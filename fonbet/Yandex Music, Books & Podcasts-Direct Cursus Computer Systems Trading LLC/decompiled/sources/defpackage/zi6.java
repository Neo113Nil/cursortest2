package defpackage;

/* loaded from: classes3.dex */
public final class zi6 {
    public final yi6 a;
    public final xi6 b;
    public final xi6 c;
    public final boolean d;

    public zi6(yi6 yi6Var, xi6 xi6Var, xi6 xi6Var2, boolean z) {
        this.a = yi6Var;
        this.b = xi6Var;
        this.c = xi6Var2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi6)) {
            return false;
        }
        zi6 zi6Var = (zi6) obj;
        return this.a == zi6Var.a && this.b == zi6Var.b && this.c == zi6Var.c && this.d == zi6Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ControlsUiData(skippingType=" + this.a + ", previousState=" + this.b + ", nextState=" + this.c + ", swipeEnabled=" + this.d + ")";
    }
}
