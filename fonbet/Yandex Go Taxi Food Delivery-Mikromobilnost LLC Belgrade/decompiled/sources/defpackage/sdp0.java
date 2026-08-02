package defpackage;

import android.animation.ValueAnimator;
import androidx.camera.view.ScreenFlashView;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class sdp0 implements v8v {
    public float a;
    public ValueAnimator b;
    public final /* synthetic */ ScreenFlashView c;

    public sdp0(ScreenFlashView screenFlashView) {
        this.c = screenFlashView;
    }

    @Override // defpackage.v8v
    public final void a(long j, en7 en7Var) {
        float brightness;
        ValueAnimator animateToFullOpacity;
        sgb1.g(3, "ScreenFlashView");
        ScreenFlashView screenFlashView = this.c;
        brightness = screenFlashView.getBrightness();
        this.a = brightness;
        screenFlashView.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(en7Var);
        animateToFullOpacity = screenFlashView.animateToFullOpacity(new v3n0(28, en7Var));
        this.b = animateToFullOpacity;
    }

    @Override // defpackage.v8v
    public final void clear() {
        sgb1.g(3, "ScreenFlashView");
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        ScreenFlashView screenFlashView = this.c;
        screenFlashView.setAlpha(0.0f);
        screenFlashView.setBrightness(this.a);
    }
}
