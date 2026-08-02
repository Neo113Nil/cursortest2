package defpackage;

/* loaded from: classes5.dex */
public final class jnr extends cg6 {
    public knr j;
    public xmo k;
    public /* synthetic */ Object l;
    public final /* synthetic */ knr m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnr(knr knrVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = knrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(this);
    }
}
