package defpackage;

/* loaded from: classes3.dex */
public final class ylp extends cg6 {
    public zlp j;
    public /* synthetic */ Object k;
    public final /* synthetic */ zlp l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylp(zlp zlpVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = zlpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return zlp.a(this.l, this);
    }
}
