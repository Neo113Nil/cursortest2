package defpackage;

import org.joda.time.DateTimeFieldType;

/* loaded from: classes5.dex */
public final class fnj extends hh7 {
    public final int c;
    public final int d;
    public final int e;

    public fnj(hh7 hh7Var, DateTimeFieldType dateTimeFieldType, int i) {
        super(hh7Var, dateTimeFieldType);
        if (i == 0) {
            xq0.x("The offset cannot be zero");
            throw null;
        }
        this.c = i;
        if (Integer.MIN_VALUE < hh7Var.n() + i) {
            this.d = hh7Var.n() + i;
        } else {
            this.d = Integer.MIN_VALUE;
        }
        if (Integer.MAX_VALUE > hh7Var.j() + i) {
            this.e = hh7Var.j() + i;
        } else {
            this.e = Integer.MAX_VALUE;
        }
    }

    @Override // defpackage.xc7
    public final long A(int i, long j) {
        ghh.V(this, i, this.d, this.e);
        return this.b.A(i - this.c, j);
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long a(int i, long j) {
        long a = super.a(i, j);
        ghh.V(this, b(a), this.d, this.e);
        return a;
    }

    @Override // defpackage.xc7
    public final int b(long j) {
        return this.b.b(j) + this.c;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final psa h() {
        return this.b.h();
    }

    @Override // defpackage.xc7
    public final int j() {
        return this.e;
    }

    @Override // defpackage.xc7
    public final int n() {
        return this.d;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final boolean r(long j) {
        return this.b.r(j);
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
}
