package ru.yandex.video.m3.player.impl.load_control.provider;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/ConstantBufferDurationProviderImpl;", "Lru/yandex/video/m3/player/impl/load_control/provider/BufferDurationProvider;", "bufferDuration", "", "(J)V", "getMaxBufferMs", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConstantBufferDurationProviderImpl implements BufferDurationProvider {
    public static final int $stable = 0;
    private static final long DEFAULT_MAX_DURATION_MS = 50000;
    private final long bufferDuration;

    public /* synthetic */ ConstantBufferDurationProviderImpl(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 50000L : j);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.BufferDurationProvider
    /* renamed from: getMaxBufferMs, reason: from getter */
    public long getBufferDuration() {
        return this.bufferDuration;
    }

    public ConstantBufferDurationProviderImpl(long j) {
        this.bufferDuration = j;
    }

    public ConstantBufferDurationProviderImpl() {
        this(0L, 1, null);
    }
}
