package ru.yandex.taxi.widgets.data.api;

import defpackage.c551;
import defpackage.cmt;
import defpackage.koh;
import defpackage.o801;
import defpackage.p551;
import defpackage.q76;
import defpackage.s490;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u0007J+\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b0\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/widgets/data/api/WidgetsApi;", "", "Lc551;", "configDto", "Lcmt;", "Lp551;", "c", "(Lc551;)Lcmt;", "", "Lo801;", "a", "Lkoh;", "request", "b", "(Lkoh;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface WidgetsApi {
    @s490("go-orders-info-gateway/v1/trackings/aggregate")
    cmt<Map<o801, p551>> a(@q76 c551 configDto);

    @s490("go-orders-info-gateway/v1/trackings/defer")
    cmt<Map<o801, p551>> b(@q76 koh request);

    @s490("mlutp/v1/inapp-widgets")
    cmt<p551> c(@q76 c551 configDto);
}
