package defpackage;

/* loaded from: classes4.dex */
public final class j2i extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ k2i k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2i(k2i k2iVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = k2iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, null, null, this);
    }
}
