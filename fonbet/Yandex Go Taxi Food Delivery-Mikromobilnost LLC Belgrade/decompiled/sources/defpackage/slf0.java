package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class slf0 implements ulf0 {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;

    public slf0(CharSequence charSequence, CharSequence charSequence2, String str) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slf0)) {
            return false;
        }
        slf0 slf0Var = (slf0) obj;
        return jl40.l(this.a, slf0Var.a) && jl40.l(this.b, slf0Var.b) && this.c.equals(slf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(vfc.r(this.a, this.b, "Content(title=", ", subtitle=", ", contentDescription="), this.c, Extension.C_BRAKE);
    }
}
