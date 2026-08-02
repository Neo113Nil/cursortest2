package defpackage;

import android.view.View;
import com.yandex.go.scooters.offers.v2.surge.widget.ScootersSurgeWidgetView;
import ru.yandex.taxi.widget.BalanceWidget;

/* loaded from: classes13.dex */
public final class z3p0 implements zo31 {
    public final ScootersSurgeWidgetView a;
    public final BalanceWidget b;

    public z3p0(ScootersSurgeWidgetView scootersSurgeWidgetView, BalanceWidget balanceWidget) {
        this.a = scootersSurgeWidgetView;
        this.b = balanceWidget;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
