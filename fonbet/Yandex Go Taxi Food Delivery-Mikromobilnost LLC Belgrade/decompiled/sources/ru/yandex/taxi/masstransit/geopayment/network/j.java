package ru.yandex.taxi.masstransit.geopayment.network;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.geopayment.network.MtVehiclesResponse;

/* loaded from: classes6.dex */
public final class j {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MtVehiclesResponse.BLEItem.TransportType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
