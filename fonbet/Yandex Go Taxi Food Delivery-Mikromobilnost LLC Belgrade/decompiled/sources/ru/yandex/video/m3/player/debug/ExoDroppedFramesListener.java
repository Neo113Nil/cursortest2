package ru.yandex.video.m3.player.debug;

import androidx.media3.common.PlaybackException;
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
import defpackage.yxc0;
import defpackage.zxc0;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/debug/ExoDroppedFramesListener;", "Lj42;", "Lh42;", "eventTime", "", "droppedFrames", "", "elapsedMs", "Lzy11;", "onDroppedVideoFrames", "(Lh42;IJ)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ExoDroppedFramesListener extends j42 {
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
    void onDroppedVideoFrames(h42 eventTime, int droppedFrames, long elapsedMs);

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

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onPlayWhenReadyChanged(h42 h42Var, boolean z, int i) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onPlaybackParametersChanged(h42 h42Var, lxc0 lxc0Var) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onPlaybackStateChanged(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onPlaybackSuppressionReasonChanged(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onPlayerError(h42 h42Var, PlaybackException playbackException) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onPlayerErrorChanged(h42 h42Var, PlaybackException playbackException) {
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

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onShuffleModeChanged(h42 h42Var, boolean z) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onSkipSilenceEnabledChanged(h42 h42Var, boolean z) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onSurfaceSizeChanged(h42 h42Var, int i, int i2) {
    }

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onTimelineChanged(h42 h42Var, int i) {
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

    @Override // defpackage.j42
    /* bridge */ /* synthetic */ default void onVolumeChanged(h42 h42Var, float f) {
    }
}
