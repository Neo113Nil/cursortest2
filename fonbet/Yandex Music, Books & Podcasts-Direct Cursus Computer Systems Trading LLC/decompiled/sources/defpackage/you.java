package defpackage;

/* loaded from: classes4.dex */
public final class you extends cg6 {
    public String j;
    public rdg k;
    public /* synthetic */ Object l;
    public final /* synthetic */ mmo m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public you(mmo mmoVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = mmoVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d0(null, null, this);
    }
}
