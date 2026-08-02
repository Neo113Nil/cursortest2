package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tc1 implements uc1 {
    public final String a;
    public final sc1 b;

    public tc1(String str, sc1 sc1Var) {
        this.a = str;
        this.b = sc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc1)) {
            return false;
        }
        tc1 tc1Var = (tc1) obj;
        return jl40.l(this.a, tc1Var.a) && jl40.l(this.b, tc1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sc1 sc1Var = this.b;
        return hashCode + (sc1Var == null ? 0 : sc1Var.hashCode());
    }

    public final String toString() {
        return "UrbanAdsSettings(page=" + this.a + ", overrides=" + this.b + Extension.C_BRAKE;
    }
}
