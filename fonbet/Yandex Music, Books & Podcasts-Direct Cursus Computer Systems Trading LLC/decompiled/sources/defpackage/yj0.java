package defpackage;

/* loaded from: classes.dex */
public final class yj0 implements opv {
    public final int a;
    public final String b;
    public final x6k c = szf.g0(zne.e);
    public final x6k d = szf.g0(Boolean.TRUE);

    public yj0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.opv
    public final int a(jx7 jx7Var) {
        return e().b;
    }

    @Override // defpackage.opv
    public final int b(jx7 jx7Var, xof xofVar) {
        return e().c;
    }

    @Override // defpackage.opv
    public final int c(jx7 jx7Var) {
        return e().d;
    }

    @Override // defpackage.opv
    public final int d(jx7 jx7Var, xof xofVar) {
        return e().a;
    }

    public final zne e() {
        return (zne) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yj0) {
            return this.a == ((yj0) obj).a;
        }
        return false;
    }

    public final void f(kqv kqvVar, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(kqvVar.a.g(i2));
            this.d.setValue(Boolean.valueOf(kqvVar.a.q(i2)));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return vz1.r(sb, e().d, ')');
    }
}
