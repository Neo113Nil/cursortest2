package defpackage;

import android.view.View;
import android.widget.Space;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.alt_select.traffic.TrafficJamView;
import com.yandex.go.navigator.map_interactions.parkings.CarParsToggle;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;

/* loaded from: classes12.dex */
public final class q57 implements zo31 {
    public final GoLinearLayout a;
    public final CarParsToggle b;
    public final FloatButtonHolderLayout c;
    public final Space d;
    public final TrafficJamView e;

    public q57(GoLinearLayout goLinearLayout, CarParsToggle carParsToggle, FloatButtonHolderLayout floatButtonHolderLayout, Space space, TrafficJamView trafficJamView) {
        this.a = goLinearLayout;
        this.b = carParsToggle;
        this.c = floatButtonHolderLayout;
        this.d = space;
        this.e = trafficJamView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
