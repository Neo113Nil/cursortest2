package defpackage;

/* loaded from: classes4.dex */
public final class wfg extends cg6 {
    public xfg j;
    public mwk k;
    public /* synthetic */ Object l;
    public final /* synthetic */ xfg m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfg(xfg xfgVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = xfgVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return xfg.h(this.m, this);
    }
}
