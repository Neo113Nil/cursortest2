package defpackage;

/* loaded from: classes8.dex */
public final class wtc0 {
    public final String a;
    public final dmc0 b;

    public wtc0(String str, dmc0 dmc0Var) {
        this.a = str;
        this.b = dmc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtc0)) {
            return false;
        }
        wtc0 wtc0Var = (wtc0) obj;
        return this.a.equals(wtc0Var.a) && this.b.equals(wtc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisplayRules(__typename=" + this.a + ", plaqueDisplayRules=" + this.b + ')';
    }
}
