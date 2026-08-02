package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zm51 {
    public final ety0 a;
    public final ety0 b;
    public final ety0 c;
    public final ety0 d;
    public final ety0 e;
    public final ety0 f;
    public final ety0 g;
    public final ety0 h;

    public zm51() {
        iyr iyrVar = wl51.a;
        lzr lzrVar = lzr.G;
        ety0 ety0Var = new ety0(0L, uh6.E(40), lzrVar, null, null, "pnum, lnum", uh6.w(-0.03d), 0, uh6.E(34), null, null, 16645945);
        ety0 ety0Var2 = new ety0(0L, uh6.E(32), lzrVar, null, null, "pnum, lnum", uh6.w(-0.03d), 0, uh6.E(28), null, null, 16645945);
        ety0 ety0Var3 = new ety0(0L, uh6.E(28), lzrVar, null, null, "pnum, lnum", uh6.w(-0.01d), 0, uh6.E(24), null, null, 16645945);
        lzr lzrVar2 = lzr.D;
        ety0 ety0Var4 = new ety0(0L, uh6.E(24), lzrVar2, null, null, "pnum, lnum", uh6.w(-0.01d), 0, uh6.E(21), null, null, 16645945);
        ety0 ety0Var5 = new ety0(0L, uh6.E(20), lzrVar2, null, null, "pnum, lnum", uh6.w(-0.01d), 0, uh6.E(20), null, null, 16645945);
        ety0 ety0Var6 = new ety0(0L, uh6.E(16), lzrVar2, null, null, "pnum, lnum", uh6.x(0), 0, uh6.E(17), null, null, 16645945);
        ety0 ety0Var7 = new ety0(0L, uh6.E(13), lzrVar2, null, null, "pnum, lnum", uh6.x(0), 0, uh6.E(14), null, null, 16645945);
        ety0 ety0Var8 = new ety0(0L, uh6.E(11), lzrVar2, null, null, "pnum, lnum", uh6.w(0.01d), 0, uh6.E(12), null, null, 16645945);
        ety0 a = an51.a(ety0Var, iyrVar);
        ety0 a2 = an51.a(ety0Var2, iyrVar);
        ety0 a3 = an51.a(ety0Var3, iyrVar);
        ety0 a4 = an51.a(ety0Var4, iyrVar);
        ety0 a5 = an51.a(ety0Var5, iyrVar);
        ety0 a6 = an51.a(ety0Var6, iyrVar);
        ety0 a7 = an51.a(ety0Var7, iyrVar);
        ety0 a8 = an51.a(ety0Var8, iyrVar);
        this.a = a;
        this.b = a2;
        this.c = a3;
        this.d = a4;
        this.e = a5;
        this.f = a6;
        this.g = a7;
        this.h = a8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm51)) {
            return false;
        }
        zm51 zm51Var = (zm51) obj;
        return jl40.l(this.a, zm51Var.a) && jl40.l(this.b, zm51Var.b) && jl40.l(this.c, zm51Var.c) && jl40.l(this.d, zm51Var.d) && jl40.l(this.e, zm51Var.e) && jl40.l(this.f, zm51Var.f) && jl40.l(this.g, zm51Var.g) && jl40.l(this.h, zm51Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + tse0.b(this.g, tse0.b(this.f, tse0.b(this.e, tse0.b(this.d, tse0.b(this.c, tse0.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YandexTypography(title1=");
        sb.append(this.a);
        sb.append(", title2=");
        sb.append(this.b);
        sb.append(", title3=");
        vfc.z(sb, this.c, ", title4=", this.d, ", body1=");
        vfc.z(sb, this.e, ", body2=", this.f, ", caption1=");
        sb.append(this.g);
        sb.append(", caption2=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
