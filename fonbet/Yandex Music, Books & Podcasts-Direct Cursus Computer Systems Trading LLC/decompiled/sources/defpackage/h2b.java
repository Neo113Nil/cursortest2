package defpackage;

/* loaded from: classes4.dex */
public final class h2b extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ i2b k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2b(i2b i2bVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = i2bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, false, this);
    }
}
