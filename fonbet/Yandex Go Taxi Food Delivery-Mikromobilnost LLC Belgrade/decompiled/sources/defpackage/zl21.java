package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class zl21 {
    public final String a;
    public final String b;
    public final String c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public zl21(String str, String str2, String str3, Long l, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, String str7, boolean z5, boolean z6, boolean z7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = str7;
        this.m = z5;
        this.n = z6;
        this.o = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl21)) {
            return false;
        }
        zl21 zl21Var = (zl21) obj;
        return jl40.l(this.a, zl21Var.a) && jl40.l(this.b, zl21Var.b) && jl40.l(this.c, zl21Var.c) && this.d.equals(zl21Var.d) && this.e.equals(zl21Var.e) && jl40.l(this.f, zl21Var.f) && this.g.equals(zl21Var.g) && this.h == zl21Var.h && this.i == zl21Var.i && this.j == zl21Var.j && this.k == zl21Var.k && jl40.l(this.l, zl21Var.l) && this.m == zl21Var.m && this.n == zl21Var.n && this.o == zl21Var.o;
    }

    public final int hashCode() {
        int b = unr0.b((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        String str = this.f;
        int e = unr0.e(unr0.e(unr0.e(unr0.e(unr0.b((b + (str == null ? 0 : str.hashCode())) * 29791, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        String str2 = this.l;
        return Boolean.hashCode(this.o) + unr0.e(unr0.e((e + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder v = b64.v("ReducedInfo(userId=", this.a, ", displayName=", this.b, ", shownName=");
        v.append(this.c);
        v.append(", userReducedVersion=");
        v.append(this.d);
        v.append(", avatarUrl=");
        g8e.D(v, this.e, ", phoneId=", this.f, ", contactId=null, lookupId=null, userSearchKey=");
        tse0.y(this.g, ", robot=", ", cannotBeBlocked=", v, this.h);
        nnm.v(", isSupportBot=", ", disablePrivates=", v, this.i, this.j);
        unr0.A(", website=", this.l, ", isContact=", v, this.k);
        nnm.v(", deleted=", ", isFake=", v, this.m, this.n);
        return x4e.i(v, this.o, Extension.C_BRAKE);
    }
}
