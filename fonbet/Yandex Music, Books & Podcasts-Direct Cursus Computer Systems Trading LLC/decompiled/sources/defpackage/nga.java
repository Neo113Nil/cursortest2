package defpackage;

/* loaded from: classes4.dex */
public final class nga extends cg6 {
    public dga j;
    public /* synthetic */ Object k;
    public final /* synthetic */ oga l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nga(oga ogaVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = ogaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(null, null, this);
    }
}
