package defpackage;

/* loaded from: classes2.dex */
public final class wju0 {
    public final vju0 a;

    public wju0(vju0 vju0Var) {
        this.a = vju0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wju0) && jl40.l(this.a, ((wju0) obj).a);
    }

    public final int hashCode() {
        vju0 vju0Var = this.a;
        if (vju0Var == null) {
            return 0;
        }
        return vju0Var.hashCode();
    }

    public final String toString() {
        return "StorePurchaseInfo(googleOfferReplaceParams=" + this.a + ')';
    }
}
