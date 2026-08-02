package defpackage;

/* loaded from: classes4.dex */
public final class qfg extends cg6 {
    public Object j;
    public Object k;
    public sfm l;
    public aur m;
    public /* synthetic */ Object n;
    public final /* synthetic */ sfg o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfg(sfg sfgVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = sfgVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, null, null, this);
    }
}
