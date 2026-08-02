package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class t7n0 implements zo31 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final ButtonComponent c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public t7n0(AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, ButtonComponent buttonComponent, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = buttonComponent;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
