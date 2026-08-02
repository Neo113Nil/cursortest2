package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class rqn0 {
    public final boolean a;
    public final String b;
    public final List c;
    public final String d;
    public final gqn0 e;
    public final boolean f;
    public final boolean g;

    public rqn0(boolean z, String str, List list, String str2, gqn0 gqn0Var, boolean z2, boolean z3) {
        this.a = z;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = gqn0Var;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqn0)) {
            return false;
        }
        rqn0 rqn0Var = (rqn0) obj;
        return this.a == rqn0Var.a && jl40.l(this.b, rqn0Var.b) && this.c.equals(rqn0Var.c) && jl40.l(this.d, rqn0Var.d) && jl40.l(this.e, rqn0Var.e) && this.f == rqn0Var.f && this.g == rqn0Var.g;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.c(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        gqn0 gqn0Var = this.e;
        return Boolean.hashCode(this.g) + unr0.e((b + (gqn0Var == null ? 0 : gqn0Var.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder v = ly3.v("ScootersIgnitionControllingUiState(firstShowing=", ", title=", this.b, ", groups=", this.a);
        oyr.D(", buttonText=", this.d, ", bottomLegalTerms=", v, this.c);
        v.append(this.e);
        v.append(", allowToEnableFeature=");
        v.append(this.f);
        v.append(", featureEnabled=");
        return x4e.i(v, this.g, Extension.C_BRAKE);
    }
}
