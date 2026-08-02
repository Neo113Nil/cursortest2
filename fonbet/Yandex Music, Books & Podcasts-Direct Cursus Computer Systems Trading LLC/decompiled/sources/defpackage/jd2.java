package defpackage;

/* loaded from: classes3.dex */
public final class jd2 {
    public final String a;
    public final String b;
    public final String c;
    public final ce2 d;
    public final int e;

    public jd2(String str, String str2, String str3, ce2 ce2Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ce2Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jd2)) {
            return false;
        }
        jd2 jd2Var = (jd2) obj;
        String str = jd2Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = jd2Var.b;
        String str4 = this.b;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = jd2Var.c;
        String str6 = this.c;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        ce2 ce2Var = jd2Var.d;
        ce2 ce2Var2 = this.d;
        if (ce2Var2 == null) {
            if (ce2Var != null) {
                return false;
            }
        } else if (!ce2Var2.equals(ce2Var)) {
            return false;
        }
        int i = jd2Var.e;
        int i2 = this.e;
        return i2 == 0 ? i == 0 : ouj.a(i2, i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        ce2 ce2Var = this.d;
        int hashCode4 = (hashCode3 ^ (ce2Var == null ? 0 : ce2Var.hashCode())) * 1000003;
        int i = this.e;
        return (i != 0 ? ouj.D(i) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i = this.e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
