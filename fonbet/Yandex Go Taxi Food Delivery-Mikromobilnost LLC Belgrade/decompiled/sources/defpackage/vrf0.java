package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes13.dex */
public final class vrf0 implements zo31 {
    public final ConstraintLayout a;
    public final ButtonComponent b;

    public vrf0(ConstraintLayout constraintLayout, ButtonComponent buttonComponent) {
        this.a = constraintLayout;
        this.b = buttonComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
