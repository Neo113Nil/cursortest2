package defpackage;

/* loaded from: classes4.dex */
public final class jlj extends cg6 {
    public String j;
    public lvu k;
    public flj l;
    public int[] m;
    public /* synthetic */ Object n;
    public final /* synthetic */ llj o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlj(llj lljVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = lljVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.e(null, null, null, this);
    }
}
