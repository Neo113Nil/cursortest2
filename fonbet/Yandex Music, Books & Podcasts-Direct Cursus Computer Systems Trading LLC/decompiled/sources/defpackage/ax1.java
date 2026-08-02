package defpackage;

/* loaded from: classes4.dex */
public final class ax1 extends cg6 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cx1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax1(cx1 cx1Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = cx1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(false, this);
    }
}
