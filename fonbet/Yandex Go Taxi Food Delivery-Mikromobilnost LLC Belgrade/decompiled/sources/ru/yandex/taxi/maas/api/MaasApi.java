package ru.yandex.taxi.maas.api;

import defpackage.cmt;
import defpackage.djg0;
import defpackage.i000;
import defpackage.s490;
import defpackage.uk50;
import defpackage.wqs;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/maas/api/MaasApi;", "", "Lcmt;", "Li000;", "b", "()Lcmt;", "", "lat", "lon", "Luk50;", "a", "(DD)Lcmt;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface MaasApi {
    @wqs("maas/v1/nearest-metro")
    cmt<uk50> a(@djg0("lat") double lat, @djg0("lon") double lon);

    @s490("maas/v1/subscription/info/short")
    cmt<i000> b();
}
