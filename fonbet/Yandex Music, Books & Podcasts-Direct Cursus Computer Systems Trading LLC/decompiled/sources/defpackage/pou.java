package defpackage;

/* loaded from: classes3.dex */
public final class pou extends cg6 {
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ uou m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pou(uou uouVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = uouVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(this);
    }
}
