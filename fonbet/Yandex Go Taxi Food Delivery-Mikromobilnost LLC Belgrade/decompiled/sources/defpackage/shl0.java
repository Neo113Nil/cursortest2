package defpackage;

/* loaded from: classes8.dex */
public final class shl0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Throwable f;
    public final String g;

    public shl0(String str, String str2, String str3, String str4, String str5, Throwable th, String str6, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        th = (i & 64) != 0 ? null : th;
        str6 = (i & 512) != 0 ? null : str6;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = th;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shl0)) {
            return false;
        }
        shl0 shl0Var = (shl0) obj;
        return jl40.l(this.a, shl0Var.a) && jl40.l(this.b, shl0Var.b) && jl40.l(this.c, shl0Var.c) && jl40.l(this.d, shl0Var.d) && jl40.l(this.e, shl0Var.e) && jl40.l(this.f, shl0Var.f) && jl40.l(this.g, shl0Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 961;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Throwable th = this.f;
        int hashCode6 = (hashCode5 + (th == null ? 0 : th.hashCode())) * 29791;
        String str6 = this.g;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RtmError(message=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", service=");
        sb.append(this.c);
        sb.append(", source=null, requestId=");
        sb.append(this.d);
        sb.append(", additional=");
        sb.append(this.e);
        sb.append(", errorCause=");
        sb.append(this.f);
        sb.append(", errorLevel=null, silent=null, url=");
        return b64.p(sb, this.g, ')');
    }

    public shl0() {
        this(null, null, null, null, null, null, null, 1023);
    }
}
