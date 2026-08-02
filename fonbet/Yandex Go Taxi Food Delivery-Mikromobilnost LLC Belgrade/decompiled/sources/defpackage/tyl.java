package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class tyl extends dk91 {
    public final double a;

    public tyl(double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyl) && Double.compare(this.a, ((tyl) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return "Temporary(timeInterval=" + this.a + Extension.C_BRAKE;
    }
}
