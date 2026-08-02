package defpackage;

/* loaded from: classes2.dex */
public final class tld0 extends lu91 {
    public final String c;
    public final String d;
    public final String e;

    public tld0(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tld0)) {
            return false;
        }
        tld0 tld0Var = (tld0) obj;
        return jl40.l(this.c, tld0Var.c) && jl40.l(this.d, tld0Var.d) && jl40.l(this.e, tld0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(this.c.hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Icon(placeholderId=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", fallbackText=");
        return b64.p(sb, this.e, ')');
    }
}
