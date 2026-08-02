package defpackage;

/* loaded from: classes3.dex */
public final class ec0 implements jc0 {
    public final xc5 a;
    public final boolean b;

    public ec0(xc5 xc5Var, boolean z) {
        this.a = xc5Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec0)) {
            return false;
        }
        ec0 ec0Var = (ec0) obj;
        return this.a.equals(ec0Var.a) && this.b == ec0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumAndroidAutoMediaId(contentId=" + this.a + ", isDownloaded=" + this.b + ")";
    }
}
