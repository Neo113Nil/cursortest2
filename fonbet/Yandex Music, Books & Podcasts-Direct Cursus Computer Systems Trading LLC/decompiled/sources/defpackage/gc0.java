package defpackage;

/* loaded from: classes3.dex */
public final class gc0 implements jc0 {
    public final zc5 a;
    public final boolean b;

    public gc0(zc5 zc5Var, boolean z) {
        this.a = zc5Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc0)) {
            return false;
        }
        gc0 gc0Var = (gc0) obj;
        return this.a.equals(gc0Var.a) && this.b == gc0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistAndroidAutoMediaId(contentId=" + this.a + ", isDownloaded=" + this.b + ")";
    }
}
