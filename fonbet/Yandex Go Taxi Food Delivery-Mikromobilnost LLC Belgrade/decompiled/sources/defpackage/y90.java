package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ToolbarComponent;

/* loaded from: classes13.dex */
public final class y90 implements zo31 {
    public final LinearLayout a;
    public final ToolbarComponent b;

    public y90(LinearLayout linearLayout, ToolbarComponent toolbarComponent) {
        this.a = linearLayout;
        this.b = toolbarComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
