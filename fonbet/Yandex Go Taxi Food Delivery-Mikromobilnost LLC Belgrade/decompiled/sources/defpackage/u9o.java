package defpackage;

/* loaded from: classes2.dex */
public final class u9o implements w9o {
    public final oz90 a;
    public final CharSequence b;

    public u9o(oz90 oz90Var, CharSequence charSequence) {
        this.a = oz90Var;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9o)) {
            return false;
        }
        u9o u9oVar = (u9o) obj;
        return jl40.l(this.a, u9oVar.a) && jl40.l(this.b, u9oVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "Content(content=" + this.a + ", supportText=" + ((Object) this.b) + ')';
    }
}
