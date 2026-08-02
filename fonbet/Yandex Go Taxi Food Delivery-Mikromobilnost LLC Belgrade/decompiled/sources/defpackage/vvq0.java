package defpackage;

/* loaded from: classes11.dex */
public final class vvq0 {
    public final String a;
    public final String b;

    public vvq0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvq0)) {
            return false;
        }
        vvq0 vvq0Var = (vvq0) obj;
        return jl40.l(this.a, vvq0Var.a) && jl40.l(this.b, vvq0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceInfo(userAgentString=");
        sb.append(this.a);
        sb.append(", message=");
        return b64.p(sb, this.b, ')');
    }
}
