package ru.yandex.video.m3.list_player_manager.impl.image;

import kotlin.Metadata;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/image/BitmapDownloaderObserver;", "", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "view", "Lzy11;", "onViewBlurSet", "(Lru/yandex/video/m3/ui/ListYandexPlayerView;)V", "onViewBitmapSet", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BitmapDownloaderObserver {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onViewBitmapSet(BitmapDownloaderObserver bitmapDownloaderObserver, ListYandexPlayerView listYandexPlayerView) {
            BitmapDownloaderObserver.super.onViewBitmapSet(listYandexPlayerView);
        }

        @Deprecated
        public static void onViewBlurSet(BitmapDownloaderObserver bitmapDownloaderObserver, ListYandexPlayerView listYandexPlayerView) {
            BitmapDownloaderObserver.super.onViewBlurSet(listYandexPlayerView);
        }
    }

    default void onViewBitmapSet(ListYandexPlayerView view) {
    }

    default void onViewBlurSet(ListYandexPlayerView view) {
    }
}
