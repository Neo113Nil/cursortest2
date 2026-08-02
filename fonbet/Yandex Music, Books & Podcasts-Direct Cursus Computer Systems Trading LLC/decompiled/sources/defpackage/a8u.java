package defpackage;

/* loaded from: classes4.dex */
public final class a8u extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ b8u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8u(b8u b8uVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = b8uVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
