package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
final class zw extends defpackage.zl0 {
    public final defpackage.mq ZpBGe2uQfcn8;
    public final float giKS3J6vZuNy;

    public zw(defpackage.mq mqVar, float f) {
        this.ZpBGe2uQfcn8 = mqVar;
        this.giKS3J6vZuNy = f;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        defpackage.ax axVar = new defpackage.ax();
        axVar.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        axVar.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
        return axVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.zw)) {
            return false;
        }
        defpackage.zw zwVar = (defpackage.zw) obj;
        return this.ZpBGe2uQfcn8 == zwVar.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == zwVar.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.giKS3J6vZuNy) + (this.ZpBGe2uQfcn8.hashCode() * 31);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.ax axVar = (defpackage.ax) ul0Var;
        axVar.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        axVar.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
    }
}
