package defpackage;

/* loaded from: classes3.dex */
public final class bng extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ aog k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bng(aog aogVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = aogVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, this);
    }
}
