package V1;

import android.animation.ValueAnimator;
import android.util.Log;

/* loaded from: classes.dex */
public final class f extends U1.a {
    public final int Y;

    public f(int i) {
        super(1);
        this.Y = i;
    }

    @Override // U1.e
    public final ValueAnimator d() {
        float[] fArr = {0.0f, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
        S1.e eVar = new S1.e(this);
        int i = 0;
        eVar.d(fArr, U1.e.f3172N, new Integer[]{0, -90, -179, -180, -270, -360});
        eVar.c(fArr, U1.e.f3174P, new Float[]{Float.valueOf(0.0f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.0f), Float.valueOf(0.0f)});
        eVar.c(fArr, U1.e.f3175Q, new Float[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.0f)});
        eVar.c(fArr, U1.e.f3177S, new Float[]{Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(1.0f)});
        eVar.f2848c = com.anythink.expressad.f.a.b.aC;
        eVar.b(fArr);
        int i6 = this.Y;
        if (i6 < 0) {
            Log.w("SpriteAnimatorBuilder", "startFrame should always be non-negative");
        } else {
            i = i6;
        }
        eVar.f2849d = i;
        return eVar.a();
    }
}
