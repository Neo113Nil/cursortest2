package ru.yandex.video.m3.player.impl.managers;

import androidx.media3.common.PlaybackException;
import defpackage.a9z0;
import defpackage.do31;
import defpackage.fe10;
import defpackage.lxc0;
import defpackage.r001;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.ue3;
import defpackage.vxc0;
import defpackage.w820;
import defpackage.wxc0;
import defpackage.xaj;
import defpackage.xxc0;
import defpackage.yxc0;
import defpackage.zxc0;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.player.managers.RepeatModeManager;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/managers/ExoRepeatModeManager;", "Lru/yandex/video/m3/player/managers/RepeatModeManager;", "Lxxc0;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ExoRepeatModeManager extends RepeatModeManager, xxc0 {
    /* bridge */ /* synthetic */ default void onAudioAttributesChanged(ue3 ue3Var) {
    }

    /* bridge */ /* synthetic */ default void onAudioSessionIdChanged(int i) {
    }

    /* bridge */ /* synthetic */ default void onAvailableCommandsChanged(vxc0 vxc0Var) {
    }

    @Deprecated
    /* bridge */ /* synthetic */ default void onCues(List list) {
    }

    /* bridge */ /* synthetic */ default void onCues(rdf rdfVar) {
    }

    /* bridge */ /* synthetic */ default void onDeviceInfoChanged(xaj xajVar) {
    }

    /* bridge */ /* synthetic */ default void onDeviceVolumeChanged(int i, boolean z) {
    }

    /* bridge */ /* synthetic */ default void onEvents(zxc0 zxc0Var, wxc0 wxc0Var) {
    }

    /* bridge */ /* synthetic */ default void onIsLoadingChanged(boolean z) {
    }

    /* bridge */ /* synthetic */ default void onIsPlayingChanged(boolean z) {
    }

    @Deprecated
    /* bridge */ /* synthetic */ default void onLoadingChanged(boolean z) {
    }

    /* bridge */ /* synthetic */ default void onMaxSeekToPreviousPositionChanged(long j) {
    }

    /* bridge */ /* synthetic */ default void onMediaItemTransition(fe10 fe10Var, int i) {
    }

    /* bridge */ /* synthetic */ default void onMediaMetadataChanged(re10 re10Var) {
    }

    /* bridge */ /* synthetic */ default void onMetadata(w820 w820Var) {
    }

    /* bridge */ /* synthetic */ default void onPlayWhenReadyChanged(boolean z, int i) {
    }

    /* bridge */ /* synthetic */ default void onPlaybackParametersChanged(lxc0 lxc0Var) {
    }

    /* bridge */ /* synthetic */ default void onPlaybackStateChanged(int i) {
    }

    /* bridge */ /* synthetic */ default void onPlaybackSuppressionReasonChanged(int i) {
    }

    /* bridge */ /* synthetic */ default void onPlayerError(PlaybackException playbackException) {
    }

    /* bridge */ /* synthetic */ default void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Deprecated
    /* bridge */ /* synthetic */ default void onPlayerStateChanged(boolean z, int i) {
    }

    /* bridge */ /* synthetic */ default void onPlaylistMetadataChanged(re10 re10Var) {
    }

    @Deprecated
    /* bridge */ /* synthetic */ default void onPositionDiscontinuity(int i) {
    }

    /* bridge */ /* synthetic */ default void onPositionDiscontinuity(yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
    }

    /* bridge */ /* synthetic */ default void onRenderedFirstFrame() {
    }

    /* bridge */ /* synthetic */ default void onRepeatModeChanged(int i) {
    }

    /* bridge */ /* synthetic */ default void onSeekBackIncrementChanged(long j) {
    }

    /* bridge */ /* synthetic */ default void onSeekForwardIncrementChanged(long j) {
    }

    /* bridge */ /* synthetic */ default void onShuffleModeEnabledChanged(boolean z) {
    }

    /* bridge */ /* synthetic */ default void onSkipSilenceEnabledChanged(boolean z) {
    }

    /* bridge */ /* synthetic */ default void onSurfaceSizeChanged(int i, int i2) {
    }

    /* bridge */ /* synthetic */ default void onTimelineChanged(a9z0 a9z0Var, int i) {
    }

    /* bridge */ /* synthetic */ default void onTrackSelectionParametersChanged(r001 r001Var) {
    }

    /* bridge */ /* synthetic */ default void onTracksChanged(r801 r801Var) {
    }

    /* bridge */ /* synthetic */ default void onVideoSizeChanged(do31 do31Var) {
    }

    /* bridge */ /* synthetic */ default void onVolumeChanged(float f) {
    }
}
