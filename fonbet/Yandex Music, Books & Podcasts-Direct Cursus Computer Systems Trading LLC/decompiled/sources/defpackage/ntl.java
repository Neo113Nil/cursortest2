package defpackage;

/* loaded from: classes4.dex */
public final class ntl extends cg6 {
    public String j;
    public nvl k;
    public Long l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ rtl o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntl(rtl rtlVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = rtlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.m(null, null, false, null, this);
    }
}
