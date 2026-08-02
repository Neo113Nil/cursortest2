package defpackage;

/* loaded from: classes.dex */
public final class p7e extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ r7e k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7e(r7e r7eVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = r7eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
