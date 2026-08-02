package defpackage;

/* loaded from: classes.dex */
public final class ecr extends wsc {
    public final /* synthetic */ fap b;
    public final /* synthetic */ au1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecr(au1 au1Var, fap fapVar, fap fapVar2) {
        super(fapVar);
        this.c = au1Var;
        this.b = fapVar2;
    }

    @Override // defpackage.wsc, defpackage.fap
    public final eap e(long j) {
        eap e = this.b.e(j);
        iap iapVar = e.a;
        long j2 = iapVar.a;
        long j3 = iapVar.b;
        long j4 = this.c.b;
        iap iapVar2 = new iap(j2, j3 + j4);
        iap iapVar3 = e.b;
        return new eap(iapVar2, new iap(iapVar3.a, iapVar3.b + j4));
    }
}
