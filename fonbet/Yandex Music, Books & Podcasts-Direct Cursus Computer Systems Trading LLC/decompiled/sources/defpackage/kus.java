package defpackage;

/* loaded from: classes4.dex */
public final class kus extends cg6 {
    public String j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ rus m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kus(rus rusVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = rusVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.g(null, null, this);
    }
}
