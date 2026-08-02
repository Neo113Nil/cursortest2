package defpackage;

/* loaded from: classes3.dex */
public final class ibn extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ kbn k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibn(kbn kbnVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = kbnVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return kbn.a(this.k, null, this);
    }
}
