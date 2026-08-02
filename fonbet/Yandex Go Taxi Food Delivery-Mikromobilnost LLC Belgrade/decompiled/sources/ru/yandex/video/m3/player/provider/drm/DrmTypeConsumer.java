package ru.yandex.video.m3.player.provider.drm;

import defpackage.jxi;
import kotlin.Metadata;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.player.provider.Consumer;

@jxi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/provider/drm/DrmTypeConsumer;", "Lru/yandex/video/m3/player/provider/Consumer;", "Lru/yandex/video/m3/data/DrmType;", "value", "Lzy11;", "accept", "(Lru/yandex/video/m3/data/DrmType;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DrmTypeConsumer extends Consumer<DrmType> {
    void accept(DrmType value);
}
