package defpackage;

/* loaded from: classes.dex */
public final class sh0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ th0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh0(th0 th0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = th0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        this.k.a(null, this);
        return nm6.a;
    }
}
