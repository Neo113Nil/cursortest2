package defpackage;

/* loaded from: classes4.dex */
public final class wb1 extends cg6 {
    public c01 j;
    public j1g k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ qne n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb1(qne qneVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = qneVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.D(null, null, this);
    }
}
