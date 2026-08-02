package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class qon0 implements zo31 {
    public final GoConstraintLayout a;
    public final ButtonComponent b;
    public final ButtonComponent c;
    public final ButtonComponent d;
    public final RobotoTextView e;
    public final RobotoTextView f;

    public qon0(GoConstraintLayout goConstraintLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, ButtonComponent buttonComponent3, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = goConstraintLayout;
        this.b = buttonComponent;
        this.c = buttonComponent2;
        this.d = buttonComponent3;
        this.e = robotoTextView;
        this.f = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
