package defpackage;

/* loaded from: classes.dex */
public final class fxo extends cg6 {
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gxo l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxo(gxo gxoVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = gxoVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.k(0L, 0L, this);
    }
}
