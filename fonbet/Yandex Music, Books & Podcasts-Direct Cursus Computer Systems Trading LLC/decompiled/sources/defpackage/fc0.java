package defpackage;

/* loaded from: classes3.dex */
public final class fc0 implements jc0 {
    public final yc5 a;
    public final boolean b;

    public fc0(yc5 yc5Var, boolean z) {
        this.a = yc5Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc0)) {
            return false;
        }
        fc0 fc0Var = (fc0) obj;
        return this.a.equals(fc0Var.a) && this.b == fc0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistAndroidAutoMediaId(contentId=" + this.a + ", isDownloaded=" + this.b + ")";
    }
}
