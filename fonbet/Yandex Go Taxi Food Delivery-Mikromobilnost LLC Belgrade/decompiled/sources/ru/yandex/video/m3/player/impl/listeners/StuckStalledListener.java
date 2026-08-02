package ru.yandex.video.m3.player.impl.listeners;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.a9z0;
import defpackage.do31;
import defpackage.fe10;
import defpackage.h5z0;
import defpackage.lxc0;
import defpackage.nwy;
import defpackage.owy;
import defpackage.r001;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.sf10;
import defpackage.ue3;
import defpackage.vxc0;
import defpackage.vyc0;
import defpackage.w820;
import defpackage.wxc0;
import defpackage.x8z0;
import defpackage.xaj;
import defpackage.yxc0;
import defpackage.zxc0;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.data.loadcontrol.LoadControlState;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.impl.PlayerEventListenerProxy;
import ru.yandex.video.m3.player.impl.load_control.YandexLoadControl;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.parameters.StuckStalledConfig;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001#B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/StuckStalledListener;", "Lru/yandex/video/m3/player/impl/PlayerEventListenerProxy;", "Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;", "loadControl", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "dispatcher", "Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", ConfigConstants.CONFIG, "Landroid/os/Looper;", "exoThreadLooper", "<init>", "(Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;Landroidx/media3/exoplayer/ExoPlayer;Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;Lru/yandex/video/m3/player/parameters/StuckStalledConfig;Landroid/os/Looper;)V", "Lzy11;", "scheduleAlarm", "()V", "cancelAlarm", "onSeekCalled", "", "playWhenReady", "", "playbackState", "onPlayerStateChanged", "(ZI)V", "Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;", "Landroidx/media3/exoplayer/ExoPlayer;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", "Landroid/os/Handler;", "currentExoThreadHandler", "Landroid/os/Handler;", "isSeekStalled", "Z", "StuckStalledAlarm", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StuckStalledListener extends PlayerEventListenerProxy {
    public static final int $stable = 8;
    private final StuckStalledConfig config;
    private final Handler currentExoThreadHandler;
    private final ObserverDispatcher<PlayerDelegate.Observer> dispatcher;
    private final ExoPlayer exoPlayer;
    private boolean isSeekStalled;
    private final YandexLoadControl loadControl;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/StuckStalledListener$StuckStalledAlarm;", "Ljava/lang/Runnable;", "Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;", "loadControl", "Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "dispatcher", "Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", ConfigConstants.CONFIG, "<init>", "(Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;Landroidx/media3/exoplayer/ExoPlayer;Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;Lru/yandex/video/m3/player/parameters/StuckStalledConfig;)V", "Lzy11;", "run", "()V", "Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;", "Landroidx/media3/exoplayer/ExoPlayer;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StuckStalledAlarm implements Runnable {
        private final StuckStalledConfig config;
        private final ObserverDispatcher<PlayerDelegate.Observer> dispatcher;
        private final ExoPlayer exoPlayer;
        private final YandexLoadControl loadControl;

        public StuckStalledAlarm(YandexLoadControl yandexLoadControl, ExoPlayer exoPlayer, ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher, StuckStalledConfig stuckStalledConfig) {
            this.loadControl = yandexLoadControl;
            this.exoPlayer = exoPlayer;
            this.dispatcher = observerDispatcher;
            this.config = stuckStalledConfig;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashSet H0;
            Object failure;
            HashSet H02;
            Object failure2;
            LoadControlState loadControlState = this.loadControl.getLoadControlState();
            YandexLoadControl yandexLoadControl = this.loadControl;
            vyc0 vyc0Var = vyc0.d;
            x8z0 x8z0Var = a9z0.a;
            sf10 sf10Var = owy.F2;
            long contentPosition = this.exoPlayer.getContentPosition() * 1000;
            long totalBufferedDuration = 1000 * this.exoPlayer.getTotalBufferedDuration();
            float f = this.exoPlayer.getPlaybackParameters().a;
            this.exoPlayer.getPlayWhenReady();
            boolean shouldContinueLoading = yandexLoadControl.shouldContinueLoading(new nwy(vyc0Var, x8z0Var, sf10Var, contentPosition, totalBufferedDuration, f, false, 100500L));
            boolean z = this.exoPlayer.getTotalBufferedDuration() >= this.config.getMinimumBufferForAlertMs();
            if (this.config.getProduceJustNonFatalErrors() || (this.config.getFatalOnlyIfShouldContinueLoadingIsFalse() && shouldContinueLoading)) {
                z = false;
            }
            ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
            if (z) {
                synchronized (observerDispatcher.getObservers()) {
                    H02 = a.H0(observerDispatcher.getObservers());
                }
                Iterator it = H02.iterator();
                while (it.hasNext()) {
                    try {
                        ((PlayerDelegate.Observer) it.next()).onError(new PlaybackException.ErrorStalledStuck(new RuntimeException(String.valueOf(loadControlState)), loadControlState));
                        failure2 = zy11.a;
                    } catch (Throwable th) {
                        failure2 = new Result.Failure(th);
                    }
                    Throwable a = Result.a(failure2);
                    if (a != null) {
                        h5z0.a.f(a, "notifyObservers", new Object[0]);
                    }
                }
                return;
            }
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it2 = H0.iterator();
            while (it2.hasNext()) {
                try {
                    ((PlayerDelegate.Observer) it2.next()).onNonFatalError(new PlaybackException.ErrorStalledStuck(new RuntimeException(String.valueOf(loadControlState)), loadControlState));
                    failure = zy11.a;
                } catch (Throwable th2) {
                    failure = new Result.Failure(th2);
                }
                Throwable a2 = Result.a(failure);
                if (a2 != null) {
                    h5z0.a.f(a2, "notifyObservers", new Object[0]);
                }
            }
        }
    }

    public StuckStalledListener(YandexLoadControl yandexLoadControl, ExoPlayer exoPlayer, ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher, StuckStalledConfig stuckStalledConfig, Looper looper) {
        this.loadControl = yandexLoadControl;
        this.exoPlayer = exoPlayer;
        this.dispatcher = observerDispatcher;
        this.config = stuckStalledConfig;
        this.currentExoThreadHandler = new Handler(looper);
    }

    private final void cancelAlarm() {
        this.isSeekStalled = false;
        this.currentExoThreadHandler.removeCallbacksAndMessages(null);
    }

    private final void scheduleAlarm() {
        cancelAlarm();
        if (!this.config.getWatchOnlySeekStalled() || this.isSeekStalled) {
            this.currentExoThreadHandler.postDelayed(new StuckStalledAlarm(this.loadControl, this.exoPlayer, this.dispatcher, this.config), this.config.getAlarmPeriodMs());
        }
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
    public /* bridge */ /* synthetic */ void onPlayerError(androidx.media3.common.PlaybackException playbackException) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(androidx.media3.common.PlaybackException playbackException) {
    }

    @Override // ru.yandex.video.m3.player.impl.PlayerEventListenerProxy, defpackage.xxc0
    public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
        if (playbackState == 2) {
            scheduleAlarm();
        } else {
            cancelAlarm();
        }
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

    public final void onSeekCalled() {
        this.isSeekStalled = true;
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
}
