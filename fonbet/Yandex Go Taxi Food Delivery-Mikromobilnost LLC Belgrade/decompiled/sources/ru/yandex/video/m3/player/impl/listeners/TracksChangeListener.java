package ru.yandex.video.m3.player.impl.listeners;

import androidx.media3.common.PlaybackException;
import defpackage.a9z0;
import defpackage.do31;
import defpackage.fe10;
import defpackage.h5z0;
import defpackage.lxc0;
import defpackage.r001;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.ue3;
import defpackage.vmh;
import defpackage.vxc0;
import defpackage.w820;
import defpackage.wxc0;
import defpackage.xaj;
import defpackage.xv00;
import defpackage.xxc0;
import defpackage.yxc0;
import defpackage.zxc0;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.yandex.video.m3.player.AnalyticsListenerExtended;
import ru.yandex.video.m3.player.DummyAnalyticsListenerExtended;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.impl.PlaybackDebugHelper;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/TracksChangeListener;", "Lxxc0;", "Lru/yandex/video/m3/player/AnalyticsListenerExtended;", "analyticsListener", "Lvmh;", "trackSelector", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "dispatcher", "<init>", "(Lru/yandex/video/m3/player/AnalyticsListenerExtended;Lvmh;Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;)V", "Lr801;", "tracks", "Lzy11;", "onTracksChanged", "(Lr801;)V", "Lvmh;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/AnalyticsListenerExtended;", "lastSeenTracks", "Lr801;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TracksChangeListener implements xxc0 {
    public static final int $stable = 8;
    private final AnalyticsListenerExtended analyticsListener;
    private final ObserverDispatcher<PlayerDelegate.Observer> dispatcher;
    private r801 lastSeenTracks;
    private final vmh trackSelector;

    public TracksChangeListener(AnalyticsListenerExtended analyticsListenerExtended, vmh vmhVar, ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher) {
        this.trackSelector = vmhVar;
        this.dispatcher = observerDispatcher;
        this.analyticsListener = analyticsListenerExtended == null ? DummyAnalyticsListenerExtended.INSTANCE : analyticsListenerExtended;
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(ue3 ue3Var) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(vxc0 vxc0Var) {
    }

    @Override // defpackage.xxc0
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onCues(rdf rdfVar) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(xaj xajVar) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onEvents(zxc0 zxc0Var, wxc0 wxc0Var) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
    }

    @Override // defpackage.xxc0
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
    }

    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onMediaItemTransition(fe10 fe10Var, int i) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(re10 re10Var) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onMetadata(w820 w820Var) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(lxc0 lxc0Var) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlayerError(PlaybackException playbackException) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // defpackage.xxc0
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(re10 re10Var) {
    }

    @Override // defpackage.xxc0
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
    }

    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
    }

    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onTimelineChanged(a9z0 a9z0Var, int i) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(r001 r001Var) {
    }

    @Override // defpackage.xxc0
    public void onTracksChanged(r801 tracks) {
        HashSet H0;
        HashSet H02;
        Object failure;
        HashSet H03;
        Object failure2;
        Object failure3;
        this.analyticsListener.onTrackChangedSuccessfully(tracks, this.trackSelector.getCurrentMappedTrackInfo());
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onTracksChanged();
                failure3 = zy11.a;
            } catch (Throwable th) {
                failure3 = new Result.Failure(th);
            }
            Throwable a = Result.a(failure3);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        if (tracks != this.lastSeenTracks) {
            xv00 currentMappedTrackInfo = this.trackSelector.getCurrentMappedTrackInfo();
            if (currentMappedTrackInfo != null) {
                if (currentMappedTrackInfo.a(2) == 1) {
                    ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher2 = this.dispatcher;
                    synchronized (observerDispatcher2.getObservers()) {
                        H03 = a.H0(observerDispatcher2.getObservers());
                    }
                    Iterator it2 = H03.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((PlayerDelegate.Observer) it2.next()).onNoSupportedTracksForRenderer(TrackType.Video, PlaybackDebugHelper.INSTANCE.logTrackSelection(this.trackSelector, tracks));
                            failure2 = zy11.a;
                        } catch (Throwable th2) {
                            failure2 = new Result.Failure(th2);
                        }
                        Throwable a2 = Result.a(failure2);
                        if (a2 != null) {
                            h5z0.a.f(a2, "notifyObservers", new Object[0]);
                        }
                    }
                }
                if (currentMappedTrackInfo.a(1) == 1) {
                    ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher3 = this.dispatcher;
                    synchronized (observerDispatcher3.getObservers()) {
                        H02 = a.H0(observerDispatcher3.getObservers());
                    }
                    Iterator it3 = H02.iterator();
                    while (it3.hasNext()) {
                        try {
                            ((PlayerDelegate.Observer) it3.next()).onNoSupportedTracksForRenderer(TrackType.Audio, PlaybackDebugHelper.INSTANCE.logTrackSelection(this.trackSelector, tracks));
                            failure = zy11.a;
                        } catch (Throwable th3) {
                            failure = new Result.Failure(th3);
                        }
                        Throwable a3 = Result.a(failure);
                        if (a3 != null) {
                            h5z0.a.f(a3, "notifyObservers", new Object[0]);
                        }
                    }
                }
            }
            this.lastSeenTracks = tracks;
        }
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(do31 do31Var) {
    }

    @Override // defpackage.xxc0
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
    }
}
