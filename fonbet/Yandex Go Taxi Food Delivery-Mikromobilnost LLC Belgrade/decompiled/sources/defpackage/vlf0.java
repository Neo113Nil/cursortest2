package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vlf0 {
    public final CharSequence a;
    public final wp2 b;
    public final wp2 c;
    public final sls d;

    public vlf0(CharSequence charSequence, wp2 wp2Var, wp2 wp2Var2, sls slsVar) {
        this.a = charSequence;
        this.b = wp2Var;
        this.c = wp2Var2;
        this.d = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlf0)) {
            return false;
        }
        vlf0 vlf0Var = (vlf0) obj;
        return jl40.l(this.a, vlf0Var.a) && jl40.l(this.b, vlf0Var.b) && jl40.l(this.c, vlf0Var.c) && this.d.equals(vlf0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + n.b(this.c, n.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "PromoButtonUiState(text=" + ((Object) this.a) + ", textColor=" + this.b + ", backgroundColor=" + this.c + ", clickCallback=" + this.d + Extension.C_BRAKE;
    }
}
