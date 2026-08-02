package defpackage;

/* loaded from: classes3.dex */
public final class o72 extends cg6 {
    public cb2 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ s72 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o72(s72 s72Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = s72Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.l(this);
    }
}
