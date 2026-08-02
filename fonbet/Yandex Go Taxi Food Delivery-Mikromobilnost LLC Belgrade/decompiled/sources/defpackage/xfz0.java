package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;

/* loaded from: classes14.dex */
public final class xfz0 implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final ButtonComponent c;
    public final ListItemInputComponent d;

    public xfz0(LinearLayout linearLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, ListItemInputComponent listItemInputComponent) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = buttonComponent2;
        this.d = listItemInputComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
