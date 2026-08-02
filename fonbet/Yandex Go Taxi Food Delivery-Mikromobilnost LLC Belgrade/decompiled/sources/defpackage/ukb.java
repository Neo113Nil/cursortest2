package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class ukb implements zo31 {
    public final GoLinearLayout a;
    public final GoLinearLayout b;
    public final ButtonsView c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public ukb(GoLinearLayout goLinearLayout, GoLinearLayout goLinearLayout2, ButtonsView buttonsView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goLinearLayout;
        this.b = goLinearLayout2;
        this.c = buttonsView;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
