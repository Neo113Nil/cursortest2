package defpackage;

/* loaded from: classes.dex */
public final class w5k {
    public String a;
    public ges b;
    public ppc c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public jx7 i;
    public ih0 j;
    public boolean k;
    public long l;
    public m5i m;
    public v5k n;
    public xof o;
    public long h = wme.a;
    public long p = ia6.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public w5k(String str, ges gesVar, ppc ppcVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = gesVar;
        this.c = ppcVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        long j = 0;
        this.l = (j & 4294967295L) | (j << 32);
    }

    public static long e(w5k w5kVar, long j, xof xofVar) {
        ges gesVar = w5kVar.b;
        m5i m5iVar = w5kVar.m;
        jx7 jx7Var = w5kVar.i;
        jx7Var.getClass();
        m5i w = dag.w(m5iVar, xofVar, gesVar, jx7Var, w5kVar.c);
        w5kVar.m = w;
        return w.a(w5kVar.g, j);
    }

    public final int a(int i, xof xofVar) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long a = ia6.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            a = e(this, a, xofVar);
        }
        v5k d = d(xofVar);
        long s = q6k.s(d.b(), this.d, a, this.e);
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int n = wxf.n(new ih0((mh0) d, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, s).b());
        int j = ga6.j(a);
        if (n < j) {
            n = j;
        }
        this.q = i;
        this.r = n;
        return n;
    }

    public final void b() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = ia6.h(0, 0, 0, 0);
        long j = 0;
        this.l = (j & 4294967295L) | (j << 32);
        this.k = false;
    }

    public final void c(jx7 jx7Var) {
        long j;
        jx7 jx7Var2 = this.i;
        if (jx7Var != null) {
            int i = wme.b;
            j = wme.a(jx7Var.getDensity(), jx7Var.i0());
        } else {
            j = wme.a;
        }
        if (jx7Var2 == null) {
            this.i = jx7Var;
            this.h = j;
        } else if (jx7Var == null || this.h != j) {
            this.i = jx7Var;
            this.h = j;
            b();
        }
    }

    public final v5k d(xof xofVar) {
        v5k v5kVar = this.n;
        if (v5kVar == null || xofVar != this.o || v5kVar.a()) {
            this.o = xofVar;
            String str = this.a;
            ges T = u7g.T(this.b, xofVar);
            c5b c5bVar = c5b.a;
            jx7 jx7Var = this.i;
            jx7Var.getClass();
            v5kVar = new mh0(str, T, c5bVar, c5bVar, this.c, jx7Var);
        }
        this.n = v5kVar;
        return v5kVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j = this.h;
        int i = wme.b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
