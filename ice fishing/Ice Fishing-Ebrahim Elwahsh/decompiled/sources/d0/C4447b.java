package d0;

import D.y;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4447b extends InputStream implements DataInput {

    /* renamed from: x, reason: collision with root package name */
    public static final ByteOrder f37130x = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: y, reason: collision with root package name */
    public static final ByteOrder f37131y = ByteOrder.BIG_ENDIAN;

    /* renamed from: n, reason: collision with root package name */
    public final DataInputStream f37132n;

    /* renamed from: u, reason: collision with root package name */
    public ByteOrder f37133u;

    /* renamed from: v, reason: collision with root package name */
    public int f37134v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f37135w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4447b(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public final void a(int i) {
        int i4 = 0;
        while (i4 < i) {
            DataInputStream dataInputStream = this.f37132n;
            int i9 = i - i4;
            int skip = (int) dataInputStream.skip(i9);
            if (skip <= 0) {
                if (this.f37135w == null) {
                    this.f37135w = new byte[8192];
                }
                skip = dataInputStream.read(this.f37135w, 0, Math.min(8192, i9));
                if (skip == -1) {
                    throw new EOFException(y.i(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i4 += skip;
        }
        this.f37134v += i4;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f37132n.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f37134v++;
        return this.f37132n.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f37134v++;
        return this.f37132n.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f37134v++;
        int read = this.f37132n.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f37134v += 2;
        return this.f37132n.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i4) {
        this.f37134v += i4;
        this.f37132n.readFully(bArr, i, i4);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f37134v += 4;
        DataInputStream dataInputStream = this.f37132n;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f37133u;
        if (byteOrder == f37130x) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == f37131y) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f37133u);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j9;
        long j10;
        this.f37134v += 8;
        DataInputStream dataInputStream = this.f37132n;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f37133u;
        if (byteOrder == f37130x) {
            j9 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j10 = read;
        } else {
            if (byteOrder != f37131y) {
                throw new IOException("Invalid byte order: " + this.f37133u);
            }
            j9 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j10 = read8;
        }
        return j9 + j10;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f37134v += 2;
        DataInputStream dataInputStream = this.f37132n;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f37133u;
        if (byteOrder == f37130x) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == f37131y) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f37133u);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f37134v += 2;
        return this.f37132n.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f37134v++;
        return this.f37132n.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f37134v += 2;
        DataInputStream dataInputStream = this.f37132n;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f37133u;
        if (byteOrder == f37130x) {
            return (read2 << 8) + read;
        }
        if (byteOrder == f37131y) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f37133u);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4447b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public C4447b(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f37133u = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f37132n = dataInputStream;
        dataInputStream.mark(0);
        this.f37134v = 0;
        this.f37133u = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        int read = this.f37132n.read(bArr, i, i4);
        this.f37134v += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f37134v += bArr.length;
        this.f37132n.readFully(bArr);
    }
}
