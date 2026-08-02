package defpackage;

/* loaded from: classes4.dex */
public final class o7u extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ bjt k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7u(bjt bjtVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = bjtVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.l(null, this);
    }
}
