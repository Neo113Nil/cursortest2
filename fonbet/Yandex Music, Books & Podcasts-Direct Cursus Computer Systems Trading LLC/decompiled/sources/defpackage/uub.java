package defpackage;

/* loaded from: classes3.dex */
public final class uub extends cg6 {
    public snq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vub l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uub(vub vubVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = vubVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(this);
    }
}
