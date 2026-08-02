package defpackage;

/* loaded from: classes15.dex */
public final class yf4 implements vff0 {
    public final /* synthetic */ zf4 a;

    public yf4(zf4 zf4Var) {
        this.a = zf4Var;
    }

    @Override // defpackage.vff0
    public final void b() {
        zf4 zf4Var = this.a;
        vf4 vf4Var = zf4Var.x;
        if (vf4Var != null) {
            vf4Var.close();
            zf4Var.x = null;
        }
    }
}
