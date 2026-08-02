package defpackage;

/* loaded from: classes.dex */
public final class jat extends cg6 {
    public tgm j;
    public String k;
    public String[] l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ mat q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jat(mat matVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = matVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return mat.c(this.q, null, 0, this);
    }
}
