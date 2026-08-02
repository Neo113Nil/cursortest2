package defpackage;

/* loaded from: classes3.dex */
public final class kid extends cg6 {
    public String j;
    public e5d k;
    public qqi l;
    public /* synthetic */ Object m;
    public final /* synthetic */ hgp n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kid(hgp hgpVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = hgpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.r(null, null, this);
    }
}
