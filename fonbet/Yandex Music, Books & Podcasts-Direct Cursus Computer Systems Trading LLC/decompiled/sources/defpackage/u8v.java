package defpackage;

/* loaded from: classes4.dex */
public final class u8v extends cg6 {
    public b9v j;
    public /* synthetic */ Object k;
    public final /* synthetic */ v8v l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8v(v8v v8vVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = v8vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(null, this);
    }
}
