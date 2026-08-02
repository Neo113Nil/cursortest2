package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class u2y implements zo31 {
    public final GoConstraintLayout a;
    public final ButtonComponent b;

    public u2y(GoConstraintLayout goConstraintLayout, GoImageView goImageView, ButtonComponent buttonComponent, GoImageView goImageView2, RobotoTextView robotoTextView, ButtonComponent buttonComponent2, RobotoTextView robotoTextView2) {
        this.a = goConstraintLayout;
        this.b = buttonComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
