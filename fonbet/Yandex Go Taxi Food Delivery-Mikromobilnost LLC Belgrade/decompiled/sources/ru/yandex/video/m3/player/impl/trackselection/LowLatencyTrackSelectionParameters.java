package ru.yandex.video.m3.player.impl.trackselection;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.impl.trackselection.LowLatencyTrackSelectionParameters;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0006\u0010\u0011¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectionParameters;", "", "", "shouldAllowInterruptingCurrentChunk", "", "qualityLevelsToDowngradeOnInterrupt", "isSwitchHistoryRuleEnabled", "<init>", "(ZIZ)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectionParameters$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectionParameters;", "Z", "getShouldAllowInterruptingCurrentChunk", "()Z", CA20Status.STATUS_USER_I, "getQualityLevelsToDowngradeOnInterrupt", "()I", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LowLatencyTrackSelectionParameters {
    public static final int $stable = 0;
    private final boolean isSwitchHistoryRuleEnabled;
    private final int qualityLevelsToDowngradeOnInterrupt;
    private final boolean shouldAllowInterruptingCurrentChunk;

    private LowLatencyTrackSelectionParameters(boolean z, int i, boolean z2) {
        this.shouldAllowInterruptingCurrentChunk = z;
        this.qualityLevelsToDowngradeOnInterrupt = i;
        this.isSwitchHistoryRuleEnabled = z2;
    }

    public static /* synthetic */ LowLatencyTrackSelectionParameters copy$default(LowLatencyTrackSelectionParameters lowLatencyTrackSelectionParameters, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.impl.trackselection.LowLatencyTrackSelectionParameters$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((LowLatencyTrackSelectionParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(LowLatencyTrackSelectionParameters.Builder builder) {
                }
            };
        }
        return lowLatencyTrackSelectionParameters.copy(tlsVar);
    }

    public final LowLatencyTrackSelectionParameters copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public final int getQualityLevelsToDowngradeOnInterrupt() {
        return this.qualityLevelsToDowngradeOnInterrupt;
    }

    public final boolean getShouldAllowInterruptingCurrentChunk() {
        return this.shouldAllowInterruptingCurrentChunk;
    }

    /* renamed from: isSwitchHistoryRuleEnabled, reason: from getter */
    public final boolean getIsSwitchHistoryRuleEnabled() {
        return this.isSwitchHistoryRuleEnabled;
    }

    public /* synthetic */ LowLatencyTrackSelectionParameters(boolean z, int i, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, z2);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010\u0016\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\n¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectionParameters$Builder;", "", "parameters", "Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectionParameters;", "(Lru/yandex/video/m3/player/impl/trackselection/LowLatencyTrackSelectionParameters;)V", "()V", "isSwitchHistoryRuleEnabled", "", "()Ljava/lang/Boolean;", "setSwitchHistoryRuleEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "qualityLevelsToDowngradeOnInterrupt", "", "getQualityLevelsToDowngradeOnInterrupt", "()Ljava/lang/Integer;", "setQualityLevelsToDowngradeOnInterrupt", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "shouldAllowInterruptingCurrentChunk", "getShouldAllowInterruptingCurrentChunk", "setShouldAllowInterruptingCurrentChunk", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Boolean isSwitchHistoryRuleEnabled;
        private Integer qualityLevelsToDowngradeOnInterrupt;
        private Boolean shouldAllowInterruptingCurrentChunk;

        public Builder(LowLatencyTrackSelectionParameters lowLatencyTrackSelectionParameters) {
            this();
            this.shouldAllowInterruptingCurrentChunk = Boolean.valueOf(lowLatencyTrackSelectionParameters.getShouldAllowInterruptingCurrentChunk());
            this.qualityLevelsToDowngradeOnInterrupt = Integer.valueOf(lowLatencyTrackSelectionParameters.getQualityLevelsToDowngradeOnInterrupt());
            this.isSwitchHistoryRuleEnabled = Boolean.valueOf(lowLatencyTrackSelectionParameters.getIsSwitchHistoryRuleEnabled());
        }

        public final LowLatencyTrackSelectionParameters build$video_player_internalRelease() {
            Boolean bool = this.shouldAllowInterruptingCurrentChunk;
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            Integer num = this.qualityLevelsToDowngradeOnInterrupt;
            int intValue = num != null ? num.intValue() : 4;
            Boolean bool2 = this.isSwitchHistoryRuleEnabled;
            return new LowLatencyTrackSelectionParameters(booleanValue, intValue, bool2 != null ? bool2.booleanValue() : true, null);
        }

        public final Integer getQualityLevelsToDowngradeOnInterrupt() {
            return this.qualityLevelsToDowngradeOnInterrupt;
        }

        public final Boolean getShouldAllowInterruptingCurrentChunk() {
            return this.shouldAllowInterruptingCurrentChunk;
        }

        /* renamed from: isSwitchHistoryRuleEnabled, reason: from getter */
        public final Boolean getIsSwitchHistoryRuleEnabled() {
            return this.isSwitchHistoryRuleEnabled;
        }

        public final void setQualityLevelsToDowngradeOnInterrupt(Integer num) {
            this.qualityLevelsToDowngradeOnInterrupt = num;
        }

        public final void setShouldAllowInterruptingCurrentChunk(Boolean bool) {
            this.shouldAllowInterruptingCurrentChunk = bool;
        }

        public final void setSwitchHistoryRuleEnabled(Boolean bool) {
            this.isSwitchHistoryRuleEnabled = bool;
        }

        public Builder() {
        }
    }
}
