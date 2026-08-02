package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class td2 {
    public final double a;

    public static String a(double d) {
        return "Angle(valueDegrees=" + d + Extension.C_BRAKE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof td2) {
            return Double.compare(this.a, ((td2) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
