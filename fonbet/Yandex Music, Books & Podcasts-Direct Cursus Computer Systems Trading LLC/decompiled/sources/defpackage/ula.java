package defpackage;

/* loaded from: classes3.dex */
public final class ula extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ vla k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ula(vla vlaVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = vlaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return vla.a(this.k, this);
    }
}
