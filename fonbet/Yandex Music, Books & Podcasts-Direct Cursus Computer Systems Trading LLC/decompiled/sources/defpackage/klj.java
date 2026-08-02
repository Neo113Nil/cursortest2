package defpackage;

/* loaded from: classes4.dex */
public final class klj extends cg6 {
    public String j;
    public kvu k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ llj q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klj(llj lljVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = lljVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return llj.a(this.q, null, null, false, this);
    }
}
