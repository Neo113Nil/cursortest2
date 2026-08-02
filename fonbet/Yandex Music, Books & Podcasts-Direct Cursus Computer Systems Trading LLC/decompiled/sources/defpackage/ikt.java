package defpackage;

/* loaded from: classes4.dex */
public final class ikt extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ jkt k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikt(jkt jktVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = jktVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return jkt.a(this.k, this);
    }
}
