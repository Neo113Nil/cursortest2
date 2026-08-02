package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ra11 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final List e;

    public ra11(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, List list) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = charSequence4;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra11)) {
            return false;
        }
        ra11 ra11Var = (ra11) obj;
        return jl40.l(this.a, ra11Var.a) && jl40.l(this.b, ra11Var.b) && jl40.l(this.c, ra11Var.c) && jl40.l(this.d, ra11Var.d) && jl40.l(this.e, ra11Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + smw0.b(smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "TransportTypeSelectorRawState(title=", ", applyButtonText=", ", resetButtonText=");
        vfc.A(r, this.c, ", disabledButtonText=", this.d, ", options=");
        return ly3.s(r, this.e, Extension.C_BRAKE);
    }
}
