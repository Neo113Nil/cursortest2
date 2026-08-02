package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qq10 {
    public final qc70 a;
    public final List b;
    public final kao c;

    public qq10(qc70 qc70Var, List list, kao kaoVar) {
        this.a = qc70Var;
        this.b = list;
        this.c = kaoVar;
    }

    public final kao a() {
        return this.c;
    }

    public final qc70 b() {
        return this.a;
    }

    public final List c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq10)) {
            return false;
        }
        qq10 qq10Var = (qq10) obj;
        return this.a.equals(qq10Var.a) && this.b.equals(qq10Var.b) && jl40.l(this.c, qq10Var.c);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        kao kaoVar = this.c;
        return c + (kaoVar == null ? 0 : kaoVar.hashCode());
    }

    public final String toString() {
        return "MerchantOffersTestSearchViewState(loadingState=" + this.a + ", screenItems=" + this.b + ", errorState=" + this.c + Extension.C_BRAKE;
    }
}
