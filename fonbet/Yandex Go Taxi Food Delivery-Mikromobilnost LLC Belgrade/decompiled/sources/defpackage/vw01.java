package defpackage;

/* loaded from: classes10.dex */
public final class vw01 {
    public final kk2 a;
    public final iv60 b;

    public vw01(kk2 kk2Var, iv60 iv60Var) {
        this.a = kk2Var;
        this.b = iv60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw01)) {
            return false;
        }
        vw01 vw01Var = (vw01) obj;
        return jl40.l(this.a, vw01Var.a) && this.b.equals(vw01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
