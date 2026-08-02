package defpackage;

/* loaded from: classes.dex */
public final class lmp extends cg6 {
    public Object j;
    public aur k;
    public qqi l;
    public /* synthetic */ Object m;
    public final /* synthetic */ pmp n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmp(pmp pmpVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = pmpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
