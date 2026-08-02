package defpackage;

/* loaded from: classes6.dex */
public final class est extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ gst k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public est(gst gstVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = gstVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return gst.a(this.k, null, this);
    }
}
