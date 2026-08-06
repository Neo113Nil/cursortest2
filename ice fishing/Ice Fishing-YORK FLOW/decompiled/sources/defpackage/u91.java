package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class u91 implements defpackage.a91 {
    public final /* synthetic */ defpackage.y91 ZpBGe2uQfcn8;
    public final /* synthetic */ defpackage.w91 giKS3J6vZuNy;

    public u91(defpackage.y91 y91Var, defpackage.w91 w91Var) {
        this.ZpBGe2uQfcn8 = y91Var;
        this.giKS3J6vZuNy = w91Var;
    }

    @Override // defpackage.a91
    public final float ZpBGe2uQfcn8(float f) {
        float abs = java.lang.Math.abs(f);
        defpackage.y91 y91Var = this.ZpBGe2uQfcn8;
        if (abs != 0.0f && !((java.lang.Boolean) y91Var.P05cfTpS5W5L.ZpBGe2uQfcn8()).booleanValue()) {
            throw new defpackage.kx("The fling animation was cancelled", 0);
        }
        return y91Var.JhCgjQRTAOCT(y91Var.QiMR8OkAhezm(this.giKS3J6vZuNy.ZpBGe2uQfcn8(2, y91Var.WDYagTQQm9ns(y91Var.P05cfTpS5W5L(f)))));
    }
}
