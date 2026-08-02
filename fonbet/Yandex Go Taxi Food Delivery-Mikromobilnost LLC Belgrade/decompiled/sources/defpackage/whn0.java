package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.scooters.discovery.ScootersDiscoveryActiveOrdersButton;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.scooters.utils.ScootersGeoButtonIconComponent;

/* loaded from: classes13.dex */
public final class whn0 implements zo31 {
    public final GoConstraintLayout a;
    public final ScootersDiscoveryActiveOrdersButton b;
    public final BackButtonIconComponent c;

    public whn0(GoConstraintLayout goConstraintLayout, ScootersDiscoveryActiveOrdersButton scootersDiscoveryActiveOrdersButton, BackButtonIconComponent backButtonIconComponent, ScootersGeoButtonIconComponent scootersGeoButtonIconComponent, GoFrameLayout goFrameLayout) {
        this.a = goConstraintLayout;
        this.b = scootersDiscoveryActiveOrdersButton;
        this.c = backButtonIconComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
