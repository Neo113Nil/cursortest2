package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoLinearLayout;

/* loaded from: classes14.dex */
public final class v1y implements zo31 {
    public final FrameLayout a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final AppCompatImageView d;
    public final GoLinearLayout e;
    public final ConstraintLayout f;
    public final LottieAnimationView g;
    public final AppCompatTextView h;
    public final AppCompatTextView i;

    public v1y(FrameLayout frameLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, GoLinearLayout goLinearLayout, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.a = frameLayout;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = appCompatImageView3;
        this.e = goLinearLayout;
        this.f = constraintLayout;
        this.g = lottieAnimationView;
        this.h = appCompatTextView;
        this.i = appCompatTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
