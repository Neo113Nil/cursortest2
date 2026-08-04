package com.gamericefishpro.space.d4;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {
    public int d;
    public Object e;

    public o0(int i) {
        this.d = i;
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i);

    public void D() {
        boolean zC;
        do {
            int iZ = z();
            if (iZ == 0) {
                return;
            }
            int i = this.d;
            if (i >= 100) {
                throw new com.gamericefishpro.space.q4.w("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.d = i + 1;
            zC = C(iZ);
            this.d--;
        } while (zC);
    }

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract o1 f(o1 o1Var, List list);

    public abstract com.gamericefishpro.space.u6.e g(x0 x0Var, com.gamericefishpro.space.u6.e eVar);

    public abstract void h(int i);

    public abstract int i(int i);

    public abstract boolean j();

    public abstract com.gamericefishpro.space.q4.f k();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();

    public void e() {
    }

    public void d(x0 x0Var) {
    }
}
