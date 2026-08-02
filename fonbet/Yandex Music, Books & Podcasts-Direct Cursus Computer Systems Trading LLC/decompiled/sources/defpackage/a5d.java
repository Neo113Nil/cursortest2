package defpackage;

/* loaded from: classes3.dex */
public final class a5d extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ b5d k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5d(b5d b5dVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = b5dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, null, this);
    }
}
