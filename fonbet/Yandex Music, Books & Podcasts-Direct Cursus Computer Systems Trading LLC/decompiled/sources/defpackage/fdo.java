package defpackage;

import android.animation.TimeInterpolator;

/* loaded from: classes3.dex */
public final class fdo implements TimeInterpolator {
    public final TimeInterpolator a;

    public fdo(TimeInterpolator timeInterpolator) {
        this.a = timeInterpolator;
    }

    public static TimeInterpolator a(boolean z, TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new fdo(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - this.a.getInterpolation(f);
    }
}
