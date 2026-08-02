package defpackage;

/* loaded from: classes3.dex */
public final class xjg extends cg6 {
    public lpi j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ fkg m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjg(fkg fkgVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = fkgVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return fkg.a(this.m, null, null, this);
    }
}
