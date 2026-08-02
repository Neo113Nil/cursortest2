package d0;

import D.x;
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
public class C4450b extends InputStream implements DataInput {

    /* renamed from: x, reason: collision with root package name */
    public static final ByteOrder f37120x = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: y, reason: collision with root package name */
    public static final ByteOrder f37121y = ByteOrder.BIG_ENDIAN;

    /* renamed from: n, reason: collision with root package name */
    public final DataInputStream f37122n;

    /* renamed from: u, reason: collision with root package name */
    public ByteOrder f37123u;

    /* renamed from: v, reason: collision with root package name */
    public int f37124v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f37125w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4450b(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public final void a(int i) {
        int i4 = 0;
        while (i4 < i) {
            DataInputStream dataInputStream = this.f37122n;
            int i6 = i - i4;
            int skip = (int) dataInputStream.skip(i6);
            if (skip <= 0) {
                if (this.f37125w == null) {
                    this.f37125w = new byte[8192];
                }
                skip = dataInputStream.read(this.f37125w, 0, Math.min(8192, i6));
                if (skip == -1) {
                    throw new EOFException(x.j(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i4 += skip;
        }
        this.f37124v += i4;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f37122n.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f37124v++;
        return this.f37122n.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f37124v++;
        return this.f37122n.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f37124v++;
        int read = this.f37122n.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f37124v += 2;
        return this.f37122n.readChar();
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
        this.f37124v += i4;
        this.f37122n.readFully(bArr, i, i4);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f37124v += 4;
        DataInputStream dataInputStream = this.f37122n;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f37123u;
        if (byteOrder == f37120x) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == f37121y) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f37123u);
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
        this.f37124v += 8;
        DataInputStream dataInputStream = this.f37122n;
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
        ByteOrder byteOrder = this.f37123u;
        if (byteOrder == f37120x) {
            j6 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j9 = read;
        } else {
            if (byteOrder != f37121y) {
                throw new IOException("Invalid byte order: " + this.f37123u);
            }
            j6 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j9 = read8;
        }
        return j6 + j9;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f37124v += 2;
        DataInputStream dataInputStream = this.f37122n;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f37123u;
        if (byteOrder == f37120x) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == f37121y) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f37123u);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f37124v += 2;
        return this.f37122n.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f37124v++;
        return this.f37122n.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f37124v += 2;
        DataInputStream dataInputStream = this.f37122n;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f37123u;
        if (byteOrder == f37120x) {
            return (read2 << 8) + read;
        }
        if (byteOrder == f37121y) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f37123u);
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
    public C4450b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public C4450b(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f37123u = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f37122n = dataInputStream;
        dataInputStream.mark(0);
        this.f37124v = 0;
        this.f37123u = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        int read = this.f37122n.read(bArr, i, i4);
        this.f37124v += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f37124v += bArr.length;
        this.f37122n.readFully(bArr);
    }
}
