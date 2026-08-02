package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class f9n implements Closeable {
    public static final Logger g = Logger.getLogger(f9n.class.getName());
    public final RandomAccessFile a;
    public int b;
    public int c;
    public c9n d;
    public c9n e;
    public final byte[] f;

    public f9n(File file) {
        byte[] bArr = new byte[16];
        this.f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    S(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    kac.f("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int D = D(0, bArr);
        this.b = D;
        if (D <= randomAccessFile2.length()) {
            this.c = D(4, bArr);
            int D2 = D(8, bArr);
            int D3 = D(12, bArr);
            this.d = z(D2);
            this.e = z(D3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int D(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void S(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final synchronized void H() {
        if (o()) {
            throw new NoSuchElementException();
        }
        if (this.c == 1) {
            synchronized (this) {
                R(4096, 0, 0, 0);
                this.c = 0;
                c9n c9nVar = c9n.d;
                this.d = c9nVar;
                this.e = c9nVar;
                if (this.b > 4096) {
                    RandomAccessFile randomAccessFile = this.a;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.b = 4096;
            }
        } else {
            c9n c9nVar2 = this.d;
            int Q = Q(c9nVar2.b + 4 + c9nVar2.c);
            I(Q, 0, 4, this.f);
            int D = D(0, this.f);
            R(this.b, this.c - 1, Q, this.e.b);
            this.c--;
            this.d = new c9n(Q, D, 0);
        }
    }

    public final void I(int i, int i2, int i3, byte[] bArr) {
        int Q = Q(i);
        int i4 = Q + i3;
        int i5 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i4 <= i5) {
            randomAccessFile.seek(Q);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - Q;
        randomAccessFile.seek(Q);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void N(byte[] bArr, int i, int i2) {
        int Q = Q(i);
        int i3 = Q + i2;
        int i4 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i3 <= i4) {
            randomAccessFile.seek(Q);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - Q;
        randomAccessFile.seek(Q);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int P() {
        if (this.c == 0) {
            return 16;
        }
        c9n c9nVar = this.e;
        int i = c9nVar.b;
        int i2 = this.d.b;
        return i >= i2 ? (i - i2) + 4 + c9nVar.c + 16 : (((i + 4) + c9nVar.c) + this.b) - i2;
    }

    public final int Q(int i) {
        int i2 = this.b;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void R(int i, int i2, int i3, int i4) {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                S(bArr, i6, iArr[i5]);
                i6 += 4;
                i5++;
            }
        }
    }

    public final void a(byte[] bArr) {
        int Q;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    b(length);
                    boolean o = o();
                    if (o) {
                        Q = 16;
                    } else {
                        c9n c9nVar = this.e;
                        Q = Q(c9nVar.b + 4 + c9nVar.c);
                    }
                    c9n c9nVar2 = new c9n(Q, length, 0);
                    S(this.f, 0, length);
                    N(this.f, Q, 4);
                    N(bArr, Q + 4, length);
                    R(this.b, this.c + 1, o ? Q : this.d.b, Q);
                    this.e = c9nVar2;
                    this.c++;
                    if (o) {
                        this.d = c9nVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void b(int i) {
        int i2 = i + 4;
        int P = this.b - P();
        if (P >= i2) {
            return;
        }
        int i3 = this.b;
        do {
            P += i3;
            i3 <<= 1;
        } while (P < i2);
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        c9n c9nVar = this.e;
        int Q = Q(c9nVar.b + 4 + c9nVar.c);
        if (Q < this.d.b) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.b);
            long j = Q - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                xq0.w("Copied insufficient number of bytes!");
                return;
            }
        }
        int i4 = this.e.b;
        int i5 = this.d.b;
        if (i4 < i5) {
            int i6 = (this.b + i4) - 16;
            R(i3, this.c, i5, i6);
            this.e = new c9n(i6, this.e.c, 0);
        } else {
            R(i3, this.c, i5, i4);
        }
        this.b = i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    public final synchronized void g(e9n e9nVar) {
        int i = this.d.b;
        for (int i2 = 0; i2 < this.c; i2++) {
            c9n z = z(i);
            e9nVar.f(new d9n(this, z), z.c);
            i = Q(z.b + 4 + z.c);
        }
    }

    public final synchronized boolean o() {
        return this.c == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(f9n.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            g(new bz2((Object) sb, 15, false));
        } catch (IOException e) {
            g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final c9n z(int i) {
        if (i == 0) {
            return c9n.d;
        }
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(i);
        return new c9n(i, randomAccessFile.readInt(), 0);
    }
}
