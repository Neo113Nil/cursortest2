package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ztt0 {
    public final wtt0 a;
    public final ttt0 b;

    public ztt0(wtt0 wtt0Var, ttt0 ttt0Var) {
        this.a = wtt0Var;
        this.b = ttt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztt0)) {
            return false;
        }
        ztt0 ztt0Var = (ztt0) obj;
        return this.a.equals(ztt0Var.a) && jl40.l(this.b, ztt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SplitDepositPageResponseData(splitDepositPageEntity=" + this.a + ", splitDepositPageData=" + this.b + Extension.C_BRAKE;
    }
}
