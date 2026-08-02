package defpackage;

/* loaded from: classes3.dex */
public final class l42 extends cg6 {
    public String j;
    public e12 k;
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ m42 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l42(m42 m42Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = m42Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
