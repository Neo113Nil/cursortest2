package defpackage;

/* loaded from: classes.dex */
public final class zv0 extends cg6 {
    public vv0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ aw0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv0(aw0 aw0Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = aw0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(this);
    }
}
