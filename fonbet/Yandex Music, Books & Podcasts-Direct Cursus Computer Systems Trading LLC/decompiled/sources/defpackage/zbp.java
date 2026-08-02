package defpackage;

/* loaded from: classes5.dex */
public final class zbp extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ acp k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbp(acp acpVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = acpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.h(null, null, this);
    }
}
