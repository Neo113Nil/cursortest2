package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class znp0 {
    public final dk10 a;
    public final bo10 b;
    public final g4u0 c;
    public final l0v0 d;
    public final y8r0 e;
    public final fze f;
    public final yn11 g;

    public znp0(dk10 dk10Var, bo10 bo10Var, g4u0 g4u0Var, l0v0 l0v0Var, y8r0 y8r0Var, fze fzeVar, yn11 yn11Var) {
        this.a = dk10Var;
        this.b = bo10Var;
        this.c = g4u0Var;
        this.d = l0v0Var;
        this.e = y8r0Var;
        this.f = fzeVar;
        this.g = yn11Var;
    }

    public static znp0 a(znp0 znp0Var, l0v0 l0v0Var, fze fzeVar, int i) {
        dk10 dk10Var = znp0Var.a;
        bo10 bo10Var = znp0Var.b;
        g4u0 g4u0Var = znp0Var.c;
        if ((i & 8) != 0) {
            l0v0Var = znp0Var.d;
        }
        l0v0 l0v0Var2 = l0v0Var;
        y8r0 y8r0Var = znp0Var.e;
        if ((i & 32) != 0) {
            fzeVar = znp0Var.f;
        }
        yn11 yn11Var = znp0Var.g;
        znp0Var.getClass();
        return new znp0(dk10Var, bo10Var, g4u0Var, l0v0Var2, y8r0Var, fzeVar, yn11Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof znp0) {
            znp0 znp0Var = (znp0) obj;
            if (jl40.l(this.a, znp0Var.a) && jl40.l(this.b, znp0Var.b) && jl40.l(this.c, znp0Var.c) && jl40.l(this.d, znp0Var.d) && this.e == znp0Var.e && jl40.l(this.f, znp0Var.f) && jl40.l(this.g, znp0Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bo10 bo10Var = this.b;
        int hashCode2 = (hashCode + (bo10Var == null ? 0 : bo10Var.hashCode())) * 31;
        g4u0 g4u0Var = this.c;
        int hashCode3 = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (g4u0Var == null ? 0 : g4u0Var.hashCode())) * 31)) * 31)) * 31)) * 31;
        yn11 yn11Var = this.g;
        return hashCode3 + (yn11Var != null ? yn11Var.hashCode() : 0);
    }

    public final String toString() {
        return "SdkData(menuData=" + this.a + ", menuWebViewData=" + this.b + ", stateData=" + this.c + ", subscriptionData=" + this.d + ", settingsList=" + this.e + ", counterData=" + this.f + ", experiments=" + this.g + Extension.C_BRAKE;
    }
}
