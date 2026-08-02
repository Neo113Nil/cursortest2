package defpackage;

/* loaded from: classes4.dex */
public final class ufr extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ vfr k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufr(vfr vfrVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = vfrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(false, this);
    }
}
