package ru.yandex.video.m3.player.netperf;

import defpackage.bgo;
import defpackage.yf7;
import defpackage.yfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/netperf/NetPerfEventListenerFactory;", "Lyfo;", "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "netPerfEventTrackerFactory", "<init>", "(Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;)V", "Lyf7;", "call", "Lbgo;", "create", "(Lyf7;)Lbgo;", "Lru/yandex/video/m3/player/netperf/NetPerfEventTrackerFactory;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetPerfEventListenerFactory implements yfo {
    public static final int $stable = 8;
    private final NetPerfEventTrackerFactory netPerfEventTrackerFactory;

    public NetPerfEventListenerFactory(NetPerfEventTrackerFactory netPerfEventTrackerFactory) {
        this.netPerfEventTrackerFactory = netPerfEventTrackerFactory;
    }

    @Override // defpackage.yfo
    public bgo create(yf7 call) {
        return new NetworkEventsListener(this.netPerfEventTrackerFactory.create());
    }
}
