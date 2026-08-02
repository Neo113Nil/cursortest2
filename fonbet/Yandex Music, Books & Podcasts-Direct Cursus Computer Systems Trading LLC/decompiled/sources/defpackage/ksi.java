package defpackage;

/* loaded from: classes3.dex */
public final class ksi extends cg6 {
    public tui j;
    public zab k;
    public /* synthetic */ Object l;
    public final /* synthetic */ iwe m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksi(iwe iweVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = iweVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.j(null, null, this);
    }
}
