package defpackage;

/* loaded from: classes4.dex */
public final class zok extends cg6 {
    public String j;
    public p73 k;
    public cr l;
    public /* synthetic */ Object m;
    public final /* synthetic */ epk n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zok(epk epkVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = epkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.g(null, null, null, this);
    }
}
