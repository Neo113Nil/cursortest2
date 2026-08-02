package defpackage;

/* loaded from: classes3.dex */
public final class o0h extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ q0h k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0h(q0h q0hVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = q0hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return q0h.b(this.k, null, this);
    }
}
