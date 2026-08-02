package defpackage;

/* loaded from: classes4.dex */
public final class fkw extends cg6 {
    public iow j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ jkw m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkw(jkw jkwVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = jkwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, null, null, null, this);
    }
}
