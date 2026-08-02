package defpackage;

/* loaded from: classes.dex */
public final class eyi extends cg6 {
    public gyi j;
    public long k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ gyi n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyi(gyi gyiVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = gyiVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.k(0L, 0L, this);
    }
}
