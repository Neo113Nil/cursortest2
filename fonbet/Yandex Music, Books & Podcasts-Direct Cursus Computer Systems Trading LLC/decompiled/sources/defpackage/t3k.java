package defpackage;

/* loaded from: classes.dex */
public final class t3k extends cg6 {
    public u3k j;
    public /* synthetic */ Object k;
    public final /* synthetic */ u3k l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3k(u3k u3kVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = u3kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, 0.0f, this);
    }
}
