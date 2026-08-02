package ru.yandex.video.m3.preload;

import androidx.media3.common.PriorityTaskManager;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.preload.PreloadPrioritySettings;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lru/yandex/video/m3/preload/PreloadPrioritySettings;", "", "Landroidx/media3/common/PriorityTaskManager;", "preloadPriorityTaskManager", "", "criticalBufferSizeMs", "minBufferSizeMsToWatchDifferenceBetweenBuffer", "differenceBetweenBufferSizeMs", "<init>", "(Landroidx/media3/common/PriorityTaskManager;JJJ)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/preload/PreloadPrioritySettings$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/preload/PreloadPrioritySettings;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/media3/common/PriorityTaskManager;", "getPreloadPriorityTaskManager", "()Landroidx/media3/common/PriorityTaskManager;", "J", "getCriticalBufferSizeMs", "()J", "getMinBufferSizeMsToWatchDifferenceBetweenBuffer", "getDifferenceBetweenBufferSizeMs", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadPrioritySettings {
    public static final int $stable = 8;
    private final long criticalBufferSizeMs;
    private final long differenceBetweenBufferSizeMs;
    private final long minBufferSizeMsToWatchDifferenceBetweenBuffer;
    private final PriorityTaskManager preloadPriorityTaskManager;

    private PreloadPrioritySettings(PriorityTaskManager priorityTaskManager, long j, long j2, long j3) {
        this.preloadPriorityTaskManager = priorityTaskManager;
        this.criticalBufferSizeMs = j;
        this.minBufferSizeMsToWatchDifferenceBetweenBuffer = j2;
        this.differenceBetweenBufferSizeMs = j3;
    }

    public static /* synthetic */ PreloadPrioritySettings copy$default(PreloadPrioritySettings preloadPrioritySettings, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.preload.PreloadPrioritySettings$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PreloadPrioritySettings.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PreloadPrioritySettings.Builder builder) {
                }
            };
        }
        return preloadPrioritySettings.copy(tlsVar);
    }

    public final PreloadPrioritySettings copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PreloadPrioritySettings.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        PreloadPrioritySettings preloadPrioritySettings = (PreloadPrioritySettings) other;
        return this.criticalBufferSizeMs == preloadPrioritySettings.criticalBufferSizeMs && this.minBufferSizeMsToWatchDifferenceBetweenBuffer == preloadPrioritySettings.minBufferSizeMsToWatchDifferenceBetweenBuffer && this.differenceBetweenBufferSizeMs == preloadPrioritySettings.differenceBetweenBufferSizeMs && jl40.l(this.preloadPriorityTaskManager, preloadPrioritySettings.preloadPriorityTaskManager);
    }

    public final long getCriticalBufferSizeMs() {
        return this.criticalBufferSizeMs;
    }

    public final long getDifferenceBetweenBufferSizeMs() {
        return this.differenceBetweenBufferSizeMs;
    }

    public final long getMinBufferSizeMsToWatchDifferenceBetweenBuffer() {
        return this.minBufferSizeMsToWatchDifferenceBetweenBuffer;
    }

    public final PriorityTaskManager getPreloadPriorityTaskManager() {
        return this.preloadPriorityTaskManager;
    }

    public int hashCode() {
        return this.preloadPriorityTaskManager.hashCode() + qv10.c(qv10.c(Long.hashCode(this.criticalBufferSizeMs) * 31, 31, this.minBufferSizeMsToWatchDifferenceBetweenBuffer), 31, this.differenceBetweenBufferSizeMs);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PreloadPrioritySettings(preloadPriorityTaskManager=");
        sb.append(this.preloadPriorityTaskManager);
        sb.append(", criticalBufferSizeMs=");
        sb.append(this.criticalBufferSizeMs);
        sb.append(", minBufferSizeMsToWatchDifferenceBetweenBuffer=");
        sb.append(this.minBufferSizeMsToWatchDifferenceBetweenBuffer);
        sb.append(", differenceBetweenBufferSizeMs=");
        return b64.o(sb, this.differenceBetweenBufferSizeMs, ')');
    }

    public /* synthetic */ PreloadPrioritySettings(PriorityTaskManager priorityTaskManager, long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(priorityTaskManager, j, j2, j3);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u0018\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0019R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0007¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/preload/PreloadPrioritySettings$Builder;", "", "preloadPrioritySettings", "Lru/yandex/video/m3/preload/PreloadPrioritySettings;", "(Lru/yandex/video/m3/preload/PreloadPrioritySettings;)V", "preloadPriorityTaskManager", "Landroidx/media3/common/PriorityTaskManager;", "(Landroidx/media3/common/PriorityTaskManager;)V", "criticalBufferSizeMs", "", "getCriticalBufferSizeMs", "()Ljava/lang/Long;", "setCriticalBufferSizeMs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "differenceBetweenBufferSizeMs", "getDifferenceBetweenBufferSizeMs", "setDifferenceBetweenBufferSizeMs", "minBufferSizeMsToWatchDifferenceBetweenBuffer", "getMinBufferSizeMsToWatchDifferenceBetweenBuffer", "setMinBufferSizeMsToWatchDifferenceBetweenBuffer", "getPreloadPriorityTaskManager", "()Landroidx/media3/common/PriorityTaskManager;", "setPreloadPriorityTaskManager", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Long criticalBufferSizeMs;
        private Long differenceBetweenBufferSizeMs;
        private Long minBufferSizeMsToWatchDifferenceBetweenBuffer;
        private PriorityTaskManager preloadPriorityTaskManager;

        public Builder(PreloadPrioritySettings preloadPrioritySettings) {
            this(preloadPrioritySettings.getPreloadPriorityTaskManager());
            this.criticalBufferSizeMs = Long.valueOf(preloadPrioritySettings.getCriticalBufferSizeMs());
            this.minBufferSizeMsToWatchDifferenceBetweenBuffer = Long.valueOf(preloadPrioritySettings.getMinBufferSizeMsToWatchDifferenceBetweenBuffer());
            this.differenceBetweenBufferSizeMs = Long.valueOf(preloadPrioritySettings.getDifferenceBetweenBufferSizeMs());
        }

        public final PreloadPrioritySettings build$video_player_internalRelease() {
            PriorityTaskManager priorityTaskManager = this.preloadPriorityTaskManager;
            Long l = this.criticalBufferSizeMs;
            long longValue = l != null ? l.longValue() : 3000L;
            Long l2 = this.minBufferSizeMsToWatchDifferenceBetweenBuffer;
            long longValue2 = l2 != null ? l2.longValue() : 6000L;
            Long l3 = this.differenceBetweenBufferSizeMs;
            return new PreloadPrioritySettings(priorityTaskManager, longValue, longValue2, l3 != null ? l3.longValue() : 1900L, null);
        }

        public final Long getCriticalBufferSizeMs() {
            return this.criticalBufferSizeMs;
        }

        public final Long getDifferenceBetweenBufferSizeMs() {
            return this.differenceBetweenBufferSizeMs;
        }

        public final Long getMinBufferSizeMsToWatchDifferenceBetweenBuffer() {
            return this.minBufferSizeMsToWatchDifferenceBetweenBuffer;
        }

        public final PriorityTaskManager getPreloadPriorityTaskManager() {
            return this.preloadPriorityTaskManager;
        }

        public final void setCriticalBufferSizeMs(Long l) {
            this.criticalBufferSizeMs = l;
        }

        public final void setDifferenceBetweenBufferSizeMs(Long l) {
            this.differenceBetweenBufferSizeMs = l;
        }

        public final void setMinBufferSizeMsToWatchDifferenceBetweenBuffer(Long l) {
            this.minBufferSizeMsToWatchDifferenceBetweenBuffer = l;
        }

        public final void setPreloadPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
            this.preloadPriorityTaskManager = priorityTaskManager;
        }

        public Builder(PriorityTaskManager priorityTaskManager) {
            this.preloadPriorityTaskManager = priorityTaskManager;
        }
    }
}
