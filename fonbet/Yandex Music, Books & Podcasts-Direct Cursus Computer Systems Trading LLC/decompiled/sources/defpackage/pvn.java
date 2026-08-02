package defpackage;

/* loaded from: classes3.dex */
public final class pvn extends cg6 {
    public Object j;
    public oqi k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qvn m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvn(qvn qvnVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = qvnVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(this);
    }
}
