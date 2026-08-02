package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.driving.DrivingTimeTextView;
import com.yandex.go.navigator.driving.ProgressView;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes12.dex */
public final class tkm implements zo31 {
    public final GoConstraintLayout a;
    public final GoImageButton b;
    public final DrivingTimeTextView c;
    public final GoFrameLayout d;
    public final RobotoTextView e;
    public final GoImageButton f;
    public final ButtonComponent g;
    public final GoLinearLayout h;
    public final DrivingTimeTextView i;
    public final ProgressView j;
    public final GoLinearLayout k;
    public final NestedScrollViewAdvanced l;
    public final GoFrameLayout m;
    public final GoFrameLayout n;
    public final AutoDividerComponentList o;

    public tkm(GoConstraintLayout goConstraintLayout, GoImageButton goImageButton, DrivingTimeTextView drivingTimeTextView, GoFrameLayout goFrameLayout, RobotoTextView robotoTextView, GoImageButton goImageButton2, ButtonComponent buttonComponent, GoLinearLayout goLinearLayout, DrivingTimeTextView drivingTimeTextView2, ProgressView progressView, GoLinearLayout goLinearLayout2, NestedScrollViewAdvanced nestedScrollViewAdvanced, GoFrameLayout goFrameLayout2, GoFrameLayout goFrameLayout3, AutoDividerComponentList autoDividerComponentList) {
        this.a = goConstraintLayout;
        this.b = goImageButton;
        this.c = drivingTimeTextView;
        this.d = goFrameLayout;
        this.e = robotoTextView;
        this.f = goImageButton2;
        this.g = buttonComponent;
        this.h = goLinearLayout;
        this.i = drivingTimeTextView2;
        this.j = progressView;
        this.k = goLinearLayout2;
        this.l = nestedScrollViewAdvanced;
        this.m = goFrameLayout2;
        this.n = goFrameLayout3;
        this.o = autoDividerComponentList;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
