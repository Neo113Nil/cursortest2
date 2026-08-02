package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes12.dex */
public final class xkr implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final ListTitleComponent c;
    public final ListItemComponent d;

    public xkr(LinearLayout linearLayout, ButtonComponent buttonComponent, ListTitleComponent listTitleComponent, ListItemComponent listItemComponent) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = listTitleComponent;
        this.d = listItemComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
