package ru.yandex.video.m3.player.impl.load_control.provider;

import defpackage.ny61;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/CompositeBufferDurationProviderImpl;", "Lru/yandex/video/m3/player/impl/load_control/provider/DependentLifecycleBufferDurationProvider;", "", "Lru/yandex/video/m3/player/impl/load_control/provider/BufferDurationProvider;", "providers", "<init>", "(Ljava/util/List;)V", "", "getMaxBufferMs", "()J", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "Lzy11;", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "release", "Ljava/util/List;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CompositeBufferDurationProviderImpl implements DependentLifecycleBufferDurationProvider {
    public static final int $stable = 8;
    private final List<BufferDurationProvider> providers;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeBufferDurationProviderImpl(List<? extends BufferDurationProvider> list) {
        this.providers = list;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.BufferDurationProvider
    /* renamed from: getMaxBufferMs */
    public long getBufferDuration() {
        Iterator<T> it = this.providers.iterator();
        if (!it.hasNext()) {
            ny61.p();
            return 0L;
        }
        long bufferDuration = ((BufferDurationProvider) it.next()).getBufferDuration();
        while (it.hasNext()) {
            long bufferDuration2 = ((BufferDurationProvider) it.next()).getBufferDuration();
            if (bufferDuration > bufferDuration2) {
                bufferDuration = bufferDuration2;
            }
        }
        return bufferDuration;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle
    public void release(YandexPlayer<?> yandexPlayer) {
        for (BufferDurationProvider bufferDurationProvider : this.providers) {
            if (bufferDurationProvider instanceof DependentLifecycleBufferDurationProvider) {
                ((DependentLifecycleBufferDurationProvider) bufferDurationProvider).release(yandexPlayer);
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle
    public void start(YandexPlayer<?> yandexPlayer) {
        for (BufferDurationProvider bufferDurationProvider : this.providers) {
            if (bufferDurationProvider instanceof DependentLifecycleBufferDurationProvider) {
                ((DependentLifecycleBufferDurationProvider) bufferDurationProvider).start(yandexPlayer);
            }
        }
    }
}
