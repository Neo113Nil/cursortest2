package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class rsd0 {
    public static final qsd0 Companion = new qsd0();
    public final float a;
    public final float b;

    public /* synthetic */ rsd0(int i, float f, float f2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, psd0.a.getDescriptor());
            throw null;
        }
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rsd0.class == obj.getClass()) {
            rsd0 rsd0Var = (rsd0) obj;
            if (this.a == rsd0Var.a && this.b == rsd0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("Point(x=", this.a, ", y=", this.b, Extension.C_BRAKE);
    }
}
