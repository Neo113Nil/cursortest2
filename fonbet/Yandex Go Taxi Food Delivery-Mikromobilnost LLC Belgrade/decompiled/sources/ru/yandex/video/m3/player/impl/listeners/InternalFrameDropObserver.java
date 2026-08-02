package ru.yandex.video.m3.player.impl.listeners;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.a;
import defpackage.ah3;
import defpackage.do31;
import defpackage.fe10;
import defpackage.h42;
import defpackage.h5z0;
import defpackage.he10;
import defpackage.i42;
import defpackage.j42;
import defpackage.kyg;
import defpackage.lxc0;
import defpackage.qyg;
import defpackage.r001;
import defpackage.r7v;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.tls;
import defpackage.ue3;
import defpackage.uwy;
import defpackage.vxc0;
import defpackage.w820;
import defpackage.xaj;
import defpackage.yxc0;
import defpackage.zxc0;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.PlaybackException;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ!\u0010\u0013\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/InternalFrameDropObserver;", "Lj42;", "Landroid/os/Looper;", "applicationLooper", "<init>", "(Landroid/os/Looper;)V", "Lh42;", "eventTime", "Lkyg;", "decoderCounters", "Lzy11;", "onVideoEnabled", "(Lh42;Lkyg;)V", "onAudioEnabled", "onVideoDisabled", "onAudioDisabled", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/PlaybackException$FrameDropDetected;", "onDropDetected", "checkFrameDrop", "(Ltls;)V", "Landroid/os/Looper;", "audioCounters", "Lkyg;", "videoCounters", "", "lastAudioCheckTimestamp", "J", "lastVideoCheckTimestamp", "", "lastDroppedAudioFrames", CA20Status.STATUS_USER_I, "lastDroppedVideoFrames", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalFrameDropObserver implements j42 {
    public static final int FRAME_DROP_THRESHOLD_PER_SECOND = 20;
    private final Looper applicationLooper;
    private kyg audioCounters;
    private final Handler handler;
    private long lastAudioCheckTimestamp;
    private int lastDroppedAudioFrames;
    private int lastDroppedVideoFrames;
    private long lastVideoCheckTimestamp;
    private kyg videoCounters;
    public static final int $stable = 8;

    public InternalFrameDropObserver(Looper looper) {
        this.applicationLooper = looper;
        this.handler = new Handler(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void checkFrameDrop$lambda$2(InternalFrameDropObserver internalFrameDropObserver, tls tlsVar) {
        long j;
        long j2;
        long j3;
        kyg kygVar;
        kyg kygVar2;
        long currentTimeMillis = System.currentTimeMillis();
        kyg kygVar3 = internalFrameDropObserver.audioCounters;
        int i = (kygVar3 != null ? kygVar3.g : 0) - internalFrameDropObserver.lastDroppedAudioFrames;
        kyg kygVar4 = internalFrameDropObserver.videoCounters;
        int i2 = (kygVar4 != null ? kygVar4.g : 0) - internalFrameDropObserver.lastDroppedVideoFrames;
        if (i > 0) {
            j2 = 1000;
            long j4 = internalFrameDropObserver.lastAudioCheckTimestamp;
            if (j4 > 0) {
                long j5 = currentTimeMillis - j4;
                j3 = 20;
                if (i >= (j5 * 20) / 1000) {
                    j = 0;
                    h5z0.a.a("audio frameDrop detected: " + i + " frames per " + j5 + " ms", new Object[0]);
                    tlsVar.invoke(new PlaybackException.FrameDropDetected(MediaStreamTrack.AUDIO_TRACK_KIND, i, j5));
                } else {
                    j = 0;
                }
                if (i2 > 0) {
                    long j6 = internalFrameDropObserver.lastVideoCheckTimestamp;
                    if (j6 > j) {
                        long j7 = currentTimeMillis - j6;
                        if (i2 >= (j7 * j3) / j2) {
                            h5z0.a.a("video frameDrop detected: " + i2 + " frames per " + j7 + " ms", new Object[0]);
                            tlsVar.invoke(new PlaybackException.FrameDropDetected(MediaStreamTrack.VIDEO_TRACK_KIND, i2, j7));
                        }
                    }
                }
                kygVar = internalFrameDropObserver.audioCounters;
                if (kygVar != null) {
                    internalFrameDropObserver.lastAudioCheckTimestamp = currentTimeMillis;
                    internalFrameDropObserver.lastDroppedAudioFrames = kygVar.g;
                }
                kygVar2 = internalFrameDropObserver.videoCounters;
                if (kygVar2 == null) {
                    internalFrameDropObserver.lastVideoCheckTimestamp = currentTimeMillis;
                    internalFrameDropObserver.lastDroppedVideoFrames = kygVar2.g;
                    return;
                }
                return;
            }
            j = 0;
        } else {
            j = 0;
            j2 = 1000;
        }
        j3 = 20;
        if (i2 > 0) {
        }
        kygVar = internalFrameDropObserver.audioCounters;
        if (kygVar != null) {
        }
        kygVar2 = internalFrameDropObserver.videoCounters;
        if (kygVar2 == null) {
        }
    }

    public final void checkFrameDrop(tls onDropDetected) {
        this.handler.post(new r7v(8, this, onDropDetected));
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(h42 h42Var, ue3 ue3Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioCodecError(h42 h42Var, Exception exc) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(h42 h42Var, String str, long j) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(h42 h42Var, String str, long j, long j2) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioDecoderReleased(h42 h42Var, String str) {
    }

    @Override // defpackage.j42
    public void onAudioDisabled(h42 eventTime, kyg decoderCounters) {
        this.audioCounters = null;
        this.lastDroppedAudioFrames = 0;
        this.lastAudioCheckTimestamp = 0L;
    }

    @Override // defpackage.j42
    public void onAudioEnabled(h42 eventTime, kyg decoderCounters) {
        this.audioCounters = decoderCounters;
        this.lastDroppedAudioFrames = 0;
        this.lastAudioCheckTimestamp = 0L;
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(h42 h42Var, a aVar, qyg qygVar) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(h42 h42Var, long j) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioSinkError(h42 h42Var, Exception exc) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioTrackInitialized(h42 h42Var, ah3 ah3Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioTrackReleased(h42 h42Var, ah3 ah3Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioUnderrun(h42 h42Var, int i, long j, long j2) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(h42 h42Var, vxc0 vxc0Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onBandwidthEstimate(h42 h42Var, int i, long j, long j2) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(h42 h42Var, List list) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onCues(h42 h42Var, rdf rdfVar) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(h42 h42Var, xaj xajVar) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(h42 h42Var, int i, boolean z) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDownstreamFormatChanged(h42 h42Var, he10 he10Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmKeysLoaded(h42 h42Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmKeysRemoved(h42 h42Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmKeysRestored(h42 h42Var) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(h42 h42Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmSessionManagerError(h42 h42Var, Exception exc) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmSessionReleased(h42 h42Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDroppedVideoFrames(h42 h42Var, int i, long j) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onEvents(zxc0 zxc0Var, i42 i42Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(h42 h42Var, boolean z) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(h42 h42Var, boolean z) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadCanceled(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadCompleted(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadError(h42 h42Var, uwy uwyVar, he10 he10Var, IOException iOException, boolean z) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadStarted(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadStarted(h42 h42Var, uwy uwyVar, he10 he10Var, int i) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(h42 h42Var, boolean z) {
    }

    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(h42 h42Var, long j) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onMediaItemTransition(h42 h42Var, fe10 fe10Var, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(h42 h42Var, re10 re10Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onMetadata(h42 h42Var, w820 w820Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(h42 h42Var, boolean z, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(h42 h42Var, lxc0 lxc0Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayerError(h42 h42Var, androidx.media3.common.PlaybackException playbackException) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(h42 h42Var, androidx.media3.common.PlaybackException playbackException) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayerReleased(h42 h42Var) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(h42 h42Var, boolean z, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(h42 h42Var, re10 re10Var) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(h42 h42Var, yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame(h42 h42Var, Object obj, long j) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onRendererReadyChanged(h42 h42Var, int i, int i2, boolean z) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(h42 h42Var, int i) {
    }

    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(h42 h42Var, long j) {
    }

    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(h42 h42Var, long j) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekStarted(h42 h42Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onShuffleModeChanged(h42 h42Var, boolean z) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(h42 h42Var, boolean z) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(h42 h42Var, int i, int i2) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onTimelineChanged(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(h42 h42Var, r001 r001Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onTracksChanged(h42 h42Var, r801 r801Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onUpstreamDiscarded(h42 h42Var, he10 he10Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoCodecError(h42 h42Var, Exception exc) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(h42 h42Var, String str, long j) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(h42 h42Var, String str, long j, long j2) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoDecoderReleased(h42 h42Var, String str) {
    }

    @Override // defpackage.j42
    public void onVideoDisabled(h42 eventTime, kyg decoderCounters) {
        this.videoCounters = null;
        this.lastDroppedVideoFrames = 0;
        this.lastVideoCheckTimestamp = 0L;
    }

    @Override // defpackage.j42
    public void onVideoEnabled(h42 eventTime, kyg decoderCounters) {
        this.videoCounters = decoderCounters;
        this.lastDroppedVideoFrames = 0;
        this.lastVideoCheckTimestamp = 0L;
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(h42 h42Var, long j, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(h42 h42Var, a aVar, qyg qygVar) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(h42 h42Var, int i, int i2, int i3, float f) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(h42 h42Var, do31 do31Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVolumeChanged(h42 h42Var, float f) {
    }
}
