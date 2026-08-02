package defpackage;

/* loaded from: classes.dex */
public final class ifi extends cg6 {
    public d18 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ d18 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifi(d18 d18Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = d18Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.j(null, null, this);
    }
}
