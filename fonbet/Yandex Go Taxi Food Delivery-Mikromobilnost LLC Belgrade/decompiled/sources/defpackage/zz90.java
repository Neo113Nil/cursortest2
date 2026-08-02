package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class zz90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ptv e;
    public final qfo f;

    public zz90(String str, String str2, String str3, String str4, ptv ptvVar, qfo qfoVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ptvVar;
        this.f = qfoVar;
    }

    public final qfo a() {
        return this.f;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final ptv d() {
        return this.e;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz90)) {
            return false;
        }
        zz90 zz90Var = (zz90) obj;
        return jl40.l(this.a, zz90Var.a) && jl40.l(this.b, zz90Var.b) && jl40.l(this.c, zz90Var.c) && jl40.l(this.d, zz90Var.d) && jl40.l(this.e, zz90Var.e) && jl40.l(this.f, zz90Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ptv ptvVar = this.e;
        int hashCode5 = (hashCode4 + (ptvVar == null ? 0 : ptvVar.hashCode())) * 31;
        qfo qfoVar = this.f;
        return hashCode5 + (qfoVar != null ? qfoVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentExtraInfo(id=", this.a, ", message=", this.b, ", info=");
        g8e.D(v, this.c, ", infoInsteadDate=", this.d, ", infoScreen=");
        v.append(this.e);
        v.append(", eventInfo=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public zz90() {
        this(null, null, null, null, null, null);
    }
}
