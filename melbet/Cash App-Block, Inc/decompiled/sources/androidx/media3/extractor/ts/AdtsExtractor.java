package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.VorbisBitArray;
import com.google.android.libraries.places.internal.zzcjk;
import net.idrnd.misnap.iad.IadFrame;

/* loaded from: classes3.dex */
public final class AdtsExtractor implements Extractor {
    public ExtractorOutput extractorOutput;
    public long firstSampleTimestampUs;
    public boolean hasOutputSeekMap;
    public final ParsableByteArray scratch;
    public final VorbisBitArray scratchBits;
    public boolean startedPacket;
    public final AdtsReader reader = new AdtsReader(null, "audio/mp4a-latm", 0, true);
    public final ParsableByteArray packetBuffer = new ParsableByteArray(2048);
    public long firstFramePosition = -1;

    public AdtsExtractor() {
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        this.scratch = parsableByteArray;
        byte[] bArr = parsableByteArray.data;
        this.scratchBits = new VorbisBitArray(bArr, bArr.length);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.reader.createTracks(extractorOutput, new zzcjk(0, 1));
        extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        this.extractorOutput.getClass();
        extractorInput.getLength();
        ParsableByteArray parsableByteArray = this.packetBuffer;
        int read = extractorInput.read(parsableByteArray.data, 0, 2048);
        boolean z = read == -1;
        if (!this.hasOutputSeekMap) {
            this.extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
            this.hasOutputSeekMap = true;
        }
        if (z) {
            return -1;
        }
        parsableByteArray.setPosition(0);
        parsableByteArray.setLimit(read);
        boolean z2 = this.startedPacket;
        AdtsReader adtsReader = this.reader;
        if (!z2) {
            adtsReader.timeUs = this.firstSampleTimestampUs;
            this.startedPacket = true;
        }
        adtsReader.consume(parsableByteArray);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.startedPacket = false;
        this.reader.seek();
        this.firstSampleTimestampUs = j2;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray;
        int i = 0;
        while (true) {
            parsableByteArray = this.scratch;
            extractorInput.peekFully(0, 10, parsableByteArray.data);
            parsableByteArray.setPosition(0);
            if (parsableByteArray.readUnsignedInt24() != 4801587) {
                break;
            }
            parsableByteArray.skipBytes(3);
            int readSynchSafeInt = parsableByteArray.readSynchSafeInt();
            i += readSynchSafeInt + 10;
            extractorInput.advancePeekPosition(readSynchSafeInt);
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i);
        if (this.firstFramePosition == -1) {
            this.firstFramePosition = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            defaultExtractorInput.peekFully(parsableByteArray.data, 0, 2, false);
            parsableByteArray.setPosition(0);
            if ((parsableByteArray.readUnsignedShort() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                defaultExtractorInput.peekFully(parsableByteArray.data, 0, 4, false);
                VorbisBitArray vorbisBitArray = this.scratchBits;
                vorbisBitArray.setPosition(14);
                int readBits = vorbisBitArray.readBits(13);
                if (readBits <= 6) {
                    i4++;
                    defaultExtractorInput.peekBufferPosition = 0;
                    defaultExtractorInput.advancePeekPosition(i4, false);
                } else {
                    defaultExtractorInput.advancePeekPosition(readBits - 6, false);
                    i3 += readBits;
                }
            } else {
                i4++;
                defaultExtractorInput.peekBufferPosition = 0;
                defaultExtractorInput.advancePeekPosition(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }
}
