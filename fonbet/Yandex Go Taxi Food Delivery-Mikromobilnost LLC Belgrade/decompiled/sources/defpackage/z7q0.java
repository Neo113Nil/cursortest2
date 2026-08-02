package defpackage;

import androidx.media3.common.a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes10.dex */
public final class z7q0 extends x7q0 {
    public final xh21 j;
    public final xh21 k;
    public final long l;

    public z7q0(w6i0 w6i0Var, long j, long j2, long j3, long j4, long j5, List list, long j6, xh21 xh21Var, xh21 xh21Var2, long j7, long j8) {
        super(w6i0Var, j, j2, j3, j5, list, j6, j7, j8);
        this.j = xh21Var;
        this.k = xh21Var2;
        this.l = j4;
    }

    @Override // defpackage.c8q0
    public final w6i0 a(s4j0 s4j0Var) {
        xh21 xh21Var = this.j;
        if (xh21Var == null) {
            return this.a;
        }
        a aVar = s4j0Var.a;
        return new w6i0(xh21Var.a(0L, 0L, aVar.a, aVar.j), 0L, -1L);
    }

    @Override // defpackage.x7q0
    public final long d(long j) {
        if (this.f != null) {
            return r0.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = ds5.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // defpackage.x7q0
    public final w6i0 h(long j, s4j0 s4j0Var) {
        List list = this.f;
        long j2 = this.d;
        long j3 = list != null ? ((a8q0) list.get((int) (j - j2))).a : (j - j2) * this.e;
        a aVar = s4j0Var.a;
        return new w6i0(this.k.a(j, j3, aVar.a, aVar.j), 0L, -1L);
    }
}
