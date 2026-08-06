package defpackage;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ag1 {
    public final int GWasM1elztuh;
    public final Interpolator X1lG3V04pd;
    public float Yi7zF1RB1;
    public final long xqGvceK5x;

    public ag1(int i, Interpolator interpolator, long j) {
        this.GWasM1elztuh = i;
        this.X1lG3V04pd = interpolator;
        this.xqGvceK5x = j;
    }

    public float GWasM1elztuh() {
        return 1.0f;
    }

    public void OOA6hdeuvCS(float f) {
        this.Yi7zF1RB1 = f;
    }

    public float X1lG3V04pd() {
        float f = this.Yi7zF1RB1;
        Interpolator interpolator = this.X1lG3V04pd;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public long Yi7zF1RB1() {
        return this.xqGvceK5x;
    }

    public int xqGvceK5x() {
        return this.GWasM1elztuh;
    }
}
