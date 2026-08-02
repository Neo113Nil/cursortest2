package defpackage;

/* loaded from: classes6.dex */
public final class sxn extends cg6 {
    public ayn j;
    public yxo k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ayn m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxn(ayn aynVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = aynVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return ayn.a(this.m, null, this);
    }
}
