package defpackage;

/* loaded from: classes3.dex */
public final class u0r extends cg6 {
    public s5d j;
    public s5d k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ cr n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0r(cr crVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = crVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return cr.m(this.n, null, null, false, this);
    }
}
