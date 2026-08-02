package defpackage;

/* loaded from: classes4.dex */
public final class aol extends cg6 {
    public oqi j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ uol m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aol(uol uolVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = uolVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(this);
    }
}
