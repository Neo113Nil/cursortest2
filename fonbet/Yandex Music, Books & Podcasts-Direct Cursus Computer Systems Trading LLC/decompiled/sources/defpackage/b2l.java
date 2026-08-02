package defpackage;

/* loaded from: classes3.dex */
public final class b2l extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ d2l k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2l(d2l d2lVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = d2lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
