package defpackage;

/* loaded from: classes3.dex */
public final class y91 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ z91 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y91(z91 z91Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = z91Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, false, this);
    }
}
