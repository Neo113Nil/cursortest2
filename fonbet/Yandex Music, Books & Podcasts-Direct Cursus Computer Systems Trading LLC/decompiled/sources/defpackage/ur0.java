package defpackage;

/* loaded from: classes.dex */
public final class ur0 extends tsc {
    public final /* synthetic */ bs0 j;
    public final /* synthetic */ es0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur0(es0 es0Var, es0 es0Var2, bs0 bs0Var) {
        super(es0Var2);
        this.k = es0Var;
        this.j = bs0Var;
    }

    @Override // defpackage.tsc
    public final keq d() {
        return this.j;
    }

    @Override // defpackage.tsc
    public final boolean e() {
        es0 es0Var = this.k;
        if (es0Var.getInternalPopup().a()) {
            return true;
        }
        es0Var.f.l(es0Var.getTextDirection(), es0Var.getTextAlignment());
        return true;
    }
}
