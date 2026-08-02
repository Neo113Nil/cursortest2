package defpackage;

/* loaded from: classes3.dex */
public final class t0i extends cg6 {
    public ap0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ u0i l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0i(u0i u0iVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = u0iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, this);
    }
}
