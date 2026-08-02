package defpackage;

/* loaded from: classes3.dex */
public final class xa1 extends cg6 {
    public String j;
    public oqi k;
    public boolean l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ab1 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa1(ab1 ab1Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = ab1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, false, this);
    }
}
