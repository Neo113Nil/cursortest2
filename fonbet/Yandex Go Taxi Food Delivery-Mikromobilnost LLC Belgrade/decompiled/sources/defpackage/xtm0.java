package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xtm0 {
    public final CharSequence a;
    public final CharSequence b;
    public final List c;

    public xtm0(CharSequence charSequence, CharSequence charSequence2, List list) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtm0)) {
            return false;
        }
        xtm0 xtm0Var = (xtm0) obj;
        return jl40.l(this.a, xtm0Var.a) && jl40.l(this.b, xtm0Var.b) && jl40.l(this.c, xtm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(vfc.r(this.a, this.b, "RenewGroup(title=", ", subtitle=", ", settingsElements="), this.c, Extension.C_BRAKE);
    }
}
