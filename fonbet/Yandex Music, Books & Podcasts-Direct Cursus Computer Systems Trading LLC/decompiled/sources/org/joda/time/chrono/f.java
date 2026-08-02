package org.joda.time.chrono;

import defpackage.ghh;
import defpackage.hh7;
import defpackage.psa;
import defpackage.xc7;
import org.joda.time.DateTimeFieldType;

/* loaded from: classes5.dex */
public final class f extends hh7 {
    public final GregorianChronology c;

    public f(c cVar, GregorianChronology gregorianChronology) {
        super(cVar, DateTimeFieldType.b);
        this.c = gregorianChronology;
    }

    @Override // defpackage.xc7
    public final long A(int i, long j) {
        xc7 xc7Var = this.b;
        ghh.V(this, i, 1, xc7Var.j());
        if (this.c.e0(j) <= 0) {
            i = 1 - i;
        }
        return xc7Var.A(i, j);
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long a(int i, long j) {
        return this.b.a(i, j);
    }

    @Override // defpackage.xc7
    public final int b(long j) {
        int b = this.b.b(j);
        return b <= 0 ? 1 - b : b;
    }

    @Override // defpackage.xc7
    public final int j() {
        return this.b.j();
    }

    @Override // defpackage.xc7
    public final int n() {
        return 1;
    }

    @Override // defpackage.hh7, defpackage.xc7
    public final psa p() {
        return this.c.l;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long u(long j) {
        return this.b.u(j);
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long v(long j) {
        return this.b.v(j);
    }

    @Override // defpackage.xc7
    public final long w(long j) {
        return this.b.w(j);
    }
}
