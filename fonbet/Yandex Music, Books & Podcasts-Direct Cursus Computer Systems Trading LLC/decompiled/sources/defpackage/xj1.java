package defpackage;

/* loaded from: classes3.dex */
public final class xj1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ rdk k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj1(rdk rdkVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = rdkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.V(null, false, this);
    }
}
