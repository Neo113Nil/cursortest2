package defpackage;

/* loaded from: classes4.dex */
public final class zlj extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ cmj k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlj(cmj cmjVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = cmjVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return cmj.a(this.k, null, 0, 0, 0, null, this);
    }
}
