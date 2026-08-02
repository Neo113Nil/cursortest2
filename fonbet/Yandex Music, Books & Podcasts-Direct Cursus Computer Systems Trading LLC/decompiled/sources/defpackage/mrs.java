package defpackage;

/* loaded from: classes3.dex */
public final class mrs extends cg6 {
    public String j;
    public String k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ nrs n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrs(nrs nrsVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = nrsVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return nrs.b(this.n, this);
    }
}
