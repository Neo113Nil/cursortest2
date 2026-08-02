package defpackage;

/* loaded from: classes4.dex */
public final class t9p extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ v9p k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9p(v9p v9pVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = v9pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
