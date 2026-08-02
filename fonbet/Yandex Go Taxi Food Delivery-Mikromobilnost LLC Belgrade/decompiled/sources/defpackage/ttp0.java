package defpackage;

import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchDataItemDto$EddystoneSearchDataDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchDataItemDto$IBeaconSearchDataDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchDataItemDto$UrlSearchDataDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.y;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class ttp0 extends xqt {
    public static final ttp0 e = new ttp0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, y.INSTANCE.serializer(), qoi0.a(y.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("url", SearchDataItemDto$UrlSearchDataDto.Companion.serializer(), qoi0.a(SearchDataItemDto$UrlSearchDataDto.class)), new f9("ble_ibeacon", SearchDataItemDto$IBeaconSearchDataDto.Companion.serializer(), qoi0.a(SearchDataItemDto$IBeaconSearchDataDto.class)), new f9("ble_eddystone_uid", SearchDataItemDto$EddystoneSearchDataDto.Companion.serializer(), qoi0.a(SearchDataItemDto$EddystoneSearchDataDto.class)));
    }
}
