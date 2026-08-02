package defpackage;

/* loaded from: classes4.dex */
public final class p2s extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ q2s k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2s(q2s q2sVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = q2sVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, false, this);
    }
}
