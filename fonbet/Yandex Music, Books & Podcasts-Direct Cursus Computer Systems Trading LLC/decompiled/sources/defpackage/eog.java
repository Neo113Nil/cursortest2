package defpackage;

/* loaded from: classes3.dex */
public final class eog extends cg6 {
    public xdh j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ fog m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eog(fog fogVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = fogVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, null, null, this);
    }
}
