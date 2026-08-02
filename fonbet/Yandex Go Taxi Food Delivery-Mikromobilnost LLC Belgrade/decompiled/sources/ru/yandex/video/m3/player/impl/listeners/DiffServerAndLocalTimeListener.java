package ru.yandex.video.m3.player.impl.listeners;

import androidx.media3.common.PlaybackException;
import defpackage.ah3;
import defpackage.bvu0;
import defpackage.do31;
import defpackage.fe10;
import defpackage.h42;
import defpackage.h5z0;
import defpackage.he10;
import defpackage.i42;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.AnalyticsListenerProxy;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u0004\u0018\u00010\n2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006H\u0002¢\u0006\u0004\b\r\u0010\fJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/DiffServerAndLocalTimeListener;", "Lru/yandex/video/m3/player/impl/AnalyticsListenerProxy;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "<init>", "(Lru/yandex/video/m3/player/impl/utils/TimeProvider;)V", "", "", "", "responseHeaders", "", "extractServerTimeMsOrNull", "(Ljava/util/Map;)Ljava/lang/Long;", "extractServerDateMsOrNull", "Lh42;", "eventTime", "Luwy;", "loadEventInfo", "Lhe10;", "mediaLoadData", "Lzy11;", "onLoadCompleted", "(Lh42;Luwy;Lhe10;)V", "getTimeDiff", "()Ljava/lang/Long;", "resetTimeDiff", "()V", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "diffServerAndLocalTime", "J", "diffUpdateElapsedTime", "Ljava/text/SimpleDateFormat;", "dateHeaderDateFormat", "Ljava/text/SimpleDateFormat;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DiffServerAndLocalTimeListener extends AnalyticsListenerProxy {
    private static final String DATE_HEADER = "Date";
    private static final String X_SERVER_TIME_MS_HEADER = "x-server-time-ms";
    private final SimpleDateFormat dateHeaderDateFormat;
    private long diffServerAndLocalTime;
    private long diffUpdateElapsedTime;
    private final TimeProvider timeProvider;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public DiffServerAndLocalTimeListener(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
        this.diffServerAndLocalTime = -9223372036854775807L;
        this.diffUpdateElapsedTime = -9223372036854775807L;
        this.dateHeaderDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", Locale.US);
    }

    private final Long extractServerDateMsOrNull(Map<String, ? extends List<String>> responseHeaders) {
        String str;
        List<String> list = responseHeaders.get(DATE_HEADER);
        if (list == null || (str = (String) a.R(list)) == null) {
            return null;
        }
        try {
            Date parse = this.dateHeaderDateFormat.parse(str);
            if (parse != null) {
                return Long.valueOf(parse.getTime());
            }
            return null;
        } catch (Exception e) {
            h5z0.a.e(e);
            return null;
        }
    }

    private final Long extractServerTimeMsOrNull(Map<String, ? extends List<String>> responseHeaders) {
        String str;
        List<String> list = responseHeaders.get(X_SERVER_TIME_MS_HEADER);
        if (list == null || (str = (String) a.R(list)) == null) {
            return null;
        }
        return bvu0.m(10, str);
    }

    public final Long getTimeDiff() {
        long j = this.diffServerAndLocalTime;
        if (j == -9223372036854775807L || this.diffUpdateElapsedTime == -9223372036854775807L) {
            return null;
        }
        return Long.valueOf((this.timeProvider.elapsedRealtime() - this.diffUpdateElapsedTime) + j);
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(h42 h42Var, ue3 ue3Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioCodecError(h42 h42Var, Exception exc) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(h42 h42Var, String str, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(h42 h42Var, String str, long j, long j2) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioDecoderReleased(h42 h42Var, String str) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioDisabled(h42 h42Var, kyg kygVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioEnabled(h42 h42Var, kyg kygVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(h42 h42Var, androidx.media3.common.a aVar, qyg qygVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(h42 h42Var, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(h42 h42Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioSinkError(h42 h42Var, Exception exc) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioTrackInitialized(h42 h42Var, ah3 ah3Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioTrackReleased(h42 h42Var, ah3 ah3Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioUnderrun(h42 h42Var, int i, long j, long j2) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(h42 h42Var, vxc0 vxc0Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onBandwidthEstimate(h42 h42Var, int i, long j, long j2) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(h42 h42Var, List list) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onCues(h42 h42Var, rdf rdfVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(h42 h42Var, xaj xajVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(h42 h42Var, int i, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDownstreamFormatChanged(h42 h42Var, he10 he10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmKeysLoaded(h42 h42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmKeysRemoved(h42 h42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmKeysRestored(h42 h42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(h42 h42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(h42 h42Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmSessionManagerError(h42 h42Var, Exception exc) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmSessionReleased(h42 h42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDroppedVideoFrames(h42 h42Var, int i, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onEvents(zxc0 zxc0Var, i42 i42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(h42 h42Var, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(h42 h42Var, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadCanceled(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onLoadCompleted(h42 eventTime, uwy loadEventInfo, he10 mediaLoadData) {
        Map<String, ? extends List<String>> map = loadEventInfo.c;
        if (mediaLoadData.a == 4) {
            Long extractServerTimeMsOrNull = extractServerTimeMsOrNull(map);
            if (extractServerTimeMsOrNull == null) {
                extractServerTimeMsOrNull = extractServerDateMsOrNull(map);
            }
            if (extractServerTimeMsOrNull != null) {
                this.diffServerAndLocalTime = (loadEventInfo.d / 2) + extractServerTimeMsOrNull.longValue();
                this.diffUpdateElapsedTime = this.timeProvider.elapsedRealtime();
            }
        }
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadError(h42 h42Var, uwy uwyVar, he10 he10Var, IOException iOException, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadStarted(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadStarted(h42 h42Var, uwy uwyVar, he10 he10Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(h42 h42Var, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(h42 h42Var, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onMediaItemTransition(h42 h42Var, fe10 fe10Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(h42 h42Var, re10 re10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onMetadata(h42 h42Var, w820 w820Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(h42 h42Var, boolean z, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(h42 h42Var, lxc0 lxc0Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(h42 h42Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(h42 h42Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayerError(h42 h42Var, PlaybackException playbackException) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(h42 h42Var, PlaybackException playbackException) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayerReleased(h42 h42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(h42 h42Var, boolean z, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(h42 h42Var, re10 re10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(h42 h42Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(h42 h42Var, yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame(h42 h42Var, Object obj, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onRendererReadyChanged(h42 h42Var, int i, int i2, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(h42 h42Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(h42 h42Var, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(h42 h42Var, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekStarted(h42 h42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onShuffleModeChanged(h42 h42Var, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(h42 h42Var, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(h42 h42Var, int i, int i2) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onTimelineChanged(h42 h42Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(h42 h42Var, r001 r001Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onTracksChanged(h42 h42Var, r801 r801Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onUpstreamDiscarded(h42 h42Var, he10 he10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoCodecError(h42 h42Var, Exception exc) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(h42 h42Var, String str, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(h42 h42Var, String str, long j, long j2) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoDecoderReleased(h42 h42Var, String str) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoDisabled(h42 h42Var, kyg kygVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoEnabled(h42 h42Var, kyg kygVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(h42 h42Var, long j, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(h42 h42Var, androidx.media3.common.a aVar, qyg qygVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(h42 h42Var, int i, int i2, int i3, float f) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(h42 h42Var, do31 do31Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVolumeChanged(h42 h42Var, float f) {
    }

    public final void resetTimeDiff() {
        this.diffServerAndLocalTime = -9223372036854775807L;
        this.diffUpdateElapsedTime = -9223372036854775807L;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/DiffServerAndLocalTimeListener$Companion;", "", "()V", "DATE_HEADER", "", "X_SERVER_TIME_MS_HEADER", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DiffServerAndLocalTimeListener(TimeProvider timeProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SystemTimeProvider() : timeProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiffServerAndLocalTimeListener() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
