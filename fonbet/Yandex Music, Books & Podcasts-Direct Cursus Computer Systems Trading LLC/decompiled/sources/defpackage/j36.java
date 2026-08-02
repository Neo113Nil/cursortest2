package defpackage;

/* loaded from: classes4.dex */
public final class j36 extends cg6 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ m36 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j36(m36 m36Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = m36Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.o(false, this);
    }
}
