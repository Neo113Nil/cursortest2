package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class fm0 {
    public em0 a;
    public final /* synthetic */ hm0 b;

    public fm0(hm0 hm0Var) {
        this.b = hm0Var;
    }

    public final boolean a() {
        boolean unregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.a);
        this.a = null;
        return unregisterDurationScaleChangeListener;
    }
}
