package defpackage;

/* loaded from: classes.dex */
public final class o1k extends cg6 {
    public w1k j;
    public x1k k;
    public qqi l;
    public /* synthetic */ Object m;
    public final /* synthetic */ w1k n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1k(w1k w1kVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = w1kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.e(this);
    }
}
