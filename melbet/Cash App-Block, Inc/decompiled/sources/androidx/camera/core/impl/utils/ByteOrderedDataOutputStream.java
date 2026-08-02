package androidx.camera.core.impl.utils;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class ByteOrderedDataOutputStream extends FilterOutputStream {
    public final /* synthetic */ int $r8$classId = 0;
    public ByteOrder mByteOrder;
    public final OutputStream mOutputStream;

    public ByteOrderedDataOutputStream(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.mOutputStream = new DataOutputStream(outputStream);
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.$r8$classId) {
            case 0:
                this.mOutputStream.write(bArr);
                break;
            default:
                ((DataOutputStream) this.mOutputStream).write(bArr);
                break;
        }
    }

    public void writeByte(int i) {
        ((DataOutputStream) this.mOutputStream).write(i);
    }

    public final void writeInt(int i) {
        int i2 = this.$r8$classId;
        OutputStream outputStream = this.mOutputStream;
        switch (i2) {
            case 0:
                ByteOrder byteOrder = this.mByteOrder;
                if (byteOrder != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder == ByteOrder.BIG_ENDIAN) {
                        outputStream.write((i >>> 24) & 255);
                        outputStream.write((i >>> 16) & 255);
                        outputStream.write((i >>> 8) & 255);
                        outputStream.write(i & 255);
                        break;
                    }
                } else {
                    outputStream.write(i & 255);
                    outputStream.write((i >>> 8) & 255);
                    outputStream.write((i >>> 16) & 255);
                    outputStream.write((i >>> 24) & 255);
                    break;
                }
                break;
            default:
                DataOutputStream dataOutputStream = (DataOutputStream) outputStream;
                ByteOrder byteOrder2 = this.mByteOrder;
                if (byteOrder2 != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder2 == ByteOrder.BIG_ENDIAN) {
                        dataOutputStream.write((i >>> 24) & 255);
                        dataOutputStream.write((i >>> 16) & 255);
                        dataOutputStream.write((i >>> 8) & 255);
                        dataOutputStream.write(i & 255);
                        break;
                    }
                } else {
                    dataOutputStream.write(i & 255);
                    dataOutputStream.write((i >>> 8) & 255);
                    dataOutputStream.write((i >>> 16) & 255);
                    dataOutputStream.write((i >>> 24) & 255);
                    break;
                }
                break;
        }
    }

    public final void writeShort(short s) {
        int i = this.$r8$classId;
        OutputStream outputStream = this.mOutputStream;
        switch (i) {
            case 0:
                ByteOrder byteOrder = this.mByteOrder;
                if (byteOrder != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder == ByteOrder.BIG_ENDIAN) {
                        outputStream.write((s >>> 8) & 255);
                        outputStream.write(s & 255);
                        break;
                    }
                } else {
                    outputStream.write(s & 255);
                    outputStream.write((s >>> 8) & 255);
                    break;
                }
                break;
            default:
                DataOutputStream dataOutputStream = (DataOutputStream) outputStream;
                ByteOrder byteOrder2 = this.mByteOrder;
                if (byteOrder2 != ByteOrder.LITTLE_ENDIAN) {
                    if (byteOrder2 == ByteOrder.BIG_ENDIAN) {
                        dataOutputStream.write((s >>> 8) & 255);
                        dataOutputStream.write(s & 255);
                        break;
                    }
                } else {
                    dataOutputStream.write(s & 255);
                    dataOutputStream.write((s >>> 8) & 255);
                    break;
                }
                break;
        }
    }

    public void writeUnsignedInt(long j) {
        if (j <= BodyPartID.bodyIdMax) {
            writeInt((int) j);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("val is larger than the maximum value of a 32-bit unsigned integer");
        }
    }

    public void writeUnsignedShort(int i) {
        if (i <= 65535) {
            writeShort((short) i);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("val is larger than the maximum value of a 16-bit unsigned integer");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteOrderedDataOutputStream(OutputStream outputStream) {
        super(outputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.mOutputStream = outputStream;
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        switch (this.$r8$classId) {
            case 0:
                this.mOutputStream.write(bArr, i, i2);
                break;
            default:
                ((DataOutputStream) this.mOutputStream).write(bArr, i, i2);
                break;
        }
    }
}
