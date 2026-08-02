package defpackage;

/* loaded from: classes3.dex */
public final class xqc {
    public final int a;
    public final q0k b;
    public final nx0 c;

    public xqc(int i, q0k q0kVar, nx0 nx0Var) {
        this.a = i;
        this.b = q0kVar;
        this.c = nx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqc)) {
            return false;
        }
        xqc xqcVar = (xqc) obj;
        return this.a == xqcVar.a && this.b.equals(xqcVar.b) && this.c.equals(xqcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "FooterUiInfo(cellColumns=" + this.a + ", rowPaddingValues=" + this.b + ", horizontalArrangement=" + this.c + ")";
    }
}
