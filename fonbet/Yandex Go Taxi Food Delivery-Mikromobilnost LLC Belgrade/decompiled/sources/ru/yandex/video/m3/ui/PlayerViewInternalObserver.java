package ru.yandex.video.m3.ui;

import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ui/PlayerViewInternalObserver;", "", "Lzy11;", "onViewAppearOnScreen", "()V", "onViewDisappearFromScreen", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "player", "onPlayerAttachedToView", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;)V", "onPlayerDetachedFromView", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlayerViewInternalObserver {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onPlayerAttachedToView(PlayerViewInternalObserver playerViewInternalObserver, InternalListYandexPlayer internalListYandexPlayer) {
            PlayerViewInternalObserver.super.onPlayerAttachedToView(internalListYandexPlayer);
        }

        @Deprecated
        public static void onPlayerDetachedFromView(PlayerViewInternalObserver playerViewInternalObserver, InternalListYandexPlayer internalListYandexPlayer) {
            PlayerViewInternalObserver.super.onPlayerDetachedFromView(internalListYandexPlayer);
        }

        @Deprecated
        public static void onViewAppearOnScreen(PlayerViewInternalObserver playerViewInternalObserver) {
            PlayerViewInternalObserver.super.onViewAppearOnScreen();
        }

        @Deprecated
        public static void onViewDisappearFromScreen(PlayerViewInternalObserver playerViewInternalObserver) {
            PlayerViewInternalObserver.super.onViewDisappearFromScreen();
        }
    }

    default void onPlayerAttachedToView(InternalListYandexPlayer player) {
    }

    default void onPlayerDetachedFromView(InternalListYandexPlayer player) {
    }

    default void onViewAppearOnScreen() {
    }

    default void onViewDisappearFromScreen() {
    }
}
