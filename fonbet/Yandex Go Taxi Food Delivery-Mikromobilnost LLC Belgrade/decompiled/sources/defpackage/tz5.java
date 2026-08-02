package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tz5 implements evz {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public tz5(String str, boolean z, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // defpackage.evz
    public final String a() {
        return this.e;
    }

    @Override // defpackage.evz
    public final String b() {
        return this.f;
    }

    @Override // defpackage.evz
    public final String c() {
        return this.g;
    }

    @Override // defpackage.evz
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz5)) {
            return false;
        }
        tz5 tz5Var = (tz5) obj;
        return jl40.l(this.a, tz5Var.a) && this.b == tz5Var.b && jl40.l(this.c, tz5Var.c) && jl40.l(this.d, tz5Var.d) && jl40.l(this.e, tz5Var.e) && jl40.l(this.f, tz5Var.f) && jl40.l(this.g, tz5Var.g);
    }

    @Override // defpackage.evz
    public final String getHeader() {
        return this.d;
    }

    @Override // defpackage.evz
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.evz
    public final String getName() {
        return this.c;
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder l = oo31.l("BirbonusLoyaltyProgram(id=", this.a, ", isPrimary=", ", name=", this.b);
        g8e.D(l, this.c, ", header=", this.d, ", balance=");
        g8e.D(l, this.e, ", formattedBalance=", this.f, ", balanceDescription=");
        return oyr.t(l, this.g, Extension.C_BRAKE);
    }
}
