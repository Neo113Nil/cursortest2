package defpackage;

/* loaded from: classes3.dex */
public final class i2d extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ p2d k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2d(p2d p2dVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = p2dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
