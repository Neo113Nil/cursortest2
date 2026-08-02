package defpackage;

/* loaded from: classes4.dex */
public final class pm2 extends cg6 {
    public boolean j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qm2 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm2(qm2 qm2Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = qm2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.o(false, this);
    }
}
