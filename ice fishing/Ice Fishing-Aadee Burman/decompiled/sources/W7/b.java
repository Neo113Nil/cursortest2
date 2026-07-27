package W7;

import com.google.android.gms.internal.ads.C3295hL;
import com.google.android.gms.internal.ads.HK;
import com.google.android.gms.internal.ads.KK;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: n, reason: collision with root package name */
    public int f3414n;

    /* renamed from: u, reason: collision with root package name */
    public int f3415u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3416v;

    public static KK f(byte[] bArr, int i, int i6) {
        KK kk = new KK(bArr, i, i6);
        try {
            kk.b(i6);
            return kk;
        } catch (C3295hL e9) {
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
            int i = this.f3414n;
            int i6 = this.f3415u;
            if (i + i6 >= 100) {
                throw new C3295hL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f3415u = i6 + 1;
            this.f3415u--;
        } while (l(j6));
    }

    public abstract int j();

    public abstract void k(int i);

    public abstract boolean l(int i);

    public abstract double m();

    public abstract float n();

    public abstract long o();

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
