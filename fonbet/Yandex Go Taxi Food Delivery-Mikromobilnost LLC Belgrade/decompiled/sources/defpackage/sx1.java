package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sx1 {
    public final CharSequence a;
    public final List b;
    public final qx1 c;
    public final qx1 d;

    public sx1(CharSequence charSequence, List list, qx1 qx1Var, qx1 qx1Var2) {
        this.a = charSequence;
        this.b = list;
        this.c = qx1Var;
        this.d = qx1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx1)) {
            return false;
        }
        sx1 sx1Var = (sx1) obj;
        return jl40.l(this.a, sx1Var.a) && jl40.l(this.b, sx1Var.b) && jl40.l(this.c, sx1Var.c) && this.d.equals(sx1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "AlternativeSourceCardUiState(title=" + ((Object) this.a) + ", cardItems=" + this.b + ", declineButton=" + this.c + ", confirmButton=" + this.d + Extension.C_BRAKE;
    }
}
