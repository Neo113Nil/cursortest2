package defpackage;

/* loaded from: classes4.dex */
public final class gtl extends cg6 {
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ rtl l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtl(rtl rtlVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = rtlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(null, 0L, this);
    }
}
