package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.SaveTime;
import com.yandex.mapkit.traffic.TrafficLayer;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes8.dex */
public final /* synthetic */ class wsg implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ wsg(ysg ysgVar, boolean z) {
        this.a = 0;
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r3 > defpackage.e3n.e(defpackage.kp50.U(1, kotlin.time.DurationUnit.HOURS))) goto L40;
     */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        SaveTime g;
        zy11 jamsVisible$lambda$0;
        int i = this.a;
        boolean z = true;
        boolean z2 = this.b;
        switch (i) {
            case 0:
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                if (taxiOrder.l.getA() && !taxiOrder.K()) {
                    if (taxiOrder.I()) {
                        if (!z2 && (g = taxiOrder.l.getG()) != null && g.b()) {
                            long a = g.a();
                            o430 o430Var = e3n.b;
                            break;
                        }
                    }
                    if (taxiOrder.h.getB() != DriveState.CANCELLED && taxiOrder.h.getB() != DriveState.EXPIRED && taxiOrder.h.getB() != DriveState.FAILED) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                Address address = (Address) obj;
                zzk0 zzk0Var = d0l0.Companion;
                if (z2 && address.Z()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                jamsVisible$lambda$0 = TaxiMapView.setJamsVisible$lambda$0(z2, (TrafficLayer) obj);
                return jamsVisible$lambda$0;
        }
    }

    public /* synthetic */ wsg(boolean z, int i) {
        this.a = i;
        this.b = z;
    }
}
