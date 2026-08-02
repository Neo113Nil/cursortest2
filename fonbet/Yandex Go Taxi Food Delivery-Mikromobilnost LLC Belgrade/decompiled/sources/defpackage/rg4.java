package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rg4 implements xg4 {
    public final bjy a;
    public final bjy b;

    public rg4(bjy bjyVar, bjy bjyVar2) {
        this.a = bjyVar;
        this.b = bjyVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg4)) {
            return false;
        }
        rg4 rg4Var = (rg4) obj;
        return this.a.equals(rg4Var.a) && jl40.l(this.b, rg4Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bjy bjyVar = this.b;
        return hashCode + (bjyVar == null ? 0 : bjyVar.hashCode());
    }

    public final String toString() {
        return "GradientBackground(lightGradient=" + this.a + ", darkGradient=" + this.b + Extension.C_BRAKE;
    }
}
