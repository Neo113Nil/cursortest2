package defpackage;

/* loaded from: classes3.dex */
public final class r82 {
    public final String a;
    public final String b;
    public final boolean c;

    public r82(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r82)) {
            return false;
        }
        r82 r82Var = (r82) obj;
        return this.a.equals(r82Var.a) && this.b.equals(r82Var.b) && this.c == r82Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(f1d.m("AutoPlaylistMediaIdComponents(uid=", this.a, ", kind=", this.b, ", isDownloaded="), this.c, ")");
    }
}
