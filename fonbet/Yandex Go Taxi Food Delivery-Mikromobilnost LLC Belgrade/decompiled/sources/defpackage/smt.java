package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes12.dex */
public final class smt implements zo31 {
    public final LinearLayout a;
    public final ButtonComponent b;
    public final ButtonComponent c;
    public final ButtonComponent d;

    public smt(LinearLayout linearLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, ButtonComponent buttonComponent3) {
        this.a = linearLayout;
        this.b = buttonComponent;
        this.c = buttonComponent2;
        this.d = buttonComponent3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
