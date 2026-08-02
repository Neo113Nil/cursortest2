package defpackage;

/* loaded from: classes4.dex */
public final class w8l extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ xdh k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8l(xdh xdhVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = xdhVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.H(0L, null, this);
    }
}
