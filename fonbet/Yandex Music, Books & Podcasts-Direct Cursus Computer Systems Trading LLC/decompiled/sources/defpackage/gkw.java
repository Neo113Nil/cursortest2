package defpackage;

/* loaded from: classes4.dex */
public final class gkw extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ jkw k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkw(jkw jkwVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = jkwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(null, false, this);
    }
}
