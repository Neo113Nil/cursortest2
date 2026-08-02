package defpackage;

/* loaded from: classes6.dex */
public final class mqw extends cg6 {
    public iqw[] j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ oqw o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqw(oqw oqwVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = oqwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, this);
    }
}
