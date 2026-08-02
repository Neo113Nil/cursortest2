package defpackage;

/* loaded from: classes3.dex */
public final class p61 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ q61 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p61(q61 q61Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = q61Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, false, this);
    }
}
