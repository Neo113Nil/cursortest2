package ru.yandex.video.m3.player.parameters;

import defpackage.qv10;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.parameters.StuckStalledConfig;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0001#B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010 R\u001a\u0010\b\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", "", "", "minimumBufferForAlertMs", "alarmPeriodMs", "", "fatalOnlyIfShouldContinueLoadingIsFalse", "produceJustNonFatalErrors", "watchOnlySeekStalled", "<init>", "(JJZZZ)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/parameters/StuckStalledConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getMinimumBufferForAlertMs$video_player_internalRelease", "()J", "getAlarmPeriodMs$video_player_internalRelease", "Z", "getFatalOnlyIfShouldContinueLoadingIsFalse$video_player_internalRelease", "()Z", "getProduceJustNonFatalErrors$video_player_internalRelease", "getWatchOnlySeekStalled$video_player_internalRelease", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StuckStalledConfig {
    public static final int $stable = 0;
    private final long alarmPeriodMs;
    private final boolean fatalOnlyIfShouldContinueLoadingIsFalse;
    private final long minimumBufferForAlertMs;
    private final boolean produceJustNonFatalErrors;
    private final boolean watchOnlySeekStalled;

    private StuckStalledConfig(long j, long j2, boolean z, boolean z2, boolean z3) {
        this.minimumBufferForAlertMs = j;
        this.alarmPeriodMs = j2;
        this.fatalOnlyIfShouldContinueLoadingIsFalse = z;
        this.produceJustNonFatalErrors = z2;
        this.watchOnlySeekStalled = z3;
    }

    public static /* synthetic */ StuckStalledConfig copy$default(StuckStalledConfig stuckStalledConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.parameters.StuckStalledConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((StuckStalledConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(StuckStalledConfig.Builder builder) {
                }
            };
        }
        return stuckStalledConfig.copy(tlsVar);
    }

    public final StuckStalledConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!StuckStalledConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        StuckStalledConfig stuckStalledConfig = (StuckStalledConfig) other;
        return this.minimumBufferForAlertMs == stuckStalledConfig.minimumBufferForAlertMs && this.alarmPeriodMs == stuckStalledConfig.alarmPeriodMs && this.fatalOnlyIfShouldContinueLoadingIsFalse == stuckStalledConfig.fatalOnlyIfShouldContinueLoadingIsFalse && this.produceJustNonFatalErrors == stuckStalledConfig.produceJustNonFatalErrors && this.watchOnlySeekStalled == stuckStalledConfig.watchOnlySeekStalled;
    }

    /* renamed from: getAlarmPeriodMs$video_player_internalRelease, reason: from getter */
    public final long getAlarmPeriodMs() {
        return this.alarmPeriodMs;
    }

    /* renamed from: getFatalOnlyIfShouldContinueLoadingIsFalse$video_player_internalRelease, reason: from getter */
    public final boolean getFatalOnlyIfShouldContinueLoadingIsFalse() {
        return this.fatalOnlyIfShouldContinueLoadingIsFalse;
    }

    /* renamed from: getMinimumBufferForAlertMs$video_player_internalRelease, reason: from getter */
    public final long getMinimumBufferForAlertMs() {
        return this.minimumBufferForAlertMs;
    }

    /* renamed from: getProduceJustNonFatalErrors$video_player_internalRelease, reason: from getter */
    public final boolean getProduceJustNonFatalErrors() {
        return this.produceJustNonFatalErrors;
    }

    /* renamed from: getWatchOnlySeekStalled$video_player_internalRelease, reason: from getter */
    public final boolean getWatchOnlySeekStalled() {
        return this.watchOnlySeekStalled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.watchOnlySeekStalled) + unr0.e(unr0.e(qv10.c(Long.hashCode(this.minimumBufferForAlertMs) * 31, 31, this.alarmPeriodMs), 31, this.fatalOnlyIfShouldContinueLoadingIsFalse), 31, this.produceJustNonFatalErrors);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StuckStalledConfig(minimumBufferForAlertMs=");
        sb.append(this.minimumBufferForAlertMs);
        sb.append(", alarmPeriodMs=");
        sb.append(this.alarmPeriodMs);
        sb.append(", fatalOnlyIfShouldContinueLoadingIsFalse=");
        sb.append(this.fatalOnlyIfShouldContinueLoadingIsFalse);
        sb.append(", produceJustNonFatalErrors=");
        sb.append(this.produceJustNonFatalErrors);
        sb.append(", watchOnlySeekStalled=");
        return unr0.u(sb, this.watchOnlySeekStalled, ')');
    }

    public /* synthetic */ StuckStalledConfig(long j, long j2, boolean z, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, z, z2, z3);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B/\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\r\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0015R\u0014\u0010\u0007\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\n\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/parameters/StuckStalledConfig$Builder;", "", "stuckStalledConfig", "Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", "(Lru/yandex/video/m3/player/parameters/StuckStalledConfig;)V", "minimumBufferForAlertMs", "", "alarmPeriodMs", "fatalOnlyIfShouldContinueLoadingIsFalse", "", "produceJustNonFatalErrors", "watchOnlySeekStalled", "(JJZZZ)V", "getAlarmPeriodMs$video_player_internalRelease", "()J", "getFatalOnlyIfShouldContinueLoadingIsFalse$video_player_internalRelease", "()Z", "getMinimumBufferForAlertMs$video_player_internalRelease", "getProduceJustNonFatalErrors$video_player_internalRelease", "getWatchOnlySeekStalled$video_player_internalRelease", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 0;
        private final long alarmPeriodMs;
        private final boolean fatalOnlyIfShouldContinueLoadingIsFalse;
        private final long minimumBufferForAlertMs;
        private final boolean produceJustNonFatalErrors;
        private final boolean watchOnlySeekStalled;

        public Builder(StuckStalledConfig stuckStalledConfig) {
            this(stuckStalledConfig.getMinimumBufferForAlertMs(), stuckStalledConfig.getAlarmPeriodMs(), stuckStalledConfig.getFatalOnlyIfShouldContinueLoadingIsFalse(), stuckStalledConfig.getProduceJustNonFatalErrors(), stuckStalledConfig.getWatchOnlySeekStalled());
        }

        public final StuckStalledConfig build$video_player_internalRelease() {
            return new StuckStalledConfig(this.minimumBufferForAlertMs, this.alarmPeriodMs, this.fatalOnlyIfShouldContinueLoadingIsFalse, this.produceJustNonFatalErrors, this.watchOnlySeekStalled, null);
        }

        /* renamed from: getAlarmPeriodMs$video_player_internalRelease, reason: from getter */
        public final long getAlarmPeriodMs() {
            return this.alarmPeriodMs;
        }

        /* renamed from: getFatalOnlyIfShouldContinueLoadingIsFalse$video_player_internalRelease, reason: from getter */
        public final boolean getFatalOnlyIfShouldContinueLoadingIsFalse() {
            return this.fatalOnlyIfShouldContinueLoadingIsFalse;
        }

        /* renamed from: getMinimumBufferForAlertMs$video_player_internalRelease, reason: from getter */
        public final long getMinimumBufferForAlertMs() {
            return this.minimumBufferForAlertMs;
        }

        /* renamed from: getProduceJustNonFatalErrors$video_player_internalRelease, reason: from getter */
        public final boolean getProduceJustNonFatalErrors() {
            return this.produceJustNonFatalErrors;
        }

        /* renamed from: getWatchOnlySeekStalled$video_player_internalRelease, reason: from getter */
        public final boolean getWatchOnlySeekStalled() {
            return this.watchOnlySeekStalled;
        }

        public Builder(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.minimumBufferForAlertMs = j;
            this.alarmPeriodMs = j2;
            this.fatalOnlyIfShouldContinueLoadingIsFalse = z;
            this.produceJustNonFatalErrors = z2;
            this.watchOnlySeekStalled = z3;
        }
    }
}
