package defpackage;

/* loaded from: classes4.dex */
public final class a5u extends cg6 {
    public String j;
    public j1g k;
    public /* synthetic */ Object l;
    public final /* synthetic */ c5u m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5u(c5u c5uVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = c5uVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f(null, null, this);
    }
}
