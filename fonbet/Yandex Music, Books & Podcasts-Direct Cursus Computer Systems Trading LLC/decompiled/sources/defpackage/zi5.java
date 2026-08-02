package defpackage;

/* loaded from: classes3.dex */
public final class zi5 extends cg6 {
    public String j;
    public String k;
    public rv8 l;
    public qqi m;
    public /* synthetic */ Object n;
    public final /* synthetic */ cj5 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi5(cj5 cj5Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = cj5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, null, null, this);
    }
}
