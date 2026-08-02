package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zjg0 {
    public static final Logger g = Logger.getLogger(zjg0.class.getName());
    public static final byte[] h = new byte[4096];
    public final RandomAccessFile a;
    public int b;
    public int c;
    public vjg0 d;
    public vjg0 e;
    public final byte[] f;

    public zjg0(File file) {
        byte[] bArr = new byte[16];
        this.f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    m(i, iArr[i2], bArr2);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    ny61.v("Rename failed!");
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
        int g2 = g(0, bArr);
        this.b = g2;
        long j = g2;
        long length = randomAccessFile2.length();
        int i3 = this.b;
        if (j > length) {
            StringBuilder t = b64.t(i3, "File is truncated. Expected length: ", ", Actual length: ");
            t.append(randomAccessFile2.length());
            throw new IOException(t.toString());
        }
        if (i3 == 0) {
            ny61.v("File is corrupt; length stored in header is 0.");
            throw null;
        }
        this.c = g(4, bArr);
        int g3 = g(8, bArr);
        int g4 = g(12, bArr);
        this.d = f(g3);
        this.e = f(g4);
    }

    public static int g(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void m(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final synchronized void a(int i, byte[] bArr) {
        int k;
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if (i < 0 || i > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        c(i);
        boolean e = e();
        if (e) {
            k = 16;
        } else {
            vjg0 vjg0Var = this.e;
            k = k(vjg0Var.b + 4 + vjg0Var.c);
        }
        vjg0 vjg0Var2 = new vjg0(k, i);
        m(0, i, this.f);
        j(k, 4, this.f);
        j(k + 4, i, bArr);
        l(this.b, this.c + 1, e ? k : this.d.b, k);
        this.e = vjg0Var2;
        this.c++;
        if (e) {
            this.d = vjg0Var2;
        }
    }

    public final synchronized void b() {
        this.a.seek(0L);
        this.a.write(h);
        l(4096, 0, 0, 0);
        this.c = 0;
        vjg0 vjg0Var = vjg0.d;
        this.d = vjg0Var;
        this.e = vjg0Var;
        if (this.b > 4096) {
            RandomAccessFile randomAccessFile = this.a;
            randomAccessFile.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            randomAccessFile.getChannel().force(true);
        }
        this.b = 4096;
    }

    public final void c(int i) {
        int i2;
        int i3 = i + 4;
        int i4 = this.b;
        if (this.c == 0) {
            i2 = 16;
        } else {
            vjg0 vjg0Var = this.e;
            int i5 = vjg0Var.b;
            int i6 = this.d.b;
            int i7 = vjg0Var.c;
            i2 = i5 >= i6 ? (i5 - i6) + 4 + i7 + 16 : (((i5 + 4) + i7) + i4) - i6;
        }
        int i8 = i4 - i2;
        if (i8 >= i3) {
            return;
        }
        do {
            i8 += i4;
            i4 <<= 1;
        } while (i8 < i3);
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.setLength(i4);
        randomAccessFile.getChannel().force(true);
        vjg0 vjg0Var2 = this.e;
        int k = k(vjg0Var2.b + 4 + vjg0Var2.c);
        if (k <= this.d.b) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.b);
            int i9 = k - 16;
            long j = i9;
            if (channel.transferTo(16L, j, channel) != j) {
                ny61.f("Copied insufficient number of bytes!");
                return;
            }
            int i10 = 16;
            while (i9 > 0) {
                byte[] bArr = h;
                int min = Math.min(i9, bArr.length);
                j(i10, min, bArr);
                i9 -= min;
                i10 += min;
            }
        }
        int i11 = this.e.b;
        int i12 = this.d.b;
        if (i11 < i12) {
            int i13 = (this.b + i11) - 16;
            l(i4, this.c, i12, i13);
            this.e = new vjg0(i13, this.e.c);
        } else {
            l(i4, this.c, i12, i11);
        }
        this.b = i4;
    }

    public final synchronized void d(ujg0 ujg0Var) {
        int i = this.d.b;
        for (int i2 = 0; i2 < this.c; i2++) {
            vjg0 f = f(i);
            new xjg0(this, f);
            ujg0Var.b(f.c);
            i = k(f.b + 4 + f.c);
        }
    }

    public final synchronized boolean e() {
        return this.c == 0;
    }

    public final vjg0 f(int i) {
        if (i == 0) {
            return vjg0.d;
        }
        byte[] bArr = this.f;
        i(i, 0, 4, bArr);
        return new vjg0(i, g(0, bArr));
    }

    public final synchronized void h() {
        try {
            if (e()) {
                throw new NoSuchElementException();
            }
            if (this.c == 1) {
                b();
            } else {
                vjg0 vjg0Var = this.d;
                int i = vjg0Var.c + 4;
                int i2 = vjg0Var.b;
                int i3 = i;
                while (i3 > 0) {
                    byte[] bArr = h;
                    int min = Math.min(i3, bArr.length);
                    j(i2, min, bArr);
                    i3 -= min;
                    i2 += min;
                }
                int k = k(this.d.b + i);
                i(k, 0, 4, this.f);
                int g2 = g(0, this.f);
                l(this.b, this.c - 1, k, this.e.b);
                this.c--;
                this.d = new vjg0(k, g2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void i(int i, int i2, int i3, byte[] bArr) {
        int k = k(i);
        int i4 = k + i3;
        int i5 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i4 <= i5) {
            randomAccessFile.seek(k);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - k;
        randomAccessFile.seek(k);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void j(int i, int i2, byte[] bArr) {
        int k = k(i);
        int i3 = k + i2;
        int i4 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i3 <= i4) {
            randomAccessFile.seek(k);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - k;
        randomAccessFile.seek(k);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int k(int i) {
        int i2 = this.b;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void l(int i, int i2, int i3, int i4) {
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
                m(i6, iArr[i5], bArr);
                i6 += 4;
                i5++;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(zjg0.class.getSimpleName());
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
            d(new ujg0(sb));
        } catch (IOException e) {
            g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
