package androidx.glance.appwidget.protobuf;

import androidx.datastore.core.UncloseableOutputStream;
import androidx.glance.appwidget.protobuf.Utf8;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class CodedOutputStream$OutputStreamEncoder {
    public final byte[] buffer;
    public final int limit;
    public final UncloseableOutputStream out;
    public int position;
    public ManifestSchemaFactory wrapper;
    public static final Logger logger = Logger.getLogger(CodedOutputStream$OutputStreamEncoder.class.getName());
    public static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.HAS_UNSAFE_ARRAY_OPERATIONS;

    public CodedOutputStream$OutputStreamEncoder(UncloseableOutputStream uncloseableOutputStream, int i) {
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("bufferSize must be >= 0");
            throw null;
        }
        int max = Math.max(i, 20);
        this.buffer = new byte[max];
        this.limit = max;
        this.out = uncloseableOutputStream;
    }

    public static int computeBytesSize(int i, ByteString$LiteralByteString byteString$LiteralByteString) {
        int computeTagSize = computeTagSize(i);
        int size = byteString$LiteralByteString.size();
        return computeUInt32SizeNoTag(size) + size + computeTagSize;
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

    public final void bufferFixed32NoTag(int i) {
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        byte[] bArr = this.buffer;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.position = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.position = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.position = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void bufferFixed64NoTag(long j) {
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte[] bArr = this.buffer;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.position = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.position = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.position = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.position = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.position = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.position = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.position = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void bufferTag(int i, int i2) {
        bufferUInt32NoTag((i << 3) | i2);
    }

    public final void bufferUInt32NoTag(int i) {
        boolean z = HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.buffer;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.position;
                if (i2 == 0) {
                    this.position = i3 + 1;
                    UnsafeUtil.putByte(bArr, i3, (byte) i);
                    return;
                } else {
                    this.position = i3 + 1;
                    UnsafeUtil.putByte(bArr, i3, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.position;
                if (i4 == 0) {
                    this.position = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.position = i5 + 1;
                    bArr[i5] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                }
            }
        }
    }

    public final void bufferUInt64NoTag(long j) {
        boolean z = HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.buffer;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.position;
                if (j2 == 0) {
                    this.position = i + 1;
                    UnsafeUtil.putByte(bArr, i, (byte) j);
                    return;
                } else {
                    this.position = i + 1;
                    UnsafeUtil.putByte(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.position;
                if (j3 == 0) {
                    this.position = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.position = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                }
            }
        }
    }

    public final void doFlush() {
        this.out.write(this.buffer, 0, this.position);
        this.position = 0;
    }

    public final void flushIfNotAvailable(int i) {
        if (this.limit - this.position < i) {
            doFlush();
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3 = this.position;
        int i4 = this.limit;
        int i5 = i4 - i3;
        byte[] bArr2 = this.buffer;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.position += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.position = i4;
        doFlush();
        if (i7 > i4) {
            this.out.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.position = i7;
        }
    }

    public final void writeBool(int i, boolean z) {
        flushIfNotAvailable(11);
        bufferTag(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.position;
        this.position = i2 + 1;
        this.buffer[i2] = b;
    }

    public final void writeBytes(int i, ByteString$LiteralByteString byteString$LiteralByteString) {
        writeTag(i, 2);
        writeUInt32NoTag(byteString$LiteralByteString.size());
        writeLazy(byteString$LiteralByteString.bytes, byteString$LiteralByteString.getOffsetIntoBytes(), byteString$LiteralByteString.size());
    }

    public final void writeFixed32(int i, int i2) {
        flushIfNotAvailable(14);
        bufferTag(i, 5);
        bufferFixed32NoTag(i2);
    }

    public final void writeFixed32NoTag(int i) {
        flushIfNotAvailable(4);
        bufferFixed32NoTag(i);
    }

    public final void writeFixed64(int i, long j) {
        flushIfNotAvailable(18);
        bufferTag(i, 1);
        bufferFixed64NoTag(j);
    }

    public final void writeFixed64NoTag(long j) {
        flushIfNotAvailable(8);
        bufferFixed64NoTag(j);
    }

    public final void writeInt32(int i, int i2) {
        flushIfNotAvailable(20);
        bufferTag(i, 0);
        if (i2 >= 0) {
            bufferUInt32NoTag(i2);
        } else {
            bufferUInt64NoTag(i2);
        }
    }

    public final void writeInt32NoTag(int i) {
        if (i >= 0) {
            writeUInt32NoTag(i);
        } else {
            writeUInt64NoTag(i);
        }
    }

    public final void writeLazy(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
    }

    public final void writeMessage(int i, AbstractMessageLite abstractMessageLite, Schema schema) {
        writeTag(i, 2);
        writeUInt32NoTag(abstractMessageLite.getSerializedSize(schema));
        schema.writeTo(abstractMessageLite, this.wrapper);
    }

    public final void writeString(int i, String str) {
        writeTag(i, 2);
        try {
            int length = str.length() * 3;
            int computeUInt32SizeNoTag = computeUInt32SizeNoTag(length);
            int i2 = computeUInt32SizeNoTag + length;
            int i3 = this.limit;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int encodeUtf8 = Utf8.processor.encodeUtf8(str, bArr, 0, length);
                writeUInt32NoTag(encodeUtf8);
                write(bArr, 0, encodeUtf8);
                return;
            }
            if (i2 > i3 - this.position) {
                doFlush();
            }
            int computeUInt32SizeNoTag2 = computeUInt32SizeNoTag(str.length());
            int i4 = this.position;
            byte[] bArr2 = this.buffer;
            try {
                if (computeUInt32SizeNoTag2 != computeUInt32SizeNoTag) {
                    int encodedLength = Utf8.encodedLength(str);
                    bufferUInt32NoTag(encodedLength);
                    this.position = Utf8.processor.encodeUtf8(str, bArr2, this.position, encodedLength);
                    return;
                }
                int i5 = i4 + computeUInt32SizeNoTag2;
                this.position = i5;
                int encodeUtf82 = Utf8.processor.encodeUtf8(str, bArr2, i5, i3 - i5);
                this.position = i4;
                bufferUInt32NoTag((encodeUtf82 - i4) - computeUInt32SizeNoTag2);
                this.position = encodeUtf82;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.position = i4;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new IOException(e2) { // from class: androidx.glance.appwidget.protobuf.CodedOutputStream$OutOfSpaceException
                };
            }
        } catch (Utf8.UnpairedSurrogateException e3) {
            logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(Internal.UTF_8);
            try {
                writeUInt32NoTag(bytes.length);
                writeLazy(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new IOException(e4) { // from class: androidx.glance.appwidget.protobuf.CodedOutputStream$OutOfSpaceException
                };
            }
        }
    }

    public final void writeTag(int i, int i2) {
        writeUInt32NoTag((i << 3) | i2);
    }

    public final void writeUInt32(int i, int i2) {
        flushIfNotAvailable(20);
        bufferTag(i, 0);
        bufferUInt32NoTag(i2);
    }

    public final void writeUInt32NoTag(int i) {
        flushIfNotAvailable(5);
        bufferUInt32NoTag(i);
    }

    public final void writeUInt64(int i, long j) {
        flushIfNotAvailable(20);
        bufferTag(i, 0);
        bufferUInt64NoTag(j);
    }

    public final void writeUInt64NoTag(long j) {
        flushIfNotAvailable(10);
        bufferUInt64NoTag(j);
    }
}
