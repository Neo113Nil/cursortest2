package defpackage;

/* loaded from: classes4.dex */
public final class b48 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ c48 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b48(c48 c48Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = c48Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
