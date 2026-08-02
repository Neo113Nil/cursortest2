package defpackage;

/* loaded from: classes4.dex */
public final class jtl extends cg6 {
    public Iterable j;
    public /* synthetic */ Object k;
    public final /* synthetic */ rtl l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtl(rtl rtlVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = rtlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.j(null, null, this);
    }
}
