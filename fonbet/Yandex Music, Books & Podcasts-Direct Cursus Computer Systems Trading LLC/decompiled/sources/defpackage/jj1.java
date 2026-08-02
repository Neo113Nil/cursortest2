package defpackage;

/* loaded from: classes3.dex */
public final class jj1 extends cg6 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ mj1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj1(mj1 mj1Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = mj1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return mj1.a(this.l, false, this);
    }
}
