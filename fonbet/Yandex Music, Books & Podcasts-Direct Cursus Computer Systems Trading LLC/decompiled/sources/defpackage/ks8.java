package defpackage;

/* loaded from: classes3.dex */
public final class ks8 extends kpj {
    public final /* synthetic */ ns8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks8(ns8 ns8Var) {
        super(true);
        this.b = ns8Var;
    }

    @Override // defpackage.kpj
    public final void handleOnBackPressed() {
        ns8 ns8Var = this.b;
        ns8Var.z().a("close_system");
        ((fs8) ns8Var.k.getValue()).a.finish();
    }
}
