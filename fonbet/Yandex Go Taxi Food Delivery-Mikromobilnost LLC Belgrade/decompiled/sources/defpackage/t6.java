package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class t6 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public t6(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj;
        return Float.compare(this.a, t6Var.a) == 0 && Float.compare(this.b, t6Var.b) == 0 && Float.compare(this.c, t6Var.c) == 0 && Float.compare(this.d, t6Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.q(oo31.k("AbsolutePixelPadding(start=", this.a, ", end=", this.b, ", top="), this.c, ", bottom=", this.d, Extension.C_BRAKE);
    }
}
