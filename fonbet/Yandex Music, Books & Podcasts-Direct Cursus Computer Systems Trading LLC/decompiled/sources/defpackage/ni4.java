package defpackage;

/* loaded from: classes3.dex */
public final class ni4 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ pi4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni4(pi4 pi4Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = pi4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f(this);
    }
}
