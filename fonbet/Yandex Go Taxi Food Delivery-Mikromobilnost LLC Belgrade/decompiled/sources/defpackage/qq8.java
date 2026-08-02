package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class qq8 extends ye0 {
    public final int b;
    public final String c;
    public final String w;

    public qq8(int i, String str, String str2) {
        super("care.button_close_camera");
        this.b = i;
        this.c = str;
        this.w = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq8)) {
            return false;
        }
        qq8 qq8Var = (qq8) obj;
        return this.b == qq8Var.b && jl40.l(this.c, qq8Var.c) && this.w.equals(qq8Var.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + unr0.b(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return oyr.t(unr0.v(this.b, "CloseCameraButtonTapped(step=", ", type=", this.c, ", cameraType="), this.w, Extension.C_BRAKE);
    }
}
