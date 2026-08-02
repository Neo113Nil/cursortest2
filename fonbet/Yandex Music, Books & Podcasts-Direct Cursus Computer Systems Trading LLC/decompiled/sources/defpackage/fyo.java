package defpackage;

/* loaded from: classes.dex */
public final class fyo extends cg6 {
    public iyo j;
    public wqn k;
    public /* synthetic */ Object l;
    public final /* synthetic */ iyo m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyo(iyo iyoVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = iyoVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(0L, this);
    }
}
