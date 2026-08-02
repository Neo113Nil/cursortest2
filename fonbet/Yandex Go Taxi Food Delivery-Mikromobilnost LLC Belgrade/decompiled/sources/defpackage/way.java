package defpackage;

/* loaded from: classes2.dex */
public final class way {
    public final String a;
    public final String b;

    public way(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof way)) {
            return false;
        }
        way wayVar = (way) obj;
        return this.a.equals(wayVar.a) && jl40.l(this.b, wayVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(text=");
        sb.append(this.a);
        sb.append(", link=");
        return b64.p(sb, this.b, ')');
    }
}
