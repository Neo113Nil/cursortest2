package org.joda.time.chrono;

import defpackage.dfi;
import defpackage.ghh;
import defpackage.mzc;
import defpackage.psa;
import defpackage.xq0;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* loaded from: classes5.dex */
public final class e extends org.joda.time.field.a {
    public final GregorianChronology d;
    public final int e;
    public final int f;

    public e(GregorianChronology gregorianChronology) {
        super(DateTimeFieldType.g, 2629746000L);
        this.d = gregorianChronology;
        this.e = 12;
        this.f = 2;
    }

    @Override // defpackage.xc7
    public final long A(int i, long j) {
        ghh.V(this, i, 1, this.e);
        GregorianChronology gregorianChronology = this.d;
        int e0 = gregorianChronology.e0(j);
        int U = gregorianChronology.U(j, e0, gregorianChronology.j0(e0, j));
        int i0 = gregorianChronology.i0(e0, i);
        if (U > i0) {
            U = i0;
        }
        return gregorianChronology.g0(e0, i, U) + BasicChronology.Y(j);
    }

    @Override // defpackage.mq2
    public final int D(String str, Locale locale) {
        Integer num = (Integer) mzc.b(locale).i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.g, str);
    }

    @Override // org.joda.time.field.a
    public final long E(long j, long j2) {
        long j3;
        long j4;
        long j5;
        int i = (int) j2;
        if (i == j2) {
            return a(i, j);
        }
        GregorianChronology gregorianChronology = this.d;
        gregorianChronology.getClass();
        long Y = BasicChronology.Y(j);
        int e0 = gregorianChronology.e0(j);
        int j0 = gregorianChronology.j0(e0, j);
        long j6 = (j0 - 1) + j2;
        int i2 = this.e;
        if (j6 >= 0) {
            long j7 = i2;
            long j8 = j6 / j7;
            j5 = (j6 % j7) + 1;
            j4 = j8 + e0;
            j3 = Y;
        } else {
            j3 = Y;
            long j9 = i2;
            j4 = (j6 / j9) + e0;
            long j10 = j4 - 1;
            int abs = (int) (Math.abs(j6) % j9);
            if (abs == 0) {
                abs = i2;
            }
            j5 = (i2 - abs) + 1;
            if (j5 != 1) {
                j4 = j10;
            }
        }
        if (j4 < -292275054 || j4 > 292278993) {
            xq0.x(dfi.d(j2, "Magnitude of add amount is too large: "));
            return 0L;
        }
        int i3 = (int) j4;
        int i4 = (int) j5;
        int U = gregorianChronology.U(j, e0, j0);
        int i0 = gregorianChronology.i0(i3, i4);
        if (U > i0) {
            U = i0;
        }
        return gregorianChronology.g0(i3, i4, U) + j3;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long a(int i, long j) {
        int i2;
        int i3;
        int i4;
        if (i == 0) {
            return j;
        }
        GregorianChronology gregorianChronology = this.d;
        gregorianChronology.getClass();
        long Y = BasicChronology.Y(j);
        int e0 = gregorianChronology.e0(j);
        int j0 = gregorianChronology.j0(e0, j);
        int i5 = j0 - 1;
        int i6 = i5 + i;
        int i7 = this.e;
        if (j0 <= 0 || i6 >= 0) {
            i2 = e0;
        } else {
            int i8 = i + i7;
            if (Math.signum(i8) == Math.signum(i)) {
                i2 = e0 - 1;
            } else {
                i8 = i - i7;
                i2 = e0 + 1;
            }
            i6 = i8 + i5;
        }
        if (i6 >= 0) {
            i3 = (i6 / i7) + i2;
            i4 = (i6 % i7) + 1;
        } else {
            i3 = (i6 / i7) + i2;
            int i9 = i3 - 1;
            int abs = Math.abs(i6) % i7;
            if (abs == 0) {
                abs = i7;
            }
            i4 = (i7 - abs) + 1;
            if (i4 != 1) {
                i3 = i9;
            }
        }
        int U = gregorianChronology.U(j, e0, j0);
        int i0 = gregorianChronology.i0(i3, i4);
        if (U > i0) {
            U = i0;
        }
        return gregorianChronology.g0(i3, i4, U) + Y;
    }

    @Override // defpackage.xc7
    public final int b(long j) {
        GregorianChronology gregorianChronology = this.d;
        return gregorianChronology.j0(gregorianChronology.e0(j), j);
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final String c(int i, Locale locale) {
        return mzc.b(locale).e[i];
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final String e(int i, Locale locale) {
        return mzc.b(locale).d[i];
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final psa h() {
        return this.d.f;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final int i(Locale locale) {
        return mzc.b(locale).l;
    }

    @Override // defpackage.xc7
    public final int j() {
        return this.e;
    }

    @Override // defpackage.xc7
    public final int n() {
        return 1;
    }

    @Override // defpackage.xc7
    public final psa p() {
        return this.d.j;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final boolean r(long j) {
        GregorianChronology gregorianChronology = this.d;
        int e0 = gregorianChronology.e0(j);
        return gregorianChronology.h0(e0) && gregorianChronology.j0(e0, j) == this.f;
    }

    @Override // defpackage.xc7
    public final boolean s() {
        return false;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long u(long j) {
        return j - w(j);
    }

    @Override // defpackage.xc7
    public final long w(long j) {
        GregorianChronology gregorianChronology = this.d;
        int e0 = gregorianChronology.e0(j);
        return gregorianChronology.f0(e0) + gregorianChronology.a0(e0, gregorianChronology.j0(e0, j));
    }
}
