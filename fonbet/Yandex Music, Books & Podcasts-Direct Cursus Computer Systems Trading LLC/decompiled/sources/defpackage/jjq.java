package defpackage;

/* loaded from: classes4.dex */
public final class jjq extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ kjq k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjq(kjq kjqVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = kjqVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(false, this);
    }
}
