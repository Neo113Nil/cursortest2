package defpackage;

/* loaded from: classes6.dex */
public final class x4t extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ b5t k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4t(b5t b5tVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = b5tVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return b5t.a(this.k, null, this);
    }
}
