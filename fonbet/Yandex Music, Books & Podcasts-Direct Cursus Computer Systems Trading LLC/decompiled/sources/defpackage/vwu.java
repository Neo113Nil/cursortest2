package defpackage;

/* loaded from: classes4.dex */
public final class vwu extends cg6 {
    public qxu j;
    public aur k;
    public /* synthetic */ Object l;
    public final /* synthetic */ hxu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwu(hxu hxuVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = hxuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return hxu.c(this.m, null, null, this);
    }
}
