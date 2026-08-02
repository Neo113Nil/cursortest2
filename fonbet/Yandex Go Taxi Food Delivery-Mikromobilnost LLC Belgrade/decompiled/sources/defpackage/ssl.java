package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ssl implements vsl {
    public final rr51 a;
    public final stz0 b;
    public final rr51 c;
    public final boolean d;
    public final yon e;
    public final rb6 f;

    public ssl(rr51 rr51Var, stz0 stz0Var, rr51 rr51Var2, boolean z, yon yonVar, rb6 rb6Var) {
        this.a = rr51Var;
        this.b = stz0Var;
        this.c = rr51Var2;
        this.d = z;
        this.e = yonVar;
        this.f = rb6Var;
    }

    @Override // defpackage.vsl
    public final rb6 a() {
        return this.f;
    }

    public final rr51 b() {
        return this.a;
    }

    public final yon c() {
        return this.e;
    }

    public final boolean d() {
        return this.d;
    }

    public final rr51 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssl)) {
            return false;
        }
        ssl sslVar = (ssl) obj;
        return jl40.l(this.a, sslVar.a) && jl40.l(this.b, sslVar.b) && jl40.l(this.c, sslVar.c) && this.d == sslVar.d && jl40.l(this.e, sslVar.e) && jl40.l(this.f, sslVar.f);
    }

    public final stz0 f() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        stz0 stz0Var = this.b;
        int hashCode2 = (hashCode + (stz0Var == null ? 0 : stz0Var.hashCode())) * 31;
        rr51 rr51Var = this.c;
        int e = unr0.e((hashCode2 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31, 31, this.d);
        yon yonVar = this.e;
        int hashCode3 = (e + (yonVar == null ? 0 : yonVar.hashCode())) * 31;
        rb6 rb6Var = this.f;
        return hashCode3 + (rb6Var != null ? rb6Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "Content(divkitData=" + this.a + ", toolbarState=" + this.b + ", toolbarDivData=" + this.c + ", showNavBar=" + this.d + ", educationV2State=" + this.e + ", bottomBarState=" + this.f + Extension.C_BRAKE;
    }
}
