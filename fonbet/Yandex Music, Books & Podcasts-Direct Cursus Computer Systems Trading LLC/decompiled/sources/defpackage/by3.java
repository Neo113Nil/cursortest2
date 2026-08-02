package defpackage;

/* loaded from: classes3.dex */
public final class by3 extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cy3 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by3(cy3 cy3Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = cy3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
