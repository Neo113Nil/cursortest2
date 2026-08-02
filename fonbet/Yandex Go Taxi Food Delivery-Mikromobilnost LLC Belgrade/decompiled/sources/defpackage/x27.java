package defpackage;

/* loaded from: classes12.dex */
public final class x27 implements e37 {
    public final CharSequence a;
    public final pjc0 b;

    public x27(String str, pjc0 pjc0Var) {
        this.a = str;
        this.b = pjc0Var;
    }

    public final pjc0 a() {
        return this.b;
    }

    public final CharSequence b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x27)) {
            return false;
        }
        x27 x27Var = (x27) obj;
        return jl40.l(this.a, x27Var.a) && this.b.equals(x27Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "Visible(title=" + ((Object) this.a) + ", clickAction=" + this.b + ", color=null)";
    }
}
