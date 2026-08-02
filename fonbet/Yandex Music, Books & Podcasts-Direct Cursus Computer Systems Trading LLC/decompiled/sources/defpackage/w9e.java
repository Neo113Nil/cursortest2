package defpackage;

import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.GregorianChronology;

/* loaded from: classes5.dex */
public final class w9e extends hh7 {
    public static final w9e c = new w9e(GregorianChronology.L0.E, DateTimeFieldType.b);

    @Override // defpackage.xc7
    public final long A(int i, long j) {
        xc7 xc7Var = this.b;
        ghh.V(this, i, 0, xc7Var.j());
        if (xc7Var.b(j) < 0) {
            i = -i;
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
        return b < 0 ? -b : b;
    }

    @Override // defpackage.xc7
    public final int j() {
        return this.b.j();
    }

    @Override // defpackage.xc7
    public final int n() {
        return 0;
    }

    @Override // defpackage.hh7, defpackage.xc7
    public final psa p() {
        return GregorianChronology.L0.l;
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
