package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ov1 extends defpackage.pv1 {
    public final android.view.WindowInsetsAnimation WDYagTQQm9ns;

    public ov1(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.WDYagTQQm9ns = windowInsetsAnimation;
    }

    @Override // defpackage.pv1
    public final int JhCgjQRTAOCT() {
        int typeMask;
        typeMask = this.WDYagTQQm9ns.getTypeMask();
        return typeMask;
    }

    @Override // defpackage.pv1
    public final void WDYagTQQm9ns(float f) {
        this.WDYagTQQm9ns.setFraction(f);
    }

    @Override // defpackage.pv1
    public final float ZpBGe2uQfcn8() {
        float alpha;
        alpha = this.WDYagTQQm9ns.getAlpha();
        return alpha;
    }

    @Override // defpackage.pv1
    public final float fWTAfUmVKrZq() {
        float interpolatedFraction;
        interpolatedFraction = this.WDYagTQQm9ns.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // defpackage.pv1
    public final long giKS3J6vZuNy() {
        long durationMillis;
        durationMillis = this.WDYagTQQm9ns.getDurationMillis();
        return durationMillis;
    }
}
