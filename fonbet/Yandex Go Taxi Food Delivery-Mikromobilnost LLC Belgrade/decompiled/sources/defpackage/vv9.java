package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vv9 {
    public final CharSequence a;
    public final CharSequence b;
    public final nvi0 c;
    public final int d;

    public vv9(CharSequence charSequence, CharSequence charSequence2, ovi0 ovi0Var, int i) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = ovi0Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv9)) {
            return false;
        }
        vv9 vv9Var = (vv9) obj;
        return jl40.l(this.a, vv9Var.a) && jl40.l(this.b, vv9Var.b) && jl40.l(this.c, vv9Var.c) && this.d == vv9Var.d;
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        nvi0 nvi0Var = this.c;
        return Integer.hashCode(this.d) + ((b + (nvi0Var == null ? 0 : nvi0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "ChargersDiscountNotificationUiState(title=", ", subtitle=", ", image=");
        r.append(this.c);
        r.append(", backgroundColor=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
