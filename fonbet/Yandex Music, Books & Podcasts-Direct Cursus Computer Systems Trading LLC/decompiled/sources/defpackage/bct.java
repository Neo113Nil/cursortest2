package defpackage;

/* loaded from: classes3.dex */
public final class bct extends cg6 {
    public long j;
    public long k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ cct n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bct(cct cctVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = cctVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.k(0L, 0L, this);
    }
}
