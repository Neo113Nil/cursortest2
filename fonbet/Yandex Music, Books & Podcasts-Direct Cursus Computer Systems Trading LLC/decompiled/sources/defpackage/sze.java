package defpackage;

/* loaded from: classes4.dex */
public final class sze extends cg6 {
    public boolean j;
    public uze k;
    public /* synthetic */ Object l;
    public final /* synthetic */ tze m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sze(tze tzeVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = tzeVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.o(false, this);
    }
}
