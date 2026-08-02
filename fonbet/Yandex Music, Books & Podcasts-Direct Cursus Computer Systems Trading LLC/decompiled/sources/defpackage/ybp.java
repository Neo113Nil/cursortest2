package defpackage;

/* loaded from: classes5.dex */
public final class ybp extends cg6 {
    public acp j;
    public /* synthetic */ Object k;
    public final /* synthetic */ acp l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybp(acp acpVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = acpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(this);
    }
}
