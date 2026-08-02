package defpackage;

/* loaded from: classes4.dex */
public final class j21 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ k21 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j21(k21 k21Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = k21Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, false, false, false, 0, this);
    }
}
