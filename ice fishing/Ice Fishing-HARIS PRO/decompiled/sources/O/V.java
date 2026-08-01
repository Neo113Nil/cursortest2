package O;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class V extends W {
    public final WindowInsetsAnimation e;

    public V(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // O.W
    public final long a() {
        long durationMillis;
        durationMillis = this.e.getDurationMillis();
        return durationMillis;
    }

    @Override // O.W
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // O.W
    public final int c() {
        int typeMask;
        typeMask = this.e.getTypeMask();
        return typeMask;
    }

    @Override // O.W
    public final void d(float f2) {
        this.e.setFraction(f2);
    }
}
