package defpackage;

/* loaded from: classes.dex */
public final class aoa extends cg6 {
    public hoa j;
    public /* synthetic */ Object k;
    public final /* synthetic */ hoa l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoa(hoa hoaVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = hoaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return hoa.V0(this.l, this);
    }
}
