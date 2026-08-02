package defpackage;

/* loaded from: classes2.dex */
public final class vgx0 {
    public final String a;
    public final wju0 b;

    public vgx0(String str, wju0 wju0Var) {
        this.a = str;
        this.b = wju0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgx0)) {
            return false;
        }
        vgx0 vgx0Var = (vgx0) obj;
        return this.a.equals(vgx0Var.a) && this.b.equals(vgx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StorePurchaseInfo(__typename=" + this.a + ", storePurchaseInfo=" + this.b + ')';
    }
}
