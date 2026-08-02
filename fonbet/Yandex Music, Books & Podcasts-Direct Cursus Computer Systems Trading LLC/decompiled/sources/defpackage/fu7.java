package defpackage;

/* loaded from: classes.dex */
public final class fu7 extends cg6 {
    public kd4 j;
    public gln k;
    public /* synthetic */ Object l;
    public final /* synthetic */ xzi m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu7(xzi xziVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = xziVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b0(this, null, null);
    }
}
