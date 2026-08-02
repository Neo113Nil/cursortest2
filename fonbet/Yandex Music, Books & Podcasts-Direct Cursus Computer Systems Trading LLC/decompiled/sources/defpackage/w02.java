package defpackage;

/* loaded from: classes3.dex */
public final class w02 {
    public final String a;
    public final boolean b;

    public w02(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w02)) {
            return false;
        }
        w02 w02Var = (w02) obj;
        return this.a.equals(w02Var.a) && this.b == w02Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("AutoAlbumMediaIdComponents(id=", this.a, ", isDownloaded=", ")", this.b);
    }
}
