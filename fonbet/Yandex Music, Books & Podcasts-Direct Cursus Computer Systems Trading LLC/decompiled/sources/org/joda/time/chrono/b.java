package org.joda.time.chrono;

import defpackage.hlm;
import defpackage.mzc;
import defpackage.psa;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* loaded from: classes5.dex */
public final class b extends hlm {
    public final /* synthetic */ int d;
    public final GregorianChronology e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GregorianChronology gregorianChronology, psa psaVar, int i) {
        super(DateTimeFieldType.h, psaVar);
        this.d = i;
        switch (i) {
            case 1:
                super(DateTimeFieldType.f, psaVar);
                this.e = gregorianChronology;
                break;
            case 2:
                super(DateTimeFieldType.k, psaVar);
                this.e = gregorianChronology;
                break;
            case 3:
                super(DateTimeFieldType.l, psaVar);
                this.e = gregorianChronology;
                break;
            default:
                this.e = gregorianChronology;
                break;
        }
    }

    @Override // defpackage.mq2
    public int D(String str, Locale locale) {
        switch (this.d) {
            case 3:
                Integer num = (Integer) mzc.b(locale).h.get(str);
                if (num != null) {
                    return num.intValue();
                }
                throw new IllegalFieldValueException(DateTimeFieldType.l, str);
            default:
                return super.D(str, locale);
        }
    }

    @Override // defpackage.xc7
    public final int b(long j) {
        switch (this.d) {
            case 0:
                GregorianChronology gregorianChronology = this.e;
                int e0 = gregorianChronology.e0(j);
                return gregorianChronology.U(j, e0, gregorianChronology.j0(e0, j));
            case 1:
                GregorianChronology gregorianChronology2 = this.e;
                return ((int) ((j - gregorianChronology2.f0(gregorianChronology2.e0(j))) / 86400000)) + 1;
            case 2:
                GregorianChronology gregorianChronology3 = this.e;
                return gregorianChronology3.b0(gregorianChronology3.e0(j), j);
            default:
                this.e.getClass();
                return BasicChronology.V(j);
        }
    }

    @Override // defpackage.mq2, defpackage.xc7
    public String c(int i, Locale locale) {
        switch (this.d) {
            case 3:
                return mzc.b(locale).c[i];
            default:
                return super.c(i, locale);
        }
    }

    @Override // defpackage.mq2, defpackage.xc7
    public String e(int i, Locale locale) {
        switch (this.d) {
            case 3:
                return mzc.b(locale).b[i];
            default:
                return super.e(i, locale);
        }
    }

    @Override // defpackage.mq2, defpackage.xc7
    public int i(Locale locale) {
        switch (this.d) {
            case 3:
                return mzc.b(locale).k;
            default:
                return super.i(locale);
        }
    }

    @Override // defpackage.xc7
    public final int j() {
        switch (this.d) {
            case 0:
                this.e.getClass();
                return 31;
            case 1:
                this.e.getClass();
                return 366;
            case 2:
                return 53;
            default:
                return 7;
        }
    }

    @Override // defpackage.xc7
    public int k(long j) {
        switch (this.d) {
            case 0:
                GregorianChronology gregorianChronology = this.e;
                int e0 = gregorianChronology.e0(j);
                return gregorianChronology.i0(e0, gregorianChronology.j0(e0, j));
            case 1:
                GregorianChronology gregorianChronology2 = this.e;
                return gregorianChronology2.h0(gregorianChronology2.e0(j)) ? 366 : 365;
            case 2:
                GregorianChronology gregorianChronology3 = this.e;
                return gregorianChronology3.c0(gregorianChronology3.d0(j));
            default:
                return super.k(j);
        }
    }

    @Override // defpackage.xc7
    public int l(long j, int i) {
        switch (this.d) {
            case 0:
                GregorianChronology gregorianChronology = this.e;
                gregorianChronology.getClass();
                if (i <= 28 && i >= 1) {
                    return 28;
                }
                int e0 = gregorianChronology.e0(j);
                return gregorianChronology.i0(e0, gregorianChronology.j0(e0, j));
            case 1:
                this.e.getClass();
                if (i > 365 || i < 1) {
                    return k(j);
                }
                return 365;
            case 2:
                if (i > 52) {
                    return k(j);
                }
                return 52;
            default:
                return super.l(j, i);
        }
    }

    @Override // defpackage.hlm, defpackage.xc7
    public final int n() {
        switch (this.d) {
        }
        return 1;
    }

    @Override // defpackage.xc7
    public final psa p() {
        switch (this.d) {
            case 0:
                return this.e.i;
            case 1:
                return this.e.j;
            case 2:
                return this.e.h;
            default:
                return this.e.g;
        }
    }

    @Override // defpackage.mq2, defpackage.xc7
    public boolean r(long j) {
        switch (this.d) {
            case 0:
                return this.e.k0(j);
            case 1:
                return this.e.k0(j);
            default:
                return super.r(j);
        }
    }

    @Override // defpackage.hlm, defpackage.mq2, defpackage.xc7
    public long u(long j) {
        switch (this.d) {
            case 2:
                return super.u(j + 259200000);
            default:
                return super.u(j);
        }
    }

    @Override // defpackage.hlm, defpackage.mq2, defpackage.xc7
    public long v(long j) {
        switch (this.d) {
            case 2:
                return super.v(j + 259200000) - 259200000;
            default:
                return super.v(j);
        }
    }

    @Override // defpackage.hlm, defpackage.xc7
    public long w(long j) {
        switch (this.d) {
            case 2:
                return super.w(j + 259200000) - 259200000;
            default:
                return super.w(j);
        }
    }
}
