package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class wtn0 implements zo31 {
    public final GoLinearLayout a;
    public final ListItemComponent b;
    public final ListItemComponent c;
    public final ButtonComponent d;
    public final ButtonComponent e;
    public final ListItemComponent f;
    public final RobotoTextView g;

    public wtn0(GoLinearLayout goLinearLayout, ListItemComponent listItemComponent, ListItemComponent listItemComponent2, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, ListItemComponent listItemComponent3, RobotoTextView robotoTextView) {
        this.a = goLinearLayout;
        this.b = listItemComponent;
        this.c = listItemComponent2;
        this.d = buttonComponent;
        this.e = buttonComponent2;
        this.f = listItemComponent3;
        this.g = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
