package defpackage;

/* loaded from: classes2.dex */
public final class yo11 {
    public final String a;
    public final xo11 b;
    public final wo11 c;
    public final vo11 d;

    public yo11(String str, xo11 xo11Var, wo11 wo11Var, vo11 vo11Var) {
        this.a = str;
        this.b = xo11Var;
        this.c = wo11Var;
        this.d = vo11Var;
    }

    public final vo11 a() {
        return this.d;
    }

    public final wo11 b() {
        return this.c;
    }

    public final xo11 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo11)) {
            return false;
        }
        yo11 yo11Var = (yo11) obj;
        return jl40.l(this.a, yo11Var.a) && jl40.l(this.b, yo11Var.b) && jl40.l(this.c, yo11Var.c) && jl40.l(this.d, yo11Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xo11 xo11Var = this.b;
        int hashCode2 = (hashCode + (xo11Var == null ? 0 : xo11Var.a.hashCode())) * 31;
        wo11 wo11Var = this.c;
        int hashCode3 = (hashCode2 + (wo11Var == null ? 0 : wo11Var.a.hashCode())) * 31;
        vo11 vo11Var = this.d;
        return hashCode3 + (vo11Var != null ? vo11Var.hashCode() : 0);
    }

    public final String toString() {
        return "TypedWidgetGroupProperties(__typename=" + this.a + ", onRowCrossWidgetGroupProperties=" + this.b + ", onColumnCrossWidgetGroupProperties=" + this.c + ", onBoxCrossWidgetGroupProperties=" + this.d + ')';
    }
}
