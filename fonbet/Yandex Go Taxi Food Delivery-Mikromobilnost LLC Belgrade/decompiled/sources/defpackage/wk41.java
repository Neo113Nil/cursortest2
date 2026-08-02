package defpackage;

/* loaded from: classes2.dex */
public final class wk41 {
    public final szg a;
    public final boolean b;
    public final String c;

    public wk41(szg szgVar, boolean z, String str) {
        this.a = szgVar;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk41)) {
            return false;
        }
        wk41 wk41Var = (wk41) obj;
        return this.a.equals(wk41Var.a) && this.b == wk41Var.b && jl40.l(this.c, wk41Var.c);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebStoriesEntry(story=");
        sb.append(this.a);
        sb.append(", isActive=");
        sb.append(this.b);
        sb.append(", data=");
        return b64.p(sb, this.c, ')');
    }
}
