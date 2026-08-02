package defpackage;

/* loaded from: classes4.dex */
public final class khv extends cg6 {
    public u5j j;
    public x66 k;
    public fhv l;
    public /* synthetic */ Object m;
    public final /* synthetic */ thv n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khv(thv thvVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = thvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return thv.a(this.n, null, null, this);
    }
}
