package defpackage;

/* loaded from: classes4.dex */
public final class d5v extends cg6 {
    public eu7 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f5v l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5v(f5v f5vVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = f5vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, null, this);
    }
}
