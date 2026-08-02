package defpackage;

/* loaded from: classes5.dex */
public final class y4a extends cg6 {
    public r4a j;
    public b5a k;
    public /* synthetic */ Object l;
    public final /* synthetic */ b5a m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4a(b5a b5aVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = b5aVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f(null, null, this);
    }
}
