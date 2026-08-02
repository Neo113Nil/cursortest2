package ru.yandex.video.m3.player.netperf;

import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/player/netperf/DefaultNetPerfEventTrackerFactoryImpl;", "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "Lru/yandex/video/m3/player/netperf/NetworkEventsCollector;", "collector", "Lkotlin/Function0;", "", "timePointProvider", "<init>", "(Lru/yandex/video/m3/player/netperf/NetworkEventsCollector;Lsls;)V", "Lru/yandex/video/m3/player/netperf/NetPerfEventTracker;", "create", "()Lru/yandex/video/m3/player/netperf/NetPerfEventTracker;", "Lru/yandex/video/m3/player/netperf/NetworkEventsCollector;", "Lsls;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultNetPerfEventTrackerFactoryImpl implements NetPerfEventTrackerFactory {
    public static final int $stable = 8;
    private final NetworkEventsCollector collector;
    private final sls timePointProvider;

    public DefaultNetPerfEventTrackerFactoryImpl(NetworkEventsCollector networkEventsCollector, sls slsVar) {
        this.collector = networkEventsCollector;
        this.timePointProvider = slsVar;
    }

    @Override // ru.yandex.video.m3.player.netperf.NetPerfEventTrackerFactory
    public NetPerfEventTracker create() {
        return new NetPerfEventTrackerImpl(this.collector, this.timePointProvider);
    }
}
