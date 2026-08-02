package ru.yandex.video.m3.player.provider.internal;

import kotlin.Metadata;
import ru.yandex.video.m3.player.provider.Consumer;
import ru.yandex.video.m3.player.provider.Supplier;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/provider/internal/SurfaceSizeProvider;", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "Lru/yandex/video/m3/player/provider/Consumer;", "<init>", "()V", "get", "()Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "value", "Lzy11;", "accept", "(Lru/yandex/video/m3/player/provider/model/SurfaceSize;)V", "Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SurfaceSizeProvider implements Supplier<SurfaceSize>, Consumer<SurfaceSize> {
    public static final int $stable = 8;
    private SurfaceSize value = new SurfaceSize(Integer.MAX_VALUE, Integer.MAX_VALUE);

    @Override // ru.yandex.video.m3.player.provider.Supplier
    /* renamed from: get, reason: avoid collision after fix types in other method and from getter */
    public SurfaceSize getValue() {
        return this.value;
    }

    @Override // ru.yandex.video.m3.player.provider.Consumer
    public void accept(SurfaceSize value) {
        this.value = value;
    }
}
