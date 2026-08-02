package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes5.dex */
public final class yc7 {
    public final qve a;
    public final cve b;
    public final rk4 c;
    public final DateTimeZone d;

    public yc7(qve qveVar, cve cveVar) {
        this.a = qveVar;
        this.b = cveVar;
        this.c = null;
        this.d = null;
    }

    public final String a(w6 w6Var) {
        long c;
        rk4 b;
        DateTimeZone dateTimeZone;
        long j;
        qve qveVar = this.a;
        if (qveVar == null) {
            qq6.d("Printing not supported");
            return null;
        }
        StringBuilder sb = new StringBuilder(qveVar.d());
        try {
            AtomicReference atomicReference = sd7.a;
            c = w6Var.c();
            b = w6Var.b();
            if (b == null) {
                b = ISOChronology.U();
            }
        } catch (IOException unused) {
        }
        if (qveVar == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
        rk4 rk4Var = this.c;
        if (rk4Var != null) {
            b = rk4Var;
        }
        DateTimeZone dateTimeZone2 = this.d;
        if (dateTimeZone2 != null) {
            b = b.I(dateTimeZone2);
        }
        DateTimeZone k = b.k();
        int j2 = k.j(c);
        long j3 = j2;
        long j4 = c + j3;
        if ((c ^ j4) >= 0 || (j3 ^ c) < 0) {
            dateTimeZone = k;
            j = j4;
        } else {
            j2 = 0;
            dateTimeZone = DateTimeZone.a;
            j = c;
        }
        qveVar.c(sb, j, b.H(), j2, dateTimeZone, null);
        return sb.toString();
    }

    public final yc7 b() {
        DateTimeZone dateTimeZone = DateTimeZone.a;
        if (this.d == dateTimeZone) {
            return this;
        }
        return new yc7(this.a, this.b, this.c, dateTimeZone);
    }

    public yc7(qve qveVar, cve cveVar, rk4 rk4Var, DateTimeZone dateTimeZone) {
        this.a = qveVar;
        this.b = cveVar;
        this.c = rk4Var;
        this.d = dateTimeZone;
    }
}
