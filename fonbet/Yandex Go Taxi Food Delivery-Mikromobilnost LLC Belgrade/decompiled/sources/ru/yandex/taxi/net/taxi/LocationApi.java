package ru.yandex.taxi.net.taxi;

import defpackage.cmt;
import defpackage.djg0;
import defpackage.e8y;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import ru.yandex.taxi.location.dto.LbsResponse;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/net/taxi/LocationApi;", "", "", "uuid", "deviceId", "Le8y;", "p", "Lcmt;", "Lru/yandex/taxi/location/dto/LbsResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Le8y;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface LocationApi {
    @s490("lbs")
    cmt<LbsResponse> a(@djg0("uuid") String uuid, @djg0("device_id") String deviceId, @q76 e8y p);
}
