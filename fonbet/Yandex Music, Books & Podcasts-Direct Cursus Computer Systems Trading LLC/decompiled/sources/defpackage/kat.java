package defpackage;

/* loaded from: classes.dex */
public final class kat extends cg6 {
    public tgm j;
    public String k;
    public String[] l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ mat p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kat(mat matVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = matVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return mat.d(this.p, null, 0, this);
    }
}
