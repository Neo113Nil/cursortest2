package defpackage;

/* loaded from: classes14.dex */
public final class uck0 implements wck0 {
    public final bdc a;
    public final bdc b;

    public uck0(bdc bdcVar, bdc bdcVar2) {
        this.a = bdcVar;
        this.b = bdcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uck0)) {
            return false;
        }
        uck0 uck0Var = (uck0) obj;
        return this.a.equals(uck0Var.a) && this.b.equals(uck0Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + oyr.b(this.b.a, Integer.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        return "NotSelected(textColor=" + this.a + ", backgroundColor=" + this.b + ", typeface=0)";
    }
}
