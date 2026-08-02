package defpackage;

import com.yandex.mapkit.transport.masstransit.Vehicle;
import com.yandex.mapkit.transport.masstransit.VehicleSession;
import com.yandex.runtime.Error;
import java.io.IOException;
import ru.yandex.taxi.masstransit.datasource.vehicle.MtVehicleRepository$mapKitRequest$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.masstransit.datasource.vehicle.MtVehicleRepository$mapKitRequest$$inlined$suspendCallbackApi$3;

/* loaded from: classes6.dex */
public final class qj40 implements VehicleSession.VehicleListener {
    public final /* synthetic */ MtVehicleRepository$mapKitRequest$$inlined$suspendCallbackApi$2 a;
    public final /* synthetic */ MtVehicleRepository$mapKitRequest$$inlined$suspendCallbackApi$3 b;

    public qj40(MtVehicleRepository$mapKitRequest$$inlined$suspendCallbackApi$2 mtVehicleRepository$mapKitRequest$$inlined$suspendCallbackApi$2, MtVehicleRepository$mapKitRequest$$inlined$suspendCallbackApi$3 mtVehicleRepository$mapKitRequest$$inlined$suspendCallbackApi$3) {
        this.a = mtVehicleRepository$mapKitRequest$$inlined$suspendCallbackApi$2;
        this.b = mtVehicleRepository$mapKitRequest$$inlined$suspendCallbackApi$3;
    }

    @Override // com.yandex.mapkit.transport.masstransit.VehicleSession.VehicleListener
    public final void onVehicleError(Error error) {
        this.b.invoke(new IOException("Error " + error + " in masstransit vehicle request"));
    }

    @Override // com.yandex.mapkit.transport.masstransit.VehicleSession.VehicleListener
    public final void onVehicleResponse(Vehicle vehicle) {
        this.a.invoke(vehicle);
    }
}
