package defpackage;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class zo7 implements fap {
    public final /* synthetic */ ap7 a;

    public zo7(ap7 ap7Var) {
        this.a = ap7Var;
    }

    @Override // defpackage.fap
    public final eap e(long j) {
        ap7 ap7Var = this.a;
        long j2 = ap7Var.b;
        BigInteger valueOf = BigInteger.valueOf((ap7Var.d.i * j) / 1000000);
        long j3 = ap7Var.c;
        iap iapVar = new iap(j, dvt.j((valueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(ap7Var.f)).longValue() + j2) - 30000, ap7Var.b, j3 - 1));
        return new eap(iapVar, iapVar);
    }

    @Override // defpackage.fap
    public final boolean g() {
        return true;
    }

    @Override // defpackage.fap
    public final long k() {
        return (this.a.f * 1000000) / r0.d.i;
    }
}
