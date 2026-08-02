package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class zdi implements zo31 {
    public final LinearLayout a;
    public final RobotoTextView b;
    public final ListItemComponent c;
    public final RobotoTextView d;

    public zdi(LinearLayout linearLayout, RobotoTextView robotoTextView, ListItemComponent listItemComponent, RobotoTextView robotoTextView2) {
        this.a = linearLayout;
        this.b = robotoTextView;
        this.c = listItemComponent;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
