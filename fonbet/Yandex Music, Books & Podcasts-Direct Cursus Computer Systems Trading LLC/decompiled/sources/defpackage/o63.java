package defpackage;

/* loaded from: classes4.dex */
public final class o63 extends cg6 {
    public wfm j;
    public /* synthetic */ Object k;
    public final /* synthetic */ q63 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o63(q63 q63Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = q63Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
