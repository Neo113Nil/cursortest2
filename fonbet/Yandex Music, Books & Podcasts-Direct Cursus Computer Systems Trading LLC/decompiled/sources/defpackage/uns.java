package defpackage;

/* loaded from: classes3.dex */
public final class uns extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wns l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uns(wns wnsVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = wnsVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
