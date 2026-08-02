package defpackage;

/* loaded from: classes5.dex */
public final class rs3 extends cg6 {
    public ltm j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ss3 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs3(ss3 ss3Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = ss3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, this);
    }
}
