package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.communications.stepsinstructions.components.StepsDashedLine;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersImageView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes6.dex */
public final class wau0 implements zo31 {
    public final LinearLayout a;
    public final StepsDashedLine b;
    public final GoImageView c;
    public final ShimmeringFrameLayout d;
    public final RoundedCornersImageView e;
    public final ShimmeringFrameLayout f;
    public final RobotoTextView g;
    public final RobotoTextView h;

    public wau0(LinearLayout linearLayout, StepsDashedLine stepsDashedLine, GoImageView goImageView, ShimmeringFrameLayout shimmeringFrameLayout, RoundedCornersImageView roundedCornersImageView, ShimmeringFrameLayout shimmeringFrameLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = linearLayout;
        this.b = stepsDashedLine;
        this.c = goImageView;
        this.d = shimmeringFrameLayout;
        this.e = roundedCornersImageView;
        this.f = shimmeringFrameLayout2;
        this.g = robotoTextView;
        this.h = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
