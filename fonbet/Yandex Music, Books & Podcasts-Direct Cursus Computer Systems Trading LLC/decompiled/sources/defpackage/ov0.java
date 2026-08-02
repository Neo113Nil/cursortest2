package defpackage;

/* loaded from: classes4.dex */
public final class ov0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ pv0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov0(pv0 pv0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = pv0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        pv0.g(this.k, null, null, this);
        return nm6.a;
    }
}
