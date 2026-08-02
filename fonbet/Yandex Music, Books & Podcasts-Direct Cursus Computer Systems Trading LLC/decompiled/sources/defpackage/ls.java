package defpackage;

/* loaded from: classes6.dex */
public final class ls extends cg6 {
    public oq j;
    public mq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ms m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(ms msVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = msVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f(null, null, this);
    }
}
