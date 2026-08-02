package defpackage;

/* loaded from: classes5.dex */
public final class iw extends cg6 {
    public ow j;
    public a6l k;
    public /* synthetic */ Object l;
    public final /* synthetic */ rdk m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(rdk rdkVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = rdkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return rdk.q(this.m, null, null, this);
    }
}
