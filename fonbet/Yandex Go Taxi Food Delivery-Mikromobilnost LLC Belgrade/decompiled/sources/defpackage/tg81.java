package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class tg81 {
    public final qb71 a;
    public final d881 b;
    public final fe81 c;

    public tg81(fe81 fe81Var, d881 d881Var, qb71 qb71Var) {
        this.a = qb71Var;
        this.b = d881Var;
        this.c = fe81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg81)) {
            return false;
        }
        tg81 tg81Var = (tg81) obj;
        return jl40.l(this.a, tg81Var.a) && jl40.l(this.b, tg81Var.b) && jl40.l(this.c, tg81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdBlock(nativeAdResponse=" + this.a + ", adResponse=" + this.b + ", adConfiguration=" + this.c + Extension.C_BRAKE;
    }
}
