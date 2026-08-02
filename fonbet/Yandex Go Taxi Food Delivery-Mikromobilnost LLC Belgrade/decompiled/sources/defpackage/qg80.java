package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class qg80 {
    public final svj a;
    public final ti80 b;
    public final lg80 c;
    public final String d;
    public final String e;
    public final String f;
    public final Boolean g;

    public qg80(svj svjVar, ti80 ti80Var, lg80 lg80Var, String str, String str2, String str3, Boolean bool) {
        this.a = svjVar;
        this.b = ti80Var;
        this.c = lg80Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg80)) {
            return false;
        }
        qg80 qg80Var = (qg80) obj;
        return jl40.l(this.a, qg80Var.a) && jl40.l(this.b, qg80Var.b) && jl40.l(this.c, qg80Var.c) && jl40.l(this.d, qg80Var.d) && jl40.l(this.e, qg80Var.e) && jl40.l(this.f, qg80Var.f) && jl40.l(this.g, qg80Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.g;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationCardRestoreInfo(source=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", mode=");
        sb.append(this.c);
        sb.append(", yclid=");
        sb.append(this.d);
        sb.append(", bannerId=");
        g8e.D(sb, this.e, ", permalinkSource=", this.f, ", isPaid=");
        return nzs.d(sb, this.g, Extension.C_BRAKE);
    }
}
