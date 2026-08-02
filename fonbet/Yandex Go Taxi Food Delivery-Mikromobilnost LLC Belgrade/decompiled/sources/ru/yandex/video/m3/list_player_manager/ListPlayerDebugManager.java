package ru.yandex.video.m3.list_player_manager;

import defpackage.zxc0;
import kotlin.Metadata;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver;
import ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerImpl;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/ListPlayerDebugManager;", "Lru/yandex/video/m3/list_player_manager/impl/ListPlayerInternalObserver;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ListPlayerDebugManager extends ListPlayerInternalObserver {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onDropSource(ListPlayerDebugManager listPlayerDebugManager, InternalListYandexPlayer internalListYandexPlayer, ListYandexPlayerView listYandexPlayerView, MediaData mediaData) {
            ListPlayerDebugManager.super.onDropSource(internalListYandexPlayer, listYandexPlayerView, mediaData);
        }

        @Deprecated
        public static void onEngineAttached(ListPlayerDebugManager listPlayerDebugManager, YandexPlayer<zxc0> yandexPlayer) {
            ListPlayerDebugManager.super.onEngineAttached(yandexPlayer);
        }

        @Deprecated
        public static void onEngineDetached(ListPlayerDebugManager listPlayerDebugManager) {
            ListPlayerDebugManager.super.onEngineDetached();
        }

        @Deprecated
        public static void onItemVideoDataLoaded(ListPlayerDebugManager listPlayerDebugManager, InternalListYandexPlayer internalListYandexPlayer, ListYandexPlayerView listYandexPlayerView, VideoData videoData, boolean z) {
            ListPlayerDebugManager.super.onItemVideoDataLoaded(internalListYandexPlayer, listYandexPlayerView, videoData, z);
        }

        @Deprecated
        public static void onPause(ListPlayerDebugManager listPlayerDebugManager, InternalListYandexPlayer internalListYandexPlayer, boolean z) {
            ListPlayerDebugManager.super.onPause(internalListYandexPlayer, z);
        }

        @Deprecated
        public static void onPlay(ListPlayerDebugManager listPlayerDebugManager, InternalListYandexPlayer internalListYandexPlayer, boolean z) {
            ListPlayerDebugManager.super.onPlay(internalListYandexPlayer, z);
        }

        @Deprecated
        public static void onPlayerViewSizeChange(ListPlayerDebugManager listPlayerDebugManager, InternalListYandexPlayer internalListYandexPlayer, int i, int i2, int i3, int i4) {
            ListPlayerDebugManager.super.onPlayerViewSizeChange(internalListYandexPlayer, i, i2, i3, i4);
        }

        @Deprecated
        public static void onRelease(ListPlayerDebugManager listPlayerDebugManager, InternalListYandexPlayer internalListYandexPlayer) {
            ListPlayerDebugManager.super.onRelease(internalListYandexPlayer);
        }

        @Deprecated
        public static void onSetSource(ListPlayerDebugManager listPlayerDebugManager, InternalListYandexPlayer internalListYandexPlayer, MediaData mediaData, MediaData mediaData2, PlaybackConfig playbackConfig) {
            ListPlayerDebugManager.super.onSetSource(internalListYandexPlayer, mediaData, mediaData2, playbackConfig);
        }

        @Deprecated
        public static void onViewAttached(ListPlayerDebugManager listPlayerDebugManager, ListYandexPlayerImpl listYandexPlayerImpl, ListYandexPlayerView listYandexPlayerView) {
            ListPlayerDebugManager.super.onViewAttached(listYandexPlayerImpl, listYandexPlayerView);
        }

        @Deprecated
        public static void onViewDetached(ListPlayerDebugManager listPlayerDebugManager, ListYandexPlayerImpl listYandexPlayerImpl, ListYandexPlayerView listYandexPlayerView) {
            ListPlayerDebugManager.super.onViewDetached(listYandexPlayerImpl, listYandexPlayerView);
        }
    }
}
