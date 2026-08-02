package defpackage;

/* loaded from: classes.dex */
public final class a1n extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ b1n k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1n(b1n b1nVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = b1nVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.r0(0L, this);
    }
}
