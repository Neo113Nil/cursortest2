package defpackage;

import android.view.View;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardButtonsContainerView;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes14.dex */
public final class yaw implements zo31 {
    public final IntercityDashboardButtonsContainerView a;
    public final ButtonComponent b;
    public final ButtonComponent c;

    public yaw(IntercityDashboardButtonsContainerView intercityDashboardButtonsContainerView, ButtonComponent buttonComponent, ButtonComponent buttonComponent2) {
        this.a = intercityDashboardButtonsContainerView;
        this.b = buttonComponent;
        this.c = buttonComponent2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
