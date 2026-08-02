package defpackage;

/* loaded from: classes3.dex */
public final class f6m extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ j6m k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6m(j6m j6mVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = j6mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
