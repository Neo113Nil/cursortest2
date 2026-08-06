package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class e6 extends defpackage.g6 {
    public float ZpBGe2uQfcn8;
    public float fWTAfUmVKrZq;
    public float giKS3J6vZuNy;

    public e6(float f, float f2, float f3) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = f2;
        this.fWTAfUmVKrZq = f3;
    }

    @Override // defpackage.g6
    public final void JhCgjQRTAOCT() {
        this.ZpBGe2uQfcn8 = 0.0f;
        this.giKS3J6vZuNy = 0.0f;
        this.fWTAfUmVKrZq = 0.0f;
    }

    @Override // defpackage.g6
    public final void WDYagTQQm9ns(float f, int i) {
        if (i == 0) {
            this.ZpBGe2uQfcn8 = f;
        } else if (i == 1) {
            this.giKS3J6vZuNy = f;
        } else {
            if (i != 2) {
                return;
            }
            this.fWTAfUmVKrZq = f;
        }
    }

    @Override // defpackage.g6
    public final float ZpBGe2uQfcn8(int i) {
        if (i == 0) {
            return this.ZpBGe2uQfcn8;
        }
        if (i == 1) {
            return this.giKS3J6vZuNy;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.fWTAfUmVKrZq;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.e6)) {
            return false;
        }
        defpackage.e6 e6Var = (defpackage.e6) obj;
        return e6Var.ZpBGe2uQfcn8 == this.ZpBGe2uQfcn8 && e6Var.giKS3J6vZuNy == this.giKS3J6vZuNy && e6Var.fWTAfUmVKrZq == this.fWTAfUmVKrZq;
    }

    @Override // defpackage.g6
    public final defpackage.g6 fWTAfUmVKrZq() {
        return new defpackage.e6(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.g6
    public final int giKS3J6vZuNy() {
        return 3;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.fWTAfUmVKrZq) + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.giKS3J6vZuNy, java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31, 31);
    }

    public final java.lang.String toString() {
        return "AnimationVector3D: v1 = " + this.ZpBGe2uQfcn8 + ", v2 = " + this.giKS3J6vZuNy + ", v3 = " + this.fWTAfUmVKrZq;
    }
}
