package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class s600 implements z600 {
    public final CharSequence a;
    public final r600 b;
    public final CharSequence c;
    public final x600 d;

    public s600(CharSequence charSequence, r600 r600Var, CharSequence charSequence2, x600 x600Var) {
        this.a = charSequence;
        this.b = r600Var;
        this.c = charSequence2;
        this.d = x600Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s600)) {
            return false;
        }
        s600 s600Var = (s600) obj;
        return jl40.l(this.a, s600Var.a) && jl40.l(this.b, s600Var.b) && jl40.l(this.c, s600Var.c) && jl40.l(this.d, s600Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + smw0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Content(userName=" + ((Object) this.a) + ", avatar=" + this.b + ", statusText=" + ((Object) this.c) + ", statusPlateBackground=" + this.d + Extension.C_BRAKE;
    }
}
