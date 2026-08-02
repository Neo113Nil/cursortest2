package defpackage;

/* loaded from: classes3.dex */
public final class a5p extends cg6 {
    public z4p j;
    public yrj k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ b5p n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5p(b5p b5pVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = b5pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.e(null, this);
    }
}
