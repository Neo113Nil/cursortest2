package defpackage;

/* loaded from: classes3.dex */
public final class kf5 {
    public final boolean a;
    public final boolean b;

    public kf5(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf5)) {
            return false;
        }
        kf5 kf5Var = (kf5) obj;
        return this.a == kf5Var.a && this.b == kf5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("DownloadState(isCached=", this.a, ", isCaching=", this.b, ")");
    }
}
