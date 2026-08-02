package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rys0 implements tys0 {
    public final CharSequence a;
    public final String b;
    public final g400 c;

    public rys0(CharSequence charSequence, String str, g400 g400Var) {
        this.a = charSequence;
        this.b = str;
        this.c = g400Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rys0)) {
            return false;
        }
        rys0 rys0Var = (rys0) obj;
        return jl40.l(this.a, rys0Var.a) && jl40.l(this.b, rys0Var.b) && jl40.l(this.c, rys0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ArBoxesSmartCamera(title=" + ((Object) this.a) + ", surfaceScanText=" + this.b + ", cameraState=" + this.c + Extension.C_BRAKE;
    }
}
