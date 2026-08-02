package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ListItemInputComponent;

/* loaded from: classes6.dex */
public final class sej0 implements zo31 {
    public final LinearLayout a;
    public final ListItemInputComponent b;

    public sej0(LinearLayout linearLayout, ListItemInputComponent listItemInputComponent) {
        this.a = linearLayout;
        this.b = listItemInputComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
