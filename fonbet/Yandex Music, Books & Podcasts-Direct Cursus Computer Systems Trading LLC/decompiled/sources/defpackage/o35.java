package defpackage;

/* loaded from: classes3.dex */
public final class o35 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ xiu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o35(xiu xiuVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = xiuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.z(this, null, false);
    }
}
