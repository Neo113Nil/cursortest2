package ru.yandex.video.m3.player.impl.listeners;

import androidx.media3.common.PlaybackException;
import defpackage.a9z0;
import defpackage.do31;
import defpackage.fe10;
import defpackage.h5z0;
import defpackage.lxc0;
import defpackage.nnm;
import defpackage.r001;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.ue3;
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
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.AnalyticsListenerExtended;
import ru.yandex.video.m3.player.DummyAnalyticsListenerExtended;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.impl.ExoPlayerExceptionKt;
import ru.yandex.video.m3.player.impl.PlayerEventListenerProxy;
import ru.yandex.video.m3.player.impl.utils.CurrentWindowStateProvider;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.player.utils.TimberPlayerLogger;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/InternalPlayerEventListener;", "Lru/yandex/video/m3/player/impl/PlayerEventListenerProxy;", "Lru/yandex/video/m3/player/AnalyticsListenerExtended;", "analyticsListener", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "dispatcher", "Lru/yandex/video/m3/player/impl/utils/CurrentWindowStateProvider;", "currentWindowStateProvider", "<init>", "(Lru/yandex/video/m3/player/AnalyticsListenerExtended;Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;Lru/yandex/video/m3/player/impl/utils/CurrentWindowStateProvider;)V", "", "", "stateToStr", "(I)Ljava/lang/String;", "", "isDiscontinuitySeekReason", "(I)Z", "Lzy11;", "resetPlayingState", "()V", "playWhenReady", "playbackState", InternalPlayerEventListener.ON_PLAYER_STATE_CHANGED, "(ZI)V", "Lyxc0;", "oldPosition", "newPosition", CRLReasonCodeExtension.REASON, InternalPlayerEventListener.ON_POSITION_DISCONTINUITY, "(Lyxc0;Lyxc0;I)V", "Landroidx/media3/common/PlaybackException;", "error", "onPlayerError", "(Landroidx/media3/common/PlaybackException;)V", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/impl/utils/CurrentWindowStateProvider;", "Lru/yandex/video/m3/player/AnalyticsListenerExtended;", "oldPlaybackState", CA20Status.STATUS_USER_I, "oldPlayWhenReady", "Z", "isFirstTimeBuffered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isContentPlaying", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lastUrl", "Ljava/lang/String;", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "logger", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalPlayerEventListener extends PlayerEventListenerProxy {
    private static final String ON_PLAYER_STATE_CHANGED = "onPlayerStateChanged";
    private static final String ON_POSITION_DISCONTINUITY = "onPositionDiscontinuity";
    private static final String TAG = "InternalPlayerEventListener";
    private final AnalyticsListenerExtended analyticsListener;
    private final CurrentWindowStateProvider currentWindowStateProvider;
    private final ObserverDispatcher<PlayerDelegate.Observer> dispatcher;
    private final AtomicBoolean isContentPlaying;
    private boolean isFirstTimeBuffered;
    private String lastUrl;
    private final TimberPlayerLogger logger;
    private boolean oldPlayWhenReady;
    private int oldPlaybackState;
    public static final int $stable = 8;

    public InternalPlayerEventListener(AnalyticsListenerExtended analyticsListenerExtended, ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher, CurrentWindowStateProvider currentWindowStateProvider) {
        this.dispatcher = observerDispatcher;
        this.currentWindowStateProvider = currentWindowStateProvider;
        this.analyticsListener = analyticsListenerExtended == null ? DummyAnalyticsListenerExtended.INSTANCE : analyticsListenerExtended;
        this.oldPlaybackState = -1;
        this.isContentPlaying = new AtomicBoolean(false);
        this.lastUrl = "";
        this.logger = new TimberPlayerLogger();
    }

    private final boolean isDiscontinuitySeekReason(int i) {
        return i == 1;
    }

    private final String stateToStr(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
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
    public /* bridge */ /* synthetic */ void onMediaItemTransition(fe10 fe10Var, int i) {
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
    public void onPlayerError(PlaybackException error) {
        HashSet H0;
        Object failure;
        ru.yandex.video.m3.player.PlaybackException playerError = ExoPlayerExceptionKt.toPlayerError(error);
        this.analyticsListener.onConvertedPlayerError(playerError);
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onError(playerError);
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

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
        HashSet H0;
        Object failure;
        HashSet H02;
        Object failure2;
        HashSet H03;
        Object failure3;
        HashSet H04;
        Object failure4;
        zd10 zd10Var;
        HashSet H05;
        Object failure5;
        HashSet H06;
        Object failure6;
        HashSet H07;
        Object failure7;
        HashSet H08;
        Object failure8;
        HashSet H09;
        Object failure9;
        HashSet H010;
        Object failure10;
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            StringBuilder sb = new StringBuilder("oldPlayWhenReady=");
            nnm.v(" playWhenReady=", " isPlaying=", sb, this.oldPlayWhenReady, playWhenReady);
            sb.append(this.isContentPlaying);
            sb.append(" playbackState=");
            sb.append(stateToStr(playbackState));
            timberPlayerLogger.debug(TAG, ON_PLAYER_STATE_CHANGED, sb.toString(), new Object[0]);
            timberPlayerLogger.debug(TAG, ON_PLAYER_STATE_CHANGED, "oldPlaybackState=" + stateToStr(this.oldPlaybackState), new Object[0]);
        }
        this.analyticsListener.onPlaybackStateChanged(playWhenReady, playbackState, this.oldPlaybackState);
        if (this.oldPlayWhenReady != playWhenReady) {
            ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H010 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H010.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerDelegate.Observer) it.next()).onWillPlayWhenReadyChanged(playWhenReady);
                    failure10 = zy11.a;
                } catch (Throwable th) {
                    failure10 = new Result.Failure(th);
                }
                Throwable a = Result.a(failure10);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }
        if (playbackState != 1) {
            if (playbackState == 2) {
                this.isFirstTimeBuffered = true;
                fe10 currentMediaItem = this.currentWindowStateProvider.getCurrentMediaItem();
                String valueOf = String.valueOf((currentMediaItem == null || (zd10Var = currentMediaItem.b) == null) ? null : zd10Var.a);
                if (!valueOf.equals(this.lastUrl)) {
                    TimberPlayerLogger timberPlayerLogger2 = this.logger;
                    if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger2)) {
                        timberPlayerLogger2.debug(TAG, ON_PLAYER_STATE_CHANGED, "onNewMediaItem playWhenReady=" + playWhenReady, new Object[0]);
                    }
                    ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher2 = this.dispatcher;
                    synchronized (observerDispatcher2.getObservers()) {
                        H04 = a.H0(observerDispatcher2.getObservers());
                    }
                    Iterator it2 = H04.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((PlayerDelegate.Observer) it2.next()).onNewMediaItem(valueOf, playWhenReady);
                            failure4 = zy11.a;
                        } catch (Throwable th2) {
                            failure4 = new Result.Failure(th2);
                        }
                        Throwable a2 = Result.a(failure4);
                        if (a2 != null) {
                            h5z0.a.f(a2, "notifyObservers", new Object[0]);
                        }
                    }
                    this.lastUrl = valueOf;
                }
                TimberPlayerLogger timberPlayerLogger3 = this.logger;
                if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger3)) {
                    StringBuilder sb2 = new StringBuilder("p f1=");
                    sb2.append(this.currentWindowStateProvider.getCurrentPosition() < this.currentWindowStateProvider.getDuration());
                    sb2.append(" f2=");
                    sb2.append(this.currentWindowStateProvider.getDuration() == -9223372036854775807L && this.oldPlaybackState != 2);
                    timberPlayerLogger3.debug(TAG, ON_PLAYER_STATE_CHANGED, sb2.toString(), new Object[0]);
                }
                if (this.currentWindowStateProvider.getCurrentPosition() < this.currentWindowStateProvider.getDuration() || (this.currentWindowStateProvider.getDuration() == -9223372036854775807L && this.oldPlaybackState != 2)) {
                    ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher3 = this.dispatcher;
                    synchronized (observerDispatcher3.getObservers()) {
                        H02 = a.H0(observerDispatcher3.getObservers());
                    }
                    Iterator it3 = H02.iterator();
                    while (it3.hasNext()) {
                        try {
                            ((PlayerDelegate.Observer) it3.next()).onBufferingStart();
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
                if (!playWhenReady && (this.isContentPlaying.compareAndSet(true, false) || this.oldPlayWhenReady)) {
                    ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher4 = this.dispatcher;
                    synchronized (observerDispatcher4.getObservers()) {
                        H03 = a.H0(observerDispatcher4.getObservers());
                    }
                    Iterator it4 = H03.iterator();
                    while (it4.hasNext()) {
                        try {
                            ((PlayerDelegate.Observer) it4.next()).onPausePlayback();
                            failure3 = zy11.a;
                        } catch (Throwable th4) {
                            failure3 = new Result.Failure(th4);
                        }
                        Throwable a4 = Result.a(failure3);
                        if (a4 != null) {
                            h5z0.a.f(a4, "notifyObservers", new Object[0]);
                        }
                    }
                }
            } else if (playbackState == 3) {
                if (this.oldPlaybackState == 2) {
                    ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher5 = this.dispatcher;
                    synchronized (observerDispatcher5.getObservers()) {
                        H07 = a.H0(observerDispatcher5.getObservers());
                    }
                    Iterator it5 = H07.iterator();
                    while (it5.hasNext()) {
                        try {
                            ((PlayerDelegate.Observer) it5.next()).onBufferingEnd();
                            failure7 = zy11.a;
                        } catch (Throwable th5) {
                            failure7 = new Result.Failure(th5);
                        }
                        Throwable a5 = Result.a(failure7);
                        if (a5 != null) {
                            h5z0.a.f(a5, "notifyObservers", new Object[0]);
                        }
                    }
                }
                if (playWhenReady && this.isContentPlaying.compareAndSet(false, true)) {
                    ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher6 = this.dispatcher;
                    synchronized (observerDispatcher6.getObservers()) {
                        H06 = a.H0(observerDispatcher6.getObservers());
                    }
                    Iterator it6 = H06.iterator();
                    while (it6.hasNext()) {
                        try {
                            ((PlayerDelegate.Observer) it6.next()).onResumePlayback();
                            failure6 = zy11.a;
                        } catch (Throwable th6) {
                            failure6 = new Result.Failure(th6);
                        }
                        Throwable a6 = Result.a(failure6);
                        if (a6 != null) {
                            h5z0.a.f(a6, "notifyObservers", new Object[0]);
                        }
                    }
                } else if (!playWhenReady && this.oldPlaybackState == 3 && this.isContentPlaying.compareAndSet(true, false)) {
                    ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher7 = this.dispatcher;
                    synchronized (observerDispatcher7.getObservers()) {
                        H05 = a.H0(observerDispatcher7.getObservers());
                    }
                    Iterator it7 = H05.iterator();
                    while (it7.hasNext()) {
                        try {
                            ((PlayerDelegate.Observer) it7.next()).onPausePlayback();
                            failure5 = zy11.a;
                        } catch (Throwable th7) {
                            failure5 = new Result.Failure(th7);
                        }
                        Throwable a7 = Result.a(failure5);
                        if (a7 != null) {
                            h5z0.a.f(a7, "notifyObservers", new Object[0]);
                        }
                    }
                }
            } else if (playbackState == 4 && playWhenReady && this.oldPlaybackState != 4) {
                if (this.isContentPlaying.compareAndSet(true, false)) {
                    ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher8 = this.dispatcher;
                    synchronized (observerDispatcher8.getObservers()) {
                        H09 = a.H0(observerDispatcher8.getObservers());
                    }
                    Iterator it8 = H09.iterator();
                    while (it8.hasNext()) {
                        try {
                            ((PlayerDelegate.Observer) it8.next()).onPausePlayback();
                            failure9 = zy11.a;
                        } catch (Throwable th8) {
                            failure9 = new Result.Failure(th8);
                        }
                        Throwable a8 = Result.a(failure9);
                        if (a8 != null) {
                            h5z0.a.f(a8, "notifyObservers", new Object[0]);
                        }
                    }
                }
                ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher9 = this.dispatcher;
                synchronized (observerDispatcher9.getObservers()) {
                    H08 = a.H0(observerDispatcher9.getObservers());
                }
                Iterator it9 = H08.iterator();
                while (it9.hasNext()) {
                    try {
                        ((PlayerDelegate.Observer) it9.next()).onPlaybackEnded();
                        failure8 = zy11.a;
                    } catch (Throwable th9) {
                        failure8 = new Result.Failure(th9);
                    }
                    Throwable a9 = Result.a(failure8);
                    if (a9 != null) {
                        h5z0.a.f(a9, "notifyObservers", new Object[0]);
                    }
                }
            }
        } else if (playWhenReady && this.oldPlaybackState == 3 && this.isContentPlaying.compareAndSet(true, false)) {
            ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher10 = this.dispatcher;
            synchronized (observerDispatcher10.getObservers()) {
                H0 = a.H0(observerDispatcher10.getObservers());
            }
            Iterator it10 = H0.iterator();
            while (it10.hasNext()) {
                try {
                    ((PlayerDelegate.Observer) it10.next()).onPausePlayback();
                    failure = zy11.a;
                } catch (Throwable th10) {
                    failure = new Result.Failure(th10);
                }
                Throwable a10 = Result.a(failure);
                if (a10 != null) {
                    h5z0.a.f(a10, "notifyObservers", new Object[0]);
                }
            }
        }
        this.oldPlayWhenReady = playWhenReady;
        this.oldPlaybackState = playbackState;
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(re10 re10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public void onPositionDiscontinuity(yxc0 oldPosition, yxc0 newPosition, int reason) {
        HashSet H0;
        Object failure;
        this.analyticsListener.onPositionDiscontinuity(this.isFirstTimeBuffered, newPosition.f, oldPosition.f);
        if (isDiscontinuitySeekReason(reason) && this.isFirstTimeBuffered) {
            ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerDelegate.Observer) it.next()).onSeek(newPosition.f, oldPosition.f);
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
    public /* bridge */ /* synthetic */ void onTimelineChanged(a9z0 a9z0Var, int i) {
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

    public final void resetPlayingState() {
        this.isContentPlaying.set(false);
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
    }
}
