package ru.yandex.video.m3.player.provider.drm;

import defpackage.jxi;
import kotlin.Metadata;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.player.provider.StatefulObservable;
import ru.yandex.video.m3.player.provider.Supplier;

@jxi
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/provider/drm/DrmTypeSupplier;", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/data/DrmType;", "Lru/yandex/video/m3/player/provider/StatefulObservable;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DrmTypeSupplier extends Supplier<DrmType>, StatefulObservable<DrmType> {
}
