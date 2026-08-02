package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class s78 {
    public final float a;
    public final float b;
    public final float c;

    public s78(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s78)) {
            return false;
        }
        s78 s78Var = (s78) obj;
        return Float.compare(this.a, s78Var.a) == 0 && Float.compare(this.b, s78Var.b) == 0 && Float.compare(this.c, s78Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + g8e.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return uw51.i(oo31.k("CarPositionUiState(x=", this.a, ", y=", this.b, ", angle="), this.c, Extension.C_BRAKE);
    }
}
