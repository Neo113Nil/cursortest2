package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class voi implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final FrameLayout c;
    public final LinearLayout d;
    public final ButtonComponent e;
    public final RobotoTextView f;
    public final ListItemComponent g;

    public voi(LinearLayout linearLayout, ButtonComponent buttonComponent, FrameLayout frameLayout, LinearLayout linearLayout2, ButtonComponent buttonComponent2, RobotoTextView robotoTextView, ListItemComponent listItemComponent) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = frameLayout;
        this.d = linearLayout2;
        this.e = buttonComponent2;
        this.f = robotoTextView;
        this.g = listItemComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
