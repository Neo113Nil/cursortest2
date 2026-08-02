package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1clientgeo.Responses$ClientGeoResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.launch.DeliveryLaunchResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask.V2FormAsyncTaskResponseDto;

/* loaded from: classes9.dex */
public final /* synthetic */ class xci implements kwj0 {
    public final /* synthetic */ int a;

    @Override // defpackage.kwj0
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                return ((DeliveryLaunchResponseDto) obj).getTypedConfigs();
            case 1:
                return ((V2FormAsyncTaskResponseDto) obj).getTaskParams();
            default:
                return Boolean.valueOf(((Responses$ClientGeoResponseDto) obj).getShouldTrackGeo());
        }
    }
}
