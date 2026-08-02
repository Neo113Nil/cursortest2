package defpackage;

/* loaded from: classes3.dex */
public final class i4d extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ j4d k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4d(j4d j4dVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = j4dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
