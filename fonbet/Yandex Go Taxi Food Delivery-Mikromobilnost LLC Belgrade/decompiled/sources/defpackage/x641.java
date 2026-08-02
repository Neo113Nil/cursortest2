package defpackage;

import android.view.View;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.order.view.walking_info.WalkingInfoView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class x641 implements zo31 {
    public final WalkingInfoView a;
    public final ButtonComponent b;
    public final RobotoTextView c;
    public final RobotoTextView d;

    public x641(WalkingInfoView walkingInfoView, ButtonComponent buttonComponent, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = walkingInfoView;
        this.b = buttonComponent;
        this.c = robotoTextView;
        this.d = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
