package defpackage;

/* loaded from: classes3.dex */
public final class ug2 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ vg2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug2(vg2 vg2Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = vg2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return vg2.c(this.k, this);
    }
}
