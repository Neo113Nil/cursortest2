package defpackage;

/* loaded from: classes5.dex */
public final class rb0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ sb0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb0(sb0 sb0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = sb0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
