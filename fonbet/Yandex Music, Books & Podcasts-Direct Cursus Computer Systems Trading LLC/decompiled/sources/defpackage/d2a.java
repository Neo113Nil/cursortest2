package defpackage;

import org.joda.time.DateTimeFieldType;
import org.joda.time.field.ScaledDurationField;

/* loaded from: classes5.dex */
public final class d2a extends hh7 {
    public final int c;
    public final ScaledDurationField d;
    public final psa e;
    public final int f;
    public final int g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d2a(xc7 xc7Var) {
        super(xc7Var, r0);
        DateTimeFieldType dateTimeFieldType = DateTimeFieldType.c;
        psa p = xc7Var.p();
        psa g = xc7Var.g();
        if (g == null) {
            this.d = null;
        } else {
            this.d = new ScaledDurationField(g, dateTimeFieldType.a());
        }
        this.e = p;
        this.c = 100;
        int n = xc7Var.n();
        int i = n >= 0 ? n / 100 : ((n + 1) / 100) - 1;
        int j = xc7Var.j();
        int i2 = j >= 0 ? j / 100 : ((j + 1) / 100) - 1;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.xc7
    public final long A(int i, long j) {
        int i2;
        ghh.V(this, i, this.f, this.g);
        xc7 xc7Var = this.b;
        int b = xc7Var.b(j);
        int i3 = this.c;
        if (b >= 0) {
            i2 = b % i3;
        } else {
            i2 = ((b + 1) % i3) + (i3 - 1);
        }
        return xc7Var.A((i * i3) + i2, j);
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long a(int i, long j) {
        return this.b.a(i * this.c, j);
    }

    @Override // defpackage.xc7
    public final int b(long j) {
        int b = this.b.b(j);
        return b >= 0 ? b / this.c : ((b + 1) / r3) - 1;
    }

    @Override // defpackage.hh7, defpackage.xc7
    public final psa g() {
        return this.d;
    }

    @Override // defpackage.xc7
    public final int j() {
        return this.g;
    }

    @Override // defpackage.xc7
    public final int n() {
        return this.f;
    }

    @Override // defpackage.hh7, defpackage.xc7
    public final psa p() {
        psa psaVar = this.e;
        return psaVar != null ? psaVar : super.p();
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long u(long j) {
        return A(b(this.b.u(j)), j);
    }

    @Override // defpackage.xc7
    public final long w(long j) {
        int b = b(j) * this.c;
        xc7 xc7Var = this.b;
        return xc7Var.w(xc7Var.A(b, j));
    }
}
