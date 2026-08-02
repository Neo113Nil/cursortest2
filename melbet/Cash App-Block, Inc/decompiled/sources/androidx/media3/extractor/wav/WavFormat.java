package androidx.media3.extractor.wav;

import androidx.tracing.Trace;

/* loaded from: classes3.dex */
public final class WavFormat {
    public int bitsPerSample = 0;
    public int blockSize;
    public byte[] extraData;
    public int frameRateHz;
    public int numChannels;

    public WavFormat(byte[] bArr, int i, int i2) {
        this.extraData = bArr;
        this.frameRateHz = i;
        this.blockSize = i;
        this.numChannels = i2;
        assertValidOffset();
    }

    public void assertValidOffset() {
        int i;
        int i2 = this.blockSize;
        Trace.checkState(i2 >= 0 && (i2 < (i = this.numChannels) || (i2 == i && this.bitsPerSample == 0)));
    }

    public boolean canReadBits(int i) {
        int i2 = this.blockSize;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.bitsPerSample + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.numChannels) {
                break;
            }
            if (shouldSkipByte(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.numChannels;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    public boolean canReadExpGolombCodedNum() {
        int i = this.blockSize;
        int i2 = this.bitsPerSample;
        int i3 = 0;
        while (this.blockSize < this.numChannels && !readBit()) {
            i3++;
        }
        boolean z = this.blockSize == this.numChannels;
        this.blockSize = i;
        this.bitsPerSample = i2;
        return !z && canReadBits((i3 * 2) + 1);
    }

    public boolean readBit() {
        boolean z = (this.extraData[this.blockSize] & (128 >> this.bitsPerSample)) != 0;
        skipBit();
        return z;
    }

    public int readBits(int i) {
        int i2;
        this.bitsPerSample += i;
        int i3 = 0;
        while (true) {
            i2 = this.bitsPerSample;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.bitsPerSample = i4;
            byte[] bArr = this.extraData;
            int i5 = this.blockSize;
            i3 |= (bArr[i5] & 255) << i4;
            if (!shouldSkipByte(i5 + 1)) {
                r3 = 1;
            }
            this.blockSize = i5 + r3;
        }
        byte[] bArr2 = this.extraData;
        int i6 = this.blockSize;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.bitsPerSample = 0;
            this.blockSize = i6 + (shouldSkipByte(i6 + 1) ? 2 : 1);
        }
        assertValidOffset();
        return i7;
    }

    public int readExpGolombCodeNum() {
        int i = 0;
        while (!readBit()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? readBits(i) : 0);
    }

    public int readSignedExpGolombCodedInt() {
        int readExpGolombCodeNum = readExpGolombCodeNum();
        return ((readExpGolombCodeNum + 1) / 2) * (readExpGolombCodeNum % 2 == 0 ? -1 : 1);
    }

    public boolean shouldSkipByte(int i) {
        int i2 = i - 2;
        if (this.frameRateHz > i2 || i >= this.numChannels) {
            return false;
        }
        byte[] bArr = this.extraData;
        return bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0;
    }

    public void skipBit() {
        int i = this.bitsPerSample + 1;
        this.bitsPerSample = i;
        if (i == 8) {
            this.bitsPerSample = 0;
            int i2 = this.blockSize;
            this.blockSize = i2 + (shouldSkipByte(i2 + 1) ? 2 : 1);
        }
        assertValidOffset();
    }

    public void skipBits(int i) {
        int i2 = this.blockSize;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.blockSize = i4;
        int i5 = (i - (i3 * 8)) + this.bitsPerSample;
        this.bitsPerSample = i5;
        if (i5 > 7) {
            this.blockSize = i4 + 1;
            this.bitsPerSample = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.blockSize) {
                assertValidOffset();
                return;
            } else if (shouldSkipByte(i2)) {
                this.blockSize++;
                i2 += 2;
            }
        }
    }
}
