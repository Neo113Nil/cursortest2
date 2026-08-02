package ru.yandex.video.m3.model.config.mediasource;

import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.g8e;
import defpackage.n;
import defpackage.qv10;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.model.config.mediasource.LivePlaybackConfig;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001'B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u0003\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010%¨\u0006("}, d2 = {"Lru/yandex/video/m3/model/config/mediasource/LivePlaybackConfig;", "", "", "isLowLatency", "", "targetOffsetMs", "minTargetOffsetMs", "maxTargetOffsetMs", "", "minPlaybackSpeed", "maxPlaybackSpeed", "<init>", "(ZJJJFF)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/model/config/mediasource/LivePlaybackConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/model/config/mediasource/LivePlaybackConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "()Z", "J", "getTargetOffsetMs", "()J", "getMinTargetOffsetMs", "getMaxTargetOffsetMs", "F", "getMinPlaybackSpeed", "()F", "getMaxPlaybackSpeed", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LivePlaybackConfig {
    public static final int $stable = 0;
    private final boolean isLowLatency;
    private final float maxPlaybackSpeed;
    private final long maxTargetOffsetMs;
    private final float minPlaybackSpeed;
    private final long minTargetOffsetMs;
    private final long targetOffsetMs;

    private LivePlaybackConfig(boolean z, long j, long j2, long j3, float f, float f2) {
        this.isLowLatency = z;
        this.targetOffsetMs = j;
        this.minTargetOffsetMs = j2;
        this.maxTargetOffsetMs = j3;
        this.minPlaybackSpeed = f;
        this.maxPlaybackSpeed = f2;
    }

    public static /* synthetic */ LivePlaybackConfig copy$default(LivePlaybackConfig livePlaybackConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.model.config.mediasource.LivePlaybackConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((LivePlaybackConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(LivePlaybackConfig.Builder builder) {
                }
            };
        }
        return livePlaybackConfig.copy(tlsVar);
    }

    public final LivePlaybackConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!LivePlaybackConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        LivePlaybackConfig livePlaybackConfig = (LivePlaybackConfig) other;
        return this.isLowLatency == livePlaybackConfig.isLowLatency && this.targetOffsetMs == livePlaybackConfig.targetOffsetMs && this.minTargetOffsetMs == livePlaybackConfig.minTargetOffsetMs && this.maxTargetOffsetMs == livePlaybackConfig.maxTargetOffsetMs && this.minPlaybackSpeed == livePlaybackConfig.minPlaybackSpeed && this.maxPlaybackSpeed == livePlaybackConfig.maxPlaybackSpeed;
    }

    public final float getMaxPlaybackSpeed() {
        return this.maxPlaybackSpeed;
    }

    public final long getMaxTargetOffsetMs() {
        return this.maxTargetOffsetMs;
    }

    public final float getMinPlaybackSpeed() {
        return this.minPlaybackSpeed;
    }

    public final long getMinTargetOffsetMs() {
        return this.minTargetOffsetMs;
    }

    public final long getTargetOffsetMs() {
        return this.targetOffsetMs;
    }

    public int hashCode() {
        return Float.hashCode(this.maxPlaybackSpeed) + g8e.c(this.minPlaybackSpeed, qv10.c(qv10.c(qv10.c(Boolean.hashCode(this.isLowLatency) * 31, 31, this.targetOffsetMs), 31, this.minTargetOffsetMs), 31, this.maxTargetOffsetMs), 31);
    }

    /* renamed from: isLowLatency, reason: from getter */
    public final boolean getIsLowLatency() {
        return this.isLowLatency;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LivePlaybackConfig(isLowLatency=");
        sb.append(this.isLowLatency);
        sb.append(", targetOffsetMs=");
        sb.append(this.targetOffsetMs);
        sb.append(", minTargetOffsetMs=");
        sb.append(this.minTargetOffsetMs);
        sb.append(", maxTargetOffsetMs=");
        sb.append(this.maxTargetOffsetMs);
        sb.append(", minPlaybackSpeed=");
        sb.append(this.minPlaybackSpeed);
        sb.append(", maxPlaybackSpeed=");
        return n.n(sb, this.maxPlaybackSpeed, ')');
    }

    public /* synthetic */ LivePlaybackConfig(boolean z, long j, long j2, long j3, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j, j2, j3, f, f2);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010#\u001a\u00020\u0003H\u0000¢\u0006\u0002\b$R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\u001e\u0010 \u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018¨\u0006%"}, d2 = {"Lru/yandex/video/m3/model/config/mediasource/LivePlaybackConfig$Builder;", "", "livePlaybackConfig", "Lru/yandex/video/m3/model/config/mediasource/LivePlaybackConfig;", "(Lru/yandex/video/m3/model/config/mediasource/LivePlaybackConfig;)V", "()V", "isLowLatency", "", "()Ljava/lang/Boolean;", "setLowLatency", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "maxPlaybackSpeed", "", "getMaxPlaybackSpeed", "()Ljava/lang/Float;", "setMaxPlaybackSpeed", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "maxTargetOffsetMs", "", "getMaxTargetOffsetMs", "()Ljava/lang/Long;", "setMaxTargetOffsetMs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "minPlaybackSpeed", "getMinPlaybackSpeed", "setMinPlaybackSpeed", "minTargetOffsetMs", "getMinTargetOffsetMs", "setMinTargetOffsetMs", "targetOffsetMs", "getTargetOffsetMs", "setTargetOffsetMs", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Boolean isLowLatency;
        private Float maxPlaybackSpeed;
        private Long maxTargetOffsetMs;
        private Float minPlaybackSpeed;
        private Long minTargetOffsetMs;
        private Long targetOffsetMs;

        public Builder(LivePlaybackConfig livePlaybackConfig) {
            this();
            this.isLowLatency = Boolean.valueOf(livePlaybackConfig.getIsLowLatency());
            this.targetOffsetMs = Long.valueOf(livePlaybackConfig.getTargetOffsetMs());
            this.minTargetOffsetMs = Long.valueOf(livePlaybackConfig.getMinTargetOffsetMs());
            this.maxTargetOffsetMs = Long.valueOf(livePlaybackConfig.getMaxTargetOffsetMs());
            this.minPlaybackSpeed = Float.valueOf(livePlaybackConfig.getMinPlaybackSpeed());
            this.maxPlaybackSpeed = Float.valueOf(livePlaybackConfig.getMaxPlaybackSpeed());
        }

        public final LivePlaybackConfig build$video_player_internalRelease() {
            Boolean bool = this.isLowLatency;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Long l = this.targetOffsetMs;
            long longValue = l != null ? l.longValue() : booleanValue ? 7000L : 25000L;
            Long l2 = this.minTargetOffsetMs;
            long longValue2 = l2 != null ? l2.longValue() : booleanValue ? 6000L : DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
            Long l3 = this.maxTargetOffsetMs;
            long longValue3 = l3 != null ? l3.longValue() : booleanValue ? 8000L : 30000L;
            Float f = this.minPlaybackSpeed;
            float f2 = 1.0f;
            float floatValue = f != null ? f.floatValue() : booleanValue ? 0.97f : 1.0f;
            Float f3 = this.maxPlaybackSpeed;
            if (f3 != null) {
                f2 = f3.floatValue();
            } else if (booleanValue) {
                f2 = 1.03f;
            }
            return new LivePlaybackConfig(booleanValue, longValue, longValue2, longValue3, floatValue, f2, null);
        }

        public final Float getMaxPlaybackSpeed() {
            return this.maxPlaybackSpeed;
        }

        public final Long getMaxTargetOffsetMs() {
            return this.maxTargetOffsetMs;
        }

        public final Float getMinPlaybackSpeed() {
            return this.minPlaybackSpeed;
        }

        public final Long getMinTargetOffsetMs() {
            return this.minTargetOffsetMs;
        }

        public final Long getTargetOffsetMs() {
            return this.targetOffsetMs;
        }

        /* renamed from: isLowLatency, reason: from getter */
        public final Boolean getIsLowLatency() {
            return this.isLowLatency;
        }

        public final void setLowLatency(Boolean bool) {
            this.isLowLatency = bool;
        }

        public final void setMaxPlaybackSpeed(Float f) {
            this.maxPlaybackSpeed = f;
        }

        public final void setMaxTargetOffsetMs(Long l) {
            this.maxTargetOffsetMs = l;
        }

        public final void setMinPlaybackSpeed(Float f) {
            this.minPlaybackSpeed = f;
        }

        public final void setMinTargetOffsetMs(Long l) {
            this.minTargetOffsetMs = l;
        }

        public final void setTargetOffsetMs(Long l) {
            this.targetOffsetMs = l;
        }

        public Builder() {
        }
    }
}
