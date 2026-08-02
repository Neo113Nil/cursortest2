package defpackage;

/* loaded from: classes3.dex */
public final class bau extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ihf k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bau(ihf ihfVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = ihfVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, this);
    }
}
