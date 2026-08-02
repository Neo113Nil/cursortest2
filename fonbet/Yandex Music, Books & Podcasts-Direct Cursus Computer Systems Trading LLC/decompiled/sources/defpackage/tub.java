package defpackage;

/* loaded from: classes3.dex */
public final class tub extends cg6 {
    public oqi j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ vub m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tub(vub vubVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = vubVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(this);
    }
}
