package defpackage;

/* loaded from: classes3.dex */
public final class qev extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ rev k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qev(rev revVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = revVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        this.k.a(null, this);
        return nm6.a;
    }
}
