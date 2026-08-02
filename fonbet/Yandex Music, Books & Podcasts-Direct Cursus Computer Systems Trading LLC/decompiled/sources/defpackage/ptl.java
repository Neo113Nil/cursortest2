package defpackage;

/* loaded from: classes4.dex */
public final class ptl extends cg6 {
    public String j;
    public byr k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ rtl n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptl(rtl rtlVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = rtlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.n(null, 0L, null, this);
    }
}
