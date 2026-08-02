package ru.yandex.video.m3.player.tracking;

import kotlin.Metadata;
import ru.yandex.video.m3.data.ViewPortState;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/tracking/ViewPortProvider;", "", "Lru/yandex/video/m3/player/tracking/ViewPortChangeListener;", "viewPortChangeListener", "Lzy11;", "addListener", "(Lru/yandex/video/m3/player/tracking/ViewPortChangeListener;)V", "removeListener", "Lru/yandex/video/m3/data/ViewPortState;", "getViewPortState", "()Lru/yandex/video/m3/data/ViewPortState;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ViewPortProvider {
    void addListener(ViewPortChangeListener viewPortChangeListener);

    ViewPortState getViewPortState();

    void removeListener(ViewPortChangeListener viewPortChangeListener);
}
