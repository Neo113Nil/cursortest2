package ru.yandex.video.m3.telemetry.helpers.netperf;

import java.util.HashSet;
import kotlin.Metadata;
import ru.yandex.video.m3.player.netperf.NetPerfManager;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\rj\b\u0012\u0004\u0012\u00020\u0006`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerControlCallRestrictor;", "Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerScope;", "Lru/yandex/video/m3/player/netperf/NetPerfManager;", "netPerfManager", "<init>", "(Lru/yandex/video/m3/player/netperf/NetPerfManager;)V", "Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerCaller;", "caller", "Lzy11;", "start", "(Lru/yandex/video/m3/telemetry/helpers/netperf/NetPerfManagerCaller;)V", "stop", "Lru/yandex/video/m3/player/netperf/NetPerfManager;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "hashSet", "Ljava/util/HashSet;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetPerfManagerControlCallRestrictor implements NetPerfManagerScope {
    public static final int $stable = 8;
    private final HashSet<NetPerfManagerCaller> hashSet = new HashSet<>();
    private final NetPerfManager netPerfManager;

    public NetPerfManagerControlCallRestrictor(NetPerfManager netPerfManager) {
        this.netPerfManager = netPerfManager;
    }

    @Override // ru.yandex.video.m3.telemetry.helpers.netperf.NetPerfManagerScope
    public void start(NetPerfManagerCaller caller) {
        synchronized (this) {
            if (this.hashSet.add(caller)) {
                this.netPerfManager.start$video_player_internalRelease();
            }
        }
    }

    @Override // ru.yandex.video.m3.telemetry.helpers.netperf.NetPerfManagerScope
    public void stop(NetPerfManagerCaller caller) {
        synchronized (this) {
            this.hashSet.remove(caller);
            if (this.hashSet.isEmpty()) {
                this.netPerfManager.stop$video_player_internalRelease();
            }
        }
    }
}
