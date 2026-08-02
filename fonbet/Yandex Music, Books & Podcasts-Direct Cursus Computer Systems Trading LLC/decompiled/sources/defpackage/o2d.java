package defpackage;

/* loaded from: classes3.dex */
public final class o2d extends cg6 {
    public xxq j;
    public String k;
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ p2d n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2d(p2d p2dVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = p2dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.d(this);
    }
}
