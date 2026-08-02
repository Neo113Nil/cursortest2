package defpackage;

/* loaded from: classes3.dex */
public final class mrt extends cg6 {
    public oqi j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ urt m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrt(urt urtVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = urtVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.l(this);
    }
}
