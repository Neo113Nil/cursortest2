package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class qk11 implements sk11, ct11 {
    public final String a;
    public final String b;
    public final wx21 c;
    public final String d;
    public final String e;
    public final String f;

    public qk11(String str, String str2, wx21 wx21Var, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = wx21Var;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // defpackage.ct11
    public final String a() {
        return this.d;
    }

    @Override // defpackage.ct11
    public final String b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk11)) {
            return false;
        }
        qk11 qk11Var = (qk11) obj;
        return jl40.l(this.a, qk11Var.a) && jl40.l(this.b, qk11Var.b) && jl40.l(this.c, qk11Var.c) && jl40.l(this.d, qk11Var.d) && jl40.l(this.e, qk11Var.e) && jl40.l(this.f, qk11Var.f);
    }

    @Override // defpackage.ct11
    public final String getDescription() {
        return this.b;
    }

    @Override // defpackage.ct11
    public final String getError() {
        return this.a;
    }

    @Override // defpackage.ct11
    public final wx21 getIcon() {
        return this.c;
    }

    @Override // defpackage.ct11
    public final String getTraceId() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        wx21 wx21Var = this.c;
        int hashCode3 = (hashCode2 + (wx21Var == null ? 0 : wx21Var.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Failed(error=", this.a, ", description=", this.b, ", icon=");
        v.append(this.c);
        v.append(", supportUrl=");
        v.append(this.d);
        v.append(", traceId=");
        return g8e.r(v, this.e, ", techInfo=", this.f, Extension.C_BRAKE);
    }
}
