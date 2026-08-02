package defpackage;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.CloseButtonIconComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class sso0 implements zo31 {
    public final GoConstraintLayout a;
    public final ButtonComponent b;
    public final CloseButtonIconComponent c;
    public final GoImageView d;
    public final LottieAnimationView e;
    public final GoLinearLayout f;
    public final RobotoTextView g;
    public final RobotoTextView h;

    public sso0(GoConstraintLayout goConstraintLayout, ButtonComponent buttonComponent, CloseButtonIconComponent closeButtonIconComponent, GoImageView goImageView, LottieAnimationView lottieAnimationView, GoLinearLayout goLinearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goConstraintLayout;
        this.b = buttonComponent;
        this.c = closeButtonIconComponent;
        this.d = goImageView;
        this.e = lottieAnimationView;
        this.f = goLinearLayout;
        this.g = robotoTextView;
        this.h = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
