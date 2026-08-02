package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class b2r {
    public f2r a;
    public long b;
    public boolean c;
    public int d;

    public b2r(long j, f2r f2rVar) {
        int i;
        int numberOfTrailingZeros;
        this.a = f2rVar;
        this.b = j;
        sfm sfmVar = g2r.a;
        if (j != 0) {
            f2r d = d();
            long j2 = d.c;
            long[] jArr = d.d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d.b;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d.a;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (g2r.b) {
                i = g2r.e.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(b2r b2rVar) {
        g2r.a.J(b2rVar);
    }

    public final void a() {
        synchronized (g2r.b) {
            b();
            p();
        }
    }

    public void b() {
        g2r.c = g2r.c.g(g());
    }

    public abstract void c();

    public f2r d() {
        return this.a;
    }

    public abstract Function1 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract Function1 i();

    public final b2r j() {
        sfm sfmVar = g2r.a;
        b2r b2rVar = (b2r) sfmVar.s();
        sfmVar.J(this);
        return b2rVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(mer merVar);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            g2r.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(f2r f2rVar) {
        this.a = f2rVar;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract b2r u(Function1 function1);
}
