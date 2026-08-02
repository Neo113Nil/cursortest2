package androidx.media3.extractor.mkv;

import androidx.media3.extractor.ExtractorInput;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class VarintReader {
    public static final long[] VARINT_LENGTH_MASKS = {128, 64, 32, 16, 8, 4, 2, 1};
    public int length;
    public final byte[] scratch = new byte[8];
    public int state;

    public static long assembleVarint(int i, byte[] bArr, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~VARINT_LENGTH_MASKS[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public final long readUnsignedVarint(ExtractorInput extractorInput, boolean z, boolean z2, int i) {
        int i2;
        int i3 = this.state;
        byte[] bArr = this.scratch;
        if (i3 == 0) {
            if (!extractorInput.readFully(bArr, 0, 1, z)) {
                return -1L;
            }
            int i4 = bArr[0] & 255;
            int i5 = 0;
            while (true) {
                if (i5 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((VARINT_LENGTH_MASKS[i5] & i4) != 0) {
                    i2 = i5 + 1;
                    break;
                }
                i5++;
            }
            this.length = i2;
            if (i2 == -1) {
                a$$ExternalSyntheticBUOutline0.m$1("No valid varint length mask found");
                return 0L;
            }
            this.state = 1;
        }
        int i6 = this.length;
        if (i6 > i) {
            this.state = 0;
            return -2L;
        }
        if (i6 != 1) {
            extractorInput.readFully(bArr, 1, i6 - 1);
        }
        this.state = 0;
        return assembleVarint(this.length, bArr, z2);
    }
}
