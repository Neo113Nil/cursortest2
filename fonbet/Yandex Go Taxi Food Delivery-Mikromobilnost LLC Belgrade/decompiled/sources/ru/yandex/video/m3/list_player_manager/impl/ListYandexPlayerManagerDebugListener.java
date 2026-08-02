package ru.yandex.video.m3.list_player_manager.impl;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH&¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH&¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0015\u0010\u000fJ'\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001e\u0010\u001dJ'\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001f\u0010\u001dJ\u001d\u0010\"\u001a\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 H&¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\u00020\u00062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040 H&¢\u0006\u0004\b%\u0010#¨\u0006&À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerManagerDebugListener;", "", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "player", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "mediaData", "Lzy11;", "onItemAttachedToListPlayer", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "onEngineAttachedToMediaData", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/player/YandexPlayer;)V", "onEngineDetachedToMediaData", "onPreloadStarted", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "", "bytes", "onPreloadSuccess", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;J)V", "onPreloadCanceled", "onPreloadError", "", "engineIndex", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", Constants.KEY_DATA, "onDecoderInitialized", "(ILru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;)V", "onDecoderReused", "onDecoderDiscarded", "", "mediaItems", "onUpdateItemsList", "(Ljava/util/List;)V", "visibleItems", "onUpdateVisibleItemsList", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ListYandexPlayerManagerDebugListener {
    void onDecoderDiscarded(int engineIndex, TrackType trackType, DecoderEventData data);

    void onDecoderInitialized(int engineIndex, TrackType trackType, DecoderEventData data);

    void onDecoderReused(int engineIndex, TrackType trackType, DecoderEventData data);

    void onEngineAttachedToMediaData(MediaData mediaData, YandexPlayer<?> yandexPlayer);

    void onEngineDetachedToMediaData(MediaData mediaData, YandexPlayer<?> yandexPlayer);

    void onItemAttachedToListPlayer(InternalListYandexPlayer player, MediaData mediaData);

    void onPreloadCanceled(MediaData mediaData);

    void onPreloadError(MediaData mediaData);

    void onPreloadStarted(MediaData mediaData);

    void onPreloadSuccess(MediaData mediaData, long bytes);

    void onUpdateItemsList(List<MediaData> mediaItems);

    void onUpdateVisibleItemsList(List<MediaData> visibleItems);
}
