package defpackage;

/* loaded from: classes3.dex */
public final class wva extends cg6 {
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xva l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wva(xva xvaVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = xvaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.r0(0L, this);
    }
}
