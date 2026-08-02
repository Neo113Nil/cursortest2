package defpackage;

/* loaded from: classes4.dex */
public final class rtt extends cg6 {
    public cvl j;
    public cut k;
    public /* synthetic */ Object l;
    public final /* synthetic */ cut m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtt(cut cutVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = cutVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.e(null, this);
    }
}
