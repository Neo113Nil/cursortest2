package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

/* loaded from: classes12.dex */
public final class vjv implements zo31 {
    public final ConstraintLayout a;
    public final IconCircleButton b;
    public final AppCompatImageView c;
    public final AppCompatImageView d;
    public final LottieAnimationView e;
    public final RobotoTextView f;
    public final RobotoTextView g;

    public vjv(ConstraintLayout constraintLayout, IconCircleButton iconCircleButton, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LottieAnimationView lottieAnimationView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = constraintLayout;
        this.b = iconCircleButton;
        this.c = appCompatImageView;
        this.d = appCompatImageView2;
        this.e = lottieAnimationView;
        this.f = robotoTextView;
        this.g = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
