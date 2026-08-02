package defpackage;

/* loaded from: classes4.dex */
public final class xs extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ et k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs(et etVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = etVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(null, null, this);
    }
}
