package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class xgv {
    public final float a;
    public final int b;

    public xgv(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgv)) {
            return false;
        }
        xgv xgvVar = (xgv) obj;
        return Float.compare(this.a, xgvVar.a) == 0 && this.b == xgvVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "State(alpha=" + this.a + ", x=" + this.b + Extension.C_BRAKE;
    }
}
