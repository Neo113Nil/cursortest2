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
public class C4435b extends InputStream implements DataInput {

    /* renamed from: x, reason: collision with root package name */
    public static final ByteOrder f36967x = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: y, reason: collision with root package name */
    public static final ByteOrder f36968y = ByteOrder.BIG_ENDIAN;

    /* renamed from: n, reason: collision with root package name */
    public final DataInputStream f36969n;

    /* renamed from: u, reason: collision with root package name */
    public ByteOrder f36970u;

    /* renamed from: v, reason: collision with root package name */
    public int f36971v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f36972w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4435b(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public final void a(int i) {
        int i6 = 0;
        while (i6 < i) {
            DataInputStream dataInputStream = this.f36969n;
            int i9 = i - i6;
            int skip = (int) dataInputStream.skip(i9);
            if (skip <= 0) {
                if (this.f36972w == null) {
                    this.f36972w = new byte[8192];
                }
                skip = dataInputStream.read(this.f36972w, 0, Math.min(8192, i9));
                if (skip == -1) {
                    throw new EOFException(y.k(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i6 += skip;
        }
        this.f36971v += i6;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f36969n.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f36971v++;
        return this.f36969n.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f36971v++;
        return this.f36969n.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f36971v++;
        int read = this.f36969n.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f36971v += 2;
        return this.f36969n.readChar();
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
    public final void readFully(byte[] bArr, int i, int i6) {
        this.f36971v += i6;
        this.f36969n.readFully(bArr, i, i6);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f36971v += 4;
        DataInputStream dataInputStream = this.f36969n;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f36970u;
        if (byteOrder == f36967x) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == f36968y) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f36970u);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j6;
        long j9;
        this.f36971v += 8;
        DataInputStream dataInputStream = this.f36969n;
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
        ByteOrder byteOrder = this.f36970u;
        if (byteOrder == f36967x) {
            j6 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j9 = read;
        } else {
            if (byteOrder != f36968y) {
                throw new IOException("Invalid byte order: " + this.f36970u);
            }
            j6 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j9 = read8;
        }
        return j6 + j9;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f36971v += 2;
        DataInputStream dataInputStream = this.f36969n;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f36970u;
        if (byteOrder == f36967x) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == f36968y) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f36970u);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f36971v += 2;
        return this.f36969n.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f36971v++;
        return this.f36969n.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f36971v += 2;
        DataInputStream dataInputStream = this.f36969n;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f36970u;
        if (byteOrder == f36967x) {
            return (read2 << 8) + read;
        }
        if (byteOrder == f36968y) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f36970u);
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
    public C4435b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public C4435b(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f36970u = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f36969n = dataInputStream;
        dataInputStream.mark(0);
        this.f36971v = 0;
        this.f36970u = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i6) {
        int read = this.f36969n.read(bArr, i, i6);
        this.f36971v += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f36971v += bArr.length;
        this.f36969n.readFully(bArr);
    }
}
