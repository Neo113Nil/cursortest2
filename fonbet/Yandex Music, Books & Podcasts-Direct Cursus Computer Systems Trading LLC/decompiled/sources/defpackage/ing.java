package defpackage;

/* loaded from: classes3.dex */
public final class ing extends cg6 {
    public jpg j;
    public /* synthetic */ Object k;
    public final /* synthetic */ aog l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ing(aog aogVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = aogVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.k(null, null, this);
    }
}
