package defpackage;

/* loaded from: classes4.dex */
public final class u3u extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ b4u k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3u(b4u b4uVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = b4uVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(null, this);
    }
}
