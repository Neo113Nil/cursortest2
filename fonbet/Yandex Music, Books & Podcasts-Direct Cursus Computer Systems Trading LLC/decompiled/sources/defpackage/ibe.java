package defpackage;

/* loaded from: classes.dex */
public final class ibe extends cg6 {
    public Object j;
    public tqn k;
    public /* synthetic */ Object l;
    public final /* synthetic */ nbe m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibe(nbe nbeVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = nbeVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(this);
    }
}
