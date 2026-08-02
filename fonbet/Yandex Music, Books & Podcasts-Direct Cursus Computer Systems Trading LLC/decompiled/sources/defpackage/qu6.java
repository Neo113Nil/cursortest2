package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class qu6 extends w4k {
    public w4k e;
    public final w4k f;
    public final jd6 g;
    public final int h;
    public final boolean i;
    public boolean l;
    public final u6k j = new u6k(0);
    public long k = -1;
    public final t6k m = new t6k(1.0f);
    public final x6k n = szf.g0(null);

    public qu6(w4k w4kVar, w4k w4kVar2, jd6 jd6Var, int i, boolean z) {
        this.e = w4kVar;
        this.f = w4kVar2;
        this.g = jd6Var;
        this.h = i;
        this.i = z;
    }

    @Override // defpackage.w4k
    public final void a(float f) {
        this.m.h(f);
    }

    @Override // defpackage.w4k
    public final void c(m85 m85Var) {
        this.n.setValue(m85Var);
    }

    @Override // defpackage.w4k
    public final long i() {
        w4k w4kVar = this.e;
        long i = w4kVar != null ? w4kVar.i() : 0L;
        w4k w4kVar2 = this.f;
        long i2 = w4kVar2 != null ? w4kVar2.i() : 0L;
        boolean z = i != 9205357640488583168L;
        boolean z2 = i2 != 9205357640488583168L;
        if (z && z2) {
            return a4g.i(Math.max(nmq.d(i), nmq.d(i2)), Math.max(nmq.b(i), nmq.b(i2)));
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.w4k
    public final void j(jpa jpaVar) {
        boolean z = this.l;
        w4k w4kVar = this.f;
        t6k t6kVar = this.m;
        if (z) {
            k(jpaVar, w4kVar, t6kVar.e());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.k == -1) {
            this.k = uptimeMillis;
        }
        float f = (uptimeMillis - this.k) / this.h;
        float e = t6kVar.e() * yhn.c(f, 0.0f, 1.0f);
        float e2 = this.i ? t6kVar.e() - e : t6kVar.e();
        this.l = f >= 1.0f;
        k(jpaVar, this.e, e2);
        k(jpaVar, w4kVar, e);
        if (this.l) {
            this.e = null;
        } else {
            u6k u6kVar = this.j;
            u6kVar.i(u6kVar.h() + 1);
        }
    }

    public final void k(jpa jpaVar, w4k w4kVar, float f) {
        if (w4kVar == null || f <= 0.0f) {
            return;
        }
        long e = jpaVar.e();
        long i = w4kVar.i();
        long O = (i == 9205357640488583168L || nmq.e(i) || e == 9205357640488583168L || nmq.e(e)) ? e : pcg.O(i, this.g.f(i, e));
        x6k x6kVar = this.n;
        if (e == 9205357640488583168L || nmq.e(e)) {
            w4kVar.g(jpaVar, O, f, (m85) x6kVar.getValue());
            return;
        }
        float f2 = 2;
        float d = (nmq.d(e) - nmq.d(O)) / f2;
        float b = (nmq.b(e) - nmq.b(O)) / f2;
        ((xzi) jpaVar.q0().b).a0(d, b, d, b);
        w4kVar.g(jpaVar, O, f, (m85) x6kVar.getValue());
        xzi xziVar = (xzi) jpaVar.q0().b;
        float f3 = -d;
        float f4 = -b;
        xziVar.a0(f3, f4, f3, f4);
    }
}
