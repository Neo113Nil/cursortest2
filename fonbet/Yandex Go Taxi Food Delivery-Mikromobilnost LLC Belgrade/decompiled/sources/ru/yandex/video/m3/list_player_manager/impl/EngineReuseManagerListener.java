package ru.yandex.video.m3.list_player_manager.impl;

import java.util.Set;
import kotlin.Metadata;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H&¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH&¢\u0006\u0004\b#\u0010$¨\u0006%À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/EngineReuseManagerListener;", "", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "player", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "mediaData", "Lzy11;", "onItemAttachedToListPlayer", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "listYandexPlayerView", "onItemDetachedFromListPlayer", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "onItemVideoDataLoaded", "(Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/data/dto/VideoData;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "onEngineAttachedToMediaData", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/player/YandexPlayer;)V", "onEngineDetachedToMediaData", "playerWithDetachedEngine", "onGetEngineFromOtherPlayer", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;)V", "", "playersWithAttachedEngines", "onForceEngineAcquire", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Ljava/util/Set;)V", "", "count", "onListPlayerCountChanged", "(I)V", "width", "height", "onPlayerAttachedToViewWithSize", "(II)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface EngineReuseManagerListener {
    void onEngineAttachedToMediaData(MediaData mediaData, YandexPlayer<?> yandexPlayer);

    void onEngineDetachedToMediaData(MediaData mediaData, YandexPlayer<?> yandexPlayer);

    void onForceEngineAcquire(InternalListYandexPlayer player, Set<? extends InternalListYandexPlayer> playersWithAttachedEngines);

    void onGetEngineFromOtherPlayer(InternalListYandexPlayer player, InternalListYandexPlayer playerWithDetachedEngine);

    void onItemAttachedToListPlayer(InternalListYandexPlayer player, MediaData mediaData);

    void onItemDetachedFromListPlayer(InternalListYandexPlayer player, ListYandexPlayerView listYandexPlayerView, MediaData mediaData);

    void onItemVideoDataLoaded(ListYandexPlayerView listYandexPlayerView, VideoData videoData);

    void onListPlayerCountChanged(int count);

    void onPlayerAttachedToViewWithSize(int width, int height);
}
