package ru.yandex.video.m3.player.impl;

import androidx.media3.common.PlaybackException;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/video/m3/player/impl/AnalyticsListenerProxy;", "Lj42;", "<init>", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class AnalyticsListenerProxy implements j42 {
    public static final int $stable = 0;

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
    public /* bridge */ /* synthetic */ void onAudioDisabled(h42 h42Var, kyg kygVar) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioEnabled(h42 h42Var, kyg kygVar) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(h42 h42Var, androidx.media3.common.a aVar, qyg qygVar) {
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
    public /* bridge */ /* synthetic */ void onPlayerError(h42 h42Var, PlaybackException playbackException) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(h42 h42Var, PlaybackException playbackException) {
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
    public /* bridge */ /* synthetic */ void onVideoDisabled(h42 h42Var, kyg kygVar) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoEnabled(h42 h42Var, kyg kygVar) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(h42 h42Var, long j, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(h42 h42Var, androidx.media3.common.a aVar, qyg qygVar) {
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
