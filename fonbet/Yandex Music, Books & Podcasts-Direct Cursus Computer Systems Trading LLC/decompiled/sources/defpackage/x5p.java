package defpackage;

/* loaded from: classes3.dex */
public final class x5p extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ b6p k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5p(b6p b6pVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = b6pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return b6p.G(this.k, null, this);
    }
}
