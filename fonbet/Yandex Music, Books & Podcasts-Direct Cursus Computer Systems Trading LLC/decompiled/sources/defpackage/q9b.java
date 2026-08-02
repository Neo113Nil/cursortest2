package defpackage;

/* loaded from: classes3.dex */
public final class q9b {
    public final long a;
    public final p85 b;
    public final long c;
    public final long d;

    public q9b(long j) {
        long j2;
        long j3;
        p85 a;
        this.a = j;
        p85 b0 = pd.b0(j);
        this.b = b0;
        if (j != 16) {
            float f = b0.b;
            j2 = ((0.0f > f || f > 0.1f) ? p85.a(b0, 1.0f, 0.88f, 1) : p85.a(b0, 0.0f, 0.88f, 1)).b();
        } else {
            j2 = d85.n;
        }
        this.c = j2;
        if (j != 16) {
            float f2 = b0.c;
            if (f2 < 0.25f) {
                a = p85.a(b0, 0.0f, 0.25f, 11);
            } else {
                float f3 = f2 + 0.08f;
                a = p85.a(b0, 0.0f, f3 <= 1.0f ? f3 : 1.0f, 11);
            }
            j3 = a.b();
        } else {
            j3 = d85.n;
        }
        this.d = j3;
    }

    public final d85 a() {
        long j = this.d;
        d85 d85Var = new d85(j);
        if (j != 16) {
            return d85Var;
        }
        return null;
    }

    public final long b(hq5 hq5Var) {
        long j = this.c;
        d85 d85Var = new d85(j);
        if (j == 16) {
            d85Var = null;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (d85Var != null) {
            oq5Var.Z(-1202108598);
            oq5Var.p(false);
            return d85Var.a;
        }
        oq5Var.Z(-1202106862);
        long j2 = ((dq0) oq5Var.j(eq0.a)).a.a;
        oq5Var.p(false);
        return j2;
    }

    public final long c(hq5 hq5Var) {
        long j = this.c;
        d85 d85Var = new d85(j);
        if (j == 16) {
            d85Var = null;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (d85Var != null) {
            oq5Var.Z(-1879738654);
            oq5Var.p(false);
            return d85Var.a;
        }
        oq5Var.Z(-1879736918);
        long j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
        oq5Var.p(false);
        return j2;
    }

    public final long d(hq5 hq5Var) {
        long j = this.c;
        d85 d85Var = new d85(j);
        if (j == 16) {
            d85Var = null;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (d85Var != null) {
            oq5Var.Z(-1602866296);
            oq5Var.p(false);
            return d85Var.a;
        }
        oq5Var.Z(-1602864560);
        long j2 = ((dq0) oq5Var.j(eq0.a)).b.b;
        oq5Var.p(false);
        return j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q9b) && d85.c(this.a, ((q9b) obj).a);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return hrg.q("EntityColorScheme(main=", d85.i(this.a), ")");
    }
}
