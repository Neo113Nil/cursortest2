package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yto {
    public final double a;
    public final double b;
    public final long c;

    public yto(double d, double d2, long j) {
        this.a = d;
        this.b = d2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yto)) {
            return false;
        }
        yto ytoVar = (yto) obj;
        return Double.compare(this.a, ytoVar.a) == 0 && Double.compare(this.b, ytoVar.b) == 0 && this.c == ytoVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "ExplorerLastLocationPosition(latitude=", ", longitude=");
        u.append(this.b);
        return g8e.l(this.c, ", timeSeconds=", Extension.C_BRAKE, u);
    }
}
