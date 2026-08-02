package defpackage;

/* loaded from: classes5.dex */
public final class cg4 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ kkp k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg4(kkp kkpVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = kkpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return kkp.a(this.k, this);
    }
}
