package defpackage;

/* loaded from: classes3.dex */
public final class y90 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ja0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y90(ja0 ja0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = ja0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, null, this);
    }
}
