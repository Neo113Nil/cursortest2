package defpackage;

/* loaded from: classes5.dex */
public final class zsl extends cg6 {
    public long j;
    public b38 k;
    public String l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ btl p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsl(btl btlVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = btlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.n(0L, null, this);
    }
}
