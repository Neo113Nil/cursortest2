package defpackage;

/* loaded from: classes4.dex */
public final class zjw extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ akw k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjw(akw akwVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = akwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return akw.c(this.k, null, null, null, this);
    }
}
