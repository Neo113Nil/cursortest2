package ru.yandex.video.m3.player.impl.load_control;

import defpackage.g8e;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/DynamicBufferDependNetworkQualityParams;", "", "bufferFactorGoodNetwork", "", "bandwidthFactor", "durationTimeInSeconds", "", "(FFI)V", "getBandwidthFactor", "()F", "getBufferFactorGoodNetwork", "getDurationTimeInSeconds", "()I", "equals", "", "other", "hashCode", "toString", "", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DynamicBufferDependNetworkQualityParams {
    public static final int $stable = 0;
    private final float bandwidthFactor;
    private final float bufferFactorGoodNetwork;
    private final int durationTimeInSeconds;

    private DynamicBufferDependNetworkQualityParams(float f, float f2, int i) {
        this.bufferFactorGoodNetwork = f;
        this.bandwidthFactor = f2;
        this.durationTimeInSeconds = i;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DynamicBufferDependNetworkQualityParams.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DynamicBufferDependNetworkQualityParams dynamicBufferDependNetworkQualityParams = (DynamicBufferDependNetworkQualityParams) other;
        return this.bufferFactorGoodNetwork == dynamicBufferDependNetworkQualityParams.bufferFactorGoodNetwork && this.bandwidthFactor == dynamicBufferDependNetworkQualityParams.bandwidthFactor && this.durationTimeInSeconds == dynamicBufferDependNetworkQualityParams.durationTimeInSeconds;
    }

    public final float getBandwidthFactor() {
        return this.bandwidthFactor;
    }

    public final float getBufferFactorGoodNetwork() {
        return this.bufferFactorGoodNetwork;
    }

    public final int getDurationTimeInSeconds() {
        return this.durationTimeInSeconds;
    }

    public int hashCode() {
        return g8e.c(this.bandwidthFactor, Float.hashCode(this.bufferFactorGoodNetwork) * 31, 31) + this.durationTimeInSeconds;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DynamicBufferDependNetworkQualityParams(bufferFactorGoodNetwork=");
        sb.append(this.bufferFactorGoodNetwork);
        sb.append(", bandwidthFactor=");
        sb.append(this.bandwidthFactor);
        sb.append(", durationTimeInSeconds=");
        return oyr.s(sb, this.durationTimeInSeconds, ')');
    }

    public /* synthetic */ DynamicBufferDependNetworkQualityParams(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, i);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010\u0017\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/DynamicBufferDependNetworkQualityParams$Builder;", "", "params", "Lru/yandex/video/m3/player/impl/load_control/DynamicBufferDependNetworkQualityParams;", "(Lru/yandex/video/m3/player/impl/load_control/DynamicBufferDependNetworkQualityParams;)V", "()V", "bandwidthFactor", "", "getBandwidthFactor", "()Ljava/lang/Float;", "setBandwidthFactor", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "bufferFactorGoodNetwork", "getBufferFactorGoodNetwork", "setBufferFactorGoodNetwork", "durationTimeInSecond", "", "getDurationTimeInSecond", "()Ljava/lang/Integer;", "setDurationTimeInSecond", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Float bandwidthFactor;
        private Float bufferFactorGoodNetwork;
        private Integer durationTimeInSecond;

        public Builder(DynamicBufferDependNetworkQualityParams dynamicBufferDependNetworkQualityParams) {
            this();
            this.bufferFactorGoodNetwork = Float.valueOf(dynamicBufferDependNetworkQualityParams.getBufferFactorGoodNetwork());
            this.bandwidthFactor = Float.valueOf(dynamicBufferDependNetworkQualityParams.getBandwidthFactor());
            this.durationTimeInSecond = Integer.valueOf(dynamicBufferDependNetworkQualityParams.getDurationTimeInSeconds());
        }

        public final DynamicBufferDependNetworkQualityParams build$video_player_internalRelease() {
            Float f = this.bufferFactorGoodNetwork;
            float floatValue = f != null ? f.floatValue() : 0.7f;
            Float f2 = this.bandwidthFactor;
            float floatValue2 = f2 != null ? f2.floatValue() : 1.6f;
            Integer num = this.durationTimeInSecond;
            return new DynamicBufferDependNetworkQualityParams(floatValue, floatValue2, num != null ? num.intValue() : 30, null);
        }

        public final Float getBandwidthFactor() {
            return this.bandwidthFactor;
        }

        public final Float getBufferFactorGoodNetwork() {
            return this.bufferFactorGoodNetwork;
        }

        public final Integer getDurationTimeInSecond() {
            return this.durationTimeInSecond;
        }

        public final void setBandwidthFactor(Float f) {
            this.bandwidthFactor = f;
        }

        public final void setBufferFactorGoodNetwork(Float f) {
            this.bufferFactorGoodNetwork = f;
        }

        public final void setDurationTimeInSecond(Integer num) {
            this.durationTimeInSecond = num;
        }

        public Builder() {
        }
    }
}
