package defpackage;

/* loaded from: classes4.dex */
public final class nhe extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ohe k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhe(ohe oheVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = oheVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, false, this);
    }
}
