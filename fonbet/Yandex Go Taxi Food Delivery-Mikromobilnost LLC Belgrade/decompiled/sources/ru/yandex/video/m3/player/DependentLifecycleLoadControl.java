package ru.yandex.video.m3.player;

import kotlin.Metadata;
import ru.yandex.video.m3.data.loadcontrol.LoadControlState;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/DependentLifecycleLoadControl;", "", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "Lzy11;", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "release", "Lru/yandex/video/m3/data/loadcontrol/LoadControlState;", "getLoadControlState", "()Lru/yandex/video/m3/data/loadcontrol/LoadControlState;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DependentLifecycleLoadControl {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static LoadControlState getLoadControlState(DependentLifecycleLoadControl dependentLifecycleLoadControl) {
            return DependentLifecycleLoadControl.super.getLoadControlState();
        }
    }

    default LoadControlState getLoadControlState() {
        return LoadControlState.INSTANCE.getEMPTY();
    }

    void release(YandexPlayer<?> yandexPlayer);

    void start(YandexPlayer<?> yandexPlayer);
}
