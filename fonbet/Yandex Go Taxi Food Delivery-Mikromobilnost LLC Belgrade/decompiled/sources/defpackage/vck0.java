package defpackage;

/* loaded from: classes14.dex */
public final class vck0 implements wck0 {
    public final kdc a;
    public final kdc b;

    public vck0(kdc kdcVar, kdc kdcVar2) {
        this.a = kdcVar;
        this.b = kdcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vck0)) {
            return false;
        }
        vck0 vck0Var = (vck0) obj;
        return jl40.l(this.a, vck0Var.a) && jl40.l(this.b, vck0Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(3) + smw0.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Selected(textColor=" + this.a + ", backgroundColor=" + this.b + ", typeface=3)";
    }
}
