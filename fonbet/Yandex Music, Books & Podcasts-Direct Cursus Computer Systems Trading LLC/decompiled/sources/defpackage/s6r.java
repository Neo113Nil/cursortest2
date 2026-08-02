package defpackage;

/* loaded from: classes4.dex */
public final class s6r extends cg6 {
    public cc7 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ t6r l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6r(t6r t6rVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = t6rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return t6r.a(this.l, this);
    }
}
