package defpackage;

/* loaded from: classes4.dex */
public final class kfs {
    public final String a;
    public final String b;
    public final jfs c;
    public final jfs d;

    public kfs(String str, String str2, jfs jfsVar, jfs jfsVar2) {
        this.a = str;
        this.b = str2;
        this.c = jfsVar;
        this.d = jfsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfs)) {
            return false;
        }
        kfs kfsVar = (kfs) obj;
        return this.a.equals(kfsVar.a) && this.b.equals(kfsVar.b) && this.c.equals(kfsVar.c) && this.d.equals(kfsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ThenNowComparisonSlideContentUiData(title=", this.a, ", subtitle=", this.b, ", firstItem=");
        m.append(this.c);
        m.append(", secondItem=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
