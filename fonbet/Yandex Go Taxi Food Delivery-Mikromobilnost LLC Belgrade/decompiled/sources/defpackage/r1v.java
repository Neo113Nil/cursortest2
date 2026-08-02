package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubRideTimeParam;
import com.yandex.go.zone.dto.objects.ServiceLevel;

/* loaded from: classes14.dex */
public final class r1v {
    public static HubRideTimeParam a(ServiceLevel.RideTime rideTime) {
        String str = rideTime.a;
        Integer num = rideTime.b;
        if (str == null || str.length() == 0 || num == null || num.intValue() <= 0) {
            return null;
        }
        int intValue = num.intValue();
        String str2 = rideTime.a;
        if (str2 == null) {
            str2 = "";
        }
        return new HubRideTimeParam(intValue, str2);
    }
}
