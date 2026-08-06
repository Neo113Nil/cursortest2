package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class zf1 extends ag1 {
    public final WindowInsetsAnimation OOA6hdeuvCS;

    public zf1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.OOA6hdeuvCS = windowInsetsAnimation;
    }

    @Override // defpackage.ag1
    public final float GWasM1elztuh() {
        float alpha;
        alpha = this.OOA6hdeuvCS.getAlpha();
        return alpha;
    }

    @Override // defpackage.ag1
    public final void OOA6hdeuvCS(float f) {
        this.OOA6hdeuvCS.setFraction(f);
    }

    @Override // defpackage.ag1
    public final float X1lG3V04pd() {
        float interpolatedFraction;
        interpolatedFraction = this.OOA6hdeuvCS.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // defpackage.ag1
    public final long Yi7zF1RB1() {
        long durationMillis;
        durationMillis = this.OOA6hdeuvCS.getDurationMillis();
        return durationMillis;
    }

    @Override // defpackage.ag1
    public final int xqGvceK5x() {
        int typeMask;
        typeMask = this.OOA6hdeuvCS.getTypeMask();
        return typeMask;
    }
}
