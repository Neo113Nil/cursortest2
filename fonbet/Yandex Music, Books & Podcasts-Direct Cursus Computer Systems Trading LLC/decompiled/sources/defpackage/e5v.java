package defpackage;

/* loaded from: classes4.dex */
public final class e5v extends cg6 {
    public cu7 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f5v l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5v(f5v f5vVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = f5vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, null, null, this);
    }
}
