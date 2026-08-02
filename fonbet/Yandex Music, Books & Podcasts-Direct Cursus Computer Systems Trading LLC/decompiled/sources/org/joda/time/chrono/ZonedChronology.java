package org.joda.time.chrono;

import defpackage.e7o;
import defpackage.psa;
import defpackage.rk4;
import defpackage.tq1;
import defpackage.xc7;
import defpackage.xq0;
import defpackage.ytw;
import java.util.HashMap;
import org.joda.time.DateTimeZone;
import org.joda.time.field.BaseDurationField;

/* loaded from: classes5.dex */
public final class ZonedChronology extends AssembledChronology {
    private static final long serialVersionUID = -1079258847191166848L;

    public static class ZonedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -485345310999208286L;
        final psa iField;
        final boolean iTimeField;
        final DateTimeZone iZone;

        public ZonedDurationField(psa psaVar, DateTimeZone dateTimeZone) {
            super(psaVar.c());
            if (!psaVar.f()) {
                e7o.e();
                throw null;
            }
            this.iField = psaVar;
            this.iTimeField = psaVar.d() < 43200000;
            this.iZone = dateTimeZone;
        }

        @Override // defpackage.psa
        public final long a(int i, long j) {
            int h = h(j);
            long a = this.iField.a(i, j + h);
            if (!this.iTimeField) {
                h = g(a);
            }
            return a - h;
        }

        @Override // defpackage.psa
        public final long b(long j, long j2) {
            int h = h(j);
            long b = this.iField.b(j + h, j2);
            if (!this.iTimeField) {
                h = g(b);
            }
            return b - h;
        }

        @Override // defpackage.psa
        public final long d() {
            return this.iField.d();
        }

        @Override // defpackage.psa
        public final boolean e() {
            boolean z = this.iTimeField;
            psa psaVar = this.iField;
            return z ? psaVar.e() : psaVar.e() && this.iZone.p();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ZonedDurationField) {
                ZonedDurationField zonedDurationField = (ZonedDurationField) obj;
                if (this.iField.equals(zonedDurationField.iField) && this.iZone.equals(zonedDurationField.iZone)) {
                    return true;
                }
            }
            return false;
        }

        public final int g(long j) {
            int k = this.iZone.k(j);
            long j2 = k;
            if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
                return k;
            }
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }

        public final int h(long j) {
            int j2 = this.iZone.j(j);
            long j3 = j2;
            if (((j + j3) ^ j) >= 0 || (j ^ j3) < 0) {
                return j2;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        public final int hashCode() {
            return this.iField.hashCode() ^ this.iZone.hashCode();
        }
    }

    public static ZonedChronology X(rk4 rk4Var, DateTimeZone dateTimeZone) {
        if (rk4Var == null) {
            xq0.x("Must supply a chronology");
            return null;
        }
        rk4 H = rk4Var.H();
        if (H == null) {
            xq0.x("UTC chronology must not be null");
            return null;
        }
        if (dateTimeZone != null) {
            return new ZonedChronology(H, dateTimeZone);
        }
        xq0.x("DateTimeZone must not be null");
        return null;
    }

    @Override // defpackage.rk4
    public final rk4 I(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.e();
        }
        return dateTimeZone == R() ? this : dateTimeZone == DateTimeZone.a ? P() : new ZonedChronology(P(), dateTimeZone);
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public final void N(tq1 tq1Var) {
        HashMap hashMap = new HashMap();
        tq1Var.l = V(tq1Var.l, hashMap);
        tq1Var.k = V(tq1Var.k, hashMap);
        tq1Var.j = V(tq1Var.j, hashMap);
        tq1Var.i = V(tq1Var.i, hashMap);
        tq1Var.h = V(tq1Var.h, hashMap);
        tq1Var.g = V(tq1Var.g, hashMap);
        tq1Var.f = V(tq1Var.f, hashMap);
        tq1Var.e = V(tq1Var.e, hashMap);
        tq1Var.d = V(tq1Var.d, hashMap);
        tq1Var.c = V(tq1Var.c, hashMap);
        tq1Var.b = V(tq1Var.b, hashMap);
        tq1Var.a = V(tq1Var.a, hashMap);
        tq1Var.E = U(tq1Var.E, hashMap);
        tq1Var.F = U(tq1Var.F, hashMap);
        tq1Var.G = U(tq1Var.G, hashMap);
        tq1Var.H = U(tq1Var.H, hashMap);
        tq1Var.I = U(tq1Var.I, hashMap);
        tq1Var.x = U(tq1Var.x, hashMap);
        tq1Var.y = U(tq1Var.y, hashMap);
        tq1Var.z = U(tq1Var.z, hashMap);
        tq1Var.D = U(tq1Var.D, hashMap);
        tq1Var.A = U(tq1Var.A, hashMap);
        tq1Var.B = U(tq1Var.B, hashMap);
        tq1Var.C = U(tq1Var.C, hashMap);
        tq1Var.m = U(tq1Var.m, hashMap);
        tq1Var.n = U(tq1Var.n, hashMap);
        tq1Var.o = U(tq1Var.o, hashMap);
        tq1Var.p = U(tq1Var.p, hashMap);
        tq1Var.q = U(tq1Var.q, hashMap);
        tq1Var.r = U(tq1Var.r, hashMap);
        tq1Var.s = U(tq1Var.s, hashMap);
        tq1Var.u = U(tq1Var.u, hashMap);
        tq1Var.t = U(tq1Var.t, hashMap);
        tq1Var.v = U(tq1Var.v, hashMap);
        tq1Var.w = U(tq1Var.w, hashMap);
    }

    public final xc7 U(xc7 xc7Var, HashMap hashMap) {
        if (xc7Var == null || !xc7Var.t()) {
            return xc7Var;
        }
        if (hashMap.containsKey(xc7Var)) {
            return (xc7) hashMap.get(xc7Var);
        }
        ytw ytwVar = new ytw(xc7Var, (DateTimeZone) R(), V(xc7Var.g(), hashMap), V(xc7Var.p(), hashMap), V(xc7Var.h(), hashMap));
        hashMap.put(xc7Var, ytwVar);
        return ytwVar;
    }

    public final psa V(psa psaVar, HashMap hashMap) {
        if (psaVar == null || !psaVar.f()) {
            return psaVar;
        }
        if (hashMap.containsKey(psaVar)) {
            return (psa) hashMap.get(psaVar);
        }
        ZonedDurationField zonedDurationField = new ZonedDurationField(psaVar, (DateTimeZone) R());
        hashMap.put(psaVar, zonedDurationField);
        return zonedDurationField;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedChronology)) {
            return false;
        }
        ZonedChronology zonedChronology = (ZonedChronology) obj;
        return P().equals(zonedChronology.P()) && ((DateTimeZone) R()).equals((DateTimeZone) zonedChronology.R());
    }

    public final int hashCode() {
        return (P().hashCode() * 7) + (((DateTimeZone) R()).hashCode() * 11) + 326565;
    }

    @Override // org.joda.time.chrono.AssembledChronology, defpackage.rk4
    public final DateTimeZone k() {
        return (DateTimeZone) R();
    }

    public final String toString() {
        return "ZonedChronology[" + P() + ", " + ((DateTimeZone) R()).f() + ']';
    }
}
