package ru.yandex.video.m3.player.impl.listeners;

import android.net.Uri;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.a70;
import defpackage.a9z0;
import defpackage.do31;
import defpackage.egg;
import defpackage.fe10;
import defpackage.h5z0;
import defpackage.knu;
import defpackage.lxc0;
import defpackage.nmh;
import defpackage.r001;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.s4j0;
import defpackage.ue3;
import defpackage.vmh;
import defpackage.vxc0;
import defpackage.w820;
import defpackage.wxc0;
import defpackage.xaj;
import defpackage.yxc0;
import defpackage.zd10;
import defpackage.zxc0;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.impl.PlayerEventListenerProxy;
import ru.yandex.video.m3.player.impl.debug.StartPositionValidator;
import ru.yandex.video.m3.player.impl.utils.CurrentWindowStateProvider;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.impl.utils.manifest_parsers.DashCappingParser;
import ru.yandex.video.m3.player.impl.utils.manifest_parsers.DashVideoSupplementalPropParser;
import ru.yandex.video.m3.player.impl.utils.manifest_parsers.HlsSessionDataParser;
import ru.yandex.video.m3.player.impl.utils.manifest_parsers.VideoTrackNameFromManifestParser;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001c\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u0015J!\u0010#\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0013¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010/R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00100R.\u00102\u001a\u0004\u0018\u00010\u00162\b\u00101\u001a\u0004\u0018\u00010\u00168\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u00109\u001a\u0004\u0018\u00010\u00192\b\u00108\u001a\u0004\u0018\u00010\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010>\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/TimelineChangeListener;", "Lru/yandex/video/m3/player/impl/PlayerEventListenerProxy;", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "Lru/yandex/video/m3/player/PlayerDelegate;", "playerDelegate", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "dispatcher", "Lvmh;", "trackSelector", "Lru/yandex/video/m3/player/impl/utils/CurrentWindowStateProvider;", "currentWindowStateProvider", "Lru/yandex/video/m3/player/impl/debug/StartPositionValidator;", "startPositionValidator", "<init>", "(Landroidx/media3/exoplayer/ExoPlayer;Lru/yandex/video/m3/player/PlayerDelegate;Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;Lvmh;Lru/yandex/video/m3/player/impl/utils/CurrentWindowStateProvider;Lru/yandex/video/m3/player/impl/debug/StartPositionValidator;)V", "", "manifest", "Lzy11;", "updateStreamAndVideoType", "(Ljava/lang/Object;)V", "Lru/yandex/video/m3/data/VideoType;", "oldVideoType", "newVideoType", "Lru/yandex/video/m3/data/StreamType;", "oldStreamType", "newStreamType", "maybeNotifyVideoOrStreamTypeUpdate", "(Lru/yandex/video/m3/data/VideoType;Lru/yandex/video/m3/data/VideoType;Lru/yandex/video/m3/data/StreamType;Lru/yandex/video/m3/data/StreamType;)V", "parseManifest", "Lfe10;", "mediaItem", "", CRLReasonCodeExtension.REASON, "onMediaItemTransition", "(Lfe10;I)V", "La9z0;", "timeline", "onTimelineChanged", "(La9z0;I)V", "resetJumpToLiveState", "()V", "Landroidx/media3/exoplayer/ExoPlayer;", "Lru/yandex/video/m3/player/PlayerDelegate;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lvmh;", "Lru/yandex/video/m3/player/impl/utils/CurrentWindowStateProvider;", "Lru/yandex/video/m3/player/impl/debug/StartPositionValidator;", "value", "videoType", "Lru/yandex/video/m3/data/VideoType;", "getVideoType", "()Lru/yandex/video/m3/data/VideoType;", "setVideoType", "(Lru/yandex/video/m3/data/VideoType;)V", "<set-?>", "streamType", "Lru/yandex/video/m3/data/StreamType;", "getStreamType", "()Lru/yandex/video/m3/data/StreamType;", "Lru/yandex/video/m3/player/impl/utils/manifest_parsers/VideoTrackNameFromManifestParser;", "videoTrackNameFromManifestParser", "Lru/yandex/video/m3/player/impl/utils/manifest_parsers/VideoTrackNameFromManifestParser;", "getVideoTrackNameFromManifestParser", "()Lru/yandex/video/m3/player/impl/utils/manifest_parsers/VideoTrackNameFromManifestParser;", "", "previousDuration", "J", "previousTimelineLeftEdge", "", "isTriedJumpToLive", "Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimelineChangeListener extends PlayerEventListenerProxy {
    public static final int $stable = 8;
    private final CurrentWindowStateProvider currentWindowStateProvider;
    private final ObserverDispatcher<PlayerDelegate.Observer> dispatcher;
    private final ExoPlayer exoPlayer;
    private boolean isTriedJumpToLive;
    private final PlayerDelegate<?> playerDelegate;
    private final StartPositionValidator startPositionValidator;
    private StreamType streamType;
    private final vmh trackSelector;
    private VideoType videoType;
    private final VideoTrackNameFromManifestParser videoTrackNameFromManifestParser = new VideoTrackNameFromManifestParser();
    private long previousDuration = -9223372036854775807L;
    private long previousTimelineLeftEdge = -9223372036854775807L;

    public TimelineChangeListener(ExoPlayer exoPlayer, PlayerDelegate<?> playerDelegate, ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher, vmh vmhVar, CurrentWindowStateProvider currentWindowStateProvider, StartPositionValidator startPositionValidator) {
        this.exoPlayer = exoPlayer;
        this.playerDelegate = playerDelegate;
        this.dispatcher = observerDispatcher;
        this.trackSelector = vmhVar;
        this.currentWindowStateProvider = currentWindowStateProvider;
        this.startPositionValidator = startPositionValidator;
    }

    private final void maybeNotifyVideoOrStreamTypeUpdate(VideoType oldVideoType, VideoType newVideoType, StreamType oldStreamType, StreamType newStreamType) {
        HashSet H0;
        Object failure;
        if (oldVideoType == newVideoType && oldStreamType == newStreamType) {
            return;
        }
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onVideoAndStreamTypeChanged(newVideoType, newStreamType);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    private final void parseManifest(Object manifest) {
        if (manifest instanceof knu) {
            this.videoTrackNameFromManifestParser.parse(new HlsSessionDataParser((knu) manifest));
            return;
        }
        if (manifest instanceof egg) {
            DashVideoSupplementalPropParser dashVideoSupplementalPropParser = new DashVideoSupplementalPropParser((egg) manifest);
            this.videoTrackNameFromManifestParser.parse(dashVideoSupplementalPropParser);
            Integer parse = new DashCappingParser().parse(dashVideoSupplementalPropParser);
            if (parse != null) {
                int intValue = parse.intValue();
                nmh buildUponParameters = this.trackSelector.buildUponParameters();
                if (intValue < this.trackSelector.getParameters().b) {
                    buildUponParameters.a = this.trackSelector.getParameters().a;
                    buildUponParameters.b = intValue;
                    this.trackSelector.setParameters(buildUponParameters);
                }
            }
        }
    }

    private final void setVideoType(VideoType videoType) {
        this.videoType = videoType;
        if (videoType != null) {
            this.startPositionValidator.onVideoTypeDetected(videoType);
        }
    }

    private final void updateStreamAndVideoType(Object manifest) {
        StreamType streamType;
        VideoType videoType;
        a70 a70Var;
        List list;
        s4j0 s4j0Var;
        VideoType videoType2 = this.videoType;
        StreamType streamType2 = this.streamType;
        if (manifest instanceof knu) {
            int i = ((knu) manifest).b.d;
            videoType = i != 1 ? i != 2 ? this.currentWindowStateProvider.isCurrentWindowDynamic() ? VideoType.LIVE : VideoType.VOD : VideoType.EVENT : VideoType.VOD;
            streamType = StreamType.Hls;
        } else if (manifest instanceof egg) {
            if (this.currentWindowStateProvider.isCurrentWindowDynamic()) {
                egg eggVar = (egg) manifest;
                videoType = (eggVar.getPeriodCount() <= 0 || (a70Var = (a70) a.R(eggVar.getPeriod(0).c)) == null || (list = a70Var.c) == null || (s4j0Var = (s4j0) a.R(list)) == null || s4j0Var.c != 0) ? VideoType.EVENT : VideoType.LIVE;
            } else {
                videoType = VideoType.VOD;
            }
            streamType = StreamType.Dash;
        } else {
            streamType = StreamType.Unknown;
            videoType = null;
        }
        setVideoType(videoType);
        this.streamType = streamType;
        maybeNotifyVideoOrStreamTypeUpdate(videoType2, videoType, streamType2, streamType);
    }

    public final StreamType getStreamType() {
        return this.streamType;
    }

    public final VideoTrackNameFromManifestParser getVideoTrackNameFromManifestParser() {
        return this.videoTrackNameFromManifestParser;
    }

    public final VideoType getVideoType() {
        return this.videoType;
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(ue3 ue3Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(vxc0 vxc0Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onCues(rdf rdfVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(xaj xajVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onEvents(zxc0 zxc0Var, wxc0 wxc0Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public void onMediaItemTransition(fe10 mediaItem, int reason) {
        zd10 zd10Var;
        Uri uri;
        if (mediaItem == null || (zd10Var = mediaItem.b) == null || (uri = zd10Var.a) == null) {
            return;
        }
        this.startPositionValidator.onMediaItemTransition(uri);
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(re10 re10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onMetadata(w820 w820Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(lxc0 lxc0Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlayerError(PlaybackException playbackException) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(re10 re10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public void onTimelineChanged(a9z0 timeline, int reason) {
        HashSet H0;
        Object failure;
        HashSet H02;
        Object failure2;
        HashSet H03;
        Object failure3;
        Object currentManifest = this.exoPlayer.getCurrentManifest();
        if (currentManifest != null) {
            updateStreamAndVideoType(currentManifest);
            parseManifest(currentManifest);
        }
        long duration = this.playerDelegate.getDuration();
        if (duration != this.previousDuration) {
            ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H03 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H03.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerDelegate.Observer) it.next()).onDurationChanged(duration);
                    failure3 = zy11.a;
                } catch (Throwable th) {
                    failure3 = new Result.Failure(th);
                }
                Throwable a = Result.a(failure3);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            this.previousDuration = duration;
        }
        if (this.previousTimelineLeftEdge == -9223372036854775807L || this.videoType != VideoType.VOD) {
            long timelineLeftEdge = this.playerDelegate.getTimelineLeftEdge();
            if ((timelineLeftEdge > 0 || this.videoType == VideoType.VOD) && timelineLeftEdge != this.previousTimelineLeftEdge) {
                ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher2 = this.dispatcher;
                synchronized (observerDispatcher2.getObservers()) {
                    H0 = a.H0(observerDispatcher2.getObservers());
                }
                Iterator it2 = H0.iterator();
                while (it2.hasNext()) {
                    try {
                        ((PlayerDelegate.Observer) it2.next()).onTimelineLeftEdgeChanged(timelineLeftEdge);
                        failure = zy11.a;
                    } catch (Throwable th2) {
                        failure = new Result.Failure(th2);
                    }
                    Throwable a2 = Result.a(failure);
                    if (a2 != null) {
                        h5z0.a.f(a2, "notifyObservers", new Object[0]);
                    }
                }
                this.previousTimelineLeftEdge = timelineLeftEdge;
            }
        }
        if (duration <= 0 || this.isTriedJumpToLive) {
            return;
        }
        this.isTriedJumpToLive = true;
        if (duration >= this.playerDelegate.getPosition().getCurrentPosition() || this.videoType == VideoType.VOD) {
            return;
        }
        StreamType streamType = this.streamType;
        if (streamType != StreamType.Hls) {
            if (streamType == StreamType.Dash) {
                h5z0.a.o("Start position of content was out of broadcast window. Player will seek to live edge!", new Object[0]);
                PlayerDelegate<?> playerDelegate = this.playerDelegate;
                playerDelegate.seekTo(playerDelegate.getLiveEdgePosition());
                return;
            }
            return;
        }
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher3 = this.dispatcher;
        synchronized (observerDispatcher3.getObservers()) {
            H02 = a.H0(observerDispatcher3.getObservers());
        }
        Iterator it3 = H02.iterator();
        while (it3.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it3.next()).onError(new PlaybackException.HLSLiveRequestsStartOutOfLiveWindow());
                failure2 = zy11.a;
            } catch (Throwable th3) {
                failure2 = new Result.Failure(th3);
            }
            Throwable a3 = Result.a(failure2);
            if (a3 != null) {
                h5z0.a.f(a3, "notifyObservers", new Object[0]);
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(r001 r001Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onTracksChanged(r801 r801Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(do31 do31Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
    }

    public final void resetJumpToLiveState() {
        this.isTriedJumpToLive = false;
    }
}
