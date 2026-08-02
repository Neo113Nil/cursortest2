package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class ap3 {
    public static final err o = new err(new d51(16));
    public static final wo3 p = new wo3();
    public boolean a;
    public int b;
    public int c;
    public long d;
    public long e;
    public zo3 f;
    public iig g;
    public iig h;
    public long i;
    public long j;
    public qeb k;
    public qeb l;
    public ewn m;
    public ngs n;

    public static ap3 d() {
        ap3 ap3Var = new ap3();
        ap3Var.a = true;
        ap3Var.b = -1;
        ap3Var.c = -1;
        ap3Var.d = -1L;
        ap3Var.e = -1L;
        ap3Var.i = -1L;
        ap3Var.j = -1L;
        return ap3Var;
    }

    public final void a() {
        if (this.f == null) {
            o2g.U("maximumWeight requires weigher", this.e == -1);
            return;
        }
        boolean z = this.a;
        long j = this.e;
        if (z) {
            o2g.U("weigher requires maximumWeight", j != -1);
        } else if (j == -1) {
            xo3.a.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public final void b(long j, TimeUnit timeUnit) {
        long j2 = this.j;
        o2g.T("expireAfterAccess was already set to %s ns", j2, j2 == -1);
        if (j >= 0) {
            this.j = timeUnit.toNanos(j);
        } else {
            xq0.x(zwf.R("duration cannot be negative: %s %s", Long.valueOf(j), timeUnit));
        }
    }

    public final void c(long j) {
        long j2 = this.d;
        o2g.T("maximum size was already set to %s", j2, j2 == -1);
        long j3 = this.e;
        o2g.T("maximum weight was already set to %s", j3, j3 == -1);
        o2g.U("maximum size can not be combined with weigher", this.f == null);
        o2g.J("maximum size must not be negative", j >= 0);
        this.d = j;
    }

    public final void e(iig iigVar) {
        iig iigVar2 = this.h;
        o2g.S(iigVar2, "Value strength was already set to %s", iigVar2 == null);
        iigVar.getClass();
        this.h = iigVar;
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        int i = this.b;
        if (i != -1) {
            Y.m(i, "initialCapacity");
        }
        int i2 = this.c;
        if (i2 != -1) {
            Y.m(i2, "concurrencyLevel");
        }
        long j = this.d;
        if (j != -1) {
            Y.n(j, "maximumSize");
        }
        long j2 = this.e;
        if (j2 != -1) {
            Y.n(j2, "maximumWeight");
        }
        if (this.i != -1) {
            Y.q(hrg.m(this.i, "ns", new StringBuilder()), "expireAfterWrite");
        }
        if (this.j != -1) {
            Y.q(hrg.m(this.j, "ns", new StringBuilder()), "expireAfterAccess");
        }
        iig iigVar = this.g;
        if (iigVar != null) {
            Y.q(ltg.M(iigVar.toString()), "keyStrength");
        }
        iig iigVar2 = this.h;
        if (iigVar2 != null) {
            Y.q(ltg.M(iigVar2.toString()), "valueStrength");
        }
        if (this.k != null) {
            ime imeVar = new ime(12);
            ((ime) Y.e).d = imeVar;
            Y.e = imeVar;
            imeVar.c = "keyEquivalence";
        }
        if (this.l != null) {
            ime imeVar2 = new ime(12);
            ((ime) Y.e).d = imeVar2;
            Y.e = imeVar2;
            imeVar2.c = "valueEquivalence";
        }
        if (this.m != null) {
            ime imeVar3 = new ime(12);
            ((ime) Y.e).d = imeVar3;
            Y.e = imeVar3;
            imeVar3.c = "removalListener";
        }
        return Y.toString();
    }
}
