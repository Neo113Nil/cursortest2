package androidx.media3.exoplayer.analytics;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import app.cash.zipline.CallResult;
import coil3.svg.internal.AndroidSvg;
import com.android.volley.NetworkResponse;
import com.google.android.filament.Viewport;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final class MediaMetricsListener implements AnalyticsListener {
    public String activeSessionId;
    public int audioUnderruns;
    public final Context context;
    public Format currentAudioFormat;
    public Format currentTextFormat;
    public Format currentVideoFormat;
    public int discontinuityReason;
    public int droppedFrames;
    public boolean hasFatalError;
    public int ioErrorType;
    public boolean isSeeking;
    public PlaybackMetrics.Builder metricsBuilder;
    public AndroidSvg pendingAudioFormat;
    public PlaybackException pendingPlayerError;
    public AndroidSvg pendingTextFormat;
    public AndroidSvg pendingVideoFormat;
    public final PlaybackSession playbackSession;
    public int playedFrames;
    public boolean reportedEventsForCurrentSession;
    public final DefaultPlaybackSessionManager sessionManager;
    public final Executor backgroundExecutor = Log.get();
    public final Timeline.Window window = new Timeline.Window();
    public final Timeline.Period period = new Timeline.Period();
    public final HashMap bandwidthBytes = new HashMap();
    public final HashMap bandwidthTimeMs = new HashMap();
    public final long startTimeMs = SystemClock.elapsedRealtime();
    public int currentPlaybackState = 0;
    public int currentNetworkType = 0;

    public MediaMetricsListener(Context context, PlaybackSession playbackSession) {
        this.context = context.getApplicationContext();
        this.playbackSession = playbackSession;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.sessionManager = defaultPlaybackSessionManager;
        defaultPlaybackSessionManager.listener = this;
    }

    public static MediaMetricsListener create(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new MediaMetricsListener(context, mediaMetricsManager.createPlaybackSession());
    }

    public final boolean canReportPendingFormatUpdate(AndroidSvg androidSvg) {
        String str;
        if (androidSvg == null) {
            return false;
        }
        String str2 = (String) androidSvg.renderOptions;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = this.sessionManager;
        synchronized (defaultPlaybackSessionManager) {
            str = defaultPlaybackSessionManager.currentSessionId;
        }
        return str2.equals(str);
    }

    public final void finishCurrentSession() {
        PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (builder != null && this.reportedEventsForCurrentSession) {
            builder.setAudioUnderrunCount(this.audioUnderruns);
            this.metricsBuilder.setVideoFramesDropped(this.droppedFrames);
            this.metricsBuilder.setVideoFramesPlayed(this.playedFrames);
            Long l = (Long) this.bandwidthTimeMs.get(this.activeSessionId);
            this.metricsBuilder.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.bandwidthBytes.get(this.activeSessionId);
            this.metricsBuilder.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.metricsBuilder.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.backgroundExecutor.execute(new DispatchQueue$$ExternalSyntheticLambda0(21, this, this.metricsBuilder.build()));
        }
        this.metricsBuilder = null;
        this.activeSessionId = null;
        this.audioUnderruns = 0;
        this.droppedFrames = 0;
        this.playedFrames = 0;
        this.currentVideoFormat = null;
        this.currentAudioFormat = null;
        this.currentTextFormat = null;
        this.reportedEventsForCurrentSession = false;
    }

    public final LogSessionId getLogSessionId() {
        return this.playbackSession.getSessionId();
    }

    public final void maybeUpdateTimelineMetadata(Timeline timeline, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        int indexOfPeriod;
        PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (mediaSource$MediaPeriodId == null || (indexOfPeriod = timeline.getIndexOfPeriod(mediaSource$MediaPeriodId.periodUid)) == -1) {
            return;
        }
        Timeline.Period period = this.period;
        int i = 0;
        timeline.getPeriod(indexOfPeriod, period, false);
        int i2 = period.windowIndex;
        Timeline.Window window = this.window;
        timeline.getWindow(i2, window);
        MediaItem.LocalConfiguration localConfiguration = window.mediaItem.localConfiguration;
        if (localConfiguration != null) {
            int inferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType);
            i = inferContentTypeForUriAndMimeType != 0 ? inferContentTypeForUriAndMimeType != 1 ? inferContentTypeForUriAndMimeType != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (window.durationUs != -9223372036854775807L && !window.isPlaceholder && !window.isDynamic && !window.isLive()) {
            builder.setMediaDurationMillis(Util.usToMs(window.durationUs));
        }
        builder.setPlaybackType(window.isLive() ? 2 : 1);
        this.reportedEventsForCurrentSession = true;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j) {
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = eventTime.mediaPeriodId;
        if (mediaSource$MediaPeriodId != null) {
            String sessionForMediaPeriodId = this.sessionManager.getSessionForMediaPeriodId(eventTime.timeline, mediaSource$MediaPeriodId);
            HashMap hashMap = this.bandwidthBytes;
            Long l = (Long) hashMap.get(sessionForMediaPeriodId);
            HashMap hashMap2 = this.bandwidthTimeMs;
            Long l2 = (Long) hashMap2.get(sessionForMediaPeriodId);
            hashMap.put(sessionForMediaPeriodId, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            hashMap2.put(sessionForMediaPeriodId, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = eventTime.mediaPeriodId;
        if (mediaSource$MediaPeriodId == null) {
            return;
        }
        Format format2 = (Format) mediaLoadData.trackFormat;
        format2.getClass();
        Timeline timeline = eventTime.timeline;
        mediaSource$MediaPeriodId.getClass();
        AndroidSvg androidSvg = new AndroidSvg(2, format2, this.sessionManager.getSessionForMediaPeriodId(timeline, mediaSource$MediaPeriodId));
        int i = mediaLoadData.trackType;
        if (i != 0) {
            if (i == 1) {
                this.pendingAudioFormat = androidSvg;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.pendingTextFormat = androidSvg;
                return;
            }
        }
        this.pendingVideoFormat = androidSvg;
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x063c A[ORIG_RETURN, RETURN] */
    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onEvents(Player player, CallResult callResult) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Viewport viewport;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        int i15;
        MediaMetricsListener mediaMetricsListener;
        Format format2;
        DrmInitData drmInitData;
        int i16;
        if (((FlagSet) callResult.result).flags.size() == 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            boolean z3 = true;
            if (i17 >= ((FlagSet) callResult.result).flags.size()) {
                break;
            }
            int i18 = ((FlagSet) callResult.result).get(i17);
            AnalyticsListener.EventTime eventTime = (AnalyticsListener.EventTime) ((SparseArray) callResult.serviceNames).get(i18);
            eventTime.getClass();
            DefaultPlaybackSessionManager defaultPlaybackSessionManager = this.sessionManager;
            if (i18 == 0) {
                synchronized (defaultPlaybackSessionManager) {
                    try {
                        defaultPlaybackSessionManager.listener.getClass();
                        Timeline timeline = defaultPlaybackSessionManager.currentTimeline;
                        defaultPlaybackSessionManager.currentTimeline = eventTime.timeline;
                        Iterator it = defaultPlaybackSessionManager.sessions.values().iterator();
                        while (it.hasNext()) {
                            DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor = (DefaultPlaybackSessionManager.SessionDescriptor) it.next();
                            if (sessionDescriptor.tryResolvingToNewTimeline(timeline, defaultPlaybackSessionManager.currentTimeline) && !sessionDescriptor.isFinishedAtEventTime(eventTime)) {
                            }
                            it.remove();
                            if (sessionDescriptor.sessionId.equals(defaultPlaybackSessionManager.currentSessionId)) {
                                defaultPlaybackSessionManager.clearCurrentSession(sessionDescriptor);
                            }
                            if (sessionDescriptor.isCreated) {
                                defaultPlaybackSessionManager.listener.onSessionFinished(eventTime, sessionDescriptor.sessionId);
                            }
                        }
                        defaultPlaybackSessionManager.updateCurrentSession(eventTime);
                    } finally {
                    }
                }
            } else if (i18 == 11) {
                int i19 = this.discontinuityReason;
                synchronized (defaultPlaybackSessionManager) {
                    try {
                        defaultPlaybackSessionManager.listener.getClass();
                        if (i19 != 0) {
                            z3 = false;
                        }
                        Iterator it2 = defaultPlaybackSessionManager.sessions.values().iterator();
                        while (it2.hasNext()) {
                            DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor2 = (DefaultPlaybackSessionManager.SessionDescriptor) it2.next();
                            if (sessionDescriptor2.isFinishedAtEventTime(eventTime)) {
                                it2.remove();
                                boolean equals = sessionDescriptor2.sessionId.equals(defaultPlaybackSessionManager.currentSessionId);
                                if (equals) {
                                    defaultPlaybackSessionManager.clearCurrentSession(sessionDescriptor2);
                                }
                                if (sessionDescriptor2.isCreated) {
                                    if (z3 && equals) {
                                        boolean z4 = sessionDescriptor2.isActive;
                                    }
                                    defaultPlaybackSessionManager.listener.onSessionFinished(eventTime, sessionDescriptor2.sessionId);
                                }
                            }
                        }
                        defaultPlaybackSessionManager.updateCurrentSession(eventTime);
                    } finally {
                    }
                }
            } else {
                defaultPlaybackSessionManager.updateSessions(eventTime);
            }
            i17++;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (callResult.contains(0)) {
            AnalyticsListener.EventTime eventTime2 = (AnalyticsListener.EventTime) ((SparseArray) callResult.serviceNames).get(0);
            eventTime2.getClass();
            if (this.metricsBuilder != null) {
                maybeUpdateTimelineMetadata(eventTime2.timeline, eventTime2.mediaPeriodId);
            }
        }
        if (callResult.contains(2) && this.metricsBuilder != null) {
            ImmutableList.Itr listIterator = ((ExoPlayerImpl) player).getCurrentTracks().groups.listIterator(0);
            loop3: while (true) {
                if (!listIterator.hasNext()) {
                    drmInitData = null;
                    break;
                }
                Tracks.Group group = (Tracks.Group) listIterator.next();
                for (int i20 = 0; i20 < group.length; i20++) {
                    if (group.trackSelected[i20] && (drmInitData = group.mediaTrackGroup.formats[i20].drmInitData) != null) {
                        break loop3;
                    }
                }
            }
            if (drmInitData != null) {
                PlaybackMetrics.Builder builder = this.metricsBuilder;
                int i21 = 0;
                while (true) {
                    if (i21 >= drmInitData.schemeDataCount) {
                        i16 = 1;
                        break;
                    }
                    UUID uuid = drmInitData.schemeDatas[i21].uuid;
                    if (uuid.equals(C.WIDEVINE_UUID)) {
                        i16 = 3;
                        break;
                    } else if (uuid.equals(C.PLAYREADY_UUID)) {
                        i16 = 2;
                        break;
                    } else {
                        if (uuid.equals(C.CLEARKEY_UUID)) {
                            i16 = 6;
                            break;
                        }
                        i21++;
                    }
                }
                builder.setDrmType(i16);
            }
        }
        if (callResult.contains(IptcConstants.IMAGE_RESOURCE_BLOCK_PRINT_FLAGS)) {
            this.audioUnderruns++;
        }
        PlaybackException playbackException = this.pendingPlayerError;
        int i22 = 5;
        if (playbackException == null) {
            i12 = 2;
            i2 = 8;
            i3 = 7;
            i4 = 6;
            i5 = 9;
            i11 = 1;
            i6 = 13;
        } else {
            int i23 = playbackException.errorCode;
            Context context = this.context;
            boolean z5 = this.ioErrorType == 4;
            if (i23 == 1001) {
                viewport = new Viewport(20, 0);
            } else {
                if (playbackException instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
                    z = exoPlaybackException.f876type == 1;
                    i = exoPlaybackException.rendererFormatSupport;
                } else {
                    z = false;
                    i = 0;
                }
                Throwable cause = playbackException.getCause();
                cause.getClass();
                int i24 = 27;
                if (!(cause instanceof IOException)) {
                    int i25 = 28;
                    i2 = 8;
                    i3 = 7;
                    i4 = 6;
                    i5 = 9;
                    if (z && (i == 0 || i == 1)) {
                        viewport = new Viewport(35, 0);
                    } else if (z && i == 3) {
                        viewport = new Viewport(15, 0);
                    } else if (z && i == 2) {
                        viewport = new Viewport(23, 0);
                    } else {
                        if (cause instanceof MediaCodecRenderer.DecoderInitializationException) {
                            i6 = 13;
                            viewport = new Viewport(13, Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaCodecRenderer.DecoderInitializationException) cause).diagnosticInfo));
                        } else {
                            i6 = 13;
                            if (cause instanceof MediaCodecDecoderException) {
                                viewport = new Viewport(14, ((MediaCodecDecoderException) cause).errorCode);
                            } else if (cause instanceof OutOfMemoryError) {
                                viewport = new Viewport(14, 0);
                            } else if (cause instanceof AudioSink$InitializationException) {
                                viewport = new Viewport(17, 0);
                            } else if (cause instanceof AudioSink$WriteException) {
                                viewport = new Viewport(18, ((AudioSink$WriteException) cause).errorCode);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (Util.getErrorCodeForMediaDrmErrorCode(errorCode)) {
                                    case 6002:
                                        i25 = 24;
                                        break;
                                    case 6003:
                                        break;
                                    case 6004:
                                        i25 = 25;
                                        break;
                                    case 6005:
                                        i25 = 26;
                                        break;
                                    default:
                                        i25 = 27;
                                        break;
                                }
                                viewport = new Viewport(i25, errorCode);
                            } else {
                                viewport = new Viewport(22, 0);
                            }
                        }
                        this.backgroundExecutor.execute(new DispatchQueue$$ExternalSyntheticLambda0(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.startTimeMs).setErrorCode(viewport.width).setSubErrorCode(viewport.height).setException(playbackException).build()));
                        i11 = 1;
                        this.reportedEventsForCurrentSession = true;
                        this.pendingPlayerError = null;
                        i12 = 2;
                    }
                    i6 = 13;
                    this.backgroundExecutor.execute(new DispatchQueue$$ExternalSyntheticLambda0(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.startTimeMs).setErrorCode(viewport.width).setSubErrorCode(viewport.height).setException(playbackException).build()));
                    i11 = 1;
                    this.reportedEventsForCurrentSession = true;
                    this.pendingPlayerError = null;
                    i12 = 2;
                } else if (cause instanceof HttpDataSource$InvalidResponseCodeException) {
                    viewport = new Viewport(5, ((HttpDataSource$InvalidResponseCodeException) cause).responseCode);
                } else {
                    if ((cause instanceof HttpDataSource$InvalidContentTypeException) || (cause instanceof ParserException)) {
                        i7 = 8;
                        i8 = 9;
                        i9 = 6;
                        i10 = 7;
                        viewport = new Viewport(z5 ? 10 : 11, 0);
                    } else {
                        boolean z6 = cause instanceof HttpDataSource$HttpDataSourceException;
                        if (z6 || (cause instanceof UdpDataSource.UdpDataSourceException)) {
                            i8 = 9;
                            if (NetworkResponse.getInstance(context).getNetworkType() == 1) {
                                viewport = new Viewport(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    viewport = new Viewport(6, 0);
                                    i5 = 9;
                                    i4 = 6;
                                    i6 = 13;
                                    i2 = 8;
                                    i3 = 7;
                                } else {
                                    i9 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i10 = 7;
                                        viewport = new Viewport(7, 0);
                                    } else {
                                        i10 = 7;
                                        if (z6 && ((HttpDataSource$HttpDataSourceException) cause).f874type == 1) {
                                            viewport = new Viewport(4, 0);
                                        } else {
                                            i7 = 8;
                                            viewport = new Viewport(8, 0);
                                        }
                                    }
                                    i5 = 9;
                                    i4 = 6;
                                    i3 = i10;
                                    i6 = 13;
                                    i2 = 8;
                                }
                                this.backgroundExecutor.execute(new DispatchQueue$$ExternalSyntheticLambda0(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.startTimeMs).setErrorCode(viewport.width).setSubErrorCode(viewport.height).setException(playbackException).build()));
                                i11 = 1;
                                this.reportedEventsForCurrentSession = true;
                                this.pendingPlayerError = null;
                                i12 = 2;
                            }
                        } else if (i23 == 1002) {
                            viewport = new Viewport(21, 0);
                        } else if (cause instanceof DrmSession$DrmSessionException) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int errorCodeFromPlatformDiagnosticsInfo = Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (Util.getErrorCodeForMediaDrmErrorCode(errorCodeFromPlatformDiagnosticsInfo)) {
                                    case 6002:
                                        i24 = 24;
                                        break;
                                    case 6003:
                                        i24 = 28;
                                        break;
                                    case 6004:
                                        i24 = 25;
                                        break;
                                    case 6005:
                                        i24 = 26;
                                        break;
                                }
                                viewport = new Viewport(i24, errorCodeFromPlatformDiagnosticsInfo);
                            } else {
                                viewport = cause3 instanceof MediaDrmResetException ? new Viewport(27, 0) : cause3 instanceof NotProvisionedException ? new Viewport(24, 0) : cause3 instanceof DeniedByServerException ? new Viewport(29, 0) : cause3 instanceof UnsupportedDrmException ? new Viewport(23, 0) : cause3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new Viewport(28, 0) : new Viewport(30, 0);
                            }
                        } else if ((cause instanceof FileDataSource.FileDataSourceException) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            viewport = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new Viewport(32, 0) : new Viewport(31, 0);
                        } else {
                            i8 = 9;
                            viewport = new Viewport(9, 0);
                        }
                        i5 = i8;
                        i6 = 13;
                        i2 = 8;
                        i3 = 7;
                        i4 = 6;
                        this.backgroundExecutor.execute(new DispatchQueue$$ExternalSyntheticLambda0(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.startTimeMs).setErrorCode(viewport.width).setSubErrorCode(viewport.height).setException(playbackException).build()));
                        i11 = 1;
                        this.reportedEventsForCurrentSession = true;
                        this.pendingPlayerError = null;
                        i12 = 2;
                    }
                    i2 = i7;
                    i5 = i8;
                    i4 = i9;
                    i3 = i10;
                    i6 = 13;
                    this.backgroundExecutor.execute(new DispatchQueue$$ExternalSyntheticLambda0(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.startTimeMs).setErrorCode(viewport.width).setSubErrorCode(viewport.height).setException(playbackException).build()));
                    i11 = 1;
                    this.reportedEventsForCurrentSession = true;
                    this.pendingPlayerError = null;
                    i12 = 2;
                }
            }
            i6 = 13;
            i2 = 8;
            i3 = 7;
            i4 = 6;
            i5 = 9;
            this.backgroundExecutor.execute(new DispatchQueue$$ExternalSyntheticLambda0(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.startTimeMs).setErrorCode(viewport.width).setSubErrorCode(viewport.height).setException(playbackException).build()));
            i11 = 1;
            this.reportedEventsForCurrentSession = true;
            this.pendingPlayerError = null;
            i12 = 2;
        }
        if (callResult.contains(i12)) {
            Tracks currentTracks = ((ExoPlayerImpl) player).getCurrentTracks();
            boolean isTypeSelected = currentTracks.isTypeSelected(i12);
            boolean isTypeSelected2 = currentTracks.isTypeSelected(i11);
            boolean isTypeSelected3 = currentTracks.isTypeSelected(3);
            if (isTypeSelected || isTypeSelected2 || isTypeSelected3) {
                if (isTypeSelected) {
                    format2 = null;
                } else {
                    format2 = null;
                    if (!Objects.equals(this.currentVideoFormat, null)) {
                        this.currentVideoFormat = null;
                        reportTrackChangeEvent(1, elapsedRealtime, null);
                    }
                }
                if (!isTypeSelected2 && !Objects.equals(this.currentAudioFormat, format2)) {
                    this.currentAudioFormat = format2;
                    reportTrackChangeEvent(0, elapsedRealtime, format2);
                }
                if (!isTypeSelected3 && !Objects.equals(this.currentTextFormat, format2)) {
                    this.currentTextFormat = format2;
                    reportTrackChangeEvent(2, elapsedRealtime, format2);
                }
            }
        }
        if (canReportPendingFormatUpdate(this.pendingVideoFormat)) {
            Format format3 = (Format) this.pendingVideoFormat.svg;
            if (format3.height != -1) {
                if (!Objects.equals(this.currentVideoFormat, format3)) {
                    this.currentVideoFormat = format3;
                    reportTrackChangeEvent(1, elapsedRealtime, format3);
                }
                this.pendingVideoFormat = null;
            }
        }
        if (canReportPendingFormatUpdate(this.pendingAudioFormat)) {
            Format format4 = (Format) this.pendingAudioFormat.svg;
            if (!Objects.equals(this.currentAudioFormat, format4)) {
                this.currentAudioFormat = format4;
                reportTrackChangeEvent(0, elapsedRealtime, format4);
            }
            this.pendingAudioFormat = null;
        }
        if (canReportPendingFormatUpdate(this.pendingTextFormat)) {
            Format format5 = (Format) this.pendingTextFormat.svg;
            if (!Objects.equals(this.currentTextFormat, format5)) {
                this.currentTextFormat = format5;
                reportTrackChangeEvent(2, elapsedRealtime, format5);
            }
            this.pendingTextFormat = null;
        }
        switch (NetworkResponse.getInstance(this.context).getNetworkType()) {
            case 0:
                i13 = 0;
                break;
            case 1:
                i13 = i5;
                break;
            case 2:
                i13 = 2;
                break;
            case 3:
                i13 = 4;
                break;
            case 4:
                i13 = 5;
                break;
            case 5:
                i13 = i4;
                break;
            case 6:
            case 8:
            default:
                i13 = 1;
                break;
            case 7:
                i13 = 3;
                break;
            case 9:
                i13 = i2;
                break;
            case 10:
                i13 = i3;
                break;
        }
        if (i13 != this.currentNetworkType) {
            this.currentNetworkType = i13;
            this.backgroundExecutor.execute(new DispatchQueue$$ExternalSyntheticLambda0(19, this, new NetworkEvent.Builder().setNetworkType(i13).setTimeSinceCreatedMillis(elapsedRealtime - this.startTimeMs).build()));
        }
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
        if (exoPlayerImpl.getPlaybackState() != 2) {
            this.isSeeking = false;
        }
        exoPlayerImpl.verifyApplicationThread();
        if (exoPlayerImpl.playbackInfo.playbackError == null) {
            this.hasFatalError = false;
            i14 = 10;
        } else {
            i14 = 10;
            if (callResult.contains(10)) {
                this.hasFatalError = true;
            }
        }
        int playbackState = exoPlayerImpl.getPlaybackState();
        if (!this.isSeeking) {
            if (!this.hasFatalError) {
                i6 = 4;
                if (playbackState == 4) {
                    i15 = 11;
                } else {
                    i22 = 2;
                    if (playbackState == 2) {
                        int i26 = this.currentPlaybackState;
                        if (i26 != 0 && i26 != 2 && i26 != 12) {
                            if (exoPlayerImpl.getPlayWhenReady()) {
                                if (exoPlayerImpl.getPlaybackSuppressionReason() == 0) {
                                    i15 = i4;
                                }
                                i15 = i14;
                            } else {
                                i15 = i3;
                            }
                        }
                    } else {
                        i14 = 3;
                        if (playbackState != 3) {
                            z2 = true;
                            i15 = (playbackState != 1 || this.currentPlaybackState == 0) ? this.currentPlaybackState : 12;
                            if (this.currentPlaybackState != i15) {
                                this.currentPlaybackState = i15;
                                this.reportedEventsForCurrentSession = z2;
                                this.backgroundExecutor.execute(new DispatchQueue$$ExternalSyntheticLambda0(22, this, new PlaybackStateEvent.Builder().setState(this.currentPlaybackState).setTimeSinceCreatedMillis(elapsedRealtime - this.startTimeMs).build()));
                            }
                            if (callResult.contains(IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA)) {
                                return;
                            }
                            DefaultPlaybackSessionManager defaultPlaybackSessionManager2 = this.sessionManager;
                            AnalyticsListener.EventTime eventTime3 = (AnalyticsListener.EventTime) ((SparseArray) callResult.serviceNames).get(IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA);
                            eventTime3.getClass();
                            synchronized (defaultPlaybackSessionManager2) {
                                try {
                                    String str = defaultPlaybackSessionManager2.currentSessionId;
                                    if (str != null) {
                                        DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor3 = (DefaultPlaybackSessionManager.SessionDescriptor) defaultPlaybackSessionManager2.sessions.get(str);
                                        sessionDescriptor3.getClass();
                                        defaultPlaybackSessionManager2.clearCurrentSession(sessionDescriptor3);
                                    }
                                    Iterator it3 = defaultPlaybackSessionManager2.sessions.values().iterator();
                                    while (it3.hasNext()) {
                                        DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor4 = (DefaultPlaybackSessionManager.SessionDescriptor) it3.next();
                                        it3.remove();
                                        if (sessionDescriptor4.isCreated && (mediaMetricsListener = defaultPlaybackSessionManager2.listener) != null) {
                                            mediaMetricsListener.onSessionFinished(eventTime3, sessionDescriptor4.sessionId);
                                        }
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        if (exoPlayerImpl.getPlayWhenReady()) {
                            if (exoPlayerImpl.getPlaybackSuppressionReason() != 0) {
                                i15 = i5;
                            }
                            i15 = i14;
                        }
                    }
                }
                z2 = true;
                if (this.currentPlaybackState != i15) {
                }
                if (callResult.contains(IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA)) {
                }
            }
            i15 = i6;
            z2 = true;
            if (this.currentPlaybackState != i15) {
            }
            if (callResult.contains(IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA)) {
            }
        }
        i15 = i22;
        z2 = true;
        if (this.currentPlaybackState != i15) {
        }
        if (callResult.contains(IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA)) {
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException) {
        this.ioErrorType = 1;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        this.pendingPlayerError = playbackException;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onPositionDiscontinuity(int i) {
        if (i == 1) {
            this.isSeeking = true;
        }
        this.discontinuityReason = i;
    }

    public final void onSessionActive(AnalyticsListener.EventTime eventTime, String str) {
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = eventTime.mediaPeriodId;
        if (mediaSource$MediaPeriodId == null || !mediaSource$MediaPeriodId.isAd()) {
            finishCurrentSession();
            this.activeSessionId = str;
            this.metricsBuilder = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
            maybeUpdateTimelineMetadata(eventTime.timeline, mediaSource$MediaPeriodId);
        }
    }

    public final void onSessionFinished(AnalyticsListener.EventTime eventTime, String str) {
        MediaSource$MediaPeriodId mediaSource$MediaPeriodId = eventTime.mediaPeriodId;
        if ((mediaSource$MediaPeriodId == null || !mediaSource$MediaPeriodId.isAd()) && str.equals(this.activeSessionId)) {
            finishCurrentSession();
        }
        this.bandwidthTimeMs.remove(str);
        this.bandwidthBytes.remove(str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
        this.droppedFrames += decoderCounters.droppedBufferCount;
        this.playedFrames += decoderCounters.renderedOutputBufferCount;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        AndroidSvg androidSvg = this.pendingVideoFormat;
        if (androidSvg != null) {
            Format format2 = (Format) androidSvg.svg;
            if (format2.height == -1) {
                Format.Builder buildUpon = format2.buildUpon();
                buildUpon.width = videoSize.width;
                buildUpon.height = videoSize.height;
                this.pendingVideoFormat = new AndroidSvg(2, new Format(buildUpon), (String) androidSvg.renderOptions);
            }
        }
    }

    public final void reportTrackChangeEvent(int i, long j, Format format2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.startTimeMs);
        if (format2 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(2);
            String str = format2.containerMimeType;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = format2.sampleMimeType;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = format2.codecs;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i2 = format2.bitrate;
            if (i2 != -1) {
                timeSinceCreatedMillis.setBitrate(i2);
            }
            int i3 = format2.width;
            if (i3 != -1) {
                timeSinceCreatedMillis.setWidth(i3);
            }
            int i4 = format2.height;
            if (i4 != -1) {
                timeSinceCreatedMillis.setHeight(i4);
            }
            int i5 = format2.channelCount;
            if (i5 != -1) {
                timeSinceCreatedMillis.setChannelCount(i5);
            }
            int i6 = format2.sampleRate;
            if (i6 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i6);
            }
            String str4 = format2.language;
            if (str4 != null) {
                String str5 = Util.DEVICE_DEBUG_INFO;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = format2.frameRate;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.reportedEventsForCurrentSession = true;
        this.backgroundExecutor.execute(new DispatchQueue$$ExternalSyntheticLambda0(18, this, timeSinceCreatedMillis.build()));
    }
}
