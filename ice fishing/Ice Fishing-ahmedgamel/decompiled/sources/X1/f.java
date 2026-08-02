package X1;

import android.animation.ValueAnimator;
import android.util.Log;

/* loaded from: classes.dex */
public final class f extends W1.a {
    public final int Y;

    public f(int i) {
        super(1);
        this.Y = i;
    }

    @Override // W1.e
    public final ValueAnimator d() {
        float[] fArr = {0.0f, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
        U1.e eVar = new U1.e(this);
        int i = 0;
        eVar.d(fArr, W1.e.f3541N, new Integer[]{0, -90, -179, -180, -270, -360});
        eVar.c(fArr, W1.e.f3543P, new Float[]{Float.valueOf(0.0f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.0f), Float.valueOf(0.0f)});
        eVar.c(fArr, W1.e.f3544Q, new Float[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.0f)});
        eVar.c(fArr, W1.e.f3546S, new Float[]{Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(1.0f)});
        eVar.f3287c = com.anythink.expressad.f.a.b.aC;
        eVar.b(fArr);
        int i4 = this.Y;
        if (i4 < 0) {
            Log.w("SpriteAnimatorBuilder", "startFrame should always be non-negative");
        } else {
            i = i4;
        }
        eVar.f3288d = i;
        return eVar.a();
    }
}
