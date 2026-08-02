package defpackage;

/* loaded from: classes3.dex */
public final class lnw extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ mnw k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnw(mnw mnwVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = mnwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, this);
    }
}
