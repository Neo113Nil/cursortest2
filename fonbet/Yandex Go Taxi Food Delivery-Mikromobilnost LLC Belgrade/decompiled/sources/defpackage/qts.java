package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.gas_stations.overview.GasStationCardView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes12.dex */
public final class qts implements zo31 {
    public final GasStationCardView a;
    public final GoLinearLayout b;
    public final qzm c;
    public final GoLinearLayout d;
    public final ShimmeringBar e;
    public final GoLinearLayout f;
    public final ShimmeringBar g;

    public qts(GasStationCardView gasStationCardView, GoLinearLayout goLinearLayout, qzm qzmVar, GoLinearLayout goLinearLayout2, ShimmeringBar shimmeringBar, GoLinearLayout goLinearLayout3, ShimmeringBar shimmeringBar2) {
        this.a = gasStationCardView;
        this.b = goLinearLayout;
        this.c = qzmVar;
        this.d = goLinearLayout2;
        this.e = shimmeringBar;
        this.f = goLinearLayout3;
        this.g = shimmeringBar2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
