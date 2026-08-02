package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zim {
    public final String a;
    public final long b;
    public final double c;
    public final double d;
    public final Long e;
    public final String f;

    public zim(String str, long j, double d, double d2, Long l, String str2) {
        this.a = str;
        this.b = j;
        this.c = d;
        this.d = d2;
        this.e = l;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zim.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        zim zimVar = (zim) obj;
        return this.b == zimVar.b && this.c == zimVar.c && this.d == zimVar.d;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + unr0.a(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder l = x4e.l("PointData(traceId=", this.a, ", timestamp=", this.b);
        nzs.o(l, ", lat=", this.c, ", lon=");
        l.append(this.d);
        l.append(", receivedTimestamp=");
        l.append(this.e);
        return unr0.r(l, ", source=", this.f, Extension.C_BRAKE);
    }
}
