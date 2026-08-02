package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;

/* loaded from: classes3.dex */
public final class PsDurationReader {
    public final /* synthetic */ int $r8$classId;
    public long durationUs;
    public long firstScrValue;
    public boolean isDurationRead;
    public boolean isFirstScrValueRead;
    public boolean isLastScrValueRead;
    public long lastScrValue;
    public final ParsableByteArray packetBuffer;
    public final TimestampAdjuster scrTimestampAdjuster;

    public PsDurationReader(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.scrTimestampAdjuster = new TimestampAdjuster(0L);
                this.firstScrValue = -9223372036854775807L;
                this.lastScrValue = -9223372036854775807L;
                this.durationUs = -9223372036854775807L;
                this.packetBuffer = new ParsableByteArray();
                break;
            default:
                this.scrTimestampAdjuster = new TimestampAdjuster(0L);
                this.firstScrValue = -9223372036854775807L;
                this.lastScrValue = -9223372036854775807L;
                this.durationUs = -9223372036854775807L;
                this.packetBuffer = new ParsableByteArray();
                break;
        }
    }

    public static int peekIntAtPosition(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long readScrValueFromPack(ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.position;
        if (parsableByteArray.bytesLeft() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        parsableByteArray.readBytes(0, 9, bArr);
        parsableByteArray.setPosition(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void finishReadDuration(ExtractorInput extractorInput) {
        int i = this.$r8$classId;
        ParsableByteArray parsableByteArray = this.packetBuffer;
        switch (i) {
            case 0:
                byte[] bArr = Util.EMPTY_BYTE_ARRAY;
                parsableByteArray.getClass();
                parsableByteArray.reset(bArr.length, bArr);
                this.isDurationRead = true;
                extractorInput.resetPeekPosition();
                break;
            default:
                byte[] bArr2 = Util.EMPTY_BYTE_ARRAY;
                parsableByteArray.getClass();
                parsableByteArray.reset(bArr2.length, bArr2);
                this.isDurationRead = true;
                extractorInput.resetPeekPosition();
                break;
        }
    }
}
