package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ToolbarComponent;

/* loaded from: classes12.dex */
public final class w7h implements zo31 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final ToolbarComponent c;

    public w7h(LinearLayout linearLayout, LinearLayout linearLayout2, ToolbarComponent toolbarComponent) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = toolbarComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
