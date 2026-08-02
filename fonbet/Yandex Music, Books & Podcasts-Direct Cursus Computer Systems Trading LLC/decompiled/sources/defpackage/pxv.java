package defpackage;

/* loaded from: classes4.dex */
public final class pxv extends cg6 {
    public long j;
    public tm0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ rxv m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxv(rxv rxvVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = rxvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.i(0L, null, this);
    }
}
