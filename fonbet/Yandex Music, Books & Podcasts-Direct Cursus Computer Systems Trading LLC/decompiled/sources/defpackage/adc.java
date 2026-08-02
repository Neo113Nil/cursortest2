package defpackage;

/* loaded from: classes3.dex */
public final class adc extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ bdc k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adc(bdc bdcVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = bdcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return bdc.a(this.k, null, this);
    }
}
