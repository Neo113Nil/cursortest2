package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x8x implements z8x {
    public final Long a;
    public final Long b;
    public final Boolean c;
    public final Boolean d;

    public x8x(Long l, Long l2, Boolean bool, Boolean bool2) {
        this.a = l;
        this.b = l2;
        this.c = bool;
        this.d = bool2;
    }

    public final Long a() {
        return this.b;
    }

    public final Long b() {
        return this.a;
    }

    public final Boolean c() {
        return this.d;
    }

    public final Boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8x)) {
            return false;
        }
        x8x x8xVar = (x8x) obj;
        return jl40.l(this.a, x8xVar.a) && jl40.l(this.b, x8xVar.b) && jl40.l(this.c, x8xVar.c) && jl40.l(this.d, x8xVar.d);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "PeriodicSchedule(repeatIntervalMinutes=" + this.a + ", firstDelayMinutes=" + this.b + ", requiresCharging=" + this.c + ", requiresBatteryNotLow=" + this.d + Extension.C_BRAKE;
    }
}
