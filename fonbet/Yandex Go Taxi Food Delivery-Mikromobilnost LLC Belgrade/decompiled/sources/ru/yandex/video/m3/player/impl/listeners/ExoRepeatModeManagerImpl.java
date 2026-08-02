package ru.yandex.video.m3.player.impl.listeners;

import androidx.media3.common.PlaybackException;
import defpackage.a9z0;
import defpackage.do31;
import defpackage.fe10;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.lxc0;
import defpackage.r001;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.sls;
import defpackage.ue3;
import defpackage.vxc0;
import defpackage.w511;
import defpackage.w820;
import defpackage.wxc0;
import defpackage.xaj;
import defpackage.yxc0;
import defpackage.zxc0;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.RepeatMode;
import ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager;
import ru.yandex.video.m3.player.impl.utils.ExoPlayerProperThreadRunner;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/ExoRepeatModeManagerImpl;", "Lru/yandex/video/m3/player/impl/managers/ExoRepeatModeManager;", "Lzxc0;", "player", "Lru/yandex/video/m3/player/impl/utils/ExoPlayerProperThreadRunner;", "exoPlayerProperThreadRunner", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "observerDispatcher", "<init>", "(Lzxc0;Lru/yandex/video/m3/player/impl/utils/ExoPlayerProperThreadRunner;Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;)V", "Lru/yandex/video/m3/player/RepeatMode;", "repeatMode", "Lzy11;", "setModeInternal", "(Lru/yandex/video/m3/player/RepeatMode;)V", "Lfe10;", "mediaItem", "", CRLReasonCodeExtension.REASON, "onMediaItemTransition", "(Lfe10;I)V", "Lzxc0;", "Lru/yandex/video/m3/player/impl/utils/ExoPlayerProperThreadRunner;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Ljava/util/concurrent/atomic/AtomicReference;", "repeatModeAtomic", "Ljava/util/concurrent/atomic/AtomicReference;", "value", "getRepeatMode", "()Lru/yandex/video/m3/player/RepeatMode;", "setRepeatMode", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoRepeatModeManagerImpl implements ExoRepeatModeManager {
    public static final int $stable = 8;
    private final ExoPlayerProperThreadRunner exoPlayerProperThreadRunner;
    private final ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher;
    private final zxc0 player;
    private AtomicReference<RepeatMode> repeatModeAtomic = new AtomicReference<>(RepeatMode.None.INSTANCE);

    public ExoRepeatModeManagerImpl(zxc0 zxc0Var, ExoPlayerProperThreadRunner exoPlayerProperThreadRunner, ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher) {
        this.player = zxc0Var;
        this.exoPlayerProperThreadRunner = exoPlayerProperThreadRunner;
        this.observerDispatcher = observerDispatcher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17, types: [T, ru.yandex.video.m3.player.RepeatMode$Fixed] */
    private final void setModeInternal(RepeatMode repeatMode) {
        HashSet H0;
        Object failure;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = repeatMode;
        if (repeatMode instanceof RepeatMode.Fixed) {
            ref$ObjectRef.element = RepeatMode.Fixed.copy$default((RepeatMode.Fixed) repeatMode, 0, 0, ((RepeatMode.Fixed) repeatMode).getCount() == 0, 1, null);
        }
        if (jl40.l(this.repeatModeAtomic.get(), ref$ObjectRef.element)) {
            return;
        }
        this.repeatModeAtomic.set(ref$ObjectRef.element);
        this.exoPlayerProperThreadRunner.runOnProperThread(new sls() { // from class: ru.yandex.video.m3.player.impl.listeners.ExoRepeatModeManagerImpl$setModeInternal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
            
                if (((ru.yandex.video.m3.player.RepeatMode.Fixed) r5).isFinished() != false) goto L12;
             */
            /* renamed from: invoke, reason: collision with other method in class */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m791invoke() {
                zxc0 zxc0Var;
                zxc0Var = ExoRepeatModeManagerImpl.this.player;
                RepeatMode repeatMode2 = ref$ObjectRef.element;
                RepeatMode repeatMode3 = repeatMode2;
                int i = 0;
                if (!(repeatMode3 instanceof RepeatMode.None)) {
                    if (!(repeatMode3 instanceof RepeatMode.Infinity)) {
                        if (!(repeatMode3 instanceof RepeatMode.Fixed)) {
                            w511.b();
                            return;
                        }
                    }
                    i = 1;
                }
                zxc0Var.setRepeatMode(i);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m791invoke();
                return zy11.a;
            }
        });
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onRepeatModeChanged((RepeatMode) ref$ObjectRef.element);
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

    @Override // ru.yandex.video.m3.player.managers.RepeatModeManager
    public RepeatMode getRepeatMode() {
        return this.repeatModeAtomic.get();
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(ue3 ue3Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(vxc0 vxc0Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onCues(rdf rdfVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(xaj xajVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onEvents(zxc0 zxc0Var, wxc0 wxc0Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public void onMediaItemTransition(fe10 mediaItem, int reason) {
        HashSet H0;
        Object failure;
        if (reason == 0) {
            RepeatMode repeatMode = this.repeatModeAtomic.get();
            if (repeatMode instanceof RepeatMode.Fixed) {
                RepeatMode.Fixed fixed = (RepeatMode.Fixed) repeatMode;
                RepeatMode.Fixed copy$default = RepeatMode.Fixed.copy$default(fixed, 0, fixed.getWatched() + 1, fixed.getCount() == fixed.getWatched() + 1, 1, null);
                this.repeatModeAtomic.set(copy$default);
                if (copy$default.isFinished()) {
                    this.exoPlayerProperThreadRunner.runOnProperThread(new sls() { // from class: ru.yandex.video.m3.player.impl.listeners.ExoRepeatModeManagerImpl$onMediaItemTransition$1
                        {
                            super(0);
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m790invoke() {
                            zxc0 zxc0Var;
                            zxc0Var = ExoRepeatModeManagerImpl.this.player;
                            zxc0Var.setRepeatMode(0);
                        }

                        @Override // defpackage.sls
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m790invoke();
                            return zy11.a;
                        }
                    });
                }
            }
            ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.observerDispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerDelegate.Observer) it.next()).onRepeat();
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

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(re10 re10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onMetadata(w820 w820Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(lxc0 lxc0Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlayerError(PlaybackException playbackException) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(re10 re10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onTimelineChanged(a9z0 a9z0Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(r001 r001Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onTracksChanged(r801 r801Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(do31 do31Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.managers.ExoRepeatModeManager, defpackage.xxc0
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
    }

    @Override // ru.yandex.video.m3.player.managers.RepeatModeManager
    public void setRepeatMode(RepeatMode repeatMode) {
        setModeInternal(repeatMode);
    }
}
