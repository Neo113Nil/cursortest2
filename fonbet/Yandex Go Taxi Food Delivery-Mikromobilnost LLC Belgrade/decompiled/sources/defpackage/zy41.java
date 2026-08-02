package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class zy41 implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final ListItemComponent c;
    public final ButtonComponent d;

    public zy41(LinearLayout linearLayout, ButtonComponent buttonComponent, ListItemComponent listItemComponent, ButtonComponent buttonComponent2) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = listItemComponent;
        this.d = buttonComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
