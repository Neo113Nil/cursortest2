package defpackage;

/* loaded from: classes3.dex */
public final class uw0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ww0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw0(ww0 ww0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = ww0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
