package defpackage;

/* loaded from: classes4.dex */
public final class kc1 extends cg6 {
    public String j;
    public j1g k;
    public /* synthetic */ Object l;
    public final /* synthetic */ mc1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc1(mc1 mc1Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = mc1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.h(null, null, this);
    }
}
