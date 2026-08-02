package ru.yandex.video.m3.player;

import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.a;
import defpackage.ah3;
import defpackage.do31;
import defpackage.fe10;
import defpackage.h42;
import defpackage.he10;
import defpackage.i42;
import defpackage.j42;
import defpackage.kyg;
import defpackage.lxc0;
import defpackage.m001;
import defpackage.qyg;
import defpackage.r001;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.ue3;
import defpackage.uwy;
import defpackage.vxc0;
import defpackage.w820;
import defpackage.xaj;
import defpackage.xv00;
import defpackage.yxc0;
import defpackage.yzz0;
import defpackage.zxc0;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.player.PlayerDelegate;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\bJ'\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J-\u0010,\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J-\u0010.\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b.\u0010-J!\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020/2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u0010\bJ!\u00107\u001a\u00020\u00042\u0006\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b7\u00108J!\u00109\u001a\u00020\u00042\u0006\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b9\u00108J)\u0010:\u001a\u00020\u00042\u0006\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u00010\u001d2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b:\u0010;¨\u0006<À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/AnalyticsListenerExtended;", "Lj42;", "", "playbackState", "Lzy11;", "onPlay", "(I)V", "onPause", "()V", "onStop", "onStopped", "onRelease", "onReleased", "Lru/yandex/video/m3/player/PlayerDelegate$Position;", "position", "onSeekTo", "(Lru/yandex/video/m3/player/PlayerDelegate$Position;)V", "Landroidx/media3/common/IllegalSeekPositionException;", "e", "onSeekToError", "(Landroidx/media3/common/IllegalSeekPositionException;)V", "onAddObserver", "onRemoveObserver", "", "playWhenReady", "oldPlaybackState", "onPlaybackStateChanged", "(ZII)V", "isFirstTimeBuffered", "", "currentPosition", "lastPosition", "onPositionDiscontinuity", "(ZJJ)V", "", "throwable", "onConvertedPlayerError", "(Ljava/lang/Throwable;)V", "Lyzz0;", "trackGroups", "Lm001;", "trackSelections", "Lxv00;", "currentMappedTrackInfo", "onVideoTrackChangedError", "(Lyzz0;Lm001;Lxv00;)V", "onAudioTrackChangedError", "Lr801;", "tracks", "onTrackChangedSuccessfully", "(Lr801;Lxv00;)V", "onPrepareDrm", "", "mediaSourceUriString", "startPosition", "onPrepare", "(Ljava/lang/String;Ljava/lang/Long;)V", "onPrepared", "onPrepareError", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AnalyticsListenerExtended extends j42 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAddObserver(AnalyticsListenerExtended analyticsListenerExtended) {
            AnalyticsListenerExtended.super.onAddObserver();
        }

        @Deprecated
        public static void onAudioTrackChangedError(AnalyticsListenerExtended analyticsListenerExtended, yzz0 yzz0Var, m001 m001Var, xv00 xv00Var) {
            AnalyticsListenerExtended.super.onAudioTrackChangedError(yzz0Var, m001Var, xv00Var);
        }

        @Deprecated
        public static void onConvertedPlayerError(AnalyticsListenerExtended analyticsListenerExtended, Throwable th) {
            AnalyticsListenerExtended.super.onConvertedPlayerError(th);
        }

        @Deprecated
        public static void onPause(AnalyticsListenerExtended analyticsListenerExtended) {
            AnalyticsListenerExtended.super.onPause();
        }

        @Deprecated
        public static void onPlay(AnalyticsListenerExtended analyticsListenerExtended, int i) {
            AnalyticsListenerExtended.super.onPlay(i);
        }

        @Deprecated
        public static void onPlaybackStateChanged(AnalyticsListenerExtended analyticsListenerExtended, boolean z, int i, int i2) {
            AnalyticsListenerExtended.super.onPlaybackStateChanged(z, i, i2);
        }

        @Deprecated
        public static void onPositionDiscontinuity(AnalyticsListenerExtended analyticsListenerExtended, boolean z, long j, long j2) {
            AnalyticsListenerExtended.super.onPositionDiscontinuity(z, j, j2);
        }

        @Deprecated
        public static void onPrepare(AnalyticsListenerExtended analyticsListenerExtended, String str, Long l) {
            AnalyticsListenerExtended.super.onPrepare(str, l);
        }

        @Deprecated
        public static void onPrepareDrm(AnalyticsListenerExtended analyticsListenerExtended) {
            AnalyticsListenerExtended.super.onPrepareDrm();
        }

        @Deprecated
        public static void onPrepareError(AnalyticsListenerExtended analyticsListenerExtended, String str, Long l, Throwable th) {
            AnalyticsListenerExtended.super.onPrepareError(str, l, th);
        }

        @Deprecated
        public static void onPrepared(AnalyticsListenerExtended analyticsListenerExtended, String str, Long l) {
            AnalyticsListenerExtended.super.onPrepared(str, l);
        }

        @Deprecated
        public static void onRelease(AnalyticsListenerExtended analyticsListenerExtended) {
            AnalyticsListenerExtended.super.onRelease();
        }

        @Deprecated
        public static void onReleased(AnalyticsListenerExtended analyticsListenerExtended) {
            AnalyticsListenerExtended.super.onReleased();
        }

        @Deprecated
        public static void onRemoveObserver(AnalyticsListenerExtended analyticsListenerExtended) {
            AnalyticsListenerExtended.super.onRemoveObserver();
        }

        @Deprecated
        public static void onSeekTo(AnalyticsListenerExtended analyticsListenerExtended, PlayerDelegate.Position position) {
            AnalyticsListenerExtended.super.onSeekTo(position);
        }

        @Deprecated
        public static void onSeekToError(AnalyticsListenerExtended analyticsListenerExtended, IllegalSeekPositionException illegalSeekPositionException) {
            AnalyticsListenerExtended.super.onSeekToError(illegalSeekPositionException);
        }

        @Deprecated
        public static void onStop(AnalyticsListenerExtended analyticsListenerExtended) {
            AnalyticsListenerExtended.super.onStop();
        }

        @Deprecated
        public static void onStopped(AnalyticsListenerExtended analyticsListenerExtended) {
            AnalyticsListenerExtended.super.onStopped();
        }

        @Deprecated
        public static void onTrackChangedSuccessfully(AnalyticsListenerExtended analyticsListenerExtended, r801 r801Var, xv00 xv00Var) {
            AnalyticsListenerExtended.super.onTrackChangedSuccessfully(r801Var, xv00Var);
        }

        @Deprecated
        public static void onVideoTrackChangedError(AnalyticsListenerExtended analyticsListenerExtended, yzz0 yzz0Var, m001 m001Var, xv00 xv00Var) {
            AnalyticsListenerExtended.super.onVideoTrackChangedError(yzz0Var, m001Var, xv00Var);
        }
    }

    default void onAddObserver() {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onAudioAttributesChanged(h42 h42Var, ue3 ue3Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onAudioCodecError(h42 h42Var, Exception exc) {
    }

    @Override // defpackage.j42
    @Deprecated
    /* bridge */ /* synthetic */ default void onAudioDecoderInitialized(h42 h42Var, String str, long j) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onAudioDecoderInitialized(h42 h42Var, String str, long j, long j2) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onAudioDecoderReleased(h42 h42Var, String str) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onAudioDisabled(h42 h42Var, kyg kygVar) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onAudioEnabled(h42 h42Var, kyg kygVar) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onAudioInputFormatChanged(h42 h42Var, a aVar, qyg qygVar) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onAudioPositionAdvancing(h42 h42Var, long j) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onAudioSessionIdChanged(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onAudioSinkError(h42 h42Var, Exception exc) {
    }

    default void onAudioTrackChangedError(yzz0 trackGroups, m001 trackSelections, xv00 currentMappedTrackInfo) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onAudioTrackInitialized(h42 h42Var, ah3 ah3Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onAudioTrackReleased(h42 h42Var, ah3 ah3Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onAudioUnderrun(h42 h42Var, int i, long j, long j2) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onAvailableCommandsChanged(h42 h42Var, vxc0 vxc0Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onBandwidthEstimate(h42 h42Var, int i, long j, long j2) {
    }

    default void onConvertedPlayerError(Throwable throwable) {
    }

    @Override // defpackage.j42
    @Deprecated
    /* bridge */ /* synthetic */ default void onCues(h42 h42Var, List list) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onCues(h42 h42Var, rdf rdfVar) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onDeviceInfoChanged(h42 h42Var, xaj xajVar) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onDeviceVolumeChanged(h42 h42Var, int i, boolean z) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onDownstreamFormatChanged(h42 h42Var, he10 he10Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onDrmKeysLoaded(h42 h42Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onDrmKeysRemoved(h42 h42Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onDrmKeysRestored(h42 h42Var) {
    }

    @Override // defpackage.j42
    @Deprecated
    /* bridge */ /* synthetic */ default void onDrmSessionAcquired(h42 h42Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onDrmSessionAcquired(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onDrmSessionManagerError(h42 h42Var, Exception exc) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onDrmSessionReleased(h42 h42Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onDroppedVideoFrames(h42 h42Var, int i, long j) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onEvents(zxc0 zxc0Var, i42 i42Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onIsLoadingChanged(h42 h42Var, boolean z) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onIsPlayingChanged(h42 h42Var, boolean z) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onLoadCanceled(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onLoadCompleted(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onLoadError(h42 h42Var, uwy uwyVar, he10 he10Var, IOException iOException, boolean z) {
    }

    @Override // defpackage.j42
    @Deprecated
    /* bridge */ /* synthetic */ default void onLoadStarted(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onLoadStarted(h42 h42Var, uwy uwyVar, he10 he10Var, int i) {
    }

    @Override // defpackage.j42
    @Deprecated
    /* bridge */ /* synthetic */ default void onLoadingChanged(h42 h42Var, boolean z) {
    }

    /* bridge */ /* synthetic */ default void onMaxSeekToPreviousPositionChanged(h42 h42Var, long j) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onMediaItemTransition(h42 h42Var, fe10 fe10Var, int i) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onMediaMetadataChanged(h42 h42Var, re10 re10Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onMetadata(h42 h42Var, w820 w820Var) {
    }

    default void onPause() {
    }

    default void onPlay(int playbackState) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onPlayWhenReadyChanged(h42 h42Var, boolean z, int i) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onPlaybackParametersChanged(h42 h42Var, lxc0 lxc0Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onPlaybackStateChanged(h42 h42Var, int i) {
    }

    default void onPlaybackStateChanged(boolean playWhenReady, int playbackState, int oldPlaybackState) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onPlaybackSuppressionReasonChanged(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onPlayerError(h42 h42Var, androidx.media3.common.PlaybackException playbackException) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onPlayerErrorChanged(h42 h42Var, androidx.media3.common.PlaybackException playbackException) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onPlayerReleased(h42 h42Var) {
    }

    @Override // defpackage.j42
    @Deprecated
    /* bridge */ /* synthetic */ default void onPlayerStateChanged(h42 h42Var, boolean z, int i) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onPlaylistMetadataChanged(h42 h42Var, re10 re10Var) {
    }

    @Override // defpackage.j42
    @Deprecated
    /* bridge */ /* synthetic */ default void onPositionDiscontinuity(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onPositionDiscontinuity(h42 h42Var, yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
    }

    default void onPrepare(String mediaSourceUriString, Long startPosition) {
    }

    default void onPrepareDrm() {
    }

    default void onPrepareError(String mediaSourceUriString, Long startPosition, Throwable throwable) {
    }

    default void onPrepared(String mediaSourceUriString, Long startPosition) {
    }

    default void onRelease() {
    }

    default void onReleased() {
    }

    default void onRemoveObserver() {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onRenderedFirstFrame(h42 h42Var, Object obj, long j) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onRendererReadyChanged(h42 h42Var, int i, int i2, boolean z) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onRepeatModeChanged(h42 h42Var, int i) {
    }

    /* bridge */ /* synthetic */ default void onSeekBackIncrementChanged(h42 h42Var, long j) {
    }

    /* bridge */ /* synthetic */ default void onSeekForwardIncrementChanged(h42 h42Var, long j) {
    }

    @Override // defpackage.j42
    @Deprecated
    /* bridge */ /* synthetic */ default void onSeekStarted(h42 h42Var) {
    }

    default void onSeekTo(PlayerDelegate.Position position) {
    }

    default void onSeekToError(IllegalSeekPositionException e) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onShuffleModeChanged(h42 h42Var, boolean z) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onSkipSilenceEnabledChanged(h42 h42Var, boolean z) {
    }

    default void onStop() {
    }

    default void onStopped() {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onSurfaceSizeChanged(h42 h42Var, int i, int i2) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onTimelineChanged(h42 h42Var, int i) {
    }

    default void onTrackChangedSuccessfully(r801 tracks, xv00 currentMappedTrackInfo) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onTrackSelectionParametersChanged(h42 h42Var, r001 r001Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onTracksChanged(h42 h42Var, r801 r801Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onUpstreamDiscarded(h42 h42Var, he10 he10Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onVideoCodecError(h42 h42Var, Exception exc) {
    }

    @Override // defpackage.j42
    @Deprecated
    /* bridge */ /* synthetic */ default void onVideoDecoderInitialized(h42 h42Var, String str, long j) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onVideoDecoderInitialized(h42 h42Var, String str, long j, long j2) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onVideoDecoderReleased(h42 h42Var, String str) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onVideoDisabled(h42 h42Var, kyg kygVar) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onVideoEnabled(h42 h42Var, kyg kygVar) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onVideoFrameProcessingOffset(h42 h42Var, long j, int i) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onVideoInputFormatChanged(h42 h42Var, a aVar, qyg qygVar) {
    }

    @Override // defpackage.j42
    @Deprecated
    /* bridge */ /* synthetic */ default void onVideoSizeChanged(h42 h42Var, int i, int i2, int i3, float f) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onVideoSizeChanged(h42 h42Var, do31 do31Var) {
    }

    default void onVideoTrackChangedError(yzz0 trackGroups, m001 trackSelections, xv00 currentMappedTrackInfo) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onVolumeChanged(h42 h42Var, float f) {
    }

    default void onPositionDiscontinuity(boolean isFirstTimeBuffered, long currentPosition, long lastPosition) {
    }
}
