package com.google.crypto.tink.shaded.protobuf;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.shaded.protobuf.Utf8;
import java.util.Locale;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class CodedOutputStream$ArrayEncoder {
    public final byte[] buffer;
    public final int limit;
    public int position;
    public ManifestSchemaFactory wrapper;
    public static final Logger logger = Logger.getLogger(CodedOutputStream$ArrayEncoder.class.getName());
    public static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS;

    public CodedOutputStream$ArrayEncoder(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            Locale locale = Locale.US;
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Array range is invalid. Buffer.length=", bArr.length, i, ", offset=0, length="));
            throw null;
        }
        this.buffer = bArr;
        this.position = 0;
        this.limit = i;
    }

    public static int computeBytesSize(int i, ByteString byteString) {
        int computeTagSize = computeTagSize(i);
        int size = byteString.size();
        return computeUInt32SizeNoTag(size) + size + computeTagSize;
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeUInt32SizeNoTag((i >> 31) ^ (i << 1));
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag((j >> 63) ^ (j << 1));
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = Utf8.encodedLength(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.UTF_8).length;
        }
        return computeUInt32SizeNoTag(length) + length;
    }

    public static int computeTagSize(int i) {
        return computeUInt32SizeNoTag(i << 3);
    }

    public static int computeUInt32SizeNoTag(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int computeUInt64SizeNoTag(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void write(byte b) {
        int i = this.position;
        try {
            int i2 = i + 1;
            try {
                this.buffer[i] = b;
                this.position = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new CodedOutputStream$OutOfSpaceException(i, this.limit, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    public final void writeFixed32(int i, int i2) {
        writeTag(i, 5);
        writeFixed32NoTag(i2);
    }

    public final void writeFixed32NoTag(int i) {
        int i2 = this.position;
        try {
            byte[] bArr = this.buffer;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.position = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(i2, this.limit, 4, e);
        }
    }

    public final void writeFixed64(int i, long j) {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    public final void writeFixed64NoTag(long j) {
        int i = this.position;
        try {
            byte[] bArr = this.buffer;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.position = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(i, this.limit, 8, e);
        }
    }

    public final void writeInt32(int i, int i2) {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    public final void writeInt32NoTag(int i) {
        if (i >= 0) {
            writeUInt32NoTag(i);
        } else {
            writeUInt64NoTag(i);
        }
    }

    public final void writeTag(int i, int i2) {
        writeUInt32NoTag((i << 3) | i2);
    }

    public final void writeUInt32(int i, int i2) {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    public final void writeUInt32NoTag(int i) {
        int i2;
        int i3 = this.position;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.buffer;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.position = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(i2, this.limit, 1, e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(i2, this.limit, 1, e);
        }
    }

    public final void writeUInt64(int i, long j) {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    public final void writeUInt64NoTag(long j) {
        int i;
        int i2 = this.position;
        boolean z = HAS_UNSAFE_ARRAY_OPERATIONS;
        int i3 = this.limit;
        byte[] bArr = this.buffer;
        if (!z || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while ((j & (-128)) != 0) {
                UnsafeUtil.putByte(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            UnsafeUtil.putByte(bArr, i2, (byte) j);
        }
        this.position = i;
    }

    public final void write(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.buffer, this.position, i2);
            this.position += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(this.position, this.limit, i2, e);
        }
    }
}
