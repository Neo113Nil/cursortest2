package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import com.google.android.libraries.places.internal.zzcjk;
import net.idrnd.misnap.iad.IadFrame;

/* loaded from: classes3.dex */
public final class Ac4Extractor implements Extractor {
    public final Ac3Reader reader = new Ac3Reader(null, 0, "audio/ac4", 1);
    public final ParsableByteArray sampleData = new ParsableByteArray(16384);
    public boolean startedPacket;

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.reader.createTracks(extractorOutput, new zzcjk(0, 1));
        extractorOutput.endTracks();
        extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, IadFrame iadFrame) {
        ParsableByteArray parsableByteArray = this.sampleData;
        int read = extractorInput.read(parsableByteArray.data, 0, 16384);
        if (read == -1) {
            return -1;
        }
        parsableByteArray.setPosition(0);
        parsableByteArray.setLimit(read);
        boolean z = this.startedPacket;
        Ac3Reader ac3Reader = this.reader;
        if (!z) {
            ac3Reader.timeUs = 0L;
            this.startedPacket = true;
        }
        ac3Reader.consume(parsableByteArray);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.startedPacket = false;
        this.reader.seek();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean sniff(ExtractorInput extractorInput) {
        DefaultExtractorInput defaultExtractorInput;
        int i;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        int i2 = 0;
        while (true) {
            defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            defaultExtractorInput.peekFully(parsableByteArray.data, 0, 10, false);
            parsableByteArray.setPosition(0);
            if (parsableByteArray.readUnsignedInt24() != 4801587) {
                break;
            }
            parsableByteArray.skipBytes(3);
            int readSynchSafeInt = parsableByteArray.readSynchSafeInt();
            i2 += readSynchSafeInt + 10;
            defaultExtractorInput.advancePeekPosition(readSynchSafeInt, false);
        }
        defaultExtractorInput.peekBufferPosition = 0;
        defaultExtractorInput.advancePeekPosition(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            defaultExtractorInput.peekFully(parsableByteArray.data, 0, 7, false);
            parsableByteArray.setPosition(0);
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            if (readUnsignedShort == 44096 || readUnsignedShort == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = parsableByteArray.data;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (readUnsignedShort == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                defaultExtractorInput.advancePeekPosition(i - 7, false);
            } else {
                defaultExtractorInput.peekBufferPosition = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                defaultExtractorInput.advancePeekPosition(i4, false);
                i3 = 0;
            }
        }
    }
}
