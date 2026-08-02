package defpackage;

/* loaded from: classes3.dex */
public final class poe extends cg6 {
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ fs7 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public poe(fs7 fs7Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = fs7Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.j(null, this);
    }
}
