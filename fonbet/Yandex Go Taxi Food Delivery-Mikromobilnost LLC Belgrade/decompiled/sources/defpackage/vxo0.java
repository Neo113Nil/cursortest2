package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class vxo0 {
    public final CharSequence a;
    public final CharSequence b;
    public final uxo0 c;

    public vxo0(CharSequence charSequence, CharSequence charSequence2, uxo0 uxo0Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = uxo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxo0)) {
            return false;
        }
        vxo0 vxo0Var = (vxo0) obj;
        return jl40.l(this.a, vxo0Var.a) && jl40.l(this.b, vxo0Var.b) && this.c.equals(vxo0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Button(title=", ", subtitle=", ", action=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
