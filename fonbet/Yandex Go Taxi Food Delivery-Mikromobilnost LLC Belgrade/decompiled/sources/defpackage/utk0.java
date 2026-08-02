package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class utk0 {
    public final CharSequence a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;

    public utk0(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utk0)) {
            return false;
        }
        utk0 utk0Var = (utk0) obj;
        if (!jl40.l(this.a, utk0Var.a) || !jl40.l(this.b, utk0Var.b)) {
            return false;
        }
        huk0 huk0Var = huk0.a;
        return huk0Var.equals(huk0Var) && this.c == utk0Var.c && this.d == utk0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 613412633) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "RoadsButtonUiState(title=", ", subtitle=", ", uiAction=");
        r.append(huk0.a);
        r.append(", isEnabled=");
        r.append(this.c);
        r.append(", isShimmering=");
        return x4e.i(r, this.d, Extension.C_BRAKE);
    }
}
