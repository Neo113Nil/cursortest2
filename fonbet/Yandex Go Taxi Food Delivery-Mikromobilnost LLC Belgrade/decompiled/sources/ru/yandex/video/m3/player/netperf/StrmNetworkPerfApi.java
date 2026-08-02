package ru.yandex.video.m3.player.netperf;

import defpackage.d5j0;
import defpackage.d5z0;
import defpackage.h5z0;
import defpackage.m5j0;
import defpackage.nci0;
import defpackage.qje;
import defpackage.rvj0;
import defpackage.t4j0;
import defpackage.wg10;
import defpackage.wms;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;
import ru.yandex.video.m3.player.utils.JsonConverter;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/player/netperf/StrmNetworkPerfApi;", "", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lru/yandex/video/m3/player/utils/JsonConverter;", "jsonConverter", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "infoProvider", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "Lru/yandex/video/m3/player/netperf/NetPerfApiSendUrlBuilder;", "netPerfApiSendUrlBuilder", "<init>", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/player/utils/JsonConverter;Lru/yandex/video/m3/player/impl/utils/InfoProvider;Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/player/impl/utils/TimeProvider;Lru/yandex/video/m3/player/netperf/NetPerfApiSendUrlBuilder;)V", "", "navStart", "", "Lru/yandex/video/m3/player/netperf/PerfEventDto;", "events", "Lzy11;", "logEventsSync", "(JLjava/util/List;)V", "Lokhttp3/OkHttpClient;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "Lru/yandex/video/m3/player/netperf/NetPerfApiSendUrlBuilder;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StrmNetworkPerfApi {
    public static final int $stable = 8;
    private final InfoProvider infoProvider;
    private final JsonConverter jsonConverter;
    private final NetPerfApiSendUrlBuilder netPerfApiSendUrlBuilder;
    private final OkHttpClient okHttpClient;
    private final PlayerLogger playerLogger;
    private final TimeProvider timeProvider;

    public StrmNetworkPerfApi(OkHttpClient okHttpClient, JsonConverter jsonConverter, InfoProvider infoProvider, PlayerLogger playerLogger, TimeProvider timeProvider, NetPerfApiSendUrlBuilder netPerfApiSendUrlBuilder) {
        this.okHttpClient = okHttpClient;
        this.jsonConverter = jsonConverter;
        this.infoProvider = infoProvider;
        this.playerLogger = playerLogger;
        this.timeProvider = timeProvider;
        this.netPerfApiSendUrlBuilder = netPerfApiSendUrlBuilder;
    }

    public final void logEventsSync(long navStart, List<PerfEventDto> events) {
        try {
            String str = this.jsonConverter.to(events);
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t("PerfApi");
            d5z0Var.a(str, new Object[0]);
            OkHttpClient okHttpClient = this.okHttpClient;
            t4j0 t4j0Var = new t4j0();
            t4j0Var.a = this.netPerfApiSendUrlBuilder.buildUrl(navStart, this.timeProvider);
            t4j0Var.c.g(ExtFunctionsKt.HEADER_USER_AGENT, this.infoProvider.getUserAgent());
            int i = m5j0.a;
            Regex regex = wg10.e;
            t4j0Var.e("POST", wms.a(str, qje.o("application/json")));
            rvj0 rvj0Var = ((nci0) okHttpClient.newCall(new d5j0(t4j0Var))).execute().z;
            if (rvj0Var != null) {
                rvj0Var.close();
            }
        } catch (Throwable th) {
            this.playerLogger.error("PerfApi", "logEventsSync", "events size = " + events.size(), th, new Object[0]);
        }
    }
}
