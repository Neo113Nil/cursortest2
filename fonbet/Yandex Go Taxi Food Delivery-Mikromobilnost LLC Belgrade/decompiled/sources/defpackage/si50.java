package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.design.SegmentedComponent;

/* loaded from: classes5.dex */
public final class si50 implements zo31 {
    public final LinearLayout a;
    public final ListItemComponent b;
    public final SegmentedComponent c;
    public final ListItemComponent d;
    public final ButtonComponent e;
    public final ListTitleComponent f;
    public final LinearLayout g;
    public final LinearLayout h;
    public final ListItemComponent i;
    public final ListTitleComponent j;

    public si50(LinearLayout linearLayout, ListItemComponent listItemComponent, SegmentedComponent segmentedComponent, ListItemComponent listItemComponent2, ButtonComponent buttonComponent, ListTitleComponent listTitleComponent, LinearLayout linearLayout2, LinearLayout linearLayout3, ListItemComponent listItemComponent3, ListTitleComponent listTitleComponent2) {
        this.a = linearLayout;
        this.b = listItemComponent;
        this.c = segmentedComponent;
        this.d = listItemComponent2;
        this.e = buttonComponent;
        this.f = listTitleComponent;
        this.g = linearLayout2;
        this.h = linearLayout3;
        this.i = listItemComponent3;
        this.j = listTitleComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
