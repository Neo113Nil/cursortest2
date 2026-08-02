package defpackage;

/* loaded from: classes3.dex */
public final class yx5 extends cg6 {
    public rx5 j;
    public Long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ le3 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx5(le3 le3Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = le3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.h(this);
    }
}
