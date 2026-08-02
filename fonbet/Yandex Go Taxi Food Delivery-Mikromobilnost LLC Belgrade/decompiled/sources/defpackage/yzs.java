package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class yzs {
    public final double a;
    public final double b;

    public yzs(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzs)) {
            return false;
        }
        yzs yzsVar = (yzs) obj;
        return Double.compare(this.a, yzsVar.a) == 0 && Double.compare(this.b, yzsVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return unr0.p("GeoPoint(latitude=", td2.a(this.a), ", longitude=", td2.a(this.b), Extension.C_BRAKE);
    }
}
