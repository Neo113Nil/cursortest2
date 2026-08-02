package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes5.dex */
public final class ww0 implements zo31 {
    public final AddressInputView a;
    public final ShimmeringRobotoTextView b;
    public final KeyboardAwareRobotoEditText c;
    public final ButtonComponent d;
    public final ButtonComponent e;
    public final ConstraintLayout f;
    public final RobotoTextView g;
    public final ImageView h;
    public final View i;
    public final ImageView j;
    public final ConstraintLayout k;
    public final ShimmeringRobotoTextView l;

    public ww0(AddressInputView addressInputView, ShimmeringRobotoTextView shimmeringRobotoTextView, KeyboardAwareRobotoEditText keyboardAwareRobotoEditText, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, ConstraintLayout constraintLayout, RobotoTextView robotoTextView, ImageView imageView, View view, ImageView imageView2, ConstraintLayout constraintLayout2, ShimmeringRobotoTextView shimmeringRobotoTextView2) {
        this.a = addressInputView;
        this.b = shimmeringRobotoTextView;
        this.c = keyboardAwareRobotoEditText;
        this.d = buttonComponent;
        this.e = buttonComponent2;
        this.f = constraintLayout;
        this.g = robotoTextView;
        this.h = imageView;
        this.i = view;
        this.j = imageView2;
        this.k = constraintLayout2;
        this.l = shimmeringRobotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
