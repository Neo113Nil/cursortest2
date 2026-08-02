package org.joda.time.chrono;

import defpackage.aun;
import defpackage.d2a;
import defpackage.fnj;
import defpackage.k5r;
import defpackage.psa;
import defpackage.rk4;
import defpackage.tq1;
import defpackage.xc7;
import defpackage.xq0;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.field.MillisDurationField;

/* loaded from: classes5.dex */
public final class GregorianChronology extends BasicGJChronology {
    private static final long serialVersionUID = -861407383323710522L;
    public static final ConcurrentHashMap M0 = new ConcurrentHashMap();
    public static final GregorianChronology L0 = m0(DateTimeZone.a, 4);

    public static GregorianChronology m0(DateTimeZone dateTimeZone, int i) {
        GregorianChronology gregorianChronology;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.e();
        }
        ConcurrentHashMap concurrentHashMap = M0;
        GregorianChronology[] gregorianChronologyArr = (GregorianChronology[]) concurrentHashMap.get(dateTimeZone);
        if (gregorianChronologyArr == null) {
            gregorianChronologyArr = new GregorianChronology[7];
            GregorianChronology[] gregorianChronologyArr2 = (GregorianChronology[]) concurrentHashMap.putIfAbsent(dateTimeZone, gregorianChronologyArr);
            if (gregorianChronologyArr2 != null) {
                gregorianChronologyArr = gregorianChronologyArr2;
            }
        }
        int i2 = i - 1;
        try {
            GregorianChronology gregorianChronology2 = gregorianChronologyArr[i2];
            if (gregorianChronology2 != null) {
                return gregorianChronology2;
            }
            synchronized (gregorianChronologyArr) {
                try {
                    gregorianChronology = gregorianChronologyArr[i2];
                    if (gregorianChronology == null) {
                        DateTimeZone dateTimeZone2 = DateTimeZone.a;
                        gregorianChronology = dateTimeZone == dateTimeZone2 ? new GregorianChronology(null, i) : new GregorianChronology(ZonedChronology.X(m0(dateTimeZone2, i), dateTimeZone), i);
                        gregorianChronologyArr[i2] = gregorianChronology;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return gregorianChronology;
        } catch (ArrayIndexOutOfBoundsException unused) {
            xq0.x(k5r.i(i, "Invalid min days in first week: "));
            return null;
        }
    }

    private Object readResolve() {
        rk4 P = P();
        int Z = super.Z();
        if (Z == 0) {
            Z = 4;
        }
        return P == null ? m0(DateTimeZone.a, Z) : m0(P.k(), Z);
    }

    @Override // org.joda.time.chrono.AssembledChronology, defpackage.rk4
    public final rk4 H() {
        return L0;
    }

    @Override // defpackage.rk4
    public final rk4 I(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.e();
        }
        return dateTimeZone == k() ? this : m0(dateTimeZone, 4);
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public final void N(tq1 tq1Var) {
        if (P() == null) {
            tq1Var.a = MillisDurationField.a;
            tq1Var.b = BasicChronology.K;
            tq1Var.c = BasicChronology.L;
            tq1Var.d = BasicChronology.X;
            tq1Var.e = BasicChronology.Y;
            tq1Var.f = BasicChronology.Z;
            tq1Var.g = BasicChronology.v0;
            tq1Var.m = BasicChronology.w0;
            tq1Var.n = BasicChronology.x0;
            tq1Var.o = BasicChronology.y0;
            tq1Var.p = BasicChronology.z0;
            tq1Var.q = BasicChronology.A0;
            tq1Var.r = BasicChronology.B0;
            tq1Var.s = BasicChronology.C0;
            tq1Var.u = BasicChronology.D0;
            tq1Var.t = BasicChronology.E0;
            tq1Var.v = BasicChronology.F0;
            tq1Var.w = BasicChronology.G0;
            c cVar = new c(this, 1);
            tq1Var.E = cVar;
            f fVar = new f(cVar, this);
            tq1Var.F = fVar;
            fnj fnjVar = new fnj(fVar, DateTimeFieldType.b, 99);
            DateTimeFieldType dateTimeFieldType = DateTimeFieldType.a;
            d2a d2aVar = new d2a(fnjVar);
            tq1Var.H = d2aVar;
            tq1Var.k = d2aVar.d;
            tq1Var.G = new fnj(new aun(d2aVar, d2aVar.b.g(), d2aVar.a), DateTimeFieldType.d, 1);
            tq1Var.I = new d(this);
            tq1Var.x = new b(this, tq1Var.f, 3);
            tq1Var.y = new b(this, tq1Var.f, 0);
            tq1Var.z = new b(this, tq1Var.f, 1);
            tq1Var.D = new e(this);
            tq1Var.B = new c(this, 0);
            tq1Var.A = new b(this, tq1Var.g, 2);
            xc7 xc7Var = tq1Var.B;
            psa psaVar = tq1Var.k;
            tq1Var.C = new fnj(new aun(xc7Var, psaVar), DateTimeFieldType.i, 1);
            tq1Var.j = tq1Var.E.g();
            tq1Var.i = tq1Var.D.g();
            tq1Var.h = tq1Var.B.g();
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public final boolean h0(int i) {
        if ((i & 3) == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology, defpackage.rk4
    public final DateTimeZone k() {
        rk4 P = P();
        return P != null ? P.k() : DateTimeZone.a;
    }
}
