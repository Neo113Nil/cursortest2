package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public final class yau0 implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;

    public yau0(LinearLayout linearLayout, ButtonComponent buttonComponent) {
        this.a = linearLayout;
        this.b = buttonComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
