package defpackage;

/* loaded from: classes3.dex */
public final class ctt extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ dtt k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctt(dtt dttVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = dttVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return dtt.e(this.k, this);
    }
}
