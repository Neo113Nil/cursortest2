package ru.yandex.video.m3.player.impl.trackselection;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.impl.trackselection.AdaptiveTrackSelectionParameters;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "", "", "minDurationForQualityIncreaseMs", "maxDurationForQualityDecreaseMs", "minDurationToRetainAfterDiscardMs", "", "bandwidthFraction", "bufferedFractionToLiveEdgeForQualityIncrease", "<init>", "(IIIFF)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", CA20Status.STATUS_USER_I, "getMinDurationForQualityIncreaseMs", "()I", "getMaxDurationForQualityDecreaseMs", "getMinDurationToRetainAfterDiscardMs", "F", "getBandwidthFraction", "()F", "getBufferedFractionToLiveEdgeForQualityIncrease", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdaptiveTrackSelectionParameters {
    public static final int $stable = 0;
    private final float bandwidthFraction;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final int maxDurationForQualityDecreaseMs;
    private final int minDurationForQualityIncreaseMs;
    private final int minDurationToRetainAfterDiscardMs;

    private AdaptiveTrackSelectionParameters(int i, int i2, int i3, float f, float f2) {
        this.minDurationForQualityIncreaseMs = i;
        this.maxDurationForQualityDecreaseMs = i2;
        this.minDurationToRetainAfterDiscardMs = i3;
        this.bandwidthFraction = f;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f2;
    }

    public static /* synthetic */ AdaptiveTrackSelectionParameters copy$default(AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.impl.trackselection.AdaptiveTrackSelectionParameters$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AdaptiveTrackSelectionParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(AdaptiveTrackSelectionParameters.Builder builder) {
                }
            };
        }
        return adaptiveTrackSelectionParameters.copy(tlsVar);
    }

    public final AdaptiveTrackSelectionParameters copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public final float getBandwidthFraction() {
        return this.bandwidthFraction;
    }

    public final float getBufferedFractionToLiveEdgeForQualityIncrease() {
        return this.bufferedFractionToLiveEdgeForQualityIncrease;
    }

    public final int getMaxDurationForQualityDecreaseMs() {
        return this.maxDurationForQualityDecreaseMs;
    }

    public final int getMinDurationForQualityIncreaseMs() {
        return this.minDurationForQualityIncreaseMs;
    }

    public final int getMinDurationToRetainAfterDiscardMs() {
        return this.minDurationToRetainAfterDiscardMs;
    }

    public /* synthetic */ AdaptiveTrackSelectionParameters(int i, int i2, int i3, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, f, f2);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters$Builder;", "", "parameters", "Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;", "(Lru/yandex/video/m3/player/impl/trackselection/AdaptiveTrackSelectionParameters;)V", "()V", "bandwidthFraction", "", "getBandwidthFraction", "()Ljava/lang/Float;", "setBandwidthFraction", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "bufferedFractionToLiveEdgeForQualityIncrease", "getBufferedFractionToLiveEdgeForQualityIncrease", "setBufferedFractionToLiveEdgeForQualityIncrease", "maxDurationForQualityDecreaseMs", "", "getMaxDurationForQualityDecreaseMs", "()Ljava/lang/Integer;", "setMaxDurationForQualityDecreaseMs", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "minDurationForQualityIncreaseMs", "getMinDurationForQualityIncreaseMs", "setMinDurationForQualityIncreaseMs", "minDurationToRetainAfterDiscardMs", "getMinDurationToRetainAfterDiscardMs", "setMinDurationToRetainAfterDiscardMs", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Float bandwidthFraction;
        private Float bufferedFractionToLiveEdgeForQualityIncrease;
        private Integer maxDurationForQualityDecreaseMs;
        private Integer minDurationForQualityIncreaseMs;
        private Integer minDurationToRetainAfterDiscardMs;

        public Builder(AdaptiveTrackSelectionParameters adaptiveTrackSelectionParameters) {
            this();
            this.minDurationForQualityIncreaseMs = Integer.valueOf(adaptiveTrackSelectionParameters.getMinDurationForQualityIncreaseMs());
            this.maxDurationForQualityDecreaseMs = Integer.valueOf(adaptiveTrackSelectionParameters.getMaxDurationForQualityDecreaseMs());
            this.minDurationToRetainAfterDiscardMs = Integer.valueOf(adaptiveTrackSelectionParameters.getMinDurationToRetainAfterDiscardMs());
            this.bandwidthFraction = Float.valueOf(adaptiveTrackSelectionParameters.getBandwidthFraction());
            this.bufferedFractionToLiveEdgeForQualityIncrease = Float.valueOf(adaptiveTrackSelectionParameters.getBufferedFractionToLiveEdgeForQualityIncrease());
        }

        public final AdaptiveTrackSelectionParameters build$video_player_internalRelease() {
            Integer num = this.minDurationForQualityIncreaseMs;
            int intValue = num != null ? num.intValue() : 10000;
            Integer num2 = this.maxDurationForQualityDecreaseMs;
            int intValue2 = num2 != null ? num2.intValue() : 25000;
            Integer num3 = this.minDurationToRetainAfterDiscardMs;
            int intValue3 = num3 != null ? num3.intValue() : 25000;
            Float f = this.bandwidthFraction;
            float floatValue = f != null ? f.floatValue() : 0.7f;
            Float f2 = this.bufferedFractionToLiveEdgeForQualityIncrease;
            return new AdaptiveTrackSelectionParameters(intValue, intValue2, intValue3, floatValue, f2 != null ? f2.floatValue() : 0.75f, null);
        }

        public final Float getBandwidthFraction() {
            return this.bandwidthFraction;
        }

        public final Float getBufferedFractionToLiveEdgeForQualityIncrease() {
            return this.bufferedFractionToLiveEdgeForQualityIncrease;
        }

        public final Integer getMaxDurationForQualityDecreaseMs() {
            return this.maxDurationForQualityDecreaseMs;
        }

        public final Integer getMinDurationForQualityIncreaseMs() {
            return this.minDurationForQualityIncreaseMs;
        }

        public final Integer getMinDurationToRetainAfterDiscardMs() {
            return this.minDurationToRetainAfterDiscardMs;
        }

        public final void setBandwidthFraction(Float f) {
            this.bandwidthFraction = f;
        }

        public final void setBufferedFractionToLiveEdgeForQualityIncrease(Float f) {
            this.bufferedFractionToLiveEdgeForQualityIncrease = f;
        }

        public final void setMaxDurationForQualityDecreaseMs(Integer num) {
            this.maxDurationForQualityDecreaseMs = num;
        }

        public final void setMinDurationForQualityIncreaseMs(Integer num) {
            this.minDurationForQualityIncreaseMs = num;
        }

        public final void setMinDurationToRetainAfterDiscardMs(Integer num) {
            this.minDurationToRetainAfterDiscardMs = num;
        }

        public Builder() {
        }
    }
}
