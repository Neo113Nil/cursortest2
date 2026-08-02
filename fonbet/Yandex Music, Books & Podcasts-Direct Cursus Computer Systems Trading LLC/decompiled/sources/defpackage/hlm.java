package defpackage;

import org.joda.time.DateTimeFieldType;

/* loaded from: classes5.dex */
public abstract class hlm extends mq2 {
    public final long b;
    public final psa c;

    public hlm(DateTimeFieldType dateTimeFieldType, psa psaVar) {
        super(dateTimeFieldType);
        if (!psaVar.e()) {
            xq0.x("Unit duration field must be precise");
            throw null;
        }
        long d = psaVar.d();
        this.b = d;
        if (d >= 1) {
            this.c = psaVar;
        } else {
            xq0.x("The unit milliseconds must be at least 1");
            throw null;
        }
    }

    @Override // defpackage.xc7
    public long A(int i, long j) {
        ghh.V(this, i, n(), l(j, i));
        return ((i - b(j)) * this.b) + j;
    }

    @Override // defpackage.xc7
    public final psa g() {
        return this.c;
    }

    @Override // defpackage.xc7
    public int n() {
        return 0;
    }

    @Override // defpackage.xc7
    public final boolean s() {
        return false;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public long u(long j) {
        long j2 = this.b;
        return j >= 0 ? j % j2 : (((j + 1) % j2) + j2) - 1;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public long v(long j) {
        long j2 = this.b;
        if (j <= 0) {
            return j - (j % j2);
        }
        long j3 = j - 1;
        return (j3 - (j3 % j2)) + j2;
    }

    @Override // defpackage.xc7
    public long w(long j) {
        long j2 = this.b;
        if (j >= 0) {
            return j - (j % j2);
        }
        long j3 = j + 1;
        return (j3 - (j3 % j2)) - j2;
    }
}
