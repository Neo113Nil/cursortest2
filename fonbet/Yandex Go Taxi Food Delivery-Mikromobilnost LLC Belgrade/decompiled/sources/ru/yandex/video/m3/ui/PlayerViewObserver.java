package ru.yandex.video.m3.ui;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ui/PlayerViewObserver;", "", "Lzy11;", "onSwitchedToFirstFrame", "()V", "onSwitchedToContent", "onBlurPictureIsSet", "onFirstFramePictureIsSet", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlayerViewObserver {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onBlurPictureIsSet(PlayerViewObserver playerViewObserver) {
            PlayerViewObserver.super.onBlurPictureIsSet();
        }

        @Deprecated
        public static void onFirstFramePictureIsSet(PlayerViewObserver playerViewObserver) {
            PlayerViewObserver.super.onFirstFramePictureIsSet();
        }

        @Deprecated
        public static void onSwitchedToContent(PlayerViewObserver playerViewObserver) {
            PlayerViewObserver.super.onSwitchedToContent();
        }

        @Deprecated
        public static void onSwitchedToFirstFrame(PlayerViewObserver playerViewObserver) {
            PlayerViewObserver.super.onSwitchedToFirstFrame();
        }
    }

    default void onBlurPictureIsSet() {
    }

    default void onFirstFramePictureIsSet() {
    }

    default void onSwitchedToContent() {
    }

    default void onSwitchedToFirstFrame() {
    }
}
