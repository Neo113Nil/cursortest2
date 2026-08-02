package defpackage;

/* loaded from: classes4.dex */
public final class tk1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ e4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk1(e4 e4Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = e4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, false, this);
    }
}
