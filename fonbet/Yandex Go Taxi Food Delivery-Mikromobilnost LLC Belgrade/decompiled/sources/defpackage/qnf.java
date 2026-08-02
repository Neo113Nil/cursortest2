package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class qnf {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public qnf(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnf)) {
            return false;
        }
        qnf qnfVar = (qnf) obj;
        return Float.compare(this.a, qnfVar.a) == 0 && Float.compare(this.b, qnfVar.b) == 0 && Float.compare(this.c, qnfVar.c) == 0 && Float.compare(this.d, qnfVar.d) == 0 && Float.compare(this.e, qnfVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder k = oo31.k("CutoutPx(cornerRadius=", this.a, ", height=", this.b, ", left=");
        vfc.x(k, this.c, ", top=", this.d, ", width=");
        return uw51.i(k, this.e, Extension.C_BRAKE);
    }
}
