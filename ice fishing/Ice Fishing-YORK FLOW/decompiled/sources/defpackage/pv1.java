package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class pv1 {
    public final long JhCgjQRTAOCT;
    public final int ZpBGe2uQfcn8;
    public final android.view.animation.Interpolator fWTAfUmVKrZq;
    public float giKS3J6vZuNy;

    public pv1(int i, android.view.animation.Interpolator interpolator, long j) {
        this.ZpBGe2uQfcn8 = i;
        this.fWTAfUmVKrZq = interpolator;
        this.JhCgjQRTAOCT = j;
    }

    public int JhCgjQRTAOCT() {
        return this.ZpBGe2uQfcn8;
    }

    public void WDYagTQQm9ns(float f) {
        this.giKS3J6vZuNy = f;
    }

    public float ZpBGe2uQfcn8() {
        return 1.0f;
    }

    public float fWTAfUmVKrZq() {
        float f = this.giKS3J6vZuNy;
        android.view.animation.Interpolator interpolator = this.fWTAfUmVKrZq;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public long giKS3J6vZuNy() {
        return this.JhCgjQRTAOCT;
    }
}
