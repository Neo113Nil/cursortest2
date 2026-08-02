package defpackage;

/* loaded from: classes3.dex */
public final class z02 {
    public final String a;
    public final boolean b;

    public z02(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z02)) {
            return false;
        }
        z02 z02Var = (z02) obj;
        return this.a.equals(z02Var.a) && this.b == z02Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("AutoArtistMediaIdComponents(id=", this.a, ", isDownloaded=", ")", this.b);
    }
}
