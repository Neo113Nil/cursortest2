package defpackage;

/* loaded from: classes.dex */
public final class a8b extends cg6 {
    public c8b j;
    public mr1 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ c8b m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8b(c8b c8bVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = c8bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
