package defpackage;

/* loaded from: classes14.dex */
public final class rvp0 extends yx01 {
    public final /* synthetic */ int f;
    public final /* synthetic */ svp0 g;

    public /* synthetic */ rvp0(svp0 svp0Var, int i) {
        this.f = i;
        this.g = svp0Var;
    }

    @Override // defpackage.yx01
    public final int b() {
        switch (this.f) {
        }
        return 0;
    }

    @Override // defpackage.yx01
    public final void e() {
        int i = this.f;
        svp0 svp0Var = this.g;
        switch (i) {
            case 0:
                svp0Var.attach();
                super.e();
                break;
            default:
                svp0Var.detach();
                super.e();
                break;
        }
    }
}
