package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xrn0 {
    public final CharSequence a;
    public final CharSequence b;
    public final List c;
    public final wrn0 d;
    public final String e;

    public xrn0(CharSequence charSequence, CharSequence charSequence2, List list, wrn0 wrn0Var, String str) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = list;
        this.d = wrn0Var;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrn0)) {
            return false;
        }
        xrn0 xrn0Var = (xrn0) obj;
        return jl40.l(this.a, xrn0Var.a) && jl40.l(this.b, xrn0Var.b) && jl40.l(this.c, xrn0Var.c) && jl40.l(this.d, xrn0Var.d) && jl40.l(this.e, xrn0Var.e);
    }

    public final int hashCode() {
        int c = unr0.c(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        wrn0 wrn0Var = this.d;
        return this.e.hashCode() + ((c + (wrn0Var == null ? 0 : wrn0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "ScootersIgnitionPanelUiState(title=", ", subtitle=", ", banners=");
        r.append(this.c);
        r.append(", startEntryPoint=");
        r.append(this.d);
        r.append(", buttonTitle=");
        return oyr.t(r, this.e, Extension.C_BRAKE);
    }
}
