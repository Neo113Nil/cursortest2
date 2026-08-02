package defpackage;

/* loaded from: classes4.dex */
public final class k51 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ p51 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k51(p51 p51Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = p51Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(null, null, this);
    }
}
