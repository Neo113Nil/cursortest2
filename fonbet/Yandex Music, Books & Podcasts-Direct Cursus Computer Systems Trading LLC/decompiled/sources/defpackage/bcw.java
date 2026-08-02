package defpackage;

/* loaded from: classes3.dex */
public final class bcw extends cg6 {
    public String j;
    public z4n k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ccw m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcw(ccw ccwVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = ccwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return ccw.c(this.m, null, null, this);
    }
}
