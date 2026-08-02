package defpackage;

/* loaded from: classes.dex */
public final class ygm extends cg6 {
    public Object j;
    public Throwable k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ahm n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygm(ahm ahmVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = ahmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.g(null, null, this);
    }
}
