package defpackage;

import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class qr4 {
    public int a;
    public int b;
    public int c = 100;
    public n8n d;

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static lr4 f(byte[] bArr, int i, int i2, boolean z) {
        lr4 lr4Var = new lr4(bArr, i, i2, z);
        try {
            lr4Var.i(i2);
            return lr4Var;
        } catch (bye e) {
            xq0.t(e);
            return null;
        }
    }

    public static qr4 g(InputStream inputStream) {
        if (inputStream != null) {
            return new nr4(inputStream);
        }
        byte[] bArr = use.b;
        return f(bArr, 0, bArr.length, false);
    }

    public static int s(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw bye.h();
            }
            i2 |= (read & 127) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw bye.h();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw bye.e();
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i);

    public final void D() {
        int z;
        do {
            z = z();
            if (z == 0) {
                return;
            }
            int i = this.a;
            int i2 = this.b;
            if (i + i2 >= this.c) {
                throw new bye("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.b = i2 + 1;
            this.b--;
        } while (C(z));
    }

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public abstract void h(int i);

    public abstract int i(int i);

    public abstract boolean j();

    public abstract kn3 k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract float p();

    public abstract int q();

    public abstract long r();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();
}
