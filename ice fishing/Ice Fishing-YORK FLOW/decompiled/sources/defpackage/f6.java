package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class f6 extends defpackage.g6 {
    public float JhCgjQRTAOCT;
    public float ZpBGe2uQfcn8;
    public float fWTAfUmVKrZq;
    public float giKS3J6vZuNy;

    public f6(float f, float f2, float f3, float f4) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = f2;
        this.fWTAfUmVKrZq = f3;
        this.JhCgjQRTAOCT = f4;
    }

    @Override // defpackage.g6
    public final void JhCgjQRTAOCT() {
        this.ZpBGe2uQfcn8 = 0.0f;
        this.giKS3J6vZuNy = 0.0f;
        this.fWTAfUmVKrZq = 0.0f;
        this.JhCgjQRTAOCT = 0.0f;
    }

    @Override // defpackage.g6
    public final void WDYagTQQm9ns(float f, int i) {
        if (i == 0) {
            this.ZpBGe2uQfcn8 = f;
            return;
        }
        if (i == 1) {
            this.giKS3J6vZuNy = f;
        } else if (i == 2) {
            this.fWTAfUmVKrZq = f;
        } else {
            if (i != 3) {
                return;
            }
            this.JhCgjQRTAOCT = f;
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
        if (i == 2) {
            return this.fWTAfUmVKrZq;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.JhCgjQRTAOCT;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.f6)) {
            return false;
        }
        defpackage.f6 f6Var = (defpackage.f6) obj;
        return f6Var.ZpBGe2uQfcn8 == this.ZpBGe2uQfcn8 && f6Var.giKS3J6vZuNy == this.giKS3J6vZuNy && f6Var.fWTAfUmVKrZq == this.fWTAfUmVKrZq && f6Var.JhCgjQRTAOCT == this.JhCgjQRTAOCT;
    }

    @Override // defpackage.g6
    public final defpackage.g6 fWTAfUmVKrZq() {
        return new defpackage.f6(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.g6
    public final int giKS3J6vZuNy() {
        return 4;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.JhCgjQRTAOCT) + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.fWTAfUmVKrZq, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.giKS3J6vZuNy, java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        return "AnimationVector4D: v1 = " + this.ZpBGe2uQfcn8 + ", v2 = " + this.giKS3J6vZuNy + ", v3 = " + this.fWTAfUmVKrZq + ", v4 = " + this.JhCgjQRTAOCT;
    }
}
