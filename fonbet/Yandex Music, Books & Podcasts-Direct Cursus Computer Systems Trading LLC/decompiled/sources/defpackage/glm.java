package defpackage;

import org.joda.time.DateTimeFieldType;

/* loaded from: classes5.dex */
public class glm extends hlm {
    public final int d;
    public final psa e;

    public glm(DateTimeFieldType dateTimeFieldType, psa psaVar, psa psaVar2) {
        super(dateTimeFieldType, psaVar);
        if (!psaVar2.e()) {
            xq0.x("Range duration field must be precise");
            throw null;
        }
        int d = (int) (psaVar2.d() / this.b);
        this.d = d;
        if (d >= 2) {
            this.e = psaVar2;
        } else {
            xq0.x("The effective range must be at least 2");
            throw null;
        }
    }

    @Override // defpackage.hlm, defpackage.xc7
    public final long A(int i, long j) {
        ghh.V(this, i, 0, this.d - 1);
        return ((i - b(j)) * this.b) + j;
    }

    @Override // defpackage.xc7
    public final int b(long j) {
        int i = this.d;
        long j2 = this.b;
        return j >= 0 ? (int) ((j / j2) % i) : (i - 1) + ((int) (((j + 1) / j2) % i));
    }

    @Override // defpackage.xc7
    public final int j() {
        return this.d - 1;
    }

    @Override // defpackage.xc7
    public final psa p() {
        return this.e;
    }
}
