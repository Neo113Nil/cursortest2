package defpackage;

import com.yandex.mapkit.navigation.automotive.WindshieldListener;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes7.dex */
public final class qmj implements WindshieldListener {
    public final /* synthetic */ rmj a;

    public qmj(rmj rmjVar) {
        this.a = rmjVar;
    }

    @Override // com.yandex.mapkit.navigation.automotive.WindshieldListener
    public final void onDirectionSignChanged() {
    }

    @Override // com.yandex.mapkit.navigation.automotive.WindshieldListener
    public final void onLaneSignChanged() {
        yeo yeoVar;
        rmj rmjVar = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onLaneSignChanged"));
            if ((e instanceof zy11) || (yeoVar = rmjVar.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = rmjVar.b;
            if (yeoVar2 != null) {
                yeoVar2.error(rmj.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }

    @Override // com.yandex.mapkit.navigation.automotive.WindshieldListener
    public final void onManoeuvresChanged() {
        rmj rmjVar = this.a;
        rmjVar.c(new amh(23, rmjVar));
    }

    @Override // com.yandex.mapkit.navigation.automotive.WindshieldListener
    public final void onNearestLanesChanged() {
    }

    @Override // com.yandex.mapkit.navigation.automotive.WindshieldListener
    public final void onRoadEventsChanged() {
        yeo yeoVar;
        rmj rmjVar = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onRoadEventsChanged"));
            if ((e instanceof zy11) || (yeoVar = rmjVar.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = rmjVar.b;
            if (yeoVar2 != null) {
                yeoVar2.error(rmj.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }

    @Override // com.yandex.mapkit.navigation.automotive.WindshieldListener
    public final void onTrafficLightsChanged() {
    }

    @Override // com.yandex.mapkit.navigation.automotive.WindshieldListener
    public final void onTrafficLightsCountdownUpdated() {
    }
}
