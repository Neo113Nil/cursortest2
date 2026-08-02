package ru.yandex.taxi.scooters.data;

import defpackage.cmt;
import defpackage.eko0;
import defpackage.i4n0;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J9\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\r\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\fH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/scooters/data/ScootersSlowdownApi;", "", "", "", "headers", "Leko0;", "params", "Lcmt;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "b", "(Ljava/util/Map;Leko0;)Lcmt;", "Li4n0;", "a", "(Ljava/util/Map;Li4n0;)Lcmt;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ScootersSlowdownApi {
    @s490("scooters/v1/vehicle/cancel-slowdown")
    cmt<zy11> a(@uau Map<String, String> headers, @q76 i4n0 params);

    @s490("scooters/v1/vehicle/plan-slowdown")
    cmt<zy11> b(@uau Map<String, String> headers, @q76 eko0 params);
}
