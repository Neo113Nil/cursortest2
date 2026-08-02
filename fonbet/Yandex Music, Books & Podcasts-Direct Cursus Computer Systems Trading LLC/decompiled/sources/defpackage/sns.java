package defpackage;

/* loaded from: classes3.dex */
public final class sns extends cg6 {
    public String j;
    public z7o k;
    public /* synthetic */ Object l;
    public final /* synthetic */ nur m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sns(nur nurVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = nurVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        Object h = this.m.h(null, this);
        return h == nm6.a ? h : new z7o(h);
    }
}
