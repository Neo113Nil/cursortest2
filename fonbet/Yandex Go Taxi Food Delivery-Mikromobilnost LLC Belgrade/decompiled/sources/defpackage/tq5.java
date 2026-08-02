package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class tq5 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final CharSequence f;
    public final long g;
    public final int h;
    public final CharSequence i;
    public final String j;
    public final CharSequence k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    public tq5(String str, boolean z, boolean z2, String str2, String str3, CharSequence charSequence, long j, int i, CharSequence charSequence2, String str4, CharSequence charSequence3, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
        this.e = str3;
        this.f = charSequence;
        this.g = j;
        this.h = i;
        this.i = charSequence2;
        this.j = str4;
        this.k = charSequence3;
        this.l = str5;
        this.m = str6;
        this.n = str7;
        this.o = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq5)) {
            return false;
        }
        tq5 tq5Var = (tq5) obj;
        return jl40.l(this.a, tq5Var.a) && this.b == tq5Var.b && this.c == tq5Var.c && jl40.l(this.d, tq5Var.d) && jl40.l(this.e, tq5Var.e) && jl40.l(this.f, tq5Var.f) && this.g == tq5Var.g && this.h == tq5Var.h && jl40.l(this.i, tq5Var.i) && jl40.l(this.j, tq5Var.j) && jl40.l(this.k, tq5Var.k) && jl40.l(this.l, tq5Var.l) && jl40.l(this.m, tq5Var.m) && jl40.l(this.n, tq5Var.n) && jl40.l(this.o, tq5Var.o);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(smw0.b(unr0.b(smw0.b(oyr.b(this.h, qv10.c(smw0.b(unr0.b(unr0.b(unr0.e(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        String str = this.o;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder l = oo31.l("BidModel(id=", this.a, ", isLoading=", ", isOutdated=", this.b);
        unr0.A(", driverName=", this.d, ", driverAvatarUrl=", l, this.c);
        l.append(this.e);
        l.append(", subtitle=");
        l.append((Object) this.f);
        l.append(", bidCreatedTime=");
        vfc.y(l, this.g, ", cancelTtlSeconds=", this.h);
        l.append(", price=");
        l.append((Object) this.i);
        l.append(", priceTitle=");
        l.append(this.j);
        l.append(", eta=");
        l.append((Object) this.k);
        l.append(", etaTitle=");
        l.append(this.l);
        g8e.D(l, ", cancelButtonTitle=", this.m, ", acceptButtonTitle=", this.n);
        return unr0.r(l, ", driverChip=", this.o, Extension.C_BRAKE);
    }
}
