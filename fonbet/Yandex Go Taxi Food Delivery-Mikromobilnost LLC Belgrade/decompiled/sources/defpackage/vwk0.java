package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vwk0 {
    public final boolean a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public vwk0(int i) {
        float f = (i & 2) != 0 ? 1.0f : 0.5f;
        float f2 = (i & 8) != 0 ? 8.0f : 7.0f;
        float f3 = (i & 16) != 0 ? 1.5f : 3.0f;
        this.a = true;
        this.b = f;
        this.c = 0.5f;
        this.d = f2;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwk0)) {
            return false;
        }
        vwk0 vwk0Var = (vwk0) obj;
        return this.a == vwk0Var.a && Float.compare(this.b, vwk0Var.b) == 0 && Float.compare(this.c, vwk0Var.c) == 0 && Float.compare(this.d, vwk0Var.d) == 0 && Float.compare(this.e, vwk0Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rotation(enabled=");
        sb.append(this.a);
        sb.append(", speed=");
        sb.append(this.b);
        sb.append(", variance=");
        vfc.x(sb, this.c, ", multiplier2D=", this.d, ", multiplier3D=");
        return uw51.i(sb, this.e, Extension.C_BRAKE);
    }

    public vwk0() {
        this(31);
    }
}
