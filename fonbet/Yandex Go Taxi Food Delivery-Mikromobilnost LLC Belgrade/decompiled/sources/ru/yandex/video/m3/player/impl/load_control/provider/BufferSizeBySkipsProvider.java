package ru.yandex.video.m3.player.impl.load_control.provider;

import defpackage.imz;
import defpackage.jl40;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.skips.data.PlayerSkip;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0002()B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/BufferSizeBySkipsProvider;", "Lru/yandex/video/m3/player/impl/load_control/provider/DependentLifecycleBufferDurationProvider;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "<init>", "()V", "", "positionMs", "calculateMaxBufferMs", "(J)J", "", "Lru/yandex/video/m3/player/skips/data/PlayerSkip;", "skips", "Lru/yandex/video/m3/player/impl/load_control/provider/BufferSizeBySkipsProvider$RangedPlayerSkip;", "createRangedPlayerSkips", "(Ljava/util/List;)Ljava/util/List;", "currentPosition", "rangedSkips", "currentRangedSkipOrNull", "(JLjava/util/List;)Lru/yandex/video/m3/player/impl/load_control/provider/BufferSizeBySkipsProvider$RangedPlayerSkip;", "findClosestRangedSkipOrNull", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "Lzy11;", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "release", "onSkipsUpdated", "(Ljava/util/List;)V", "Lru/yandex/video/m3/player/PreparingParams;", "params", "onPreparingStarted", "(Lru/yandex/video/m3/player/PreparingParams;)V", "onAnalyticsPlaybackProgress", "(J)V", "getMaxBufferMs", "()J", "lastCalculatedBufferValueMs", "J", "playerSkips", "Ljava/util/List;", "Companion", "RangedPlayerSkip", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BufferSizeBySkipsProvider implements DependentLifecycleBufferDurationProvider, PlayerAnalyticsObserver {
    private static final long DEFAULT_MAX_DURATION_MS = Long.MAX_VALUE;
    private static final long KINOPOISK_SKIP_BUTTON_DURATION_MS = 10000;
    private static final long MAX_BUFFER_INSIDE_SKIPPABLE_FRAGMENT = 3000;
    private volatile long lastCalculatedBufferValueMs = Long.MAX_VALUE;
    private List<PlayerSkip> playerSkips = EmptyList.a;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private final long calculateMaxBufferMs(long positionMs) {
        List<PlayerSkip> list = this.playerSkips;
        if (list.isEmpty()) {
            return Long.MAX_VALUE;
        }
        List<RangedPlayerSkip> createRangedPlayerSkips = createRangedPlayerSkips(list);
        RangedPlayerSkip currentRangedSkipOrNull = currentRangedSkipOrNull(positionMs, createRangedPlayerSkips);
        if (currentRangedSkipOrNull != null) {
            return currentRangedSkipOrNull.getAutoSkip() ? 3000L : Long.MAX_VALUE;
        }
        RangedPlayerSkip findClosestRangedSkipOrNull = findClosestRangedSkipOrNull(positionMs, createRangedPlayerSkips);
        if (findClosestRangedSkipOrNull == null || !findClosestRangedSkipOrNull.getAutoSkip()) {
            return Long.MAX_VALUE;
        }
        long j = (findClosestRangedSkipOrNull.getTimelineRange().a - positionMs) + 3000;
        if (j <= 0) {
            return Long.MAX_VALUE;
        }
        return j;
    }

    private final List<RangedPlayerSkip> createRangedPlayerSkips(List<PlayerSkip> skips) {
        List x0 = a.x0(skips, new Comparator() { // from class: ru.yandex.video.m3.player.impl.load_control.provider.BufferSizeBySkipsProvider$createRangedPlayerSkips$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Long.valueOf(((PlayerSkip) t).getStartTimeMs()).compareTo(Long.valueOf(((PlayerSkip) t2).getStartTimeMs()));
            }
        });
        ArrayList arrayList = new ArrayList(tcc.n(x0, 10));
        Iterator it = x0.iterator();
        while (it.hasNext()) {
            arrayList.add(RangedPlayerSkip.INSTANCE.fromPlayerSkip((PlayerSkip) it.next(), 10000L));
        }
        return arrayList;
    }

    private final RangedPlayerSkip currentRangedSkipOrNull(long currentPosition, List<RangedPlayerSkip> rangedSkips) {
        Object obj;
        Iterator<T> it = rangedSkips.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            imz timelineRange = ((RangedPlayerSkip) obj).getTimelineRange();
            long j = timelineRange.a;
            if (currentPosition <= timelineRange.b && j <= currentPosition) {
                break;
            }
        }
        return (RangedPlayerSkip) obj;
    }

    private final RangedPlayerSkip findClosestRangedSkipOrNull(long currentPosition, List<RangedPlayerSkip> rangedSkips) {
        long j = Long.MAX_VALUE;
        RangedPlayerSkip rangedPlayerSkip = null;
        for (RangedPlayerSkip rangedPlayerSkip2 : rangedSkips) {
            long abs = Math.abs(rangedPlayerSkip2.getTimelineRange().a - currentPosition);
            if (abs < j) {
                rangedPlayerSkip = rangedPlayerSkip2;
                j = abs;
            }
        }
        return rangedPlayerSkip;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.BufferDurationProvider
    /* renamed from: getMaxBufferMs, reason: from getter */
    public long getLastCalculatedBufferValueMs() {
        return this.lastCalculatedBufferValueMs;
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onAnalyticsPlaybackProgress(long positionMs) {
        this.lastCalculatedBufferValueMs = calculateMaxBufferMs(positionMs);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onPreparingStarted(PreparingParams params) {
        this.playerSkips = EmptyList.a;
        this.lastCalculatedBufferValueMs = Long.MAX_VALUE;
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onSkipsUpdated(List<PlayerSkip> skips) {
        this.playerSkips = skips;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle
    public void release(YandexPlayer<?> yandexPlayer) {
        yandexPlayer.removeAnalyticsObserver(this);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle
    public void start(YandexPlayer<?> yandexPlayer) {
        yandexPlayer.addAnalyticsObserver(this);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/BufferSizeBySkipsProvider$RangedPlayerSkip;", "", "", "autoSkip", "Limz;", "timelineRange", "<init>", "(ZLimz;)V", "component1", "()Z", "component2", "()Limz;", "copy", "(ZLimz;)Lru/yandex/video/m3/player/impl/load_control/provider/BufferSizeBySkipsProvider$RangedPlayerSkip;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getAutoSkip", "Limz;", "getTimelineRange", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RangedPlayerSkip {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean autoSkip;
        private final imz timelineRange;

        public RangedPlayerSkip(boolean z, imz imzVar) {
            this.autoSkip = z;
            this.timelineRange = imzVar;
        }

        public static /* synthetic */ RangedPlayerSkip copy$default(RangedPlayerSkip rangedPlayerSkip, boolean z, imz imzVar, int i, Object obj) {
            if ((i & 1) != 0) {
                z = rangedPlayerSkip.autoSkip;
            }
            if ((i & 2) != 0) {
                imzVar = rangedPlayerSkip.timelineRange;
            }
            return rangedPlayerSkip.copy(z, imzVar);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAutoSkip() {
            return this.autoSkip;
        }

        /* renamed from: component2, reason: from getter */
        public final imz getTimelineRange() {
            return this.timelineRange;
        }

        public final RangedPlayerSkip copy(boolean autoSkip, imz timelineRange) {
            return new RangedPlayerSkip(autoSkip, timelineRange);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RangedPlayerSkip)) {
                return false;
            }
            RangedPlayerSkip rangedPlayerSkip = (RangedPlayerSkip) other;
            return this.autoSkip == rangedPlayerSkip.autoSkip && jl40.l(this.timelineRange, rangedPlayerSkip.timelineRange);
        }

        public final boolean getAutoSkip() {
            return this.autoSkip;
        }

        public final imz getTimelineRange() {
            return this.timelineRange;
        }

        public int hashCode() {
            return this.timelineRange.hashCode() + (Boolean.hashCode(this.autoSkip) * 31);
        }

        public String toString() {
            return "RangedPlayerSkip(autoSkip=" + this.autoSkip + ", timelineRange=" + this.timelineRange + ')';
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/BufferSizeBySkipsProvider$RangedPlayerSkip$Companion;", "", "()V", "fromPlayerSkip", "Lru/yandex/video/m3/player/impl/load_control/provider/BufferSizeBySkipsProvider$RangedPlayerSkip;", "playerSkip", "Lru/yandex/video/m3/player/skips/data/PlayerSkip;", "kpDelay", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RangedPlayerSkip fromPlayerSkip(PlayerSkip playerSkip, long kpDelay) {
                return new RangedPlayerSkip(playerSkip.getAutoSkip(), new imz(playerSkip.getStartTimeMs() + kpDelay, playerSkip.getEndTimeMs(), false));
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/BufferSizeBySkipsProvider$Companion;", "", "()V", "DEFAULT_MAX_DURATION_MS", "", "KINOPOISK_SKIP_BUTTON_DURATION_MS", "MAX_BUFFER_INSIDE_SKIPPABLE_FRAGMENT", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
