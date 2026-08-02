package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public final class bbp extends zap {
    public final gqt j;
    public final gqt k;
    public final long l;

    public bbp(whn whnVar, long j, long j2, long j3, long j4, long j5, List list, long j6, gqt gqtVar, gqt gqtVar2, long j7, long j8) {
        super(whnVar, j, j2, j3, j5, list, j6, j7, j8);
        this.j = gqtVar;
        this.k = gqtVar2;
        this.l = j4;
    }

    @Override // defpackage.ebp
    public final whn a(a0o a0oVar) {
        gqt gqtVar = this.j;
        if (gqtVar == null) {
            return this.a;
        }
        dsc dscVar = a0oVar.a;
        return new whn(gqtVar.a(0L, 0L, dscVar.j, dscVar.a), 0L, -1L);
    }

    @Override // defpackage.zap
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
        int i = lz2.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // defpackage.zap
    public final whn h(yzn yznVar, long j) {
        List list = this.f;
        long j2 = this.d;
        long j3 = list != null ? ((cbp) list.get((int) (j - j2))).a : (j - j2) * this.e;
        dsc dscVar = yznVar.a;
        return new whn(this.k.a(j, j3, dscVar.j, dscVar.a), 0L, -1L);
    }
}
