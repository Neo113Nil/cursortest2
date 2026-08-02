package defpackage;

/* loaded from: classes3.dex */
public final class kcn extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ocn k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcn(ocn ocnVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = ocnVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object g = this.k.g(this);
        return g == nm6.a ? g : new z7o(g);
    }
}
