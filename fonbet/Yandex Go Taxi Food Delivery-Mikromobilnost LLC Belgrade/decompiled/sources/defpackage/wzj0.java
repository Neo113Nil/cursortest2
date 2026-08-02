package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public abstract class wzj0 {
    public final float a;
    public final float b;

    public wzj0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static float a(wzj0 wzj0Var, wzj0 wzj0Var2) {
        float f = wzj0Var.a;
        float f2 = wzj0Var.b;
        double d = f - wzj0Var2.a;
        double d2 = f2 - wzj0Var2.b;
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wzj0) {
            wzj0 wzj0Var = (wzj0) obj;
            if (this.a == wzj0Var.a && this.b == wzj0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Extension.O_BRAKE);
        sb.append(this.a);
        sb.append(HexString.CHAR_COMMA);
        return n.n(sb, this.b, ')');
    }
}
