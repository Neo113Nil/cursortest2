package defpackage;

/* loaded from: classes4.dex */
public final class yz extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ gs4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz(gs4 gs4Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = gs4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.v(null, this);
    }
}
