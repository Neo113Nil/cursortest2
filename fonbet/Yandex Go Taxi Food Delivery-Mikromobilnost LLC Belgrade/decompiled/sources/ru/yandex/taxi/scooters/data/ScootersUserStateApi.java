package ru.yandex.taxi.scooters.data;

import defpackage.cmt;
import defpackage.uau;
import defpackage.w6p0;
import defpackage.wqs;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/scooters/data/ScootersUserStateApi;", "", "", "", "headers", "Lcmt;", "Lw6p0;", "a", "(Ljava/util/Map;)Lcmt;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ScootersUserStateApi {
    @wqs("scooters/v1/user/state")
    cmt<w6p0> a(@uau Map<String, String> headers);
}
