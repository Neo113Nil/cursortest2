package defpackage;

/* loaded from: classes4.dex */
public final class x2 extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ y2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(y2 y2Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = y2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
