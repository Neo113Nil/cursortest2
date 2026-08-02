package defpackage;

/* loaded from: classes10.dex */
public final class xjy0 {
    public final kk2 a;
    public kk2 b;
    public boolean c = false;
    public km40 d = null;

    public xjy0(kk2 kk2Var, kk2 kk2Var2) {
        this.a = kk2Var;
        this.b = kk2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjy0)) {
            return false;
        }
        xjy0 xjy0Var = (xjy0) obj;
        return jl40.l(this.a, xjy0Var.a) && jl40.l(this.b, xjy0Var.b) && this.c == xjy0Var.c && jl40.l(this.d, xjy0Var.d);
    }

    public final int hashCode() {
        int e = unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        km40 km40Var = this.d;
        return e + (km40Var == null ? 0 : km40Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}
