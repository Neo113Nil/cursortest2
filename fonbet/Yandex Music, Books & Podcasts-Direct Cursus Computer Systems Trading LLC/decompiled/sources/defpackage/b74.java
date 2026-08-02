package defpackage;

/* loaded from: classes4.dex */
public final class b74 extends cg6 {
    public c74 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ c74 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b74(c74 c74Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = c74Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this, null, null);
    }
}
