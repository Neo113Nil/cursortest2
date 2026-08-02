package defpackage;

/* loaded from: classes.dex */
public final class ffi extends cg6 {
    public d18 j;
    public iyo k;
    public uqn l;
    public float m;
    public /* synthetic */ Object n;
    public final /* synthetic */ d18 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffi(d18 d18Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = d18Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return d18.b(this.o, null, null, 0.0f, 0.0f, this);
    }
}
