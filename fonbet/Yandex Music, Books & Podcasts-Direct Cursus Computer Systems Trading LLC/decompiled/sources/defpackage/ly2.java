package defpackage;

/* loaded from: classes3.dex */
public final class ly2 extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ oy2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly2(oy2 oy2Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = oy2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return oy2.a(this.l, null, this);
    }
}
