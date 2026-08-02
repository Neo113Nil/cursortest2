package defpackage;

/* loaded from: classes4.dex */
public final class csw extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ gsw k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csw(gsw gswVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = gswVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
