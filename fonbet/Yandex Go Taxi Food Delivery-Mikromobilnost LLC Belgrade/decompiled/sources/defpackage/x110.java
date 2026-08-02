package defpackage;

import com.yandex.mapkit.transport.masstransit.Vehicle;
import com.yandex.mapkit.transport.masstransit.VehicleSession;
import com.yandex.runtime.Error;
import ru.yandex.taxi.masstransit.datasource.source.MassTransitVehiclesDataSource$makeRequest$2$invokeSuspend$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.masstransit.datasource.source.MassTransitVehiclesDataSource$makeRequest$2$invokeSuspend$$inlined$suspendCallbackApi$3;

/* loaded from: classes6.dex */
public final class x110 implements VehicleSession.VehicleListener {
    public final /* synthetic */ MassTransitVehiclesDataSource$makeRequest$2$invokeSuspend$$inlined$suspendCallbackApi$2 a;
    public final /* synthetic */ MassTransitVehiclesDataSource$makeRequest$2$invokeSuspend$$inlined$suspendCallbackApi$3 b;

    public x110(MassTransitVehiclesDataSource$makeRequest$2$invokeSuspend$$inlined$suspendCallbackApi$2 massTransitVehiclesDataSource$makeRequest$2$invokeSuspend$$inlined$suspendCallbackApi$2, MassTransitVehiclesDataSource$makeRequest$2$invokeSuspend$$inlined$suspendCallbackApi$3 massTransitVehiclesDataSource$makeRequest$2$invokeSuspend$$inlined$suspendCallbackApi$3) {
        this.a = massTransitVehiclesDataSource$makeRequest$2$invokeSuspend$$inlined$suspendCallbackApi$2;
        this.b = massTransitVehiclesDataSource$makeRequest$2$invokeSuspend$$inlined$suspendCallbackApi$3;
    }

    @Override // com.yandex.mapkit.transport.masstransit.VehicleSession.VehicleListener
    public final void onVehicleError(Error error) {
        this.b.invoke(new Exception(error.toString()));
    }

    @Override // com.yandex.mapkit.transport.masstransit.VehicleSession.VehicleListener
    public final void onVehicleResponse(Vehicle vehicle) {
        this.a.invoke(vehicle);
    }
}
