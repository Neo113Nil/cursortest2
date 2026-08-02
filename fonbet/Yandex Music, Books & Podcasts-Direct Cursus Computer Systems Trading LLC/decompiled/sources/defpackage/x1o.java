package defpackage;

/* loaded from: classes4.dex */
public final class x1o extends cg6 {
    public mm6 j;
    public w2f k;
    public /* synthetic */ Object l;
    public final /* synthetic */ cr m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1o(cr crVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = crVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f0(null, this);
    }
}
