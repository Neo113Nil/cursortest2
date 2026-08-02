package ru.yandex.video.m3.player.lowlatency.bandwidth.ewma;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/lowlatency/bandwidth/ewma/HalfLife;", "", "slow", "", "fast", "(DD)V", "getFast", "()D", "getSlow", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HalfLife {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HalfLife HALF_LIFE_DEFAULT = new HalfLife(2.0d, 5.0d);
    private static final HalfLife HALF_LIFE_LOW_LATENCY = new HalfLife(1.0d, 2.0d);
    private final double fast;
    private final double slow;

    public HalfLife(double d, double d2) {
        this.slow = d;
        this.fast = d2;
    }

    public final double getFast() {
        return this.fast;
    }

    public final double getSlow() {
        return this.slow;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/lowlatency/bandwidth/ewma/HalfLife$Companion;", "", "()V", "HALF_LIFE_DEFAULT", "Lru/yandex/video/m3/player/lowlatency/bandwidth/ewma/HalfLife;", "getHALF_LIFE_DEFAULT", "()Lru/yandex/video/m3/player/lowlatency/bandwidth/ewma/HalfLife;", "HALF_LIFE_LOW_LATENCY", "getHALF_LIFE_LOW_LATENCY", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HalfLife getHALF_LIFE_DEFAULT() {
            return HalfLife.HALF_LIFE_DEFAULT;
        }

        public final HalfLife getHALF_LIFE_LOW_LATENCY() {
            return HalfLife.HALF_LIFE_LOW_LATENCY;
        }

        private Companion() {
        }
    }
}
