package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class vdn0 implements zo31 {
    public final LinearLayout a;
    public final RobotoTextView b;
    public final ListItemComponent c;
    public final RobotoTextView d;

    public vdn0(LinearLayout linearLayout, RobotoTextView robotoTextView, ListItemComponent listItemComponent, RobotoTextView robotoTextView2) {
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
