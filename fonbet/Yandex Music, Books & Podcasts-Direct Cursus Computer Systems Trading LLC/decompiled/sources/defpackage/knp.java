package defpackage;

/* loaded from: classes3.dex */
public final class knp extends cg6 {
    public lnp j;
    public /* synthetic */ Object k;
    public final /* synthetic */ lnp l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knp(lnp lnpVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = lnpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(this);
    }
}
