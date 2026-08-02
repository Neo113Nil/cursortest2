package defpackage;

/* loaded from: classes3.dex */
public final class ab2 extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ bb2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab2(bb2 bb2Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = bb2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
