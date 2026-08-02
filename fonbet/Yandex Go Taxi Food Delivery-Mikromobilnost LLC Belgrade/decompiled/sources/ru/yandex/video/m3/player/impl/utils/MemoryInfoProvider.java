package ru.yandex.video.m3.player.impl.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/MemoryInfoProvider;", "", "()V", "runtime", "Ljava/lang/Runtime;", "kotlin.jvm.PlatformType", "freeMemory", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MemoryInfoProvider {
    public static final int $stable = 8;
    private final Runtime runtime = Runtime.getRuntime();

    public final long freeMemory() {
        return this.runtime.maxMemory() - (this.runtime.totalMemory() - this.runtime.freeMemory());
    }
}
