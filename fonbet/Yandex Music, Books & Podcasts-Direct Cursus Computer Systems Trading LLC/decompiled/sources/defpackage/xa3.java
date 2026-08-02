package defpackage;

/* loaded from: classes3.dex */
public final class xa3 implements ya3 {
    public final boolean a;
    public final boolean b;

    public xa3(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.ya3
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa3)) {
            return false;
        }
        xa3 xa3Var = (xa3) obj;
        return this.a == xa3Var.a && this.b == xa3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("InitialLoading(showLoadingScreen=", this.a, ", hasYandexBooksBadge=", this.b, ")");
    }
}
