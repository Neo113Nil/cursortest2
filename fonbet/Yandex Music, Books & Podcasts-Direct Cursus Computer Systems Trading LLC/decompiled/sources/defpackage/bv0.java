package defpackage;

/* loaded from: classes3.dex */
public final class bv0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ iv0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv0(iv0 iv0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = iv0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object l = this.k.l(null, this);
        return l == nm6.a ? l : new z7o(l);
    }
}
