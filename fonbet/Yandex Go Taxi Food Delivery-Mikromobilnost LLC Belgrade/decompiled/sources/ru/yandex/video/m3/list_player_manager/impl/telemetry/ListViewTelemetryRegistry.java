package ru.yandex.video.m3.list_player_manager.impl.telemetry;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.impl.ItemsListAbsoluteIndicesAdapter;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.network.NetworkTypeProviderImpl;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryRegistry;", "", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListPlayerManagerEventTracker;", "listPlayerManagerEventTracker", "Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter;", "absoluteItems", "<init>", "(Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListPlayerManagerEventTracker;Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter;)V", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "view", "Lzy11;", "registerViewCreation", "(Lru/yandex/video/m3/ui/ListYandexPlayerView;)V", "onAllListPlayersDestroyed", "()V", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListPlayerManagerEventTracker;", "Lru/yandex/video/m3/list_player_manager/impl/ItemsListAbsoluteIndicesAdapter;", "Ljava/util/WeakHashMap;", "Ljava/lang/ref/WeakReference;", "Lru/yandex/video/m3/list_player_manager/impl/telemetry/ListViewTelemetryLogger;", "listViews", "Ljava/util/WeakHashMap;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "lastReportedItemRef", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicInteger;", "reportedItemIndexOffsetRef", "Ljava/util/concurrent/atomic/AtomicInteger;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListViewTelemetryRegistry {
    public static final int $stable = 8;
    private final ItemsListAbsoluteIndicesAdapter absoluteItems;
    private final ListPlayerManagerEventTracker listPlayerManagerEventTracker;
    private final WeakHashMap<ListYandexPlayerView, WeakReference<ListViewTelemetryLogger>> listViews = new WeakHashMap<>();
    private final AtomicReference<MediaData> lastReportedItemRef = new AtomicReference<>(null);
    private final AtomicInteger reportedItemIndexOffsetRef = new AtomicInteger(Integer.MIN_VALUE);

    public ListViewTelemetryRegistry(ListPlayerManagerEventTracker listPlayerManagerEventTracker, ItemsListAbsoluteIndicesAdapter itemsListAbsoluteIndicesAdapter) {
        this.listPlayerManagerEventTracker = listPlayerManagerEventTracker;
        this.absoluteItems = itemsListAbsoluteIndicesAdapter;
    }

    public final void onAllListPlayersDestroyed() {
        this.lastReportedItemRef.set(null);
        this.reportedItemIndexOffsetRef.set(Integer.MIN_VALUE);
    }

    public final void registerViewCreation(ListYandexPlayerView view) {
        this.listViews.put(view, new WeakReference<>(new ListViewTelemetryLogger(view, new SystemTimeProvider(), this.listPlayerManagerEventTracker, this.absoluteItems, this.lastReportedItemRef, this.reportedItemIndexOffsetRef, NetworkTypeProviderImpl.INSTANCE.getInstance(view.getContext()))));
    }
}
