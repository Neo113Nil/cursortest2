package ru.yandex.video.m3.player.bandwidth;

import defpackage.u3n;
import defpackage.v3n;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/player/bandwidth/DurationMeasurerImpl;", "Lu3n;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", RemoteBioParameters.TIME, "<init>", "(Lru/yandex/video/m3/player/impl/utils/TimeProvider;)V", "", "getDurationMs", "()D", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "", "startMs", "J", "Factory", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DurationMeasurerImpl implements u3n {
    public static final int $stable = 8;
    private final long startMs;
    private final TimeProvider time;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/bandwidth/DurationMeasurerImpl$Factory;", "Lv3n;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", RemoteBioParameters.TIME, "<init>", "(Lru/yandex/video/m3/player/impl/utils/TimeProvider;)V", "Lru/yandex/video/m3/player/bandwidth/DurationMeasurerImpl;", "create", "()Lru/yandex/video/m3/player/bandwidth/DurationMeasurerImpl;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Factory implements v3n {
        public static final int $stable = 8;
        private final TimeProvider time;

        public Factory(TimeProvider timeProvider) {
            this.time = timeProvider;
        }

        @Override // defpackage.v3n
        public DurationMeasurerImpl create() {
            return new DurationMeasurerImpl(this.time);
        }
    }

    public DurationMeasurerImpl(TimeProvider timeProvider) {
        this.time = timeProvider;
        this.startMs = timeProvider.elapsedRealtime();
    }

    @Override // defpackage.u3n
    public double getDurationMs() {
        return this.time.elapsedRealtime() - this.startMs;
    }
}
