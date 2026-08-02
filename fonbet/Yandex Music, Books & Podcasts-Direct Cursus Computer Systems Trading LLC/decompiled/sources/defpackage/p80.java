package defpackage;

/* loaded from: classes3.dex */
public final class p80 {
    public final String a;
    public final int b;
    public final boolean c;

    public p80(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p80)) {
            return false;
        }
        p80 p80Var = (p80) obj;
        return this.a.equals(p80Var.a) && this.b == p80Var.b && this.c == p80Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return ouj.r(f1d.l(this.b, "AnalyticsTab(id=", this.a, ", position=", ", default="), this.c, ")");
    }
}
