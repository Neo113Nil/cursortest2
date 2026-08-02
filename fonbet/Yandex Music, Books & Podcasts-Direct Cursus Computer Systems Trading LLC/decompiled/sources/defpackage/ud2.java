package defpackage;

/* loaded from: classes3.dex */
public final class ud2 extends peo {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public ud2(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            jj4.j("Null rolloutId");
            throw null;
        }
        this.b = str;
        if (str2 == null) {
            jj4.j("Null parameterKey");
            throw null;
        }
        this.c = str2;
        this.d = str3;
        if (str4 == null) {
            jj4.j("Null variantId");
            throw null;
        }
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof peo)) {
            return false;
        }
        ud2 ud2Var = (ud2) ((peo) obj);
        return this.b.equals(ud2Var.b) && this.c.equals(ud2Var.c) && this.d.equals(ud2Var.d) && this.e.equals(ud2Var.e) && this.f == ud2Var.f;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return hrg.m(this.f, "}", sb);
    }
}
