package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class yfc extends ysc {
    public final long b;
    public final boolean c;
    public long d;

    public yfc(n3r n3rVar, long j, boolean z) {
        super(n3rVar);
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.ysc, defpackage.n3r
    public final long e0(hi3 hi3Var, long j) {
        hi3Var.getClass();
        long j2 = this.d;
        long j3 = this.b;
        if (j2 > j3) {
            j = 0;
        } else if (this.c) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long e0 = this.a.e0(hi3Var, j);
        if (e0 != -1) {
            this.d += e0;
        }
        long j5 = this.d;
        if ((j5 >= j3 || e0 != -1) && j5 <= j3) {
            return e0;
        }
        if (e0 > 0 && j5 > j3) {
            long j6 = hi3Var.b - (j5 - j3);
            hi3 hi3Var2 = new hi3();
            hi3Var2.o0(hi3Var);
            hi3Var.t0(hi3Var2, j6);
            hi3Var2.b();
        }
        StringBuilder l = tlm.l(j3, "expected ", " bytes but got ");
        l.append(this.d);
        throw new IOException(l.toString());
    }
}
