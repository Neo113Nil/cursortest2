package defpackage;

/* loaded from: classes4.dex */
public final class o51 extends cg6 {
    public Iterable j;
    public /* synthetic */ Object k;
    public final /* synthetic */ p51 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o51(p51 p51Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = p51Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.h(null, null, this);
    }
}
