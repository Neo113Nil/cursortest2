package ru.yandex.taxi.hiredriver;

import defpackage.cmt;
import defpackage.gjg0;
import defpackage.opq0;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JE\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/hiredriver/HireDriverApi;", "", "", "idempotenceKey", "Lopq0;", "sendRequest", "", "queryParams", "Lcmt;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "a", "(Ljava/lang/String;Lopq0;Ljava/util/Map;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface HireDriverApi {
    @s490("hiring/v2/hire-driver")
    cmt<zy11> a(@z8u("X-Delivery-Id") String idempotenceKey, @q76 opq0 sendRequest, @gjg0 Map<String, String> queryParams);
}
