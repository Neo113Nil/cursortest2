package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.PerformerDto;

/* loaded from: classes.dex */
public final class xwa0 {
    public static vwa0 a(PerformerDto performerDto) {
        return new vwa0(performerDto.getName(), performerDto.getShortName(), performerDto.getVehicleModel(), performerDto.getVehicleNumber(), performerDto.getRating(), performerDto.getPhotoUrl(), performerDto.getImageTagDefault(), performerDto.getPhone());
    }
}
