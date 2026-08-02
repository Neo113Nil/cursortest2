package defpackage;

/* loaded from: classes3.dex */
public final class e8n extends cg6 {
    public boolean j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ g8n m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8n(g8n g8nVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = g8nVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.o(false, this);
    }
}
