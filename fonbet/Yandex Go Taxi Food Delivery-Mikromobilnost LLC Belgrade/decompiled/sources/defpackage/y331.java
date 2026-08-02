package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.vault.flexsdk.descriptors.widget.animation.LockOverlayView;
import ru.yandex.taxi.design.ClickableImageView;

/* loaded from: classes14.dex */
public final /* synthetic */ class y331 implements auz {
    public final /* synthetic */ a431 a;
    public final /* synthetic */ ClickableImageView b;
    public final /* synthetic */ GoImageView c;
    public final /* synthetic */ Integer d;

    public /* synthetic */ y331(a431 a431Var, ClickableImageView clickableImageView, GoImageView goImageView, Integer num) {
        this.a = a431Var;
        this.b = clickableImageView;
        this.c = goImageView;
        this.d = num;
    }

    public final void a() {
        a431 a431Var = this.a;
        LockOverlayView lockOverlayView = a431Var.Q;
        if (lockOverlayView == null) {
            lockOverlayView = null;
        }
        lockOverlayView.setVisibility(0);
        this.b.setVisibility(0);
        LottieAnimationView lottieAnimationView = a431Var.O;
        (lottieAnimationView != null ? lottieAnimationView : null).setVisibility(0);
        this.c.setVisibility(this.d == null ? 4 : 0);
    }
}
