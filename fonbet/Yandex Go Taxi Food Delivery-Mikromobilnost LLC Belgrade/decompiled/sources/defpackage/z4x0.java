package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class z4x0 {
    public final CharSequence a;
    public final CharSequence b;
    public final x9x0 c;

    public z4x0(CharSequence charSequence, CharSequence charSequence2, x9x0 x9x0Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = x9x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4x0)) {
            return false;
        }
        z4x0 z4x0Var = (z4x0) obj;
        return jl40.l(this.a, z4x0Var.a) && jl40.l(this.b, z4x0Var.b) && this.c.equals(z4x0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "TabState(selectedText=", ", unselectedText=", ", widgetAction=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
