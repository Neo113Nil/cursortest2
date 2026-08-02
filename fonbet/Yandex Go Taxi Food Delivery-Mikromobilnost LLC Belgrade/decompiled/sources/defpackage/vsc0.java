package defpackage;

/* loaded from: classes2.dex */
public final class vsc0 {
    public final String a;
    public final psu0 b;

    public vsc0(String str, psu0 psu0Var) {
        this.a = str;
        this.b = psu0Var;
    }

    public final psu0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsc0)) {
            return false;
        }
        vsc0 vsc0Var = (vsc0) obj;
        return this.a.equals(vsc0Var.a) && this.b.equals(vsc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StrictAction(__typename=" + this.a + ", strictPlaqueAction=" + this.b + ')';
    }
}
