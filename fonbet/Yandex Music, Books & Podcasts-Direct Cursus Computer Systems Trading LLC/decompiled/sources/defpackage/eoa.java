package defpackage;

/* loaded from: classes.dex */
public final class eoa extends cg6 {
    public hoa j;
    public ana k;
    public /* synthetic */ Object l;
    public final /* synthetic */ hoa m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoa(hoa hoaVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = hoaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return hoa.X0(this.m, null, this);
    }
}
