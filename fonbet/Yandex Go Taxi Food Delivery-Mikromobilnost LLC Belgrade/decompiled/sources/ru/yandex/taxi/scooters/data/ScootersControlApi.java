package ru.yandex.taxi.scooters.data;

import defpackage.cmt;
import defpackage.kme;
import defpackage.nme;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/scooters/data/ScootersControlApi;", "", "", "", "headers", "Lkme;", "controlParams", "Lcmt;", "Lnme;", "a", "(Ljava/util/Map;Lkme;)Lcmt;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ScootersControlApi {
    @s490("scooters/api/yandex/car/control")
    cmt<nme> a(@uau Map<String, String> headers, @q76 kme controlParams);
}
