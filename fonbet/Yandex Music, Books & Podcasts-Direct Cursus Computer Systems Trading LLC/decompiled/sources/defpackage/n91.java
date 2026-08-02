package defpackage;

/* loaded from: classes3.dex */
public final class n91 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ osh k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n91(osh oshVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = oshVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(this);
    }
}
