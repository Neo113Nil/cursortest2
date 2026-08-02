package ru.yandex.video.m3.player.netperf;

import defpackage.d5j0;
import defpackage.jwu;
import defpackage.kwu;
import defpackage.t4j0;
import defpackage.xf7;
import defpackage.yf7;
import defpackage.yfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;
import ru.yandex.video.m3.player.netperf.NetPerfManager;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/yandex/video/m3/player/netperf/NetPerfCallFactory;", "Lxf7;", "Lokhttp3/OkHttpClient;", "baseOkHttpClient", "Lru/yandex/video/m3/player/netperf/IsAppropriateUrlChecker;", "needAddTInUrlProvider", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "netPerfEventTrackerFactory", "<init>", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/player/netperf/IsAppropriateUrlChecker;Lru/yandex/video/m3/player/impl/utils/TimeProvider;Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;)V", "okHttpClient", "", "isNetPerfed", "(Lokhttp3/OkHttpClient;)Z", "Ld5j0;", "request", "maybeAddTimestampToRequest", "(Ld5j0;)Ld5j0;", "Lyf7;", "newCall", "(Ld5j0;)Lyf7;", "Lru/yandex/video/m3/player/netperf/IsAppropriateUrlChecker;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "netPerfedOkHttpClient", "Lokhttp3/OkHttpClient;", "Lru/yandex/video/m3/player/netperf/NetPerfEventListenerFactory;", "eventListenerFactory", "Lru/yandex/video/m3/player/netperf/NetPerfEventListenerFactory;", "Lru/yandex/video/m3/player/netperf/NetPerfManager$Timestamp;", "getCurrentTimestamp", "()Lru/yandex/video/m3/player/netperf/NetPerfManager$Timestamp;", "currentTimestamp", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetPerfCallFactory implements xf7 {
    public static final int $stable = 8;
    private final NetPerfEventListenerFactory eventListenerFactory;
    private final IsAppropriateUrlChecker needAddTInUrlProvider;
    private final NetPerfEventTrackerFactory netPerfEventTrackerFactory;
    private final OkHttpClient netPerfedOkHttpClient;
    private final TimeProvider timeProvider;

    public NetPerfCallFactory(OkHttpClient okHttpClient, IsAppropriateUrlChecker isAppropriateUrlChecker, TimeProvider timeProvider, NetPerfEventTrackerFactory netPerfEventTrackerFactory) {
        this.needAddTInUrlProvider = isAppropriateUrlChecker;
        this.timeProvider = timeProvider;
        this.netPerfEventTrackerFactory = netPerfEventTrackerFactory;
        NetPerfEventListenerFactory netPerfEventListenerFactory = new NetPerfEventListenerFactory(netPerfEventTrackerFactory);
        this.eventListenerFactory = netPerfEventListenerFactory;
        if (isNetPerfed(okHttpClient)) {
            this.netPerfedOkHttpClient = okHttpClient;
            return;
        }
        yfo yfoVar = okHttpClient.w;
        OkHttpClient.a b = okHttpClient.b();
        CompositeOkHttpEventListenerFactoryBuilder compositeOkHttpEventListenerFactoryBuilder = new CompositeOkHttpEventListenerFactoryBuilder();
        compositeOkHttpEventListenerFactoryBuilder.addEventListenerFactory(netPerfEventListenerFactory);
        compositeOkHttpEventListenerFactoryBuilder.addEventListenerFactory(yfoVar);
        b.e = compositeOkHttpEventListenerFactoryBuilder.build();
        this.netPerfedOkHttpClient = new OkHttpClient(b);
    }

    private final NetPerfManager.Timestamp getCurrentTimestamp() {
        return new NetPerfManager.Timestamp(this.timeProvider.currentTimeMillis(), this.timeProvider.uptimeMillis());
    }

    private final boolean isNetPerfed(OkHttpClient okHttpClient) {
        return okHttpClient.w instanceof CompositeOkHttpEventListenerFactory;
    }

    private final d5j0 maybeAddTimestampToRequest(d5j0 request) {
        boolean isAppropriateUrl = this.needAddTInUrlProvider.isAppropriateUrl(request.a);
        kwu kwuVar = request.a;
        if (isAppropriateUrl) {
            jwu g = kwuVar.g();
            g.d("t", String.valueOf(getCurrentTimestamp().getCurrentTimeMillis()));
            kwuVar = g.e();
        }
        t4j0 b = request.b();
        b.a = kwuVar;
        return new d5j0(b);
    }

    @Override // defpackage.xf7
    public yf7 newCall(d5j0 request) {
        return this.netPerfedOkHttpClient.newCall(maybeAddTimestampToRequest(request));
    }

    public /* synthetic */ NetPerfCallFactory(OkHttpClient okHttpClient, IsAppropriateUrlChecker isAppropriateUrlChecker, TimeProvider timeProvider, NetPerfEventTrackerFactory netPerfEventTrackerFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(okHttpClient, (i & 2) != 0 ? new DefaultIsNeedAddTInUrlChecker(null, 1, null) : isAppropriateUrlChecker, (i & 4) != 0 ? new SystemTimeProvider() : timeProvider, netPerfEventTrackerFactory);
    }
}
