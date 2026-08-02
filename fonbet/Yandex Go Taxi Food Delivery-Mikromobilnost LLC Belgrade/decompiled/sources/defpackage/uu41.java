package defpackage;

/* loaded from: classes2.dex */
public final class uu41 {
    public final String a;
    public final String b;
    public final boolean c;

    public uu41(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu41)) {
            return false;
        }
        uu41 uu41Var = (uu41) obj;
        return jl40.l(this.a, uu41Var.a) && jl40.l(this.b, uu41Var.b) && this.c == uu41Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebViewToolbarData(url=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", canGoBack=");
        return unr0.u(sb, this.c, ')');
    }
}
