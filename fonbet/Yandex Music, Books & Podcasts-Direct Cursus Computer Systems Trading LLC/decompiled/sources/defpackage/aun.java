package defpackage;

import org.joda.time.DateTimeFieldType;

/* loaded from: classes5.dex */
public final class aun extends hh7 {
    public final int c;
    public final psa d;
    public final psa e;

    public aun(xc7 xc7Var, psa psaVar) {
        super(xc7Var, DateTimeFieldType.i);
        this.e = psaVar;
        this.d = xc7Var.g();
        this.c = 100;
    }

    @Override // defpackage.xc7
    public final long A(int i, long j) {
        int i2 = this.c;
        ghh.V(this, i, 0, i2 - 1);
        xc7 xc7Var = this.b;
        int b = xc7Var.b(j);
        return xc7Var.A(((b >= 0 ? b / i2 : ((b + 1) / i2) - 1) * i2) + i, j);
    }

    @Override // defpackage.xc7
    public final int b(long j) {
        int b = this.b.b(j);
        int i = this.c;
        if (b >= 0) {
            return b % i;
        }
        return ((b + 1) % i) + (i - 1);
    }

    @Override // defpackage.hh7, defpackage.xc7
    public final psa g() {
        return this.d;
    }

    @Override // defpackage.xc7
    public final int j() {
        return this.c - 1;
    }

    @Override // defpackage.xc7
    public final int n() {
        return 0;
    }

    @Override // defpackage.hh7, defpackage.xc7
    public final psa p() {
        return this.e;
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

    @Override // defpackage.mq2, defpackage.xc7
    public final long x(long j) {
        return this.b.x(j);
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long y(long j) {
        return this.b.y(j);
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long z(long j) {
        return this.b.z(j);
    }

    public aun(d2a d2aVar, psa psaVar, DateTimeFieldType dateTimeFieldType) {
        super(d2aVar.b, dateTimeFieldType);
        this.c = d2aVar.c;
        this.d = psaVar;
        this.e = d2aVar.d;
    }
}
