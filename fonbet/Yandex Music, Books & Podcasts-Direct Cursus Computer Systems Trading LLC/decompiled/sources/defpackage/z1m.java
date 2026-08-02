package defpackage;

/* loaded from: classes4.dex */
public final class z1m extends cg6 {
    public nvl j;
    public /* synthetic */ Object k;
    public final /* synthetic */ i2m l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1m(i2m i2mVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = i2mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(null, null, this);
    }
}
