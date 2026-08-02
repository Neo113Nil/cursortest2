package defpackage;

/* loaded from: classes3.dex */
public final class i68 extends cg6 {
    public qqi j;
    public /* synthetic */ Object k;
    public final /* synthetic */ k68 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i68(k68 k68Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = k68Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(this);
    }
}
