package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.webvtt.WebvttCueParser;
import androidx.tracing.Trace;
import java.io.EOFException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class Id3Peeker implements SubtitleParser {
    public final ParsableByteArray scratch;

    public Id3Peeker(int i) {
        switch (i) {
            case 1:
                this.scratch = new ParsableByteArray();
                break;
            default:
                this.scratch = new ParsableByteArray(10);
                break;
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        Cue build;
        ParsableByteArray parsableByteArray = this.scratch;
        parsableByteArray.reset(i2 + i, bArr);
        parsableByteArray.setPosition(i);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.bytesLeft() > 0) {
            Trace.checkArgument("Incomplete Mp4Webvtt Top Level box header found.", parsableByteArray.bytesLeft() >= 8);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1987343459) {
                int i3 = readInt - 8;
                CharSequence charSequence = null;
                Cue.Builder builder = null;
                while (i3 > 0) {
                    Trace.checkArgument("Incomplete vtt cue box header found.", i3 >= 8);
                    int readInt2 = parsableByteArray.readInt();
                    int readInt3 = parsableByteArray.readInt();
                    int i4 = readInt2 - 8;
                    byte[] bArr2 = parsableByteArray.data;
                    int i5 = parsableByteArray.position;
                    String str = Util.DEVICE_DEBUG_INFO;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    parsableByteArray.skipBytes(i4);
                    i3 = (i3 - 8) - i4;
                    if (readInt3 == 1937011815) {
                        WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueParser.WebvttCueInfoBuilder();
                        WebvttCueParser.parseCueSettingsList(str2, webvttCueInfoBuilder);
                        builder = webvttCueInfoBuilder.toCueBuilder();
                    } else if (readInt3 == 1885436268) {
                        charSequence = WebvttCueParser.parseCueText(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (builder != null) {
                    builder.text = charSequence;
                    builder.bitmap = null;
                    build = builder.build();
                } else {
                    Pattern pattern = WebvttCueParser.CUE_HEADER_PATTERN;
                    WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder2 = new WebvttCueParser.WebvttCueInfoBuilder();
                    webvttCueInfoBuilder2.text = charSequence;
                    build = webvttCueInfoBuilder2.toCueBuilder().build();
                }
                arrayList.add(build);
            } else {
                parsableByteArray.skipBytes(readInt - 8);
            }
        }
        consumer.accept(new CuesWithTiming(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public Metadata peekId3Data(ExtractorInput extractorInput, Id3Peeker$$ExternalSyntheticBUOutline0 id3Peeker$$ExternalSyntheticBUOutline0, int i) {
        int i2 = 0;
        Metadata metadata = null;
        loop0: while (true) {
            int i3 = 0;
            do {
                int i4 = i3 % 10;
                int i5 = i4 + 10;
                ParsableByteArray parsableByteArray = this.scratch;
                if (i4 == 0 && i3 != 0) {
                    byte[] bArr = parsableByteArray.data;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i6 = i3 == 0 ? 10 : 1;
                try {
                    extractorInput.peekFully(i5 - i6, i6, parsableByteArray.data);
                    parsableByteArray.setPosition(i4);
                    parsableByteArray.setLimit(i5);
                    if (parsableByteArray.bytesLeft() < 3) {
                        Id3Peeker$$ExternalSyntheticBUOutline0.m(parsableByteArray.position, parsableByteArray.limit);
                        return null;
                    }
                    int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
                    int i7 = parsableByteArray.position - 3;
                    parsableByteArray.position = i7;
                    if (readUnsignedInt24 != 4801587) {
                        if (AacUtil.getFrameSize(parsableByteArray.peekInt()) != -1) {
                            break loop0;
                        }
                        if (i3 == 0) {
                            parsableByteArray.ensureCapacity(20);
                        }
                        i3++;
                    } else {
                        parsableByteArray.skipBytes(6);
                        int readSynchSafeInt = parsableByteArray.readSynchSafeInt();
                        int i8 = readSynchSafeInt + 10;
                        if (metadata == null) {
                            byte[] bArr2 = new byte[i8];
                            System.arraycopy(parsableByteArray.data, i7, bArr2, 0, 10);
                            extractorInput.peekFully(10, readSynchSafeInt, bArr2);
                            metadata = new Id3Decoder(id3Peeker$$ExternalSyntheticBUOutline0).decode(i8, bArr2);
                        } else {
                            extractorInput.advancePeekPosition(readSynchSafeInt);
                        }
                        i2 += i8;
                    }
                } catch (EOFException unused) {
                }
            } while (i3 <= i);
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i2);
        return metadata;
    }
}
