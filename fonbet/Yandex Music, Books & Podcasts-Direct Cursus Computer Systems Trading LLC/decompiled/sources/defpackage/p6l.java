package defpackage;

/* loaded from: classes4.dex */
public final class p6l extends cg6 {
    public boolean j;
    public boolean k;
    public qqi l;
    public /* synthetic */ Object m;
    public final /* synthetic */ x6l n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6l(x6l x6lVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = x6lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.e(false, false, this);
    }
}
