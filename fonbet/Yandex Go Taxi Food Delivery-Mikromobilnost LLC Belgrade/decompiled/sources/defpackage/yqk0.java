package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class yqk0 implements zo31 {
    public final LinearLayout a;
    public final RobotoTextView b;
    public final ButtonComponent c;
    public final ButtonComponent d;
    public final RobotoTextView e;

    public yqk0(LinearLayout linearLayout, RobotoTextView robotoTextView, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, RobotoTextView robotoTextView2) {
        this.a = linearLayout;
        this.b = robotoTextView;
        this.c = buttonComponent;
        this.d = buttonComponent2;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
