package defpackage;

/* loaded from: classes4.dex */
public final class sys extends cg6 {
    public String j;
    public nvl k;
    public /* synthetic */ Object l;
    public final /* synthetic */ uys m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sys(uys uysVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = uysVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f(null, null, this);
    }
}
