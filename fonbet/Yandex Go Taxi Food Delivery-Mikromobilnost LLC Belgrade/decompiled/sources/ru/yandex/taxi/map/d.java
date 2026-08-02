package ru.yandex.taxi.map;

import com.yandex.mapkit.transport.masstransit.Route;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public abstract class d {
    public static final WalkingRouteUiState a(Route route) {
        return new WalkingRouteUiState(route.getGeometry().getPoints(), route.getMetadata().getWeight().getTime().getText(), 0.0f, null, null, null, null, HProv.PP_SAME_MEDIA);
    }
}
