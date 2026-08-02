package defpackage;

/* loaded from: classes.dex */
public final class wod extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ xod k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wod(xod xodVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = xodVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.j(this);
    }
}
