package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zcx0 {
    public final v0f0 a;
    public final v0f0 b;
    public final v0f0 c;

    public zcx0(v0f0 v0f0Var, v0f0 v0f0Var2, v0f0 v0f0Var3) {
        this.a = v0f0Var;
        this.b = v0f0Var2;
        this.c = v0f0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcx0)) {
            return false;
        }
        zcx0 zcx0Var = (zcx0) obj;
        return jl40.l(this.a, zcx0Var.a) && jl40.l(this.b, zcx0Var.b) && jl40.l(this.c, zcx0Var.c);
    }

    public final int hashCode() {
        v0f0 v0f0Var = this.a;
        int hashCode = (v0f0Var == null ? 0 : v0f0Var.hashCode()) * 31;
        v0f0 v0f0Var2 = this.b;
        int hashCode2 = (hashCode + (v0f0Var2 == null ? 0 : v0f0Var2.hashCode())) * 31;
        v0f0 v0f0Var3 = this.c;
        return hashCode2 + (v0f0Var3 != null ? v0f0Var3.hashCode() : 0);
    }

    public final String toString() {
        return "TariffCardPriceUi(tariffCard=" + this.a + ", fullscreenTariffCard=" + this.b + ", tariffCardDetails=" + this.c + Extension.C_BRAKE;
    }
}
