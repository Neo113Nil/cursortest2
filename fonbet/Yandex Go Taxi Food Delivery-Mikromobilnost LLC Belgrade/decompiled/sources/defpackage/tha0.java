package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class tha0 implements zo31 {
    public final LinearLayout a;
    public final AppCompatImageView b;
    public final RobotoTextView c;
    public final AppCompatImageView d;
    public final ButtonComponent e;
    public final RobotoTextView f;

    public tha0(LinearLayout linearLayout, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView, AppCompatImageView appCompatImageView2, ButtonComponent buttonComponent, RobotoTextView robotoTextView2) {
        this.a = linearLayout;
        this.b = appCompatImageView;
        this.c = robotoTextView;
        this.d = appCompatImageView2;
        this.e = buttonComponent;
        this.f = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
