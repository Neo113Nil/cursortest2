package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class qgi {
    public mn0 a;
    public ppc b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public m5i h;
    public jx7 j;
    public ges k;
    public dn9 l;
    public xof m;
    public cds n;
    public long i = wme.a;
    public int o = -1;
    public int p = -1;

    public qgi(mn0 mn0Var, ges gesVar, ppc ppcVar, int i, boolean z, int i2, int i3, List list) {
        this.a = mn0Var;
        this.b = ppcVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = gesVar;
    }

    public final int a(int i, xof xofVar) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long a = ia6.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            m5i m5iVar = this.h;
            ges gesVar = this.k;
            jx7 jx7Var = this.j;
            jx7Var.getClass();
            m5i w = dag.w(m5iVar, xofVar, gesVar, jx7Var, this.b);
            this.h = w;
            a = w.a(this.f, a);
        }
        int n = wxf.n(b(a, xofVar).e);
        int j = ga6.j(a);
        if (n < j) {
            n = j;
        }
        this.o = i;
        this.p = n;
        return n;
    }

    public final ogi b(long j, xof xofVar) {
        dn9 d = d(xofVar);
        long s = q6k.s(d.b(), this.c, j, this.d);
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new ogi(d, s, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final void c(jx7 jx7Var) {
        long j;
        jx7 jx7Var2 = this.j;
        if (jx7Var != null) {
            int i = wme.b;
            j = wme.a(jx7Var.getDensity(), jx7Var.i0());
        } else {
            j = wme.a;
        }
        if (jx7Var2 == null) {
            this.j = jx7Var;
            this.i = j;
        } else if (jx7Var == null || this.i != j) {
            this.j = jx7Var;
            this.i = j;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final dn9 d(xof xofVar) {
        dn9 dn9Var = this.l;
        if (dn9Var == null || xofVar != this.m || dn9Var.a()) {
            this.m = xofVar;
            mn0 mn0Var = this.a;
            ges T = u7g.T(this.k, xofVar);
            jx7 jx7Var = this.j;
            jx7Var.getClass();
            ppc ppcVar = this.b;
            List list = this.g;
            if (list == null) {
                list = c5b.a;
            }
            dn9Var = new dn9(mn0Var, T, list, jx7Var, ppcVar);
        }
        this.l = dn9Var;
        return dn9Var;
    }

    public final cds e(xof xofVar, long j, ogi ogiVar) {
        float min = Math.min(ogiVar.a.b(), ogiVar.d);
        mn0 mn0Var = this.a;
        ges gesVar = this.k;
        List list = this.g;
        if (list == null) {
            list = c5b.a;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        jx7 jx7Var = this.j;
        jx7Var.getClass();
        return new cds(new bds(mn0Var, gesVar, list, i, z, i2, jx7Var, xofVar, this.b, j), ogiVar, ia6.d(j, (wxf.n(min) << 32) | (wxf.n(ogiVar.e) & 4294967295L)));
    }

    public final void f(mn0 mn0Var, ges gesVar, ppc ppcVar, int i, boolean z, int i2, int i3, List list) {
        this.a = mn0Var;
        boolean d = gesVar.d(this.k);
        this.k = gesVar;
        if (!d) {
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
        this.b = ppcVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.l = null;
        this.n = null;
        this.p = -1;
        this.o = -1;
    }
}
