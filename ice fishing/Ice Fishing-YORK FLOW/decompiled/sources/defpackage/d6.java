package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class d6 extends defpackage.g6 {
    public float ZpBGe2uQfcn8;
    public float giKS3J6vZuNy;

    public d6(float f, float f2) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = f2;
    }

    @Override // defpackage.g6
    public final void JhCgjQRTAOCT() {
        this.ZpBGe2uQfcn8 = 0.0f;
        this.giKS3J6vZuNy = 0.0f;
    }

    @Override // defpackage.g6
    public final void WDYagTQQm9ns(float f, int i) {
        if (i == 0) {
            this.ZpBGe2uQfcn8 = f;
        } else {
            if (i != 1) {
                return;
            }
            this.giKS3J6vZuNy = f;
        }
    }

    @Override // defpackage.g6
    public final float ZpBGe2uQfcn8(int i) {
        if (i == 0) {
            return this.ZpBGe2uQfcn8;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.giKS3J6vZuNy;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.d6)) {
            return false;
        }
        defpackage.d6 d6Var = (defpackage.d6) obj;
        return d6Var.ZpBGe2uQfcn8 == this.ZpBGe2uQfcn8 && d6Var.giKS3J6vZuNy == this.giKS3J6vZuNy;
    }

    @Override // defpackage.g6
    public final defpackage.g6 fWTAfUmVKrZq() {
        return new defpackage.d6(0.0f, 0.0f);
    }

    @Override // defpackage.g6
    public final int giKS3J6vZuNy() {
        return 2;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.giKS3J6vZuNy) + (java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31);
    }

    public final java.lang.String toString() {
        return "AnimationVector2D: v1 = " + this.ZpBGe2uQfcn8 + ", v2 = " + this.giKS3J6vZuNy;
    }
}
