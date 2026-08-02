package ru.yandex.taxi.client.api;

import defpackage.a1o;
import defpackage.bsn;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.ewx;
import defpackage.jsn;
import defpackage.m6x0;
import defpackage.owx;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J{\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u0010\u0010\u0011J\u008f\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/client/api/LaunchApi;", "", "Lewx;", "p", "", "proxyBlockId", "uuid", "metricaDeviceId", "localization", "advGaid", "advOaid", "location", "La1o;", "tag", "Lcmt;", "Lowx;", "c", "(Lewx;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La1o;)Lcmt;", "authorization", "oauthToken", "xAdvGaid", "xAdvOaid", "xLocation", "b", "(Ljava/lang/String;Ljava/lang/String;Lewx;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La1o;)Lcmt;", "Lbsn;", "Ljsn;", "a", "(Lbsn;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface LaunchApi {
    @s490("email")
    cmt<jsn> a(@q76 bsn p);

    @s490("launch")
    cmt<owx> b(@z8u("Authorization") String authorization, @z8u("X-Oauth-Token") String oauthToken, @q76 ewx p, @djg0("block_id") String proxyBlockId, @djg0(encoded = true, value = "uuid") String uuid, @djg0(encoded = true, value = "metrica_device_id") String metricaDeviceId, @z8u("Localization") String localization, @z8u("x-adv-gaid") String xAdvGaid, @z8u("x-adv-oaid") String xAdvOaid, @z8u("x-location") String xLocation, @m6x0 a1o tag);

    @s490("launch")
    cmt<owx> c(@q76 ewx p, @djg0("block_id") String proxyBlockId, @djg0(encoded = true, value = "uuid") String uuid, @djg0(encoded = true, value = "metrica_device_id") String metricaDeviceId, @z8u("Localization") String localization, @z8u("x-adv-gaid") String advGaid, @z8u("x-adv-oaid") String advOaid, @z8u("x-location") String location, @m6x0 a1o tag);
}
