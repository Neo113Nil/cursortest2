package defpackage;

/* loaded from: classes4.dex */
public final class tol extends cg6 {
    public boolean j;
    public oqi k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ uol n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tol(uol uolVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = uolVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.q(false, this);
    }
}
