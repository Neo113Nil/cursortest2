package defpackage;

/* loaded from: classes6.dex */
public final class nwp extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ owp k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwp(owp owpVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = owpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.k(null, null, this);
    }
}
