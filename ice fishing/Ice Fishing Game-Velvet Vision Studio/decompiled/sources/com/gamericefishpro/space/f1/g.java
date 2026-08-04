package com.gamericefishpro.space.f1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public m a;
    public long b;
    public boolean c;
    public int d;

    public g(long j, m mVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = mVar;
        this.b = j;
        com.gamericefishpro.space.d0.p pVar = p.a;
        if (j != 0) {
            m mVarD = d();
            long j2 = mVarD.i;
            long[] jArr = mVarD.v;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = mVarD.e;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = mVarD.d;
                    if (j4 != 0) {
                        j2 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (p.c) {
                iA = p.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(g gVar) {
        p.b.B(gVar);
    }

    public final void a() {
        synchronized (p.c) {
            b();
            p();
            Unit unit = Unit.a;
        }
    }

    public void b() {
        p.d = p.d.c(g());
    }

    public void c() {
        this.c = true;
        synchronized (p.c) {
            o();
            Unit unit = Unit.a;
        }
    }

    public m d() {
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

    public final g j() {
        com.gamericefishpro.space.a8.c cVar = p.b;
        g gVar = (g) cVar.get();
        cVar.B(this);
        return gVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(c0 c0Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            p.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(m mVar) {
        this.a = mVar;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g u(Function1 function1);
}
