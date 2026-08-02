package ru.yandex.video.m3.player.impl.listeners;

import androidx.media3.common.PlaybackException;
import defpackage.ah3;
import defpackage.do31;
import defpackage.fe10;
import defpackage.h42;
import defpackage.h5z0;
import defpackage.he10;
import defpackage.i42;
import defpackage.kju0;
import defpackage.kyg;
import defpackage.lxc0;
import defpackage.qyg;
import defpackage.r001;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.scc;
import defpackage.u4r0;
import defpackage.ue3;
import defpackage.uwy;
import defpackage.vxc0;
import defpackage.w820;
import defpackage.xaj;
import defpackage.yxc0;
import defpackage.zxc0;
import defpackage.zy11;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecReuseLogKt;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.impl.AnalyticsListenerProxy;
import ru.yandex.video.m3.player.impl.ExoDecoderCounter;
import ru.yandex.video.m3.player.impl.codecs.LoggingMediaCodecSelector;
import ru.yandex.video.m3.player.impl.tracks.ExoPlayerTrack;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010%\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J/\u0010+\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020#H\u0016¢\u0006\u0004\b+\u0010,J/\u0010-\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020#H\u0016¢\u0006\u0004\b-\u0010,J\u001f\u00100\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b4\u00103J\u001f\u00105\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b5\u00101J)\u00109\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b9\u0010:J)\u0010;\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b;\u0010:J7\u0010A\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u00102\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ'\u0010C\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u0010H\u0016¢\u0006\u0004\bC\u0010DJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010EJ\u0017\u0010F\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\bF\u0010GJ\u0013\u0010H\u001a\u00020'*\u00020\u0010H\u0007¢\u0006\u0004\bH\u0010IR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010JR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010KR$\u0010N\u001a\u0012\u0012\u0004\u0012\u00020\u00100Lj\b\u0012\u0004\u0012\u00020\u0010`M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR$\u0010P\u001a\u0012\u0012\u0004\u0012\u00020\u00100Lj\b\u0012\u0004\u0012\u00020\u0010`M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010OR$\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020#0Lj\b\u0012\u0004\u0012\u00020#`M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010OR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020'0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/InternalAnalyticsListener;", "Lru/yandex/video/m3/player/impl/AnalyticsListenerProxy;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "dispatcher", "Lru/yandex/video/m3/player/impl/codecs/LoggingMediaCodecSelector;", "loggingMediaCodecSelector", "<init>", "(Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;Lru/yandex/video/m3/player/impl/codecs/LoggingMediaCodecSelector;)V", "Luwy;", "loadEventInfo", "Lhe10;", "mediaLoadData", "Lzy11;", "onLoadCompleted", "(Luwy;Lhe10;)V", "", "Lru/yandex/video/m3/player/tracks/TrackType;", "toTrackType", "(I)Lru/yandex/video/m3/player/tracks/TrackType;", "Lru/yandex/video/m3/data/MediaCodecReuseLog$DecoderReuseMethod;", "toMediaCodecReuseMethod", "(I)Lru/yandex/video/m3/data/MediaCodecReuseLog$DecoderReuseMethod;", "Lqyg;", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "toMediaCodecReuseLog", "(Lqyg;)Lru/yandex/video/m3/data/MediaCodecReuseLog;", "Lh42;", "eventTime", "Lw820;", kju0.j, "onMetadata", "(Lh42;Lw820;)V", "", "output", "", "renderTimeMs", "onRenderedFirstFrame", "(Lh42;Ljava/lang/Object;J)V", "", "decoderName", "initializedTimestampMs", "initializationDurationMs", "onVideoDecoderInitialized", "(Lh42;Ljava/lang/String;JJ)V", "onAudioDecoderInitialized", "Lkyg;", "counters", "onVideoEnabled", "(Lh42;Lkyg;)V", "onVideoDecoderReleased", "(Lh42;Ljava/lang/String;)V", "onAudioDecoderReleased", "onAudioEnabled", "Landroidx/media3/common/a;", "format", "decoderReuseEvaluation", "onVideoInputFormatChanged", "(Lh42;Landroidx/media3/common/a;Lqyg;)V", "onAudioInputFormatChanged", "width", "height", "unappliedRotationDegrees", "", "pixelWidthHeightRatio", "onVideoSizeChanged", "(Lh42;IIIF)V", "onSurfaceSizeChanged", "(Lh42;II)V", "(Lh42;Luwy;Lhe10;)V", "onDrmKeysLoaded", "(Lh42;)V", "stringifyDecoderDiscardReason", "(I)Ljava/lang/String;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/impl/codecs/LoggingMediaCodecSelector;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "allowedDataMediaTypes", "Ljava/util/HashSet;", "allowedTrackTypes", "prohibitedTimings", "", "decoderDiscardReasons", "Ljava/util/List;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalAnalyticsListener extends AnalyticsListenerProxy {
    public static final int $stable = 8;
    private final ObserverDispatcher<PlayerDelegate.Observer> dispatcher;
    private final LoggingMediaCodecSelector loggingMediaCodecSelector;
    private final HashSet<Integer> allowedDataMediaTypes = u4r0.c(1, 7);
    private final HashSet<Integer> allowedTrackTypes = u4r0.c(0, 2);
    private final HashSet<Long> prohibitedTimings = u4r0.c(-9223372036854775807L, Long.MIN_VALUE);
    private final List<String> decoderDiscardReasons = scc.g("REUSE_NOT_IMPLEMENTED", "WORKAROUND", "APP_OVERRIDE", "MIME_TYPE_CHANGED", "OPERATING_RATE_CHANGED", "INITIALIZATION_DATA_CHANGED", "MAX_INPUT_SIZE_EXCEEDED", "DRM_SESSION_CHANGED", "VIDEO_MAX_RESOLUTION_EXCEEDED", "VIDEO_RESOLUTION_CHANGED", "VIDEO_ROTATION_CHANGED", "VIDEO_COLOR_INFO_CHANGED", "AUDIO_CHANNEL_COUNT_CHANGED", "AUDIO_SAMPLE_RATE_CHANGED", "AUDIO_ENCODING_CHANGED");

    public InternalAnalyticsListener(ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher, LoggingMediaCodecSelector loggingMediaCodecSelector) {
        this.dispatcher = observerDispatcher;
        this.loggingMediaCodecSelector = loggingMediaCodecSelector;
    }

    private final void onLoadCompleted(uwy loadEventInfo, he10 mediaLoadData) {
        HashSet H0;
        Object failure;
        HashSet H02;
        Object failure2;
        if (!this.allowedDataMediaTypes.contains(Integer.valueOf(mediaLoadData.a)) || this.prohibitedTimings.contains(Long.valueOf(mediaLoadData.f)) || this.prohibitedTimings.contains(Long.valueOf(mediaLoadData.g))) {
            return;
        }
        if (this.allowedTrackTypes.contains(Integer.valueOf(mediaLoadData.b))) {
            ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H02 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H02.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerDelegate.Observer) it.next()).onDataLoaded(mediaLoadData.g - mediaLoadData.f, loadEventInfo.d);
                    failure2 = zy11.a;
                } catch (Throwable th) {
                    failure2 = new Result.Failure(th);
                }
                Throwable a = Result.a(failure2);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
        }
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher2 = this.dispatcher;
        synchronized (observerDispatcher2.getObservers()) {
            H0 = a.H0(observerDispatcher2.getObservers());
        }
        Iterator it2 = H0.iterator();
        while (it2.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it2.next()).onBytesLoaded(loadEventInfo.e, toTrackType(mediaLoadData.b));
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

    private final MediaCodecReuseLog toMediaCodecReuseLog(qyg qygVar) {
        return MediaCodecReuseLogKt.MediaCodecReuseLog$default(toMediaCodecReuseMethod(qygVar.d), stringifyDecoderDiscardReason(qygVar.e), null, 4, null);
    }

    private final MediaCodecReuseLog.DecoderReuseMethod toMediaCodecReuseMethod(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? MediaCodecReuseLog.DecoderReuseMethod.UNKNOWN : MediaCodecReuseLog.DecoderReuseMethod.NOOP : MediaCodecReuseLog.DecoderReuseMethod.RECONFIGURE : MediaCodecReuseLog.DecoderReuseMethod.FLUSH : MediaCodecReuseLog.DecoderReuseMethod.DISCARD;
    }

    private final TrackType toTrackType(int i) {
        if (i == 1) {
            return TrackType.Audio;
        }
        if (i == 2) {
            return TrackType.Video;
        }
        if (i != 3) {
            return null;
        }
        return TrackType.Subtitles;
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(h42 h42Var, ue3 ue3Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioCodecError(h42 h42Var, Exception exc) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onAudioDecoderInitialized(h42 eventTime, String decoderName, long initializedTimestampMs, long initializationDurationMs) {
        HashSet<PlayerDelegate.Observer> H0;
        Object failure;
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        for (PlayerDelegate.Observer observer : H0) {
            try {
                TrackType trackType = TrackType.Audio;
                observer.onDecoderInitialized(trackType, decoderName, this.loggingMediaCodecSelector.getLastSelectorLog(trackType));
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

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onAudioDecoderReleased(h42 eventTime, String decoderName) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onAudioDecoderReleased(decoderName);
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

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioDisabled(h42 h42Var, kyg kygVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onAudioEnabled(h42 eventTime, kyg counters) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onAudioDecoderEnabled(new ExoDecoderCounter(counters));
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

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onAudioInputFormatChanged(h42 eventTime, androidx.media3.common.a format, qyg decoderReuseEvaluation) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onAudioInputFormatChanged(new ExoPlayerTrack.ExoTrackFormat(format, null, null, null, null, 0, 0, 0, 0.0f, null, null, 2046, null), decoderReuseEvaluation != null ? toMediaCodecReuseLog(decoderReuseEvaluation) : null);
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
    public void onDrmKeysLoaded(h42 eventTime) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onDrmKeysLoaded();
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
    public void onMetadata(h42 eventTime, w820 metadata) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onMetadata(eventTime, metadata);
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
    public void onRenderedFirstFrame(h42 eventTime, Object output, long renderTimeMs) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onFirstFrame();
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
    public void onSurfaceSizeChanged(h42 eventTime, int width, int height) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onSurfaceSizeChanged(width, height);
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[SYNTHETIC] */
    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onVideoDecoderInitialized(h42 eventTime, String decoderName, long initializedTimestampMs, long initializationDurationMs) {
        HashSet<PlayerDelegate.Observer> H0;
        String str;
        long j;
        long j2;
        Object failure;
        Throwable a;
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        for (PlayerDelegate.Observer observer : H0) {
            try {
                TrackType trackType = TrackType.Video;
                observer.onDecoderInitialized(trackType, decoderName, this.loggingMediaCodecSelector.getLastSelectorLog(trackType));
                str = decoderName;
                j = initializedTimestampMs;
                j2 = initializationDurationMs;
                try {
                    observer.onVideoDecoderInitialized(str, j, j2);
                    failure = zy11.a;
                } catch (Throwable th) {
                    th = th;
                    failure = new Result.Failure(th);
                    a = Result.a(failure);
                    if (a == null) {
                    }
                    decoderName = str;
                    initializedTimestampMs = j;
                    initializationDurationMs = j2;
                }
            } catch (Throwable th2) {
                th = th2;
                str = decoderName;
                j = initializedTimestampMs;
                j2 = initializationDurationMs;
            }
            a = Result.a(failure);
            if (a == null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
            decoderName = str;
            initializedTimestampMs = j;
            initializationDurationMs = j2;
        }
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onVideoDecoderReleased(h42 eventTime, String decoderName) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onVideoDecoderReleased(decoderName);
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

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoDisabled(h42 h42Var, kyg kygVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onVideoEnabled(h42 eventTime, kyg counters) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onVideoDecoderEnabled(new ExoDecoderCounter(counters));
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

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(h42 h42Var, long j, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onVideoInputFormatChanged(h42 eventTime, androidx.media3.common.a format, qyg decoderReuseEvaluation) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onVideoInputFormatChanged(new ExoPlayerTrack.ExoTrackFormat(format, null, null, null, null, 0, 0, 0, 0.0f, null, null, 2046, null), decoderReuseEvaluation != null ? toMediaCodecReuseLog(decoderReuseEvaluation) : null);
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

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onVideoSizeChanged(h42 eventTime, int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onVideoSizeChanged(width, height);
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

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVolumeChanged(h42 h42Var, float f) {
    }

    public final String stringifyDecoderDiscardReason(int i) {
        if (i == 0) {
            return "ZERO_INFO";
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        for (String str : this.decoderDiscardReasons) {
            if ((i & i2) > 0) {
                arrayList.add(str);
            }
            i2 *= 2;
        }
        return a.X(arrayList, ",", null, null, null, 62);
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(h42 h42Var, do31 do31Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(h42 h42Var, String str, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(h42 h42Var, String str, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onLoadCompleted(h42 eventTime, uwy loadEventInfo, he10 mediaLoadData) {
        onLoadCompleted(loadEventInfo, mediaLoadData);
    }
}
