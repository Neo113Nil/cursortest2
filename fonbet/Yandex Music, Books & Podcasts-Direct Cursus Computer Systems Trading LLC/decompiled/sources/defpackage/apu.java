package defpackage;

/* loaded from: classes4.dex */
public final class apu extends cg6 {
    public sfo j;
    public jzs k;
    public v5j l;
    public /* synthetic */ Object m;
    public final /* synthetic */ mmo n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apu(mmo mmoVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = mmoVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.y0(null, null, null, this);
    }
}
