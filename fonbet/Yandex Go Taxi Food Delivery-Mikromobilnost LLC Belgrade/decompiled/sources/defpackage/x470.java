package defpackage;

import com.yandex.go.places.models.data.entities.network.DeliveryPointTypeDto;
import com.yandex.go.places.models.domain.entities.DeliveryRoutePointType;

/* loaded from: classes13.dex */
public final class x470 {
    public static agi a(String str, DeliveryPointTypeDto deliveryPointTypeDto, double[] dArr, Integer num) {
        DeliveryRoutePointType deliveryRoutePointType;
        int i = w470.a[deliveryPointTypeDto.ordinal()];
        if (i == 1) {
            deliveryRoutePointType = DeliveryRoutePointType.SOURCE;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            deliveryRoutePointType = DeliveryRoutePointType.DESTINATION;
        }
        return new agi(deliveryRoutePointType, str, new coe(dArr[1], dArr[0]), num);
    }
}
