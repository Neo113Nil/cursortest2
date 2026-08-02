package defpackage;

/* loaded from: classes4.dex */
public final class nhq extends cg6 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wt5 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhq(wt5 wt5Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = wt5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, 0, this);
    }
}
