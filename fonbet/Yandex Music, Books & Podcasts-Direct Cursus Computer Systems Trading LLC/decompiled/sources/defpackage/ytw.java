package defpackage;

import java.util.Locale;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.Instant;
import org.joda.time.format.a;

/* loaded from: classes5.dex */
public final class ytw extends mq2 {
    public final xc7 b;
    public final DateTimeZone c;
    public final psa d;
    public final boolean e;
    public final psa f;
    public final psa g;

    public ytw(xc7 xc7Var, DateTimeZone dateTimeZone, psa psaVar, psa psaVar2, psa psaVar3) {
        super(xc7Var.q());
        if (!xc7Var.t()) {
            e7o.e();
            throw null;
        }
        this.b = xc7Var;
        this.c = dateTimeZone;
        this.d = psaVar;
        this.e = psaVar != null && psaVar.d() < 43200000;
        this.f = psaVar2;
        this.g = psaVar3;
    }

    @Override // defpackage.xc7
    public final long A(int i, long j) {
        DateTimeZone dateTimeZone = this.c;
        long b = dateTimeZone.b(j);
        xc7 xc7Var = this.b;
        long A = xc7Var.A(i, b);
        long a = dateTimeZone.a(A, j);
        if (b(a) == i) {
            return a;
        }
        String f = dateTimeZone.f();
        IllegalInstantException illegalInstantException = new IllegalInstantException(hrg.q("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ", a.a().a(new Instant(A)), f != null ? hrg.q(" (", f, ")") : ""));
        IllegalFieldValueException illegalFieldValueException = new IllegalFieldValueException(xc7Var.q(), Integer.valueOf(i), illegalInstantException.getMessage());
        illegalFieldValueException.initCause(illegalInstantException);
        throw illegalFieldValueException;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long B(long j, String str, Locale locale) {
        DateTimeZone dateTimeZone = this.c;
        return dateTimeZone.a(this.b.B(dateTimeZone.b(j), str, locale), j);
    }

    public final int E(long j) {
        int j2 = this.c.j(j);
        long j3 = j2;
        if (((j + j3) ^ j) >= 0 || (j ^ j3) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long a(int i, long j) {
        boolean z = this.e;
        xc7 xc7Var = this.b;
        if (z) {
            long E = E(j);
            return xc7Var.a(i, j + E) - E;
        }
        DateTimeZone dateTimeZone = this.c;
        return dateTimeZone.a(xc7Var.a(i, dateTimeZone.b(j)), j);
    }

    @Override // defpackage.xc7
    public final int b(long j) {
        return this.b.b(this.c.b(j));
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final String c(int i, Locale locale) {
        return this.b.c(i, locale);
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final String d(long j, Locale locale) {
        return this.b.d(this.c.b(j), locale);
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final String e(int i, Locale locale) {
        return this.b.e(i, locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ytw) {
            ytw ytwVar = (ytw) obj;
            if (this.b.equals(ytwVar.b) && this.c.equals(ytwVar.c) && this.d.equals(ytwVar.d) && this.f.equals(ytwVar.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final String f(long j, Locale locale) {
        return this.b.f(this.c.b(j), locale);
    }

    @Override // defpackage.xc7
    public final psa g() {
        return this.d;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final psa h() {
        return this.g;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.c.hashCode();
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final int i(Locale locale) {
        return this.b.i(locale);
    }

    @Override // defpackage.xc7
    public final int j() {
        return this.b.j();
    }

    @Override // defpackage.xc7
    public final int n() {
        return this.b.n();
    }

    @Override // defpackage.xc7
    public final psa p() {
        return this.f;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final boolean r(long j) {
        return this.b.r(this.c.b(j));
    }

    @Override // defpackage.xc7
    public final boolean s() {
        return this.b.s();
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long u(long j) {
        return this.b.u(this.c.b(j));
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long v(long j) {
        boolean z = this.e;
        xc7 xc7Var = this.b;
        if (z) {
            long E = E(j);
            return xc7Var.v(j + E) - E;
        }
        DateTimeZone dateTimeZone = this.c;
        return dateTimeZone.a(xc7Var.v(dateTimeZone.b(j)), j);
    }

    @Override // defpackage.xc7
    public final long w(long j) {
        boolean z = this.e;
        xc7 xc7Var = this.b;
        if (z) {
            long E = E(j);
            return xc7Var.w(j + E) - E;
        }
        DateTimeZone dateTimeZone = this.c;
        return dateTimeZone.a(xc7Var.w(dateTimeZone.b(j)), j);
    }
}
