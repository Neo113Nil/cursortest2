package defpackage;

/* loaded from: classes15.dex */
public final class vhl0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public vhl0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhl0)) {
            return false;
        }
        vhl0 vhl0Var = (vhl0) obj;
        return jl40.l(this.a, vhl0Var.a) && jl40.l(this.b, vhl0Var.b) && jl40.l(this.c, vhl0Var.c) && jl40.l(this.d, vhl0Var.d) && jl40.l(this.e, vhl0Var.e);
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
        return (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("String(message=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", service=");
        sb.append(this.c);
        sb.append(", source=null, requestId=");
        sb.append(this.d);
        sb.append(", additional=");
        return oyr.t(sb, this.e, ", value=null, loggedIn=null)");
    }
}
