package ru.yandex.video.m3.player.impl.tracking;

import defpackage.jl40;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.Decoder;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.SizeKt;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.ViewPortState;
import ru.yandex.video.m3.player.DecoderCounter;
import ru.yandex.video.m3.player.RepeatMode;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.api.tracking.BatteryStateProvider;
import ru.yandex.video.m3.player.api.tracking.ContainerSizeProvider;
import ru.yandex.video.m3.player.api.tracking.UserQualityInfoProvider;
import ru.yandex.video.m3.player.impl.tracking.data.MergeDecoderCounter;
import ru.yandex.video.m3.player.impl.tracking.data.PlaybackSpeedControlInfo;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerStateProvider;
import ru.yandex.video.m3.player.impl.tracking.event.AudioTrack;
import ru.yandex.video.m3.player.impl.tracking.event.PlaybackState;
import ru.yandex.video.m3.player.impl.tracking.event.TrackingAdType;
import ru.yandex.video.m3.player.impl.tracking.event.VideoTrack;
import ru.yandex.video.m3.player.impl.utils.IsMuteProvider;
import ru.yandex.video.m3.player.impl.utils.LimitedLinkedList;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;
import ru.yandex.video.m3.player.live.LiveSpeedControlInfoProvider;
import ru.yandex.video.m3.player.tracking.FullscreenInfo;
import ru.yandex.video.m3.player.tracking.FullscreenInfoProvider;
import ru.yandex.video.m3.player.tracking.ViewPortProvider;
import ru.yandex.video.m3.player.tracks.CappingProvider;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import ru.yandex.video.m3.player.utils.battery.BatteryState;
import ru.yandex.video.m3.player.utils.network.NetworkType;
import ru.yandex.video.m3.player.utils.network.NetworkTypeProvider;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 v2\u00020\u0001:\u0001vB\u0087\u0001\b\u0000\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010!J\u0011\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020\u0018*\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020\u001fH\u0016¢\u0006\u0004\b-\u0010!J\r\u0010.\u001a\u00020)¢\u0006\u0004\b.\u0010+J\r\u0010/\u001a\u00020)¢\u0006\u0004\b/\u0010+J\r\u00100\u001a\u00020)¢\u0006\u0004\b0\u0010+J\u0015\u00103\u001a\u00020)2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020)2\u0006\u00105\u001a\u00020\u0018¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020)¢\u0006\u0004\b8\u0010+J\u001d\u0010<\u001a\u00020)2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u000209¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u00020)2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020)2\u0006\u0010B\u001a\u000209¢\u0006\u0004\bC\u0010DJ!\u0010H\u001a\u00020)2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u0002090E¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020)¢\u0006\u0004\bJ\u0010+J\u0015\u0010M\u001a\u00020)2\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020)¢\u0006\u0004\bO\u0010+J\u0015\u0010Q\u001a\u00020)2\u0006\u0010P\u001a\u00020&¢\u0006\u0004\bQ\u0010RR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010WR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010XR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010YR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ZR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010[R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\\R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010]R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010^R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010_R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\\R&\u0010b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u0002090a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010jR\u0018\u0010B\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010kR$\u0010l\u001a\u0010\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u000209\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010nR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010s\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010^¨\u0006w"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/StateProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/PlayerStateProvider;", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "Lru/yandex/video/m3/player/impl/tracking/TimeCounter;", "stalledCounter", "Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProvider;", "watchedTimeProvider", "Lru/yandex/video/m3/player/impl/utils/IsMuteProvider;", "isMuteProvider", "Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "networkTypeProvider", "Lru/yandex/video/m3/player/live/LiveSpeedControlInfoProvider;", "liveSpeedControlInfoProvider", "Lru/yandex/video/m3/player/api/tracking/BatteryStateProvider;", "batteryStateProvider", "Lru/yandex/video/m3/player/tracking/FullscreenInfoProvider;", "fullscreenInfoProvider", "Lru/yandex/video/m3/player/api/tracking/ContainerSizeProvider;", "containerSizeProvider", "Lru/yandex/video/m3/player/api/tracking/UserQualityInfoProvider;", "userQualityInfoProvider", "", "useOptimizedTelemetryMode", "Lru/yandex/video/m3/player/tracking/ViewPortProvider;", "viewPortProvider", "internalContainerSizeProvider", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/impl/utils/TimeProvider;Lru/yandex/video/m3/player/impl/tracking/TimeCounter;Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProvider;Lru/yandex/video/m3/player/impl/utils/IsMuteProvider;Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;Lru/yandex/video/m3/player/live/LiveSpeedControlInfoProvider;Lru/yandex/video/m3/player/api/tracking/BatteryStateProvider;Lru/yandex/video/m3/player/tracking/FullscreenInfoProvider;Lru/yandex/video/m3/player/api/tracking/ContainerSizeProvider;Lru/yandex/video/m3/player/api/tracking/UserQualityInfoProvider;ZLru/yandex/video/m3/player/tracking/ViewPortProvider;Lru/yandex/video/m3/player/api/tracking/ContainerSizeProvider;)V", "Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;", "getPlayerStateInternal", "()Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;", "getInitialState", "Lru/yandex/video/m3/player/impl/tracking/data/PlaybackSpeedControlInfo;", "getLiveSpeedControlInfo", "()Lru/yandex/video/m3/player/impl/tracking/data/PlaybackSpeedControlInfo;", "Lru/yandex/video/m3/player/RepeatMode;", "isLoop", "(Lru/yandex/video/m3/player/RepeatMode;)Z", "Lzy11;", "connectToPlayer", "()V", "disconnectFromPlayer", "getPlayerState", "onResumePlayback", "onPausePlayback", "onPlaybackEnded", "Lru/yandex/video/m3/data/StalledReason;", "stalledReason", "onBufferingStart", "(Lru/yandex/video/m3/data/StalledReason;)V", "willPlay", "onBufferingEnd", "(Z)V", "onPlaybackError", "", "chunkSize", "loadTime", "onDataLoaded", "(JJ)V", "Lru/yandex/video/m3/player/DecoderCounter;", "decoderCounter", "setDecoderCounter", "(Lru/yandex/video/m3/player/DecoderCounter;)V", "bandwidthEstimation", "setBandwidthEstimation", "(J)V", "", "", "estimates", "setInitialBandwidthEstimatesAcquired", "(Ljava/util/Map;)V", "onAdEnd", "Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;", "adType", "onAdStart", "(Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;)V", "onRepeat", "repeatMode", "onRepeatModeChanged", "(Lru/yandex/video/m3/player/RepeatMode;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "Lru/yandex/video/m3/player/impl/tracking/TimeCounter;", "Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProvider;", "Lru/yandex/video/m3/player/impl/utils/IsMuteProvider;", "Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "Lru/yandex/video/m3/player/live/LiveSpeedControlInfoProvider;", "Lru/yandex/video/m3/player/api/tracking/BatteryStateProvider;", "Lru/yandex/video/m3/player/tracking/FullscreenInfoProvider;", "Lru/yandex/video/m3/player/api/tracking/ContainerSizeProvider;", "Lru/yandex/video/m3/player/api/tracking/UserQualityInfoProvider;", "Z", "Lru/yandex/video/m3/player/tracking/ViewPortProvider;", "Lru/yandex/video/m3/player/impl/utils/LimitedLinkedList;", "Lkotlin/Pair;", "cycleBuffer", "Lru/yandex/video/m3/player/impl/utils/LimitedLinkedList;", "Lru/yandex/video/m3/player/impl/tracking/event/PlaybackState;", "playbackState", "Lru/yandex/video/m3/player/impl/tracking/event/PlaybackState;", "", "totalStalledCount", CA20Status.STATUS_USER_I, "Lru/yandex/video/m3/player/DecoderCounter;", "Ljava/lang/Long;", "initialBandwidthEstimates", "Ljava/util/Map;", "Lru/yandex/video/m3/data/StalledReason;", "Lru/yandex/video/m3/player/impl/tracking/event/TrackingAdType;", "Lru/yandex/video/m3/player/impl/tracking/RepeatCounter;", "repeatCounter", "Lru/yandex/video/m3/player/impl/tracking/RepeatCounter;", "frozenState", "Lru/yandex/video/m3/player/impl/tracking/data/PlayerState;", "useInitialState", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StateProvider implements PlayerStateProvider {
    private static final long BUFFER_TIME_UNSET = 0;
    private TrackingAdType adType;
    private Long bandwidthEstimation;
    private final BatteryStateProvider batteryStateProvider;
    private final ContainerSizeProvider containerSizeProvider;
    private final LimitedLinkedList<Pair<Long, Long>> cycleBuffer;
    private DecoderCounter decoderCounter;
    private volatile PlayerState frozenState;
    private final FullscreenInfoProvider fullscreenInfoProvider;
    private Map<String, Long> initialBandwidthEstimates;
    private final ContainerSizeProvider internalContainerSizeProvider;
    private final IsMuteProvider isMuteProvider;
    private final LiveSpeedControlInfoProvider liveSpeedControlInfoProvider;
    private final NetworkTypeProvider networkTypeProvider;
    private PlaybackState playbackState;
    private final RepeatCounter repeatCounter;
    private final TimeCounter stalledCounter;
    private StalledReason stalledReason;
    private final TimeProvider timeProvider;
    private int totalStalledCount;
    private volatile boolean useInitialState;
    private final boolean useOptimizedTelemetryMode;
    private final UserQualityInfoProvider userQualityInfoProvider;
    private final ViewPortProvider viewPortProvider;
    private final WatchedTimeProvider watchedTimeProvider;
    private final YandexPlayer<?> yandexPlayer;
    public static final int $stable = 8;

    public StateProvider(YandexPlayer<?> yandexPlayer, TimeProvider timeProvider, TimeCounter timeCounter, WatchedTimeProvider watchedTimeProvider, IsMuteProvider isMuteProvider, NetworkTypeProvider networkTypeProvider, LiveSpeedControlInfoProvider liveSpeedControlInfoProvider, BatteryStateProvider batteryStateProvider, FullscreenInfoProvider fullscreenInfoProvider, ContainerSizeProvider containerSizeProvider, UserQualityInfoProvider userQualityInfoProvider, boolean z, ViewPortProvider viewPortProvider, ContainerSizeProvider containerSizeProvider2) {
        this.yandexPlayer = yandexPlayer;
        this.timeProvider = timeProvider;
        this.stalledCounter = timeCounter;
        this.watchedTimeProvider = watchedTimeProvider;
        this.isMuteProvider = isMuteProvider;
        this.networkTypeProvider = networkTypeProvider;
        this.liveSpeedControlInfoProvider = liveSpeedControlInfoProvider;
        this.batteryStateProvider = batteryStateProvider;
        this.fullscreenInfoProvider = fullscreenInfoProvider;
        this.containerSizeProvider = containerSizeProvider;
        this.userQualityInfoProvider = userQualityInfoProvider;
        this.useOptimizedTelemetryMode = z;
        this.viewPortProvider = viewPortProvider;
        this.internalContainerSizeProvider = containerSizeProvider2;
        this.cycleBuffer = new LimitedLinkedList<>(5);
        this.playbackState = PlaybackState.PAUSE;
        this.repeatCounter = new RepeatCounter(yandexPlayer.getRepeatMode());
        this.useInitialState = true;
    }

    private final PlayerState getInitialState() {
        ViewPortState viewPortState;
        long currentTimeMillis = this.timeProvider.currentTimeMillis();
        TrackingAdType trackingAdType = this.adType;
        boolean isPlaybackMuted = this.isMuteProvider.isPlaybackMuted();
        long watchedTime = this.watchedTimeProvider.getWatchedTime();
        int i = this.totalStalledCount;
        long time = this.stalledCounter.getTime();
        DecoderCounter decoderCounter = this.decoderCounter;
        Integer valueOf = decoderCounter != null ? Integer.valueOf(decoderCounter.getDroppedFrames()) : null;
        DecoderCounter decoderCounter2 = this.decoderCounter;
        Integer valueOf2 = decoderCounter2 != null ? Integer.valueOf(decoderCounter2.getShownFrames()) : null;
        PlaybackState playbackState = this.playbackState;
        StalledReason stalledReason = this.stalledReason;
        NetworkType networkType = this.networkTypeProvider.getNetworkType();
        BatteryState batteryState = this.batteryStateProvider.getBatteryState();
        FullscreenInfo fullscreenInfo = this.fullscreenInfoProvider.getFullscreenInfo();
        Size containerSize = this.containerSizeProvider.getContainerSize();
        ContainerSizeProvider containerSizeProvider = this.internalContainerSizeProvider;
        Size containerSize2 = containerSizeProvider != null ? containerSizeProvider.getContainerSize() : null;
        Integer userQuality = this.userQualityInfoProvider.getUserQuality();
        long uptimeMillis = this.timeProvider.uptimeMillis();
        ViewPortProvider viewPortProvider = this.viewPortProvider;
        if (viewPortProvider == null || (viewPortState = viewPortProvider.getViewPortState()) == null) {
            viewPortState = ViewPortState.DEFAULT;
        }
        return new PlayerState(currentTimeMillis, trackingAdType, isPlaybackMuted, watchedTime, null, 0L, null, null, null, null, null, null, i, time, valueOf, valueOf2, playbackState, null, null, null, false, stalledReason, networkType, null, batteryState, fullscreenInfo, containerSize, null, userQuality, uptimeMillis, 0L, viewPortState, 1.0d, 1.0d, containerSize2, null, isLoop(this.yandexPlayer.getRepeatMode()), this.repeatCounter.getRepeatCount(), this.initialBandwidthEstimates, this.yandexPlayer.getPlaybackViewState(), null, null, null);
    }

    private final PlaybackSpeedControlInfo getLiveSpeedControlInfo() {
        LiveSpeedControlInfoProvider liveSpeedControlInfoProvider = this.liveSpeedControlInfoProvider;
        if (liveSpeedControlInfoProvider != null) {
            if (!liveSpeedControlInfoProvider.hasAvailableInfo()) {
                liveSpeedControlInfoProvider = null;
            }
            if (liveSpeedControlInfoProvider != null) {
                return new PlaybackSpeedControlInfo(liveSpeedControlInfoProvider.getAdjustedSpeed(), liveSpeedControlInfoProvider.getExoPlayerLiveOffset(), liveSpeedControlInfoProvider.getLiveOffsetDifference(), liveSpeedControlInfoProvider.getCurrentTargetOffsetMs(), liveSpeedControlInfoProvider.getTargetOffsetOverride());
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0196, code lost:
    
        if (r14.longValue() > (-1)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b5, code lost:
    
        if (r15.longValue() > (-1)) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final PlayerState getPlayerStateInternal() {
        Size Size$default;
        Size size;
        boolean z;
        Boolean bool;
        TrackVariant trackVariant;
        TrackVariant.Variant variant;
        VideoTrack videoTrack;
        PlaybackStats playbackStats;
        Long l;
        Long l2;
        Long valueOf;
        Integer num;
        boolean z2;
        ViewPortProvider viewPortProvider;
        Decoder audioDecoder;
        Decoder videoDecoder;
        TrackFormat selectedTrackFormat;
        TrackFormat selectedTrackFormat2;
        Object next;
        Track videoTrack2 = this.yandexPlayer.getVideoTrack();
        TrackVariant selectedTrackVariant = videoTrack2 != null ? videoTrack2.getSelectedTrackVariant() : null;
        Track videoTrack3 = this.yandexPlayer.getVideoTrack();
        List<TrackVariant> availableTrackVariants = videoTrack3 != null ? videoTrack3.getAvailableTrackVariants() : null;
        if (selectedTrackVariant instanceof TrackVariant.Adaptive) {
            CappingProvider cappingProvider = ((TrackVariant.Adaptive) selectedTrackVariant).getCappingProvider();
            if (cappingProvider != null) {
                Size$default = cappingProvider.getCapping();
                size = Size$default;
            }
            size = null;
        } else {
            if (selectedTrackVariant instanceof TrackVariant.Variant) {
                TrackVariant.Variant variant2 = (TrackVariant.Variant) selectedTrackVariant;
                Size$default = SizeKt.Size$default(variant2.getFormat().getWidth(), variant2.getFormat().getHeight(), null, 4, null);
                size = Size$default;
            }
            size = null;
        }
        Boolean valueOf2 = selectedTrackVariant != null ? Boolean.valueOf(selectedTrackVariant instanceof TrackVariant.Adaptive) : null;
        boolean z3 = true;
        if (availableTrackVariants != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : availableTrackVariants) {
                TrackVariant trackVariant2 = (TrackVariant) obj;
                if (!(trackVariant2 instanceof TrackVariant.Adaptive) && !(trackVariant2 instanceof TrackVariant.Disable)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() == 1) {
                z = true;
                if (valueOf2 == null) {
                    if (!valueOf2.booleanValue() && !z) {
                        z3 = false;
                    }
                    bool = Boolean.valueOf(z3);
                } else {
                    bool = null;
                }
                if (availableTrackVariants == null) {
                    Iterator<T> it = availableTrackVariants.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            TrackVariant trackVariant3 = (TrackVariant) next;
                            int height = trackVariant3 instanceof TrackVariant.Variant ? ((TrackVariant.Variant) trackVariant3).getFormat().getHeight() : 0;
                            do {
                                Object next2 = it.next();
                                TrackVariant trackVariant4 = (TrackVariant) next2;
                                int height2 = trackVariant4 instanceof TrackVariant.Variant ? ((TrackVariant.Variant) trackVariant4).getFormat().getHeight() : 0;
                                if (height < height2) {
                                    next = next2;
                                    height = height2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    trackVariant = (TrackVariant) next;
                } else {
                    trackVariant = null;
                }
                variant = !(trackVariant instanceof TrackVariant.Variant) ? (TrackVariant.Variant) trackVariant : null;
                if (variant == null) {
                    TrackFormat format = variant.getFormat();
                    videoTrack = new VideoTrack(format.getWidth(), format.getHeight(), format.getBitrate());
                } else {
                    videoTrack = null;
                }
                Track videoTrack4 = this.yandexPlayer.getVideoTrack();
                VideoTrack videoTrack5 = (videoTrack4 != null || (selectedTrackFormat2 = videoTrack4.getSelectedTrackFormat()) == null) ? null : new VideoTrack(selectedTrackFormat2.getWidth(), selectedTrackFormat2.getHeight(), selectedTrackFormat2.getBitrate());
                Track audioTrack = this.yandexPlayer.getAudioTrack();
                AudioTrack audioTrack2 = (audioTrack != null || (selectedTrackFormat = audioTrack.getSelectedTrackFormat()) == null) ? null : new AudioTrack(selectedTrackFormat.getId(), selectedTrackFormat.getBitrate());
                playbackStats = this.yandexPlayer.getPlaybackStats();
                float volume = this.yandexPlayer.getVolume();
                float playbackSpeed = this.yandexPlayer.getPlaybackSpeed();
                long currentTimeMillis = this.timeProvider.currentTimeMillis();
                TrackingAdType trackingAdType = this.adType;
                boolean isPlaybackMuted = this.isMuteProvider.isPlaybackMuted();
                long watchedTime = this.watchedTimeProvider.getWatchedTime();
                if (playbackStats != null) {
                    l = Long.valueOf(playbackStats.getPlaybackPosition());
                }
                l = null;
                long remainingBufferedTime = playbackStats == null ? playbackStats.getRemainingBufferedTime() : 0L;
                if (playbackStats != null) {
                    l2 = Long.valueOf(playbackStats.getWindowDuration());
                }
                l2 = null;
                VideoType videoType = playbackStats == null ? playbackStats.getVideoType() : null;
                int i = this.totalStalledCount;
                long time = this.stalledCounter.getTime();
                DecoderCounter decoderCounter = this.decoderCounter;
                Integer valueOf3 = decoderCounter == null ? Integer.valueOf(decoderCounter.getDroppedFrames()) : null;
                DecoderCounter decoderCounter2 = this.decoderCounter;
                Integer valueOf4 = decoderCounter2 == null ? Integer.valueOf(decoderCounter2.getShownFrames()) : null;
                PlaybackState playbackState = this.playbackState;
                Long l3 = this.bandwidthEstimation;
                valueOf = playbackStats == null ? Long.valueOf(playbackStats.getLiveOffset()) : null;
                if (valueOf != null && valueOf.longValue() == -9223372036854775807L) {
                    valueOf = null;
                }
                if (playbackStats == null) {
                    num = valueOf4;
                    z2 = jl40.l(playbackStats.getIsInLive(), Boolean.TRUE);
                } else {
                    num = valueOf4;
                    z2 = false;
                }
                StalledReason stalledReason = this.stalledReason;
                boolean z4 = z2;
                NetworkType networkType = this.networkTypeProvider.getNetworkType();
                Long l4 = l;
                long j = remainingBufferedTime;
                Integer num2 = valueOf3;
                Integer num3 = num;
                PlaybackSpeedControlInfo liveSpeedControlInfo = getLiveSpeedControlInfo();
                BatteryState batteryState = this.batteryStateProvider.getBatteryState();
                FullscreenInfo fullscreenInfo = this.fullscreenInfoProvider.getFullscreenInfo();
                Size containerSize = this.containerSizeProvider.getContainerSize();
                ContainerSizeProvider containerSizeProvider = this.internalContainerSizeProvider;
                Size containerSize2 = containerSizeProvider == null ? containerSizeProvider.getContainerSize() : null;
                Long valueOf5 = playbackStats == null ? Long.valueOf(playbackStats.getLiveEdgePosition()) : null;
                Integer userQuality = this.userQualityInfoProvider.getUserQuality();
                long uptimeMillis = this.timeProvider.uptimeMillis();
                long maxTargetBufferMs = playbackStats != null ? playbackStats.getMaxTargetBufferMs() : 0L;
                viewPortProvider = this.viewPortProvider;
                if (viewPortProvider != null || (r1 = viewPortProvider.getViewPortState()) == null) {
                    ViewPortState viewPortState = ViewPortState.DEFAULT;
                }
                return new PlayerState(currentTimeMillis, trackingAdType, isPlaybackMuted, watchedTime, l4, j, l2, videoTrack5, videoTrack, size, videoType, bool, i, time, num2, num3, playbackState, audioTrack2, l3, valueOf, z4, stalledReason, networkType, liveSpeedControlInfo, batteryState, fullscreenInfo, containerSize, valueOf5, userQuality, uptimeMillis, maxTargetBufferMs, viewPortState, volume, playbackSpeed, containerSize2, playbackStats == null ? playbackStats.getActualLiveOffset() : null, isLoop(this.yandexPlayer.getRepeatMode()), this.repeatCounter.getRepeatCount(), this.initialBandwidthEstimates, this.yandexPlayer.getPlaybackViewState(), playbackStats == null ? playbackStats.getExoPlayerPlaybackState() : null, (playbackStats != null || (videoDecoder = playbackStats.getVideoDecoder()) == null) ? null : videoDecoder.getName(), (playbackStats != null || (audioDecoder = playbackStats.getAudioDecoder()) == null) ? null : audioDecoder.getName());
            }
        }
        z = false;
        if (valueOf2 == null) {
        }
        if (availableTrackVariants == null) {
        }
        if (!(trackVariant instanceof TrackVariant.Variant)) {
        }
        if (variant == null) {
        }
        Track videoTrack42 = this.yandexPlayer.getVideoTrack();
        if (videoTrack42 != null) {
        }
        Track audioTrack3 = this.yandexPlayer.getAudioTrack();
        if (audioTrack3 != null) {
        }
        playbackStats = this.yandexPlayer.getPlaybackStats();
        float volume2 = this.yandexPlayer.getVolume();
        float playbackSpeed2 = this.yandexPlayer.getPlaybackSpeed();
        long currentTimeMillis2 = this.timeProvider.currentTimeMillis();
        TrackingAdType trackingAdType2 = this.adType;
        boolean isPlaybackMuted2 = this.isMuteProvider.isPlaybackMuted();
        long watchedTime2 = this.watchedTimeProvider.getWatchedTime();
        if (playbackStats != null) {
        }
        l = null;
        if (playbackStats == null) {
        }
        if (playbackStats != null) {
        }
        l2 = null;
        if (playbackStats == null) {
        }
        int i2 = this.totalStalledCount;
        long time2 = this.stalledCounter.getTime();
        DecoderCounter decoderCounter3 = this.decoderCounter;
        if (decoderCounter3 == null) {
        }
        DecoderCounter decoderCounter22 = this.decoderCounter;
        if (decoderCounter22 == null) {
        }
        PlaybackState playbackState2 = this.playbackState;
        Long l32 = this.bandwidthEstimation;
        if (playbackStats == null) {
        }
        if (valueOf != null) {
            valueOf = null;
        }
        if (playbackStats == null) {
        }
        StalledReason stalledReason2 = this.stalledReason;
        boolean z42 = z2;
        NetworkType networkType2 = this.networkTypeProvider.getNetworkType();
        Long l42 = l;
        long j2 = remainingBufferedTime;
        Integer num22 = valueOf3;
        Integer num32 = num;
        PlaybackSpeedControlInfo liveSpeedControlInfo2 = getLiveSpeedControlInfo();
        BatteryState batteryState2 = this.batteryStateProvider.getBatteryState();
        FullscreenInfo fullscreenInfo2 = this.fullscreenInfoProvider.getFullscreenInfo();
        Size containerSize3 = this.containerSizeProvider.getContainerSize();
        ContainerSizeProvider containerSizeProvider2 = this.internalContainerSizeProvider;
        if (containerSizeProvider2 == null) {
        }
        if (playbackStats == null) {
        }
        Integer userQuality2 = this.userQualityInfoProvider.getUserQuality();
        long uptimeMillis2 = this.timeProvider.uptimeMillis();
        if (playbackStats != null) {
        }
        viewPortProvider = this.viewPortProvider;
        if (viewPortProvider != null) {
        }
        ViewPortState viewPortState2 = ViewPortState.DEFAULT;
        return new PlayerState(currentTimeMillis2, trackingAdType2, isPlaybackMuted2, watchedTime2, l42, j2, l2, videoTrack5, videoTrack, size, videoType, bool, i2, time2, num22, num32, playbackState2, audioTrack2, l32, valueOf, z42, stalledReason2, networkType2, liveSpeedControlInfo2, batteryState2, fullscreenInfo2, containerSize3, valueOf5, userQuality2, uptimeMillis2, maxTargetBufferMs, viewPortState2, volume2, playbackSpeed2, containerSize2, playbackStats == null ? playbackStats.getActualLiveOffset() : null, isLoop(this.yandexPlayer.getRepeatMode()), this.repeatCounter.getRepeatCount(), this.initialBandwidthEstimates, this.yandexPlayer.getPlaybackViewState(), playbackStats == null ? playbackStats.getExoPlayerPlaybackState() : null, (playbackStats != null || (videoDecoder = playbackStats.getVideoDecoder()) == null) ? null : videoDecoder.getName(), (playbackStats != null || (audioDecoder = playbackStats.getAudioDecoder()) == null) ? null : audioDecoder.getName());
    }

    private final boolean isLoop(RepeatMode repeatMode) {
        return !jl40.l(repeatMode, RepeatMode.None.INSTANCE);
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.data.PlayerStateProvider
    public void connectToPlayer() {
        this.useInitialState = false;
        this.frozenState = null;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.data.PlayerStateProvider
    public void disconnectFromPlayer() {
        if (this.frozenState == null) {
            this.frozenState = getPlayerState();
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.data.PlayerStateProvider
    public PlayerState getPlayerState() {
        if (this.useOptimizedTelemetryMode) {
            if (this.useInitialState) {
                return getInitialState();
            }
            PlayerState playerState = this.frozenState;
            if (playerState != null) {
                return playerState;
            }
        }
        return getPlayerStateInternal();
    }

    public final void onAdEnd() {
        this.adType = null;
    }

    public final void onAdStart(TrackingAdType adType) {
        this.adType = adType;
    }

    public final void onBufferingEnd(boolean willPlay) {
        this.stalledReason = null;
        this.playbackState = willPlay ? PlaybackState.PLAY : PlaybackState.PAUSE;
        this.stalledCounter.stop();
    }

    public final void onBufferingStart(StalledReason stalledReason) {
        this.playbackState = PlaybackState.BUFFERING;
        this.stalledReason = stalledReason;
        this.totalStalledCount++;
        this.stalledCounter.start();
    }

    public final synchronized void onDataLoaded(long chunkSize, long loadTime) {
        this.cycleBuffer.offer(new Pair<>(Long.valueOf(chunkSize), Long.valueOf(loadTime)));
    }

    public final void onPausePlayback() {
        this.playbackState = PlaybackState.PAUSE;
    }

    public final void onPlaybackEnded() {
        this.playbackState = PlaybackState.END;
    }

    public final void onPlaybackError() {
        this.playbackState = PlaybackState.PAUSE;
    }

    public final void onRepeat() {
        this.repeatCounter.onRepeat();
    }

    public final void onRepeatModeChanged(RepeatMode repeatMode) {
        this.repeatCounter.onRepeatModeChanged(repeatMode);
    }

    public final void onResumePlayback() {
        this.playbackState = PlaybackState.PLAY;
    }

    public final void setBandwidthEstimation(long bandwidthEstimation) {
        this.bandwidthEstimation = Long.valueOf(bandwidthEstimation);
    }

    public final void setDecoderCounter(DecoderCounter decoderCounter) {
        this.decoderCounter = new MergeDecoderCounter(this.decoderCounter, decoderCounter);
    }

    public final void setInitialBandwidthEstimatesAcquired(Map<String, Long> estimates) {
        this.initialBandwidthEstimates = estimates;
    }

    public /* synthetic */ StateProvider(YandexPlayer yandexPlayer, TimeProvider timeProvider, TimeCounter timeCounter, WatchedTimeProvider watchedTimeProvider, IsMuteProvider isMuteProvider, NetworkTypeProvider networkTypeProvider, LiveSpeedControlInfoProvider liveSpeedControlInfoProvider, BatteryStateProvider batteryStateProvider, FullscreenInfoProvider fullscreenInfoProvider, ContainerSizeProvider containerSizeProvider, UserQualityInfoProvider userQualityInfoProvider, boolean z, ViewPortProvider viewPortProvider, ContainerSizeProvider containerSizeProvider2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(yandexPlayer, timeProvider, timeCounter, watchedTimeProvider, isMuteProvider, networkTypeProvider, liveSpeedControlInfoProvider, batteryStateProvider, fullscreenInfoProvider, containerSizeProvider, userQualityInfoProvider, z, (i & 4096) != 0 ? null : viewPortProvider, (i & 8192) != 0 ? null : containerSizeProvider2);
    }
}
