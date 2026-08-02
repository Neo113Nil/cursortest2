package defpackage;

/* loaded from: classes4.dex */
public final class p02 extends cg6 {
    public xum j;
    public zns k;
    public /* synthetic */ Object l;
    public final /* synthetic */ q02 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p02(q02 q02Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = q02Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        Object a = this.m.a(null, this);
        return a == nm6.a ? a : new z7o(a);
    }
}
