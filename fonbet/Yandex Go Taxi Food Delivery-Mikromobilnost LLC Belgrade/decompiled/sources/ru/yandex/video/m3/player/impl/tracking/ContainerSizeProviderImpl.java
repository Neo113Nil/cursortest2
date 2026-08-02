package ru.yandex.video.m3.player.impl.tracking;

import kotlin.Metadata;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.player.api.tracking.ContainerSizeProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/ContainerSizeProviderImpl;", "Lru/yandex/video/m3/player/api/tracking/ContainerSizeProvider;", "()V", "containerSize", "Lru/yandex/video/m3/data/Size;", "getContainerSize", "()Lru/yandex/video/m3/data/Size;", "setContainerSize", "(Lru/yandex/video/m3/data/Size;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContainerSizeProviderImpl implements ContainerSizeProvider {
    public static final int $stable = 8;
    private Size containerSize;

    @Override // ru.yandex.video.m3.player.api.tracking.ContainerSizeProvider
    public Size getContainerSize() {
        return this.containerSize;
    }

    public void setContainerSize(Size size) {
        this.containerSize = size;
    }
}
