package defpackage;

/* loaded from: classes4.dex */
public final class jco extends cg6 {
    public boolean j;
    public Exception k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ mco n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jco(mco mcoVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = mcoVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(false, null, this);
    }
}
