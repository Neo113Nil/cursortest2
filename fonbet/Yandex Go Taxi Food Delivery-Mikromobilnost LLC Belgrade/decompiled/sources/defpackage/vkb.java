package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes6.dex */
public final class vkb implements zo31 {
    public final GoLinearLayout a;
    public final GoFrameLayout b;
    public final CompositePaymentIconsView c;
    public final GoLinearLayout d;
    public final AppCompatImageView e;
    public final ButtonComponent f;

    public vkb(GoLinearLayout goLinearLayout, GoFrameLayout goFrameLayout, CompositePaymentIconsView compositePaymentIconsView, GoLinearLayout goLinearLayout2, AppCompatImageView appCompatImageView, ButtonComponent buttonComponent) {
        this.a = goLinearLayout;
        this.b = goFrameLayout;
        this.c = compositePaymentIconsView;
        this.d = goLinearLayout2;
        this.e = appCompatImageView;
        this.f = buttonComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
