package defpackage;

/* loaded from: classes2.dex */
public final class szc0 implements xzc0 {
    public final String a;
    public final String b;

    public szc0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szc0)) {
            return false;
        }
        szc0 szc0Var = (szc0) obj;
        return jl40.l(this.a, szc0Var.a) && jl40.l(this.b, szc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(page=");
        sb.append(this.a);
        sb.append(", place=");
        return b64.p(sb, this.b, ')');
    }
}
