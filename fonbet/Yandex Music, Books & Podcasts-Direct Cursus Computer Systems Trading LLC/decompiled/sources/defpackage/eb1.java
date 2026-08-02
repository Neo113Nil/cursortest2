package defpackage;

/* loaded from: classes3.dex */
public final class eb1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ dn9 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb1(dn9 dn9Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = dn9Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.m(this);
    }
}
