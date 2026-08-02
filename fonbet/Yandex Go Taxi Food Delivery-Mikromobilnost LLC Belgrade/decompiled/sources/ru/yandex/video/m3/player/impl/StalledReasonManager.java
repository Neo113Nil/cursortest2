package ru.yandex.video.m3.player.impl;

import defpackage.g8e;
import defpackage.jl40;
import defpackage.w511;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.ExtendedStalledReason;
import ru.yandex.video.m3.data.LastPlayWhenReadyChanged;
import ru.yandex.video.m3.data.RecoverDetails;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.player.utils.TimberPlayerLogger;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 m2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001mB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ#\u0010\u000f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u0005J\u0017\u0010 \u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\"\u0010\u0005J\u001f\u0010'\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001aH\u0016¢\u0006\u0004\b2\u0010\u0005J\u001f\u00106\u001a\u00020\u001a2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0016¢\u0006\u0004\b6\u00107J'\u0010;\u001a\u00020\u001a2\u0006\u00108\u001a\u00020)2\u0006\u00109\u001a\u0002032\u0006\u0010:\u001a\u000203H\u0016¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\u001a2\b\u00108\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bC\u0010AJ\u000f\u0010D\u001a\u00020\u001aH\u0016¢\u0006\u0004\bD\u0010\u0005J'\u0010I\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020E2\u0006\u0010H\u001a\u00020EH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u001aH\u0016¢\u0006\u0004\bK\u0010\u0005J\u000f\u0010L\u001a\u00020\u001aH\u0016¢\u0006\u0004\bL\u0010\u0005R\u0014\u0010N\u001a\u00020M8\u0002X\u0082D¢\u0006\u0006\n\u0004\bN\u0010OR\u001c\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010SR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010SR\u0016\u0010T\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010SR\u0016\u0010U\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010SR\u0016\u0010V\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010SR\u0016\u0010W\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010SR\u0016\u0010X\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010SR\u0016\u0010Y\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010SR\u0016\u0010Z\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010SR\u0016\u0010[\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010SR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010SR\u0016\u0010\\\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010SR\u0016\u0010]\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010SR\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010SR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010j\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010l\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010k¨\u0006n"}, d2 = {"Lru/yandex/video/m3/player/impl/StalledReasonManager;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "<init>", "()V", "", "isLoadingBecauseSetSource", "()Z", "isLoadingBecauseInit", "isVideoDecoderInitialized", "isLoadingByInitOrSetSourceWithoutInitCodec", "Lru/yandex/video/m3/player/tracks/TrackVariant;", "oldTrackVariant", "newTrackVariant", "isTrackChangedManually", "(Lru/yandex/video/m3/player/tracks/TrackVariant;Lru/yandex/video/m3/player/tracks/TrackVariant;)Z", "Lru/yandex/video/m3/data/ExtendedStalledReason;", "getStalledReasonWithExplanation$video_player_internalRelease", "()Lru/yandex/video/m3/data/ExtendedStalledReason;", "getStalledReasonWithExplanation", "Lru/yandex/video/m3/data/StalledReason;", "getStalledReason", "()Lru/yandex/video/m3/data/StalledReason;", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lzy11;", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "stop", "Lru/yandex/video/m3/data/Ad;", "ad", "onAdStart", "(Lru/yandex/video/m3/data/Ad;)V", "onAdEnd", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "Lru/yandex/video/m3/data/RecoverDetails;", "recoverDetails", "onPlayerWillTryRecoverAfterError", "(Lru/yandex/video/m3/player/PlaybackException;Lru/yandex/video/m3/data/RecoverDetails;)V", "", "url", "autoplay", "onNewMediaItem", "(Ljava/lang/String;Z)V", "Lru/yandex/video/m3/player/PreparingParams;", "params", "onPreparingStarted", "(Lru/yandex/video/m3/player/PreparingParams;)V", "onResumePlayback", "", "newPositionMs", "oldPositionMs", "onSeek", "(JJ)V", "decoderName", "initializedTimestampMs", "initializationDurationMs", "onVideoDecoderInitialized", "(Ljava/lang/String;JJ)V", "onVideoDecoderReleased", "(Ljava/lang/String;)V", "willPlayWhenReady", "onWillPlayWhenReadyChanged", "(Z)V", "keepDecoders", "onStopPlayback", "onPlayerReleased", "Lru/yandex/video/m3/player/tracks/Track;", "audioTrack", "subtitlesTrack", "videoTrack", "onTracksChanged", "(Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;)V", "onLoadingStart", "onLoadingFinished", "", "lowerEstimateOfSegmentDurationMs", CA20Status.STATUS_USER_I, "Lru/yandex/video/m3/player/YandexPlayer;", "lastVideoDataUrl", "Ljava/lang/String;", "Z", "isLoadingBecauseRecover", "isLoadingBecauseSeeking", "isLoadingBecauseTrackChanged", "isLoadingBecauseLiveEdge", "isLoadingBecauseAdPlayingStarting", "isLoadingBecauseAdPlayingEnding", "isAllowPrepareWithoutInitCodec", "isVideoTrackEnabled", "playWhenReady", "isFirstEverStart", "Ljava/util/concurrent/atomic/AtomicInteger;", "initializedVideoDecoderCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "isPlaybackResumedSinceLastSetSource", "Lru/yandex/video/m3/data/LastPlayWhenReadyChanged;", "lastPlayWhenReadyChanged", "Lru/yandex/video/m3/data/LastPlayWhenReadyChanged;", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "logger", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "lastExtendedStalledReason", "Lru/yandex/video/m3/data/ExtendedStalledReason;", "oldVideoTrackVariant", "Lru/yandex/video/m3/player/tracks/TrackVariant;", "oldAudioTrackVariant", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StalledReasonManager implements PlayerObserver<Object>, PlayerAnalyticsObserver {
    private static final String TAG = "StalledReasonManager";
    private volatile boolean isAllowPrepareWithoutInitCodec;
    private volatile boolean isFirstEverStart;
    private volatile boolean isLoadingBecauseAdPlayingEnding;
    private volatile boolean isLoadingBecauseAdPlayingStarting;
    private volatile boolean isLoadingBecauseInit;
    private volatile boolean isLoadingBecauseLiveEdge;
    private volatile boolean isLoadingBecauseRecover;
    private volatile boolean isLoadingBecauseSeeking;
    private volatile boolean isLoadingBecauseSetSource;
    private volatile boolean isLoadingBecauseTrackChanged;
    private volatile boolean isLoadingByInitOrSetSourceWithoutInitCodec;
    private volatile boolean isPlaybackResumedSinceLastSetSource;
    private volatile boolean isVideoTrackEnabled;
    private ExtendedStalledReason lastExtendedStalledReason;
    private LastPlayWhenReadyChanged lastPlayWhenReadyChanged;
    private volatile String lastVideoDataUrl;
    private TrackVariant oldAudioTrackVariant;
    private TrackVariant oldVideoTrackVariant;
    private volatile boolean playWhenReady;
    private volatile YandexPlayer<?> player;
    public static final int $stable = 8;
    private final int lowerEstimateOfSegmentDurationMs = 2000;
    private AtomicInteger initializedVideoDecoderCounter = new AtomicInteger(0);
    private final TimberPlayerLogger logger = new TimberPlayerLogger();

    private final boolean isLoadingBecauseInit() {
        if (this.isLoadingBecauseInit) {
            return true;
        }
        return this.isFirstEverStart && this.isLoadingByInitOrSetSourceWithoutInitCodec;
    }

    private final boolean isLoadingBecauseSetSource() {
        if (this.isLoadingBecauseSetSource) {
            return true;
        }
        return !this.isFirstEverStart && this.isLoadingByInitOrSetSourceWithoutInitCodec;
    }

    private final boolean isLoadingByInitOrSetSourceWithoutInitCodec() {
        return this.isAllowPrepareWithoutInitCodec && this.playWhenReady && this.isVideoTrackEnabled && !isVideoDecoderInitialized() && !this.isPlaybackResumedSinceLastSetSource;
    }

    private final boolean isTrackChangedManually(TrackVariant oldTrackVariant, TrackVariant newTrackVariant) {
        if (oldTrackVariant == null) {
            return false;
        }
        if (newTrackVariant == null) {
            return true;
        }
        boolean z = oldTrackVariant instanceof TrackVariant.Variant;
        if (z && (newTrackVariant instanceof TrackVariant.Variant)) {
            TrackVariant.Variant variant = (TrackVariant.Variant) oldTrackVariant;
            TrackVariant.Variant variant2 = (TrackVariant.Variant) newTrackVariant;
            return (variant.getGroupIndex() == variant2.getGroupIndex() && variant.getTrackIndex() == variant2.getTrackIndex()) ? false : true;
        }
        if (oldTrackVariant instanceof TrackVariant.Adaptive) {
            return !(newTrackVariant instanceof TrackVariant.Adaptive);
        }
        if (oldTrackVariant instanceof TrackVariant.Disable) {
            return !(newTrackVariant instanceof TrackVariant.Disable);
        }
        if (z) {
            return !(newTrackVariant instanceof TrackVariant.Variant);
        }
        if (oldTrackVariant instanceof TrackVariant.DownloadVariant) {
            return !(newTrackVariant instanceof TrackVariant.DownloadVariant);
        }
        if (oldTrackVariant instanceof TrackVariant.PreferredTrackVariant) {
            return !(newTrackVariant instanceof TrackVariant.PreferredTrackVariant);
        }
        w511.b();
        return false;
    }

    private final boolean isVideoDecoderInitialized() {
        return this.initializedVideoDecoderCounter.get() > 0;
    }

    public final StalledReason getStalledReason() {
        StalledReason stalledReason = this.isLoadingBecauseAdPlayingStarting ? StalledReason.AD_START : this.isLoadingBecauseAdPlayingEnding ? StalledReason.AD_END : this.isLoadingBecauseRecover ? StalledReason.RECOVER : isLoadingBecauseSetSource() ? StalledReason.SET_SOURCE : isLoadingBecauseInit() ? StalledReason.INIT : this.isLoadingBecauseSeeking ? StalledReason.SEEK : this.isLoadingBecauseTrackChanged ? StalledReason.VIDEO_TRACK_CHANGE : this.isLoadingBecauseLiveEdge ? StalledReason.LIVE_EDGE : StalledReason.OTHER;
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "getStalledReason", "stalledReason=" + stalledReason, new Object[0]);
        }
        return stalledReason;
    }

    public final ExtendedStalledReason getStalledReasonWithExplanation$video_player_internalRelease() {
        ExtendedStalledReason extendedStalledReason = new ExtendedStalledReason(getStalledReason(), this.isLoadingBecauseInit, this.isLoadingBecauseSetSource, this.isLoadingBecauseRecover, this.isLoadingBecauseSeeking, this.isLoadingBecauseTrackChanged, this.isLoadingBecauseLiveEdge, this.isFirstEverStart, this.isLoadingByInitOrSetSourceWithoutInitCodec, this.playWhenReady, this.initializedVideoDecoderCounter.get(), this.isAllowPrepareWithoutInitCodec, this.isVideoTrackEnabled, this.isLoadingBecauseAdPlayingStarting, this.isLoadingBecauseAdPlayingEnding, this.lastPlayWhenReadyChanged, this.isPlaybackResumedSinceLastSetSource);
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger) && !jl40.l(this.lastExtendedStalledReason, extendedStalledReason)) {
            this.lastExtendedStalledReason = extendedStalledReason;
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "getStalledReasonWithExplanation done. " + extendedStalledReason, null, new Object[0], 4, null);
        }
        return extendedStalledReason;
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onAdEnd() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onAdEnd done", null, new Object[0], 4, null);
        }
        this.isLoadingBecauseAdPlayingEnding = true;
        this.isLoadingBecauseAdPlayingStarting = false;
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onAdStart(Ad ad) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onAdStart done", null, new Object[0], 4, null);
        }
        this.isLoadingBecauseAdPlayingStarting = true;
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onLoadingFinished() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onLoadingFinished", null, new Object[0], 4, null);
        }
        this.isLoadingBecauseSetSource = false;
        this.isLoadingBecauseRecover = false;
        this.isLoadingBecauseSeeking = false;
        this.isLoadingBecauseTrackChanged = false;
        this.isLoadingBecauseInit = false;
        this.isLoadingBecauseLiveEdge = false;
        this.isLoadingBecauseAdPlayingStarting = false;
        this.isLoadingBecauseAdPlayingEnding = false;
        this.isLoadingByInitOrSetSourceWithoutInitCodec = false;
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onLoadingStart() {
        YandexPlayer<?> yandexPlayer = this.player;
        if (yandexPlayer != null) {
            this.isLoadingBecauseLiveEdge = yandexPlayer.getVideoType() == VideoType.LIVE && yandexPlayer.getAvailableWindowDuration() > 0 && yandexPlayer.getPosition() > 0 && Math.abs(yandexPlayer.getAvailableWindowDuration() - yandexPlayer.getPosition()) < ((long) this.lowerEstimateOfSegmentDurationMs);
        }
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onLoadingStart completed. StalledReason is " + getStalledReason(), null, new Object[0], 4, null);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onNewMediaItem(String url, boolean autoplay) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onNewMediaItem url=" + url + " autoplay=" + autoplay, null, new Object[0], 4, null);
        }
        if (this.lastVideoDataUrl == null) {
            this.isLoadingBecauseInit = true;
        } else {
            this.isLoadingBecauseSetSource = true;
        }
        this.lastVideoDataUrl = url;
        this.isPlaybackResumedSinceLastSetSource = false;
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onPlayerReleased() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onPlayerReleased", null, new Object[0], 4, null);
        }
        this.initializedVideoDecoderCounter.set(0);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onPlayerWillTryRecoverAfterError(PlaybackException playbackException, RecoverDetails recoverDetails) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onPlayerWillTryRecoverAfterError", null, new Object[0], 4, null);
        }
        this.isLoadingBecauseRecover = true;
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onPreparingStarted(PreparingParams params) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onPreparingStarted " + params, null, new Object[0], 4, null);
        }
        this.isFirstEverStart = params.getIsFirstEverStart();
        this.isAllowPrepareWithoutInitCodec = params.getPrepareWithoutInitCodecs();
        if (params.getIsFirstEverStart()) {
            this.isLoadingBecauseInit = true;
        } else {
            this.isLoadingBecauseSetSource = true;
        }
        this.isPlaybackResumedSinceLastSetSource = false;
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onResumePlayback() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onResumePlayback", null, new Object[0], 4, null);
        }
        this.isPlaybackResumedSinceLastSetSource = true;
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onSeek(long newPositionMs, long oldPositionMs) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onSeek", null, new Object[0], 4, null);
        }
        this.isLoadingBecauseSeeking = true;
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onStopPlayback(boolean keepDecoders) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onStopPlayback keepDecoders=" + keepDecoders, null, new Object[0], 4, null);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onTracksChanged(Track audioTrack, Track subtitlesTrack, Track videoTrack) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            StringBuilder sb = new StringBuilder("video=");
            TrackVariant selectedTrackVariant = videoTrack.getSelectedTrackVariant();
            sb.append(selectedTrackVariant != null ? selectedTrackVariant.getTitle() : null);
            sb.append(", audio=");
            TrackVariant selectedTrackVariant2 = audioTrack.getSelectedTrackVariant();
            sb.append(selectedTrackVariant2 != null ? selectedTrackVariant2.getTitle() : null);
            sb.append(", subtitles=");
            TrackVariant selectedTrackVariant3 = subtitlesTrack.getSelectedTrackVariant();
            sb.append(selectedTrackVariant3 != null ? selectedTrackVariant3.getTitle() : null);
            timberPlayerLogger.debug(TAG, "onTracksChanged", sb.toString(), new Object[0]);
        }
        TrackVariant selectedTrackVariant4 = videoTrack.getSelectedTrackVariant();
        boolean isTrackChangedManually = isTrackChangedManually(this.oldVideoTrackVariant, selectedTrackVariant4);
        this.oldVideoTrackVariant = selectedTrackVariant4;
        if (!isTrackChangedManually) {
            TrackVariant selectedTrackVariant5 = audioTrack.getSelectedTrackVariant();
            isTrackChangedManually = isTrackChangedManually(this.oldAudioTrackVariant, selectedTrackVariant5);
            this.oldAudioTrackVariant = selectedTrackVariant5;
        }
        if (isTrackChangedManually) {
            this.isLoadingBecauseTrackChanged = true;
        }
        this.isVideoTrackEnabled = true ^ (videoTrack.getSelectedTrackVariant() instanceof TrackVariant.Disable);
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoDecoderInitialized(String decoderName, long initializedTimestampMs, long initializationDurationMs) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "onVideoDecoderInitialized", null, new Object[0], 4, null);
        }
        this.initializedVideoDecoderCounter.incrementAndGet();
        isVideoDecoderInitialized();
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoDecoderReleased(String decoderName) {
        this.initializedVideoDecoderCounter.decrementAndGet();
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "onVideoDecoderReleased", g8e.o("decoderName: ", decoderName), new Object[0]);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onWillPlayWhenReadyChanged(boolean willPlayWhenReady) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "onWillPlayWhenReadyChanged", "willPlayWhenReady: " + willPlayWhenReady, new Object[0]);
        }
        boolean z = this.playWhenReady;
        this.playWhenReady = willPlayWhenReady;
        this.isLoadingByInitOrSetSourceWithoutInitCodec = isLoadingByInitOrSetSourceWithoutInitCodec();
        this.lastPlayWhenReadyChanged = new LastPlayWhenReadyChanged(z, this.playWhenReady, this.isLoadingByInitOrSetSourceWithoutInitCodec, this.isAllowPrepareWithoutInitCodec, this.isVideoTrackEnabled, this.initializedVideoDecoderCounter.get(), System.currentTimeMillis());
    }

    public final void start(YandexPlayer<?> player) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "start", null, new Object[0], 4, null);
        }
        this.player = player;
        player.addObserver(this);
        player.addAnalyticsObserver(this);
    }

    public final void stop() {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            PlayerLogger.debug$default(timberPlayerLogger, TAG, "stop", null, new Object[0], 4, null);
        }
        YandexPlayer<?> yandexPlayer = this.player;
        if (yandexPlayer != null) {
            yandexPlayer.removeObserver(this);
        }
        YandexPlayer<?> yandexPlayer2 = this.player;
        if (yandexPlayer2 != null) {
            yandexPlayer2.removeAnalyticsObserver(this);
        }
    }
}
