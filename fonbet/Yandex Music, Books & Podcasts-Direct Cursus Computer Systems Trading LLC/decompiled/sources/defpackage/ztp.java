package defpackage;

/* loaded from: classes6.dex */
public final class ztp extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ cup k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztp(cup cupVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = cupVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
