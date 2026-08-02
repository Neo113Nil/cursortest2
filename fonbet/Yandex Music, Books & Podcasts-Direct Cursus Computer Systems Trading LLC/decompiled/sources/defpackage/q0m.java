package defpackage;

/* loaded from: classes3.dex */
public final class q0m extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ r0m l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0m(r0m r0mVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = r0mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
