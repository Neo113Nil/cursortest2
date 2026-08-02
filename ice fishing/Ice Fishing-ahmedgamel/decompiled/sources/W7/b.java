package W7;

import com.google.android.gms.internal.ads.C3318hL;
import com.google.android.gms.internal.ads.HK;
import com.google.android.gms.internal.ads.KK;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: n, reason: collision with root package name */
    public int f3576n;

    /* renamed from: u, reason: collision with root package name */
    public int f3577u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3578v;

    public static KK f(byte[] bArr, int i, int i4) {
        KK kk = new KK(bArr, i, i4);
        try {
            kk.b(i4);
            return kk;
        } catch (C3318hL e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public static int h(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long i(long j6) {
        return (j6 >>> 1) ^ (-(1 & j6));
    }

    public abstract int A();

    public abstract long B();

    public abstract int C();

    public abstract long D();

    public abstract int b(int i);

    public abstract void c(int i);

    public abstract boolean d();

    public abstract int e();

    public void g() {
        int j6;
        do {
            j6 = j();
            if (j6 == 0) {
                return;
            }
            int i = this.f3576n;
            int i4 = this.f3577u;
            if (i + i4 >= 100) {
                throw new C3318hL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f3577u = i4 + 1;
            this.f3577u--;
        } while (m(j6));
    }

    public abstract int j();

    public abstract void k(int i);

    public abstract boolean m(int i);

    public abstract double n();

    public abstract float o();

    public abstract long p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract boolean u();

    public abstract String v();

    public abstract String w();

    public abstract HK x();

    public abstract int y();

    public abstract int z();
}
