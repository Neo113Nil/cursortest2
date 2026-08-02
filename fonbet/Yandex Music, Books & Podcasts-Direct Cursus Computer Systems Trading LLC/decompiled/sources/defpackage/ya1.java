package defpackage;

/* loaded from: classes3.dex */
public final class ya1 extends cg6 {
    public String j;
    public oqi k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ab1 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya1(ab1 ab1Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = ab1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, this);
    }
}
