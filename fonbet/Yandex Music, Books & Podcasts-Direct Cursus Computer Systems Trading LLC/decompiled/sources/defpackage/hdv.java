package defpackage;

/* loaded from: classes4.dex */
public final class hdv extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ idv k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdv(idv idvVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = idvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        this.k.a(null, this);
        return nm6.a;
    }
}
