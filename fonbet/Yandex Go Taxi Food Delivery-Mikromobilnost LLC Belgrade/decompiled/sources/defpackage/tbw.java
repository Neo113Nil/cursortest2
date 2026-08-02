package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.FlowLayout;

/* loaded from: classes14.dex */
public final class tbw implements zo31 {
    public final LinearLayout a;
    public final FlowLayout b;
    public final ButtonComponent c;
    public final ListHeaderComponent d;

    public tbw(LinearLayout linearLayout, FlowLayout flowLayout, ButtonComponent buttonComponent, ListHeaderComponent listHeaderComponent) {
        this.a = linearLayout;
        this.b = flowLayout;
        this.c = buttonComponent;
        this.d = listHeaderComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
