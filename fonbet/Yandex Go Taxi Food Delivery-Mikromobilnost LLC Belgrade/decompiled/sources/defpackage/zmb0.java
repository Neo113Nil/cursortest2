package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.pickup_from_photo.ui.CameraTargetView;
import ru.yandex.taxi.camera.CameraPreview;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class zmb0 implements zo31 {
    public final ConstraintLayout a;
    public final GoImageButton b;
    public final ConstraintLayout c;
    public final CameraPreview d;
    public final GoImageButton e;
    public final FrameLayout f;
    public final RobotoTextView g;
    public final LottieAnimationView h;
    public final ListItemComponent i;
    public final eob0 j;
    public final GoImageButton k;
    public final AppCompatImageView l;
    public final CameraTargetView m;

    public zmb0(ConstraintLayout constraintLayout, GoImageButton goImageButton, ConstraintLayout constraintLayout2, CameraPreview cameraPreview, GoImageButton goImageButton2, FrameLayout frameLayout, RobotoTextView robotoTextView, LottieAnimationView lottieAnimationView, ListItemComponent listItemComponent, eob0 eob0Var, GoImageButton goImageButton3, AppCompatImageView appCompatImageView, CameraTargetView cameraTargetView) {
        this.a = constraintLayout;
        this.b = goImageButton;
        this.c = constraintLayout2;
        this.d = cameraPreview;
        this.e = goImageButton2;
        this.f = frameLayout;
        this.g = robotoTextView;
        this.h = lottieAnimationView;
        this.i = listItemComponent;
        this.j = eob0Var;
        this.k = goImageButton3;
        this.l = appCompatImageView;
        this.m = cameraTargetView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
