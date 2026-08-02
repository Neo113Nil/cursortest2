package ru.yandex.video.m3.player.impl.tracking;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.data.ExtendedStalledReason;
import ru.yandex.video.m3.player.impl.tracking.event.LoggingStalledReason;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BS\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\r\u0010\u001b\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u0016\u0010\u001d\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0016\u0010\u001e\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J`\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\t\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\n\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/StalledState;", "", CRLReasonCodeExtension.REASON, "Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;", "internalStalledDuration", "", "Lru/yandex/video/m3/data/Milliseconds;", "stalledId", "", "externalStalledDuration", "stalledDurationFromPlayWhenReadyTrue", "extendedStalledReason", "Lru/yandex/video/m3/data/ExtendedStalledReason;", "(Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;JILjava/lang/Long;Ljava/lang/Long;Lru/yandex/video/m3/data/ExtendedStalledReason;)V", "getExtendedStalledReason", "()Lru/yandex/video/m3/data/ExtendedStalledReason;", "getExternalStalledDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInternalStalledDuration", "()J", "getReason", "()Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;", "getStalledDurationFromPlayWhenReadyTrue", "getStalledId", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;JILjava/lang/Long;Ljava/lang/Long;Lru/yandex/video/m3/data/ExtendedStalledReason;)Lru/yandex/video/m3/player/impl/tracking/StalledState;", "equals", "", "other", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class StalledState {
    public static final int $stable = 0;
    private final ExtendedStalledReason extendedStalledReason;
    private final Long externalStalledDuration;
    private final long internalStalledDuration;
    private final LoggingStalledReason reason;
    private final Long stalledDurationFromPlayWhenReadyTrue;
    private final int stalledId;

    public /* synthetic */ StalledState(LoggingStalledReason loggingStalledReason, long j, int i, Long l, Long l2, ExtendedStalledReason extendedStalledReason, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(loggingStalledReason, j, i, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? null : l2, (i2 & 32) != 0 ? null : extendedStalledReason);
    }

    public static /* synthetic */ StalledState copy$default(StalledState stalledState, LoggingStalledReason loggingStalledReason, long j, int i, Long l, Long l2, ExtendedStalledReason extendedStalledReason, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            loggingStalledReason = stalledState.reason;
        }
        if ((i2 & 2) != 0) {
            j = stalledState.internalStalledDuration;
        }
        if ((i2 & 4) != 0) {
            i = stalledState.stalledId;
        }
        if ((i2 & 8) != 0) {
            l = stalledState.externalStalledDuration;
        }
        if ((i2 & 16) != 0) {
            l2 = stalledState.stalledDurationFromPlayWhenReadyTrue;
        }
        if ((i2 & 32) != 0) {
            extendedStalledReason = stalledState.extendedStalledReason;
        }
        return stalledState.copy(loggingStalledReason, j, i, l, l2, extendedStalledReason);
    }

    /* renamed from: component1, reason: from getter */
    public final LoggingStalledReason getReason() {
        return this.reason;
    }

    /* renamed from: component2, reason: from getter */
    public final long getInternalStalledDuration() {
        return this.internalStalledDuration;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStalledId() {
        return this.stalledId;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getExternalStalledDuration() {
        return this.externalStalledDuration;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getStalledDurationFromPlayWhenReadyTrue() {
        return this.stalledDurationFromPlayWhenReadyTrue;
    }

    /* renamed from: component6, reason: from getter */
    public final ExtendedStalledReason getExtendedStalledReason() {
        return this.extendedStalledReason;
    }

    public final StalledState copy(LoggingStalledReason reason, long internalStalledDuration, int stalledId, Long externalStalledDuration, Long stalledDurationFromPlayWhenReadyTrue, ExtendedStalledReason extendedStalledReason) {
        return new StalledState(reason, internalStalledDuration, stalledId, externalStalledDuration, stalledDurationFromPlayWhenReadyTrue, extendedStalledReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StalledState)) {
            return false;
        }
        StalledState stalledState = (StalledState) other;
        return this.reason == stalledState.reason && this.internalStalledDuration == stalledState.internalStalledDuration && this.stalledId == stalledState.stalledId && jl40.l(this.externalStalledDuration, stalledState.externalStalledDuration) && jl40.l(this.stalledDurationFromPlayWhenReadyTrue, stalledState.stalledDurationFromPlayWhenReadyTrue) && jl40.l(this.extendedStalledReason, stalledState.extendedStalledReason);
    }

    public final ExtendedStalledReason getExtendedStalledReason() {
        return this.extendedStalledReason;
    }

    public final Long getExternalStalledDuration() {
        return this.externalStalledDuration;
    }

    public final long getInternalStalledDuration() {
        return this.internalStalledDuration;
    }

    public final LoggingStalledReason getReason() {
        return this.reason;
    }

    public final Long getStalledDurationFromPlayWhenReadyTrue() {
        return this.stalledDurationFromPlayWhenReadyTrue;
    }

    public final int getStalledId() {
        return this.stalledId;
    }

    public int hashCode() {
        int b = oyr.b(this.stalledId, qv10.c(this.reason.hashCode() * 31, 31, this.internalStalledDuration), 31);
        Long l = this.externalStalledDuration;
        int hashCode = (b + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.stalledDurationFromPlayWhenReadyTrue;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        ExtendedStalledReason extendedStalledReason = this.extendedStalledReason;
        return hashCode2 + (extendedStalledReason != null ? extendedStalledReason.hashCode() : 0);
    }

    public String toString() {
        return "StalledState(reason=" + this.reason + ", internalStalledDuration=" + this.internalStalledDuration + ", stalledId=" + this.stalledId + ", externalStalledDuration=" + this.externalStalledDuration + ", stalledDurationFromPlayWhenReadyTrue=" + this.stalledDurationFromPlayWhenReadyTrue + ", extendedStalledReason=" + this.extendedStalledReason + ')';
    }

    public StalledState(LoggingStalledReason loggingStalledReason, long j, int i, Long l, Long l2, ExtendedStalledReason extendedStalledReason) {
        this.reason = loggingStalledReason;
        this.internalStalledDuration = j;
        this.stalledId = i;
        this.externalStalledDuration = l;
        this.stalledDurationFromPlayWhenReadyTrue = l2;
        this.extendedStalledReason = extendedStalledReason;
    }
}
