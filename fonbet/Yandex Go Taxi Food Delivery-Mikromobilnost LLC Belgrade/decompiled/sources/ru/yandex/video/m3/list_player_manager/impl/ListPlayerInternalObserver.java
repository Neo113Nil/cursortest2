package ru.yandex.video.m3.list_player_manager.impl;

import defpackage.zxc0;
import kotlin.Metadata;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.PlaybackConfig;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ1\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u001d\u0010#\u001a\u00020\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010&J7\u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/¨\u00060À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ListPlayerInternalObserver;", "", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "player", "", "wasPlayWhenReady", "Lzy11;", "onPlay", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Z)V", "onPause", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "oldMediaData", "newMediaData", "Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "playbackConfig", "onSetSource", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/list_player_manager/PlaybackConfig;)V", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "listYandexPlayerView", "mediaData", "onDropSource", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "isFromCache", "onItemVideoDataLoaded", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/data/dto/VideoData;Z)V", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl;", "listYandexPlayerImpl", "onViewAttached", "(Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl;Lru/yandex/video/m3/ui/ListYandexPlayerView;)V", "onViewDetached", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "engine", "onEngineAttached", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "onEngineDetached", "()V", "", "w", "h", "oldw", "oldh", "onPlayerViewSizeChange", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;IIII)V", "onRelease", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface ListPlayerInternalObserver {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void onDropSource(ListPlayerInternalObserver listPlayerInternalObserver, InternalListYandexPlayer internalListYandexPlayer, ListYandexPlayerView listYandexPlayerView, MediaData mediaData) {
            ListPlayerInternalObserver.super.onDropSource(internalListYandexPlayer, listYandexPlayerView, mediaData);
        }

        @Deprecated
        public static void onEngineAttached(ListPlayerInternalObserver listPlayerInternalObserver, YandexPlayer<zxc0> yandexPlayer) {
            ListPlayerInternalObserver.super.onEngineAttached(yandexPlayer);
        }

        @Deprecated
        public static void onEngineDetached(ListPlayerInternalObserver listPlayerInternalObserver) {
            ListPlayerInternalObserver.super.onEngineDetached();
        }

        @Deprecated
        public static void onItemVideoDataLoaded(ListPlayerInternalObserver listPlayerInternalObserver, InternalListYandexPlayer internalListYandexPlayer, ListYandexPlayerView listYandexPlayerView, VideoData videoData, boolean z) {
            ListPlayerInternalObserver.super.onItemVideoDataLoaded(internalListYandexPlayer, listYandexPlayerView, videoData, z);
        }

        @Deprecated
        public static void onPause(ListPlayerInternalObserver listPlayerInternalObserver, InternalListYandexPlayer internalListYandexPlayer, boolean z) {
            ListPlayerInternalObserver.super.onPause(internalListYandexPlayer, z);
        }

        @Deprecated
        public static void onPlay(ListPlayerInternalObserver listPlayerInternalObserver, InternalListYandexPlayer internalListYandexPlayer, boolean z) {
            ListPlayerInternalObserver.super.onPlay(internalListYandexPlayer, z);
        }

        @Deprecated
        public static void onPlayerViewSizeChange(ListPlayerInternalObserver listPlayerInternalObserver, InternalListYandexPlayer internalListYandexPlayer, int i, int i2, int i3, int i4) {
            ListPlayerInternalObserver.super.onPlayerViewSizeChange(internalListYandexPlayer, i, i2, i3, i4);
        }

        @Deprecated
        public static void onRelease(ListPlayerInternalObserver listPlayerInternalObserver, InternalListYandexPlayer internalListYandexPlayer) {
            ListPlayerInternalObserver.super.onRelease(internalListYandexPlayer);
        }

        @Deprecated
        public static void onSetSource(ListPlayerInternalObserver listPlayerInternalObserver, InternalListYandexPlayer internalListYandexPlayer, MediaData mediaData, MediaData mediaData2, PlaybackConfig playbackConfig) {
            ListPlayerInternalObserver.super.onSetSource(internalListYandexPlayer, mediaData, mediaData2, playbackConfig);
        }

        @Deprecated
        public static void onViewAttached(ListPlayerInternalObserver listPlayerInternalObserver, ListYandexPlayerImpl listYandexPlayerImpl, ListYandexPlayerView listYandexPlayerView) {
            ListPlayerInternalObserver.super.onViewAttached(listYandexPlayerImpl, listYandexPlayerView);
        }

        @Deprecated
        public static void onViewDetached(ListPlayerInternalObserver listPlayerInternalObserver, ListYandexPlayerImpl listYandexPlayerImpl, ListYandexPlayerView listYandexPlayerView) {
            ListPlayerInternalObserver.super.onViewDetached(listYandexPlayerImpl, listYandexPlayerView);
        }
    }

    default void onDropSource(InternalListYandexPlayer player, ListYandexPlayerView listYandexPlayerView, MediaData mediaData) {
    }

    default void onEngineAttached(YandexPlayer<zxc0> engine) {
    }

    default void onEngineDetached() {
    }

    default void onItemVideoDataLoaded(InternalListYandexPlayer player, ListYandexPlayerView listYandexPlayerView, VideoData videoData, boolean isFromCache) {
    }

    default void onPause(InternalListYandexPlayer player, boolean wasPlayWhenReady) {
    }

    default void onPlay(InternalListYandexPlayer player, boolean wasPlayWhenReady) {
    }

    default void onPlayerViewSizeChange(InternalListYandexPlayer player, int w, int h, int oldw, int oldh) {
    }

    default void onRelease(InternalListYandexPlayer player) {
    }

    default void onSetSource(InternalListYandexPlayer player, MediaData oldMediaData, MediaData newMediaData, PlaybackConfig playbackConfig) {
    }

    default void onViewAttached(ListYandexPlayerImpl listYandexPlayerImpl, ListYandexPlayerView listYandexPlayerView) {
    }

    default void onViewDetached(ListYandexPlayerImpl listYandexPlayerImpl, ListYandexPlayerView listYandexPlayerView) {
    }
}
