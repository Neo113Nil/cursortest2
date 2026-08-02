package defpackage;

/* loaded from: classes3.dex */
public final class vnh extends cg6 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wnh l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnh(wnh wnhVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = wnhVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return wnh.a(this.l, null, this);
    }
}
