package ru.yandex.video.m3.model.config.delegate;

import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001$Ba\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u0006%"}, d2 = {"Lru/yandex/video/m3/model/config/delegate/SupplementalDelegateProperties;", "", "expDoNotRecreateWrapper", "", "releaseTimeoutMs", "", "enableDecoderFallback", "experimental_enableSurfaceControl", "eventLoggerEnabled", "shouldHandleZeroStartPositionAsDefault", "allowDisabledTrackVariant", "monitorFrameDrops", "allowDisabledAudioTrackVariant", "allowPendingAudioTrackDisabling", "experimentalAllowPreloadWithoutInitCodecs", "(ZLjava/lang/Long;ZZZZZZZZZ)V", "getAllowDisabledAudioTrackVariant", "()Z", "getAllowDisabledTrackVariant", "getAllowPendingAudioTrackDisabling", "getEnableDecoderFallback", "getEventLoggerEnabled", "getExpDoNotRecreateWrapper", "getExperimentalAllowPreloadWithoutInitCodecs", "getExperimental_enableSurfaceControl", "getMonitorFrameDrops", "getReleaseTimeoutMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getShouldHandleZeroStartPositionAsDefault", "equals", "other", "hashCode", "", "toString", "", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SupplementalDelegateProperties {
    public static final int $stable = 0;
    private final boolean allowDisabledAudioTrackVariant;
    private final boolean allowDisabledTrackVariant;
    private final boolean allowPendingAudioTrackDisabling;
    private final boolean enableDecoderFallback;
    private final boolean eventLoggerEnabled;
    private final boolean expDoNotRecreateWrapper;
    private final boolean experimentalAllowPreloadWithoutInitCodecs;
    private final boolean experimental_enableSurfaceControl;
    private final boolean monitorFrameDrops;
    private final Long releaseTimeoutMs;
    private final boolean shouldHandleZeroStartPositionAsDefault;

    private SupplementalDelegateProperties(boolean z, Long l, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.expDoNotRecreateWrapper = z;
        this.releaseTimeoutMs = l;
        this.enableDecoderFallback = z2;
        this.experimental_enableSurfaceControl = z3;
        this.eventLoggerEnabled = z4;
        this.shouldHandleZeroStartPositionAsDefault = z5;
        this.allowDisabledTrackVariant = z6;
        this.monitorFrameDrops = z7;
        this.allowDisabledAudioTrackVariant = z8;
        this.allowPendingAudioTrackDisabling = z9;
        this.experimentalAllowPreloadWithoutInitCodecs = z10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!SupplementalDelegateProperties.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        SupplementalDelegateProperties supplementalDelegateProperties = (SupplementalDelegateProperties) other;
        return jl40.l(this.releaseTimeoutMs, supplementalDelegateProperties.releaseTimeoutMs) && this.expDoNotRecreateWrapper == supplementalDelegateProperties.expDoNotRecreateWrapper && this.enableDecoderFallback == supplementalDelegateProperties.enableDecoderFallback && this.experimental_enableSurfaceControl == supplementalDelegateProperties.experimental_enableSurfaceControl && this.eventLoggerEnabled == supplementalDelegateProperties.eventLoggerEnabled && this.shouldHandleZeroStartPositionAsDefault == supplementalDelegateProperties.shouldHandleZeroStartPositionAsDefault && this.allowDisabledTrackVariant == supplementalDelegateProperties.allowDisabledTrackVariant && this.monitorFrameDrops == supplementalDelegateProperties.monitorFrameDrops && this.allowDisabledAudioTrackVariant == supplementalDelegateProperties.allowDisabledAudioTrackVariant && this.allowPendingAudioTrackDisabling == supplementalDelegateProperties.allowPendingAudioTrackDisabling && this.experimentalAllowPreloadWithoutInitCodecs == supplementalDelegateProperties.experimentalAllowPreloadWithoutInitCodecs;
    }

    public final boolean getAllowDisabledAudioTrackVariant() {
        return this.allowDisabledAudioTrackVariant;
    }

    public final boolean getAllowDisabledTrackVariant() {
        return this.allowDisabledTrackVariant;
    }

    public final boolean getAllowPendingAudioTrackDisabling() {
        return this.allowPendingAudioTrackDisabling;
    }

    public final boolean getEnableDecoderFallback() {
        return this.enableDecoderFallback;
    }

    public final boolean getEventLoggerEnabled() {
        return this.eventLoggerEnabled;
    }

    public final boolean getExpDoNotRecreateWrapper() {
        return this.expDoNotRecreateWrapper;
    }

    public final boolean getExperimentalAllowPreloadWithoutInitCodecs() {
        return this.experimentalAllowPreloadWithoutInitCodecs;
    }

    public final boolean getExperimental_enableSurfaceControl() {
        return this.experimental_enableSurfaceControl;
    }

    public final boolean getMonitorFrameDrops() {
        return this.monitorFrameDrops;
    }

    public final Long getReleaseTimeoutMs() {
        return this.releaseTimeoutMs;
    }

    public final boolean getShouldHandleZeroStartPositionAsDefault() {
        return this.shouldHandleZeroStartPositionAsDefault;
    }

    public int hashCode() {
        Long l = this.releaseTimeoutMs;
        return Boolean.hashCode(this.experimentalAllowPreloadWithoutInitCodecs) + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e((l != null ? l.hashCode() : 0) * 31, 31, this.expDoNotRecreateWrapper), 31, this.enableDecoderFallback), 31, this.experimental_enableSurfaceControl), 31, this.eventLoggerEnabled), 31, this.shouldHandleZeroStartPositionAsDefault), 31, this.allowDisabledTrackVariant), 31, this.monitorFrameDrops), 31, this.allowDisabledAudioTrackVariant), 31, this.allowPendingAudioTrackDisabling);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SupplementalDelegateProperties(releaseTimeoutMs=");
        sb.append(this.releaseTimeoutMs);
        sb.append(", expDoNotRecreateWrapper=");
        sb.append(this.expDoNotRecreateWrapper);
        sb.append(", enableDecoderFallback=");
        sb.append(this.enableDecoderFallback);
        sb.append(", experimental_enableSurfaceControl=");
        sb.append(this.experimental_enableSurfaceControl);
        sb.append(", eventLoggerEnabled=");
        sb.append(this.eventLoggerEnabled);
        sb.append(", shouldHandleZeroStartPositionAsDefault=");
        sb.append(this.shouldHandleZeroStartPositionAsDefault);
        sb.append(", allowDisabledTrackVariant=");
        sb.append(this.allowDisabledTrackVariant);
        sb.append(", monitorFrameDrops=");
        sb.append(this.monitorFrameDrops);
        sb.append(", allowDisabledAudioTrackVariant=");
        sb.append(this.allowDisabledAudioTrackVariant);
        sb.append(", allowPendingAudioTrackDisabling=");
        sb.append(this.allowPendingAudioTrackDisabling);
        sb.append(", experimentalAllowPreloadWithoutInitCodecs=");
        return unr0.u(sb, this.experimentalAllowPreloadWithoutInitCodecs, ')');
    }

    public /* synthetic */ SupplementalDelegateProperties(boolean z, Long l, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, l, z2, z3, z4, z5, z6, z7, z8, z9, z10);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010/\u001a\u00020\u0003H\u0000¢\u0006\u0002\b0R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u000bR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR\u001e\u0010\"\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b#\u0010\t\"\u0004\b$\u0010\u000bR\u001e\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010,\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010\u000b¨\u00061"}, d2 = {"Lru/yandex/video/m3/model/config/delegate/SupplementalDelegateProperties$Builder;", "", "properties", "Lru/yandex/video/m3/model/config/delegate/SupplementalDelegateProperties;", "(Lru/yandex/video/m3/model/config/delegate/SupplementalDelegateProperties;)V", "()V", "allowDisabledAudioTrackVariant", "", "getAllowDisabledAudioTrackVariant", "()Ljava/lang/Boolean;", "setAllowDisabledAudioTrackVariant", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "allowDisabledTrackVariant", "getAllowDisabledTrackVariant", "setAllowDisabledTrackVariant", "allowPendingAudioTrackDisabling", "getAllowPendingAudioTrackDisabling", "setAllowPendingAudioTrackDisabling", "enableDecoderFallback", "getEnableDecoderFallback", "setEnableDecoderFallback", "eventLoggerEnabled", "getEventLoggerEnabled", "setEventLoggerEnabled", "expDoNotRecreateWrapper", "getExpDoNotRecreateWrapper", "setExpDoNotRecreateWrapper", "experimentalAllowPreloadWithoutInitCodecs", "getExperimentalAllowPreloadWithoutInitCodecs", "setExperimentalAllowPreloadWithoutInitCodecs", "experimental_enableSurfaceControl", "getExperimental_enableSurfaceControl", "setExperimental_enableSurfaceControl", "monitorFrameDrops", "getMonitorFrameDrops", "setMonitorFrameDrops", "releaseTimeoutMs", "", "getReleaseTimeoutMs", "()Ljava/lang/Long;", "setReleaseTimeoutMs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "shouldHandleZeroStartPositionAsDefault", "getShouldHandleZeroStartPositionAsDefault", "setShouldHandleZeroStartPositionAsDefault", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Boolean allowDisabledAudioTrackVariant;
        private Boolean allowDisabledTrackVariant;
        private Boolean allowPendingAudioTrackDisabling;
        private Boolean enableDecoderFallback;
        private Boolean eventLoggerEnabled;
        private Boolean expDoNotRecreateWrapper;
        private Boolean experimentalAllowPreloadWithoutInitCodecs;
        private Boolean experimental_enableSurfaceControl;
        private Boolean monitorFrameDrops;
        private Long releaseTimeoutMs;
        private Boolean shouldHandleZeroStartPositionAsDefault;

        public Builder(SupplementalDelegateProperties supplementalDelegateProperties) {
            this();
            this.expDoNotRecreateWrapper = Boolean.valueOf(supplementalDelegateProperties.getExpDoNotRecreateWrapper());
            this.releaseTimeoutMs = supplementalDelegateProperties.getReleaseTimeoutMs();
            this.enableDecoderFallback = Boolean.valueOf(supplementalDelegateProperties.getEnableDecoderFallback());
            this.experimental_enableSurfaceControl = Boolean.valueOf(supplementalDelegateProperties.getExperimental_enableSurfaceControl());
            this.eventLoggerEnabled = Boolean.valueOf(supplementalDelegateProperties.getEventLoggerEnabled());
            this.shouldHandleZeroStartPositionAsDefault = Boolean.valueOf(supplementalDelegateProperties.getShouldHandleZeroStartPositionAsDefault());
            this.allowDisabledTrackVariant = Boolean.valueOf(supplementalDelegateProperties.getAllowDisabledTrackVariant());
            this.monitorFrameDrops = Boolean.valueOf(supplementalDelegateProperties.getMonitorFrameDrops());
            this.allowDisabledAudioTrackVariant = Boolean.valueOf(supplementalDelegateProperties.getAllowDisabledAudioTrackVariant());
            this.allowPendingAudioTrackDisabling = Boolean.valueOf(supplementalDelegateProperties.getAllowPendingAudioTrackDisabling());
            this.experimentalAllowPreloadWithoutInitCodecs = Boolean.valueOf(supplementalDelegateProperties.getExperimentalAllowPreloadWithoutInitCodecs());
        }

        public final SupplementalDelegateProperties build$video_player_internalRelease() {
            boolean z;
            boolean z2;
            Boolean bool = this.expDoNotRecreateWrapper;
            if (bool != null) {
                z = bool.booleanValue();
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            Long l = this.releaseTimeoutMs;
            Boolean bool2 = this.enableDecoderFallback;
            boolean booleanValue = bool2 != null ? bool2.booleanValue() : z2;
            Boolean bool3 = this.experimental_enableSurfaceControl;
            boolean booleanValue2 = bool3 != null ? bool3.booleanValue() : z2;
            Boolean bool4 = this.eventLoggerEnabled;
            boolean booleanValue3 = bool4 != null ? bool4.booleanValue() : z2;
            Boolean bool5 = this.shouldHandleZeroStartPositionAsDefault;
            boolean booleanValue4 = bool5 != null ? bool5.booleanValue() : true;
            Boolean bool6 = this.allowDisabledTrackVariant;
            boolean booleanValue5 = bool6 != null ? bool6.booleanValue() : z2;
            Boolean bool7 = this.monitorFrameDrops;
            boolean booleanValue6 = bool7 != null ? bool7.booleanValue() : z2;
            Boolean bool8 = this.allowDisabledAudioTrackVariant;
            boolean booleanValue7 = bool8 != null ? bool8.booleanValue() : z2;
            Boolean bool9 = this.allowPendingAudioTrackDisabling;
            boolean booleanValue8 = bool9 != null ? bool9.booleanValue() : z2;
            Boolean bool10 = this.experimentalAllowPreloadWithoutInitCodecs;
            return new SupplementalDelegateProperties(z, l, booleanValue, booleanValue2, booleanValue3, booleanValue4, booleanValue5, booleanValue6, booleanValue7, booleanValue8, bool10 != null ? bool10.booleanValue() : z2, null);
        }

        public final Boolean getAllowDisabledAudioTrackVariant() {
            return this.allowDisabledAudioTrackVariant;
        }

        public final Boolean getAllowDisabledTrackVariant() {
            return this.allowDisabledTrackVariant;
        }

        public final Boolean getAllowPendingAudioTrackDisabling() {
            return this.allowPendingAudioTrackDisabling;
        }

        public final Boolean getEnableDecoderFallback() {
            return this.enableDecoderFallback;
        }

        public final Boolean getEventLoggerEnabled() {
            return this.eventLoggerEnabled;
        }

        public final Boolean getExpDoNotRecreateWrapper() {
            return this.expDoNotRecreateWrapper;
        }

        public final Boolean getExperimentalAllowPreloadWithoutInitCodecs() {
            return this.experimentalAllowPreloadWithoutInitCodecs;
        }

        public final Boolean getExperimental_enableSurfaceControl() {
            return this.experimental_enableSurfaceControl;
        }

        public final Boolean getMonitorFrameDrops() {
            return this.monitorFrameDrops;
        }

        public final Long getReleaseTimeoutMs() {
            return this.releaseTimeoutMs;
        }

        public final Boolean getShouldHandleZeroStartPositionAsDefault() {
            return this.shouldHandleZeroStartPositionAsDefault;
        }

        public final void setAllowDisabledAudioTrackVariant(Boolean bool) {
            this.allowDisabledAudioTrackVariant = bool;
        }

        public final void setAllowDisabledTrackVariant(Boolean bool) {
            this.allowDisabledTrackVariant = bool;
        }

        public final void setAllowPendingAudioTrackDisabling(Boolean bool) {
            this.allowPendingAudioTrackDisabling = bool;
        }

        public final void setEnableDecoderFallback(Boolean bool) {
            this.enableDecoderFallback = bool;
        }

        public final void setEventLoggerEnabled(Boolean bool) {
            this.eventLoggerEnabled = bool;
        }

        public final void setExpDoNotRecreateWrapper(Boolean bool) {
            this.expDoNotRecreateWrapper = bool;
        }

        public final void setExperimentalAllowPreloadWithoutInitCodecs(Boolean bool) {
            this.experimentalAllowPreloadWithoutInitCodecs = bool;
        }

        public final void setExperimental_enableSurfaceControl(Boolean bool) {
            this.experimental_enableSurfaceControl = bool;
        }

        public final void setMonitorFrameDrops(Boolean bool) {
            this.monitorFrameDrops = bool;
        }

        public final void setReleaseTimeoutMs(Long l) {
            this.releaseTimeoutMs = l;
        }

        public final void setShouldHandleZeroStartPositionAsDefault(Boolean bool) {
            this.shouldHandleZeroStartPositionAsDefault = bool;
        }

        public Builder() {
        }
    }
}
