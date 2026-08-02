package defpackage;

/* loaded from: classes.dex */
public final class hh2 extends cg6 {
    public zt3 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ih2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh2(ih2 ih2Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = ih2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(this);
    }
}
