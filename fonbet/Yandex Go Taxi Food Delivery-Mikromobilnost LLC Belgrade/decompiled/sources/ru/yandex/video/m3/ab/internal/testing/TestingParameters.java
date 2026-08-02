package ru.yandex.video.m3.ab.internal.testing;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ab.internal.SticknessHolder;
import ru.yandex.video.m3.ab.internal.VpuidHolder;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ab/internal/testing/TestingParameters;", "", "()V", "Debug", "Release", "Lru/yandex/video/m3/ab/internal/testing/TestingParameters$Debug;", "Lru/yandex/video/m3/ab/internal/testing/TestingParameters$Release;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TestingParameters {
    public static final int $stable = 0;

    /* renamed from: Release, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/ab/internal/testing/TestingParameters$Debug;", "Lru/yandex/video/m3/ab/internal/testing/TestingParameters;", "vpuidHolder", "Lru/yandex/video/m3/ab/internal/VpuidHolder;", "sticknessHolder", "Lru/yandex/video/m3/ab/internal/SticknessHolder;", "(Lru/yandex/video/m3/ab/internal/VpuidHolder;Lru/yandex/video/m3/ab/internal/SticknessHolder;)V", "getSticknessHolder$video_player_internalRelease", "()Lru/yandex/video/m3/ab/internal/SticknessHolder;", "getVpuidHolder$video_player_internalRelease", "()Lru/yandex/video/m3/ab/internal/VpuidHolder;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Debug extends TestingParameters {
        public static final int $stable = 0;
        private final SticknessHolder sticknessHolder;
        private final VpuidHolder vpuidHolder;

        public Debug(VpuidHolder vpuidHolder, SticknessHolder sticknessHolder) {
            super(null);
            this.vpuidHolder = vpuidHolder;
            this.sticknessHolder = sticknessHolder;
        }

        /* renamed from: getSticknessHolder$video_player_internalRelease, reason: from getter */
        public final SticknessHolder getSticknessHolder() {
            return this.sticknessHolder;
        }

        /* renamed from: getVpuidHolder$video_player_internalRelease, reason: from getter */
        public final VpuidHolder getVpuidHolder() {
            return this.vpuidHolder;
        }
    }

    public /* synthetic */ TestingParameters(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ab/internal/testing/TestingParameters$Release;", "Lru/yandex/video/m3/ab/internal/testing/TestingParameters;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: ru.yandex.video.m3.ab.internal.testing.TestingParameters$Release, reason: from kotlin metadata */
    public static final class Companion extends TestingParameters {
        private Companion() {
            super(null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private TestingParameters() {
    }
}
