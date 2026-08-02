package defpackage;

import com.yandex.go.explorer.impl.ui.map.c;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.transport.masstransit.VehicleData;
import java.util.Map;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.overlay.e;

/* loaded from: classes12.dex */
public final class xth implements hr7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xth(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hr7
    public final void h(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    r0 r0Var = ((yth) obj).b.a;
                    Boolean bool = Boolean.FALSE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    break;
                }
                break;
            case 1:
                if (cameraUpdateReason == CameraUpdateReason.GESTURES) {
                    c cVar = (c) obj;
                    if (cVar.H) {
                        cVar.H = false;
                        ((gh00) ((ah00) cVar.b)).u(cVar.I);
                        pzt0 pzt0Var = cVar.F;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        cVar.F = null;
                        cVar.Ig();
                        break;
                    }
                }
                break;
            default:
                e eVar = (e) obj;
                if (z && Math.abs(cameraPosition.getZoom() - eVar.m) > 0.1d) {
                    for (Map.Entry entry : eVar.n.entrySet()) {
                        e.a(eVar, (PlacemarkMapObject) entry.getKey(), (VehicleData) entry.getValue());
                    }
                    eVar.m = cameraPosition.getZoom();
                    break;
                }
                break;
        }
    }
}
