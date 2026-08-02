package defpackage;

/* loaded from: classes3.dex */
public final class gx2 extends cg6 {
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ lx2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx2(lx2 lx2Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = lx2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.l(this);
    }
}
