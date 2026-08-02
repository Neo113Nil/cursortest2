package defpackage;

/* loaded from: classes4.dex */
public final class ts extends cg6 {
    public et j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ et m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts(et etVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = etVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, null, this);
    }
}
