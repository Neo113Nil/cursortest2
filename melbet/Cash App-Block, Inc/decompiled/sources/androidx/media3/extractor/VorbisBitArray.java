package androidx.media3.extractor;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.tracing.Trace;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class VorbisBitArray {
    public final /* synthetic */ int $r8$classId;
    public int bitOffset;
    public int byteLimit;
    public int byteOffset;
    public byte[] data;

    public VorbisBitArray(int i, int i2) {
        this.$r8$classId = 2;
        this.byteLimit = i;
        this.byteOffset = i2;
        this.data = new byte[(i2 * 2) - 1];
        this.bitOffset = 0;
    }

    public void assertValidOffset() {
        int i;
        int i2 = this.byteLimit;
        Trace.checkState(i2 >= 0 && (i2 < (i = this.bitOffset) || (i2 == i && this.byteOffset == 0)));
    }

    public int bitsLeft() {
        return ((this.bitOffset - this.byteLimit) * 8) - this.byteOffset;
    }

    public void byteAlign() {
        if (this.byteOffset == 0) {
            return;
        }
        this.byteOffset = 0;
        this.byteLimit++;
        assertValidOffset();
    }

    public int getBytePosition() {
        Trace.checkState(this.byteOffset == 0);
        return this.byteLimit;
    }

    public int getPosition() {
        return (this.byteLimit * 8) + this.byteOffset;
    }

    public boolean readBit() {
        switch (this.$r8$classId) {
            case 0:
                boolean z = (((this.data[this.byteOffset] & 255) >> this.bitOffset) & 1) == 1;
                skipBits(1);
                return z;
            default:
                boolean z2 = (this.data[this.byteLimit] & (128 >> this.byteOffset)) != 0;
                skipBit();
                return z2;
        }
    }

    public int readBits(int i) {
        switch (this.$r8$classId) {
            case 0:
                int i2 = this.byteOffset;
                int min = Math.min(i, 8 - this.bitOffset);
                byte[] bArr = this.data;
                int i3 = i2 + 1;
                int i4 = ((bArr[i2] & 255) >> this.bitOffset) & (255 >> (8 - min));
                while (min < i) {
                    i4 |= (bArr[i3] & 255) << min;
                    min += 8;
                    i3++;
                }
                int i5 = i4 & ((-1) >>> (32 - i));
                skipBits(i);
                return i5;
            default:
                if (i == 0) {
                    return 0;
                }
                this.byteOffset += i;
                int i6 = 0;
                while (true) {
                    int i7 = this.byteOffset;
                    if (i7 <= 8) {
                        byte[] bArr2 = this.data;
                        int i8 = this.byteLimit;
                        int i9 = ((-1) >>> (32 - i)) & (((255 & bArr2[i8]) >> (8 - i7)) | i6);
                        if (i7 == 8) {
                            this.byteOffset = 0;
                            this.byteLimit = i8 + 1;
                        }
                        assertValidOffset();
                        return i9;
                    }
                    int i10 = i7 - 8;
                    this.byteOffset = i10;
                    byte[] bArr3 = this.data;
                    int i11 = this.byteLimit;
                    this.byteLimit = i11 + 1;
                    i6 |= (bArr3[i11] & 255) << i10;
                }
        }
    }

    public long readBitsToLong(int i) {
        if (i <= 32) {
            int readBits = readBits(i);
            String str = Util.DEVICE_DEBUG_INFO;
            return readBits & BodyPartID.bodyIdMax;
        }
        int readBits2 = readBits(i - 32);
        int readBits3 = readBits(32);
        String str2 = Util.DEVICE_DEBUG_INFO;
        return (readBits3 & BodyPartID.bodyIdMax) | ((readBits2 & BodyPartID.bodyIdMax) << 32);
    }

    public void readBytes(int i, byte[] bArr) {
        Trace.checkState(this.byteOffset == 0);
        System.arraycopy(this.data, this.byteLimit, bArr, 0, i);
        this.byteLimit += i;
        assertValidOffset();
    }

    public void reset(ParsableByteArray parsableByteArray) {
        reset(parsableByteArray.limit, parsableByteArray.data);
        setPosition(parsableByteArray.position * 8);
    }

    public void setPosition(int i) {
        int i2 = i / 8;
        this.byteLimit = i2;
        this.byteOffset = i - (i2 * 8);
        assertValidOffset();
    }

    public void skipBit() {
        int i = this.byteOffset + 1;
        this.byteOffset = i;
        if (i == 8) {
            this.byteOffset = 0;
            this.byteLimit++;
        }
        assertValidOffset();
    }

    public void skipBits(int i) {
        int i2;
        switch (this.$r8$classId) {
            case 0:
                int i3 = i / 8;
                int i4 = this.byteOffset + i3;
                this.byteOffset = i4;
                int i5 = (i - (i3 * 8)) + this.bitOffset;
                this.bitOffset = i5;
                boolean z = true;
                if (i5 > 7) {
                    this.byteOffset = i4 + 1;
                    this.bitOffset = i5 - 8;
                }
                int i6 = this.byteOffset;
                if (i6 < 0 || (i6 >= (i2 = this.byteLimit) && (i6 != i2 || this.bitOffset != 0))) {
                    z = false;
                }
                Trace.checkState(z);
                break;
            default:
                int i7 = i / 8;
                int i8 = this.byteLimit + i7;
                this.byteLimit = i8;
                int i9 = (i - (i7 * 8)) + this.byteOffset;
                this.byteOffset = i9;
                if (i9 > 7) {
                    this.byteLimit = i8 + 1;
                    this.byteOffset = i9 - 8;
                }
                assertValidOffset();
                break;
        }
    }

    public void skipBytes(int i) {
        Trace.checkState(this.byteOffset == 0);
        this.byteLimit += i;
        assertValidOffset();
    }

    public void reset(int i, byte[] bArr) {
        this.data = bArr;
        this.byteLimit = 0;
        this.byteOffset = 0;
        this.bitOffset = i;
    }

    public VorbisBitArray(byte[] bArr) {
        this.$r8$classId = 0;
        this.data = bArr;
        this.byteLimit = bArr.length;
    }

    public VorbisBitArray(byte[] bArr, int i) {
        this.$r8$classId = 1;
        this.data = bArr;
        this.bitOffset = i;
    }

    public VorbisBitArray() {
        this.$r8$classId = 1;
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    public void readBits(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.data;
            int i4 = this.byteLimit;
            int i5 = i4 + 1;
            this.byteLimit = i5;
            byte b = bArr2[i4];
            int i6 = this.byteOffset;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.byteOffset;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.data;
            int i9 = this.byteLimit;
            this.byteLimit = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.byteOffset = i8 - 8;
        }
        int i10 = this.byteOffset + i7;
        this.byteOffset = i10;
        byte[] bArr4 = this.data;
        int i11 = this.byteLimit;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.byteOffset = 0;
            this.byteLimit = i11 + 1;
        }
        assertValidOffset();
    }
}
