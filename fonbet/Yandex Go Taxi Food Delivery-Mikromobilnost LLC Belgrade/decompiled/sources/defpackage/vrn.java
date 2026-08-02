package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class vrn implements zo31 {
    public final FrameLayout a;
    public final FrameLayout b;
    public final RobotoTextView c;
    public final AnimatedListItemInputComponent d;
    public final ButtonComponent e;
    public final FloatingTitleToolbarComponent f;

    public vrn(FrameLayout frameLayout, FrameLayout frameLayout2, RobotoTextView robotoTextView, AnimatedListItemInputComponent animatedListItemInputComponent, ButtonComponent buttonComponent, FloatingTitleToolbarComponent floatingTitleToolbarComponent) {
        this.a = frameLayout;
        this.b = frameLayout2;
        this.c = robotoTextView;
        this.d = animatedListItemInputComponent;
        this.e = buttonComponent;
        this.f = floatingTitleToolbarComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
