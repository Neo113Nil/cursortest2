package defpackage;

/* loaded from: classes4.dex */
public final class vkv extends flv {
    public final boolean a;
    public final boolean b;

    public vkv(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkv)) {
            return false;
        }
        vkv vkvVar = (vkv) obj;
        return this.a == vkvVar.a && this.b == vkvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("Dislike(isDisliked=", this.a, ", isDislikedSupported=", this.b, ")");
    }

    public /* synthetic */ vkv() {
        this(false, true);
    }
}
