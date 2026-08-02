package org.joda.time.chrono;

import defpackage.f1d;
import defpackage.ghh;
import defpackage.psa;
import org.joda.time.DateTimeFieldType;

/* loaded from: classes5.dex */
public final class c extends org.joda.time.field.a {
    public final /* synthetic */ int d;
    public final GregorianChronology e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GregorianChronology gregorianChronology, int i) {
        super(DateTimeFieldType.j, 31556952000L);
        this.d = i;
        switch (i) {
            case 1:
                super(DateTimeFieldType.e, 31556952000L);
                this.e = gregorianChronology;
                break;
            default:
                this.e = gregorianChronology;
                break;
        }
    }

    @Override // defpackage.xc7
    public final long A(int i, long j) {
        switch (this.d) {
            case 0:
                int abs = Math.abs(i);
                GregorianChronology gregorianChronology = this.e;
                gregorianChronology.getClass();
                ghh.V(this, abs, -292275054, 292278993);
                int d0 = gregorianChronology.d0(j);
                if (d0 == i) {
                    return j;
                }
                int V = BasicChronology.V(j);
                int c0 = gregorianChronology.c0(d0);
                int c02 = gregorianChronology.c0(i);
                if (c02 < c0) {
                    c0 = c02;
                }
                int b0 = gregorianChronology.b0(gregorianChronology.e0(j), j);
                if (b0 <= c0) {
                    c0 = b0;
                }
                long l0 = gregorianChronology.l0(i, j);
                int d02 = gregorianChronology.d0(l0);
                if (d02 < i) {
                    l0 += 604800000;
                } else if (d02 > i) {
                    l0 -= 604800000;
                }
                return gregorianChronology.x.A(V, ((c0 - gregorianChronology.b0(gregorianChronology.e0(l0), l0)) * 604800000) + l0);
            default:
                GregorianChronology gregorianChronology2 = this.e;
                gregorianChronology2.getClass();
                ghh.V(this, i, -292275054, 292278993);
                return gregorianChronology2.l0(i, j);
        }
    }

    @Override // defpackage.xc7
    public long C(long j, int i) {
        switch (this.d) {
            case 1:
                GregorianChronology gregorianChronology = this.e;
                gregorianChronology.getClass();
                ghh.V(this, i, -292275055, 292278994);
                return gregorianChronology.l0(i, j);
            default:
                return super.C(j, i);
        }
    }

    @Override // org.joda.time.field.a
    public final long E(long j, long j2) {
        switch (this.d) {
        }
        return a(ghh.E(j2), j);
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long a(int i, long j) {
        switch (this.d) {
            case 0:
                return i == 0 ? j : A(this.e.d0(j) + i, j);
            default:
                if (i == 0) {
                    return j;
                }
                int e0 = this.e.e0(j);
                int i2 = e0 + i;
                if ((e0 ^ i2) >= 0 || (e0 ^ i) < 0) {
                    return A(i2, j);
                }
                throw new ArithmeticException(f1d.e(e0, i, "The calculation caused an overflow: ", " + "));
        }
    }

    @Override // defpackage.xc7
    public final int b(long j) {
        switch (this.d) {
            case 0:
                return this.e.d0(j);
            default:
                return this.e.e0(j);
        }
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final psa h() {
        switch (this.d) {
            case 0:
                return this.e.g;
            default:
                return this.e.f;
        }
    }

    @Override // defpackage.xc7
    public final int j() {
        switch (this.d) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
        return 292278993;
    }

    @Override // defpackage.xc7
    public final int n() {
        switch (this.d) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
        return -292275054;
    }

    @Override // defpackage.xc7
    public final psa p() {
        switch (this.d) {
        }
        return null;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final boolean r(long j) {
        switch (this.d) {
            case 0:
                GregorianChronology gregorianChronology = this.e;
                return gregorianChronology.c0(gregorianChronology.d0(j)) > 52;
            default:
                GregorianChronology gregorianChronology2 = this.e;
                return gregorianChronology2.h0(gregorianChronology2.e0(j));
        }
    }

    @Override // defpackage.xc7
    public final boolean s() {
        switch (this.d) {
        }
        return false;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long u(long j) {
        long w;
        switch (this.d) {
            case 0:
                w = w(j);
                break;
            default:
                w = w(j);
                break;
        }
        return j - w;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public long v(long j) {
        switch (this.d) {
            case 1:
                GregorianChronology gregorianChronology = this.e;
                int e0 = gregorianChronology.e0(j);
                return j != gregorianChronology.f0(e0) ? gregorianChronology.f0(e0 + 1) : j;
            default:
                return super.v(j);
        }
    }

    @Override // defpackage.xc7
    public final long w(long j) {
        switch (this.d) {
            case 0:
                GregorianChronology gregorianChronology = this.e;
                long w = gregorianChronology.A.w(j);
                return gregorianChronology.b0(gregorianChronology.e0(w), w) > 1 ? w - ((r0 - 1) * 604800000) : w;
            default:
                GregorianChronology gregorianChronology2 = this.e;
                return gregorianChronology2.f0(gregorianChronology2.e0(j));
        }
    }
}
