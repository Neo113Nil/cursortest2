package defpackage;

/* loaded from: classes3.dex */
public final class eb2 {
    public final String a;
    public final String b;
    public final boolean c;

    public eb2(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb2)) {
            return false;
        }
        eb2 eb2Var = (eb2) obj;
        return this.a.equals(eb2Var.a) && this.b.equals(eb2Var.b) && this.c == eb2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(f1d.m("AutoTrackMediaIdComponents(trackId=", this.a, ", contentId=", this.b, ", isDownloaded="), this.c, ")");
    }
}
