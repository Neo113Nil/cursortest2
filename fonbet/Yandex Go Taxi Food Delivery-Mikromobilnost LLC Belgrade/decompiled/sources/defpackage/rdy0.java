package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class rdy0 implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final ButtonComponent c;
    public final RobotoTextView d;
    public final FrameLayout e;
    public final RobotoTextView f;

    public rdy0(LinearLayout linearLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, RobotoTextView robotoTextView, FrameLayout frameLayout, RobotoTextView robotoTextView2) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = buttonComponent2;
        this.d = robotoTextView;
        this.e = frameLayout;
        this.f = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
