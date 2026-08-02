package defpackage;

/* loaded from: classes3.dex */
public final class rtg extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ hgp k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtg(hgp hgpVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = hgpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(this);
    }
}
