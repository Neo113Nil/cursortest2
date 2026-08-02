package defpackage;

/* loaded from: classes5.dex */
public final class s88 extends cg6 {
    public long j;
    public int k;
    public int l;
    public String m;
    public /* synthetic */ Object n;
    public final /* synthetic */ t88 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s88(t88 t88Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = t88Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(this);
    }
}
