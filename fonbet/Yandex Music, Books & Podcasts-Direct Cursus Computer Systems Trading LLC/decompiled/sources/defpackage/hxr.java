package defpackage;

/* loaded from: classes6.dex */
public final class hxr extends cg6 {
    public xqn j;
    public xqn k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ixr n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxr(ixr ixrVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = ixrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(this);
    }
}
