package ru.yandex.video.m3.player.netperf;

import java.util.Collection;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/netperf/NetPerfEventCollector;", "Lru/yandex/video/m3/player/netperf/NetworkEventsCollector;", "", "Lru/yandex/video/m3/player/netperf/NetPerfEvent;", "mutableCollection", "<init>", "(Ljava/util/Collection;)V", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "addEvent", "(Lru/yandex/video/m3/player/netperf/NetPerfEvent;)V", "Ljava/util/Collection;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetPerfEventCollector implements NetworkEventsCollector {
    public static final int $stable = 8;
    private final Collection<NetPerfEvent> mutableCollection;

    public NetPerfEventCollector(Collection<NetPerfEvent> collection) {
        this.mutableCollection = collection;
    }

    @Override // ru.yandex.video.m3.player.netperf.NetworkEventsCollector
    public void addEvent(NetPerfEvent event) {
        this.mutableCollection.add(event);
    }
}
