package defpackage;

/* loaded from: classes3.dex */
public final class dhd {
    public final boolean a;
    public final boolean b;

    public dhd(int i, boolean z) {
        z = (i & 1) != 0 ? false : z;
        boolean z2 = (i & 2) != 0;
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhd)) {
            return false;
        }
        dhd dhdVar = (dhd) obj;
        return this.a == dhdVar.a && this.b == dhdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("GlagolCloseStrategy(fatal=", this.a, ", transition=", this.b, ")");
    }
}
