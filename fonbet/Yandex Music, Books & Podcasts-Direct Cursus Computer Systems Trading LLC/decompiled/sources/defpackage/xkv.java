package defpackage;

/* loaded from: classes4.dex */
public final class xkv extends flv {
    public final boolean a;
    public final boolean b;

    public xkv(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkv)) {
            return false;
        }
        xkv xkvVar = (xkv) obj;
        return this.a == xkvVar.a && this.b == xkvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("Like(isLiked=", this.a, ", isLikeSupported=", this.b, ")");
    }
}
