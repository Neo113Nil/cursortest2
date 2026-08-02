package defpackage;

/* loaded from: classes2.dex */
public final class vqp0 extends crp0 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public vqp0(String str, String str2, String str3, String str4, String str5, String str6) {
        super("ServerBusinessError");
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return null;
    }

    @Override // defpackage.crp0
    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqp0)) {
            return false;
        }
        vqp0 vqp0Var = (vqp0) obj;
        return jl40.l(this.c, vqp0Var.c) && jl40.l(this.d, vqp0Var.d) && jl40.l(this.e, vqp0Var.e) && jl40.l(this.f, vqp0Var.f) && jl40.l(this.g, vqp0Var.g) && jl40.l(this.h, vqp0Var.h);
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        return (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
    }

    public final String i() {
        return this.f;
    }

    public final String toString() {
        StringBuilder v = b64.v("ServerBusinessError(url=", this.c, ", description=", this.d, ", supportUrl=");
        g8e.D(v, this.e, ", traceId=", this.f, ", techInfo=");
        return g8e.r(v, this.g, ", title=", this.h, ", payload=null)");
    }
}
