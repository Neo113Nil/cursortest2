package defpackage;

/* loaded from: classes3.dex */
public final class ybw extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ccw k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybw(ccw ccwVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = ccwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(this);
    }
}
