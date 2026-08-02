package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.order.cancel.v2.ui.CircleBadgeIcon;
import com.yandex.go.tips.ui.TipsView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class shz0 implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final ButtonComponent c;
    public final RobotoTextView d;
    public final ListHeaderComponent e;
    public final CircleBadgeIcon f;
    public final TipsView g;

    public shz0(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, RobotoTextView robotoTextView, ListHeaderComponent listHeaderComponent, CircleBadgeIcon circleBadgeIcon, TipsView tipsView) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = buttonComponent2;
        this.d = robotoTextView;
        this.e = listHeaderComponent;
        this.f = circleBadgeIcon;
        this.g = tipsView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
