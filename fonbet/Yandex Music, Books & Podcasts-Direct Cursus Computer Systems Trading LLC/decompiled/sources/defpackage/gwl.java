package defpackage;

/* loaded from: classes4.dex */
public final class gwl extends cg6 {
    public Integer j;
    public hwl k;
    public eul l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ hwl o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwl(hwl hwlVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = hwlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, 0, null, this);
    }
}
