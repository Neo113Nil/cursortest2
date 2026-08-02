package defpackage;

/* loaded from: classes5.dex */
public final class tfd extends cg6 {
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ g06 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfd(g06 g06Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = g06Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.m(null, null, this);
    }
}
