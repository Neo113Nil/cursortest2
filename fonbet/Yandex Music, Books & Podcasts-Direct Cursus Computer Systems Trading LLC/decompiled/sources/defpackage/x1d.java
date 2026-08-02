package defpackage;

/* loaded from: classes3.dex */
public final class x1d extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ y1d k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1d(y1d y1dVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = y1dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
