package defpackage;

/* loaded from: classes4.dex */
public final class a4r extends cg6 {
    public tnm j;
    public oqi k;
    public /* synthetic */ Object l;
    public final /* synthetic */ tnm m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4r(tnm tnmVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = tnmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return tnm.c(this.m, this);
    }
}
