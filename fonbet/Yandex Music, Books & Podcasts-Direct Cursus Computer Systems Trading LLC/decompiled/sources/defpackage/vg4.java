package defpackage;

/* loaded from: classes5.dex */
public final class vg4 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ yg4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg4(yg4 yg4Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = yg4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(false, this);
    }
}
