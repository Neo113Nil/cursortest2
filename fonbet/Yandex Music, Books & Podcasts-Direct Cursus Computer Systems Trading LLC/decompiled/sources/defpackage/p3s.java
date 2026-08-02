package defpackage;

/* loaded from: classes4.dex */
public final class p3s extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ q3s k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3s(q3s q3sVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = q3sVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, this);
    }
}
