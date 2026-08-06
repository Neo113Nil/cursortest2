package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class eq extends defpackage.hv1 {
    public final /* synthetic */ defpackage.fq QiMR8OkAhezm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(defpackage.fq fqVar) {
        super(1);
        this.QiMR8OkAhezm = fqVar;
    }

    @Override // defpackage.hv1
    public final defpackage.mw1 JhCgjQRTAOCT(defpackage.mw1 mw1Var, java.util.List list) {
        defpackage.fq fqVar = this.QiMR8OkAhezm;
        if (!fqVar.WmetiUbpKU9I) {
            android.view.View childAt = fqVar.getChildAt(0);
            int max = java.lang.Math.max(0, childAt.getLeft());
            int max2 = java.lang.Math.max(0, childAt.getTop());
            int max3 = java.lang.Math.max(0, fqVar.getWidth() - childAt.getRight());
            int max4 = java.lang.Math.max(0, fqVar.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return mw1Var.ZpBGe2uQfcn8.WmetiUbpKU9I(max, max2, max3, max4);
            }
        }
        return mw1Var;
    }

    @Override // defpackage.hv1
    public final defpackage.pd1 WDYagTQQm9ns(defpackage.qv1 qv1Var, defpackage.pd1 pd1Var) {
        defpackage.fq fqVar = this.QiMR8OkAhezm;
        if (!fqVar.WmetiUbpKU9I) {
            android.view.View childAt = fqVar.getChildAt(0);
            int max = java.lang.Math.max(0, childAt.getLeft());
            int max2 = java.lang.Math.max(0, childAt.getTop());
            int max3 = java.lang.Math.max(0, fqVar.getWidth() - childAt.getRight());
            int max4 = java.lang.Math.max(0, fqVar.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                defpackage.v80 giKS3J6vZuNy = defpackage.v80.giKS3J6vZuNy(max, max2, max3, max4);
                int i = giKS3J6vZuNy.ZpBGe2uQfcn8;
                defpackage.v80 v80Var = (defpackage.v80) pd1Var.giKS3J6vZuNy;
                int i2 = giKS3J6vZuNy.giKS3J6vZuNy;
                int i3 = giKS3J6vZuNy.fWTAfUmVKrZq;
                int i4 = giKS3J6vZuNy.JhCgjQRTAOCT;
                return new defpackage.pd1(5, defpackage.mw1.ZpBGe2uQfcn8(v80Var, i, i2, i3, i4), defpackage.mw1.ZpBGe2uQfcn8((defpackage.v80) pd1Var.fWTAfUmVKrZq, i, i2, i3, i4));
            }
        }
        return pd1Var;
    }
}
