package defpackage;

/* loaded from: classes4.dex */
public final class nh6 extends cg6 {
    public qj6 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ oh6 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh6(oh6 oh6Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = oh6Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return oh6.m(this.l, this);
    }
}
