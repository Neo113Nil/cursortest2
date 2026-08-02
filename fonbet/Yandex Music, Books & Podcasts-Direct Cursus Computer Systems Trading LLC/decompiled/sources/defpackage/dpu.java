package defpackage;

/* loaded from: classes4.dex */
public final class dpu extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ sml k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpu(sml smlVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = smlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.j(this);
    }
}
