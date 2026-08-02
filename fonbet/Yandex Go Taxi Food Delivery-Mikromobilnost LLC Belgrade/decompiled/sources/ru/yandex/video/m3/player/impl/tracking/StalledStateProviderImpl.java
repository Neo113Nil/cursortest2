package ru.yandex.video.m3.player.impl.tracking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.ExtendedStalledReason;
import ru.yandex.video.m3.player.impl.tracking.event.LoggingStalledReason;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/StalledStateProviderImpl;", "Lru/yandex/video/m3/player/impl/tracking/StalledStateProvider;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "Lru/yandex/video/m3/player/impl/tracking/ExtraStalledInfoProvider;", "extraStalledInfoProvider", "<init>", "(Lru/yandex/video/m3/player/impl/utils/TimeProvider;Lru/yandex/video/m3/player/impl/tracking/ExtraStalledInfoProvider;)V", "Lru/yandex/video/m3/data/ExtendedStalledReason;", "extendedStalledReason", "Lzy11;", "setExtendedStalledReason", "(Lru/yandex/video/m3/data/ExtendedStalledReason;)V", "Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;", "stalledReason", "", "Lru/yandex/video/m3/player/impl/tracking/StalledState;", "beginStalledPeriods", "(Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;)Ljava/util/List;", "endStalledPeriod", "()Lru/yandex/video/m3/player/impl/tracking/StalledState;", "", "playWhenReady", "setPlayWhenReady", "(Z)V", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "Lru/yandex/video/m3/player/impl/tracking/ExtraStalledInfoProvider;", "Lru/yandex/video/m3/player/impl/tracking/event/LoggingStalledReason;", "", "stalledBeginTime", "J", "", "stalledId", CA20Status.STATUS_USER_I, "playWhenReadyTrueTime", "Z", "lastExtendedStalledReason", "Lru/yandex/video/m3/data/ExtendedStalledReason;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StalledStateProviderImpl implements StalledStateProvider {
    private static final long TIME_UNSET = -1;
    private final ExtraStalledInfoProvider extraStalledInfoProvider;
    private ExtendedStalledReason lastExtendedStalledReason;
    private boolean playWhenReady;
    private long stalledBeginTime;
    private LoggingStalledReason stalledReason;
    private final TimeProvider timeProvider;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private int stalledId = 1;
    private long playWhenReadyTrueTime = -1;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoggingStalledReason.values().length];
            try {
                iArr[LoggingStalledReason.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoggingStalledReason.SET_SOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StalledStateProviderImpl(TimeProvider timeProvider, ExtraStalledInfoProvider extraStalledInfoProvider) {
        this.timeProvider = timeProvider;
        this.extraStalledInfoProvider = extraStalledInfoProvider;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.StalledStateProvider
    public synchronized List<StalledState> beginStalledPeriods(LoggingStalledReason stalledReason) {
        Long[] lArr;
        ArrayList arrayList;
        Long[] lArr2;
        LoggingStalledReason loggingStalledReason = stalledReason;
        try {
            this.stalledReason = loggingStalledReason;
            this.stalledBeginTime = this.timeProvider.elapsedRealtime();
            int i = WhenMappings.$EnumSwitchMapping$0[loggingStalledReason.ordinal()];
            if (i == 1 || i == 2) {
                lArr = StalledStateProviderImplKt.STALE_DELAYS;
                arrayList = new ArrayList(lArr.length);
                for (Long l : lArr) {
                    long longValue = l.longValue();
                    arrayList.add(longValue == 0 ? new StalledState(stalledReason, TimeUnit.SECONDS.toMillis(longValue), this.stalledId, this.extraStalledInfoProvider.getExternalStalledDuration(), null, this.lastExtendedStalledReason, 16, null) : new StalledState(stalledReason, TimeUnit.SECONDS.toMillis(longValue), this.stalledId, null, null, this.lastExtendedStalledReason, 24, null));
                }
            } else {
                lArr2 = StalledStateProviderImplKt.STALE_DELAYS;
                arrayList = new ArrayList(lArr2.length);
                int length = lArr2.length;
                int i2 = 0;
                while (i2 < length) {
                    arrayList.add(new StalledState(loggingStalledReason, TimeUnit.SECONDS.toMillis(lArr2[i2].longValue()), this.stalledId, null, null, this.lastExtendedStalledReason, 24, null));
                    i2++;
                    loggingStalledReason = stalledReason;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.StalledStateProvider
    public synchronized StalledState endStalledPeriod() {
        StalledState stalledState;
        try {
            LoggingStalledReason loggingStalledReason = this.stalledReason;
            stalledState = null;
            if (loggingStalledReason != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[loggingStalledReason.ordinal()];
                StalledState stalledState2 = new StalledState(loggingStalledReason, (i == 1 || i == 2) ? (this.timeProvider.elapsedRealtime() - this.stalledBeginTime) + this.extraStalledInfoProvider.getExtraInternalStalledDuration() : this.timeProvider.elapsedRealtime() - this.stalledBeginTime, this.stalledId, null, this.playWhenReadyTrueTime != -1 ? Long.valueOf(this.timeProvider.elapsedRealtime() - this.playWhenReadyTrueTime) : null, this.lastExtendedStalledReason, 8, null);
                this.stalledReason = null;
                this.stalledBeginTime = 0L;
                this.playWhenReadyTrueTime = -1L;
                this.stalledId++;
                stalledState = stalledState2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return stalledState;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.StalledStateProvider
    public void setExtendedStalledReason(ExtendedStalledReason extendedStalledReason) {
        this.lastExtendedStalledReason = extendedStalledReason;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.StalledStateProvider
    public void setPlayWhenReady(boolean playWhenReady) {
        if (playWhenReady != this.playWhenReady || this.playWhenReadyTrueTime == -1) {
            this.playWhenReady = playWhenReady;
            this.playWhenReadyTrueTime = playWhenReady ? this.timeProvider.elapsedRealtime() : -1L;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/StalledStateProviderImpl$Companion;", "", "()V", "TIME_UNSET", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
