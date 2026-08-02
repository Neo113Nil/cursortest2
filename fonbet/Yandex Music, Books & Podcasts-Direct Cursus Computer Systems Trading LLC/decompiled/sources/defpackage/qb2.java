package defpackage;

/* loaded from: classes3.dex */
public final class qb2 extends oq6 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final nq6 k;
    public final tp6 l;
    public final qp6 m;

    public qb2(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, nq6 nq6Var, tp6 tp6Var, qp6 qp6Var) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = nq6Var;
        this.l = tp6Var;
        this.m = qp6Var;
    }

    public final pb2 a() {
        pb2 pb2Var = new pb2();
        pb2Var.a = this.b;
        pb2Var.b = this.c;
        pb2Var.c = this.d;
        pb2Var.d = this.e;
        pb2Var.e = this.f;
        pb2Var.f = this.g;
        pb2Var.g = this.h;
        pb2Var.h = this.i;
        pb2Var.i = this.j;
        pb2Var.j = this.k;
        pb2Var.k = this.l;
        pb2Var.l = this.m;
        pb2Var.m = (byte) 1;
        return pb2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oq6) {
            qb2 qb2Var = (qb2) ((oq6) obj);
            if (this.b.equals(qb2Var.b) && this.c.equals(qb2Var.c) && this.d == qb2Var.d && this.e.equals(qb2Var.e)) {
                String str = qb2Var.f;
                String str2 = this.f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = qb2Var.g;
                    String str4 = this.g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = qb2Var.h;
                        String str6 = this.h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.i.equals(qb2Var.i) && this.j.equals(qb2Var.j)) {
                                nq6 nq6Var = qb2Var.k;
                                nq6 nq6Var2 = this.k;
                                if (nq6Var2 != null ? nq6Var2.equals(nq6Var) : nq6Var == null) {
                                    tp6 tp6Var = qb2Var.l;
                                    tp6 tp6Var2 = this.l;
                                    if (tp6Var2 != null ? tp6Var2.equals(tp6Var) : tp6Var == null) {
                                        qp6 qp6Var = qb2Var.m;
                                        qp6 qp6Var2 = this.m;
                                        if (qp6Var2 != null ? qp6Var2.equals(qp6Var) : qp6Var == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        nq6 nq6Var = this.k;
        int hashCode5 = (hashCode4 ^ (nq6Var == null ? 0 : nq6Var.hashCode())) * 1000003;
        tp6 tp6Var = this.l;
        int hashCode6 = (hashCode5 ^ (tp6Var == null ? 0 : tp6Var.hashCode())) * 1000003;
        qp6 qp6Var = this.m;
        return hashCode6 ^ (qp6Var != null ? qp6Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
