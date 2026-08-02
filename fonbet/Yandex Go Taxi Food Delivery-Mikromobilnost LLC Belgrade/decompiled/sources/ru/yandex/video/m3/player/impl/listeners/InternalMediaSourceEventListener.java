package ru.yandex.video.m3.player.impl.listeners;

import androidx.media3.common.a;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import defpackage.cvu0;
import defpackage.eh20;
import defpackage.h5z0;
import defpackage.he10;
import defpackage.jwu;
import defpackage.kwu;
import defpackage.sf10;
import defpackage.tls;
import defpackage.tw21;
import defpackage.uwy;
import defpackage.yf10;
import defpackage.zy11;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.impl.tracks.RendererTrackSelector;
import ru.yandex.video.m3.player.impl.utils.LoadErrorHandlingPolicyImpl;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadCanceledKt;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracking.LoadErrorKt;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 72\u00020\u0001:\u000278B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010\"J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010(JA\u0010-\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010.J1\u0010/\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u00100J1\u00101\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b1\u00100J)\u00102\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u00103R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106¨\u00069"}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/InternalMediaSourceEventListener;", "Lyf10;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "dispatcher", "Lru/yandex/video/m3/player/impl/listeners/InternalMediaSourceEventListener$VideoTrackSelectionProvider;", "videoTrackSelectionProvider", "Lru/yandex/video/m3/player/impl/utils/LoadErrorHandlingPolicyImpl;", "loadErrorHandlingPolicyImpl", "<init>", "(Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;Lru/yandex/video/m3/player/impl/listeners/InternalMediaSourceEventListener$VideoTrackSelectionProvider;Lru/yandex/video/m3/player/impl/utils/LoadErrorHandlingPolicyImpl;)V", "Lhe10;", "mediaLoadData", "Luwy;", "loadEventInfo", "Lzy11;", "dispatchVideoBitrateInfo", "(Lhe10;Luwy;)V", "", "mimeType", "", "isApplication", "(Ljava/lang/String;)Z", "Ljava/io/IOException;", "error", "Lru/yandex/video/m3/player/tracking/LoadError;", "toLoadError", "(Luwy;Ljava/io/IOException;)Lru/yandex/video/m3/player/tracking/LoadError;", "Lru/yandex/video/m3/player/tracking/LoadCanceled;", "createLoadCanceled", "(Luwy;Lhe10;)Lru/yandex/video/m3/player/tracking/LoadCanceled;", "", PlaybackException.ErrorInRenderer.TRACK_TYPE, "trackTypeOf", "(I)Ljava/lang/String;", "dataType", "dataTypeOf", "isAdaptiveVideoStream", "(Lhe10;)Z", "isNonAdaptiveVideoStream", "(Lhe10;Luwy;)Z", "windowIndex", "Lsf10;", "mediaPeriodId", "wasCanceled", "onLoadError", "(ILsf10;Luwy;Lhe10;Ljava/io/IOException;Z)V", "onLoadCompleted", "(ILsf10;Luwy;Lhe10;)V", "onLoadCanceled", "onDownstreamFormatChanged", "(ILsf10;Lhe10;)V", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/impl/listeners/InternalMediaSourceEventListener$VideoTrackSelectionProvider;", "Lru/yandex/video/m3/player/impl/utils/LoadErrorHandlingPolicyImpl;", "Companion", "VideoTrackSelectionProvider", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalMediaSourceEventListener implements yf10 {
    private static final int BITS_IN_BYTE = 8;
    private final ObserverDispatcher<PlayerDelegate.Observer> dispatcher;
    private final LoadErrorHandlingPolicyImpl loadErrorHandlingPolicyImpl;
    private final VideoTrackSelectionProvider videoTrackSelectionProvider;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/InternalMediaSourceEventListener$VideoTrackSelectionProvider;", "", "getVideoTrackSelection", "Lru/yandex/video/m3/player/impl/tracks/RendererTrackSelector$Selection;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface VideoTrackSelectionProvider {
        RendererTrackSelector.Selection getVideoTrackSelection();
    }

    public InternalMediaSourceEventListener(ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher, VideoTrackSelectionProvider videoTrackSelectionProvider, LoadErrorHandlingPolicyImpl loadErrorHandlingPolicyImpl) {
        this.dispatcher = observerDispatcher;
        this.videoTrackSelectionProvider = videoTrackSelectionProvider;
        this.loadErrorHandlingPolicyImpl = loadErrorHandlingPolicyImpl;
    }

    private final LoadCanceled createLoadCanceled(final uwy loadEventInfo, final he10 mediaLoadData) {
        final kwu kwuVar;
        String uri = loadEventInfo.b.toString();
        try {
            jwu jwuVar = new jwu();
            jwuVar.i(null, uri);
            kwuVar = jwuVar.e();
        } catch (IllegalArgumentException unused) {
            kwuVar = null;
        }
        if (kwuVar == null) {
            return null;
        }
        return LoadCanceledKt.LoadCanceled(new tls() { // from class: ru.yandex.video.m3.player.impl.listeners.InternalMediaSourceEventListener$createLoadCanceled$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(LoadCanceled.Builder builder) {
                String trackTypeOf;
                String dataTypeOf;
                builder.m815setHost(kwu.this.d);
                builder.m819setUri(kwu.this.i);
                builder.m816setLoadDurationMs(loadEventInfo.d);
                builder.m813setBytesLoaded(loadEventInfo.e);
                trackTypeOf = this.trackTypeOf(mediaLoadData.b);
                builder.m818setTrackType(trackTypeOf);
                builder.m817setTrackFormat(String.valueOf(mediaLoadData.c));
                dataTypeOf = this.dataTypeOf(mediaLoadData.a);
                builder.m814setDataType(dataTypeOf);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LoadCanceled.Builder) obj);
                return zy11.a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String dataTypeOf(int dataType) {
        switch (dataType) {
            case 1:
                return "DATA_TYPE_MEDIA";
            case 2:
                return "DATA_TYPE_MEDIA_INITIALIZATION";
            case 3:
                return "DATA_TYPE_DRM";
            case 4:
                return "DATA_TYPE_MANIFEST";
            case 5:
                return "DATA_TYPE_TIME_SYNCHRONIZATION";
            case 6:
                return "DATA_TYPE_AD";
            default:
                return "DATA_TYPE_UNKNOWN";
        }
    }

    private final void dispatchVideoBitrateInfo(he10 mediaLoadData, uwy loadEventInfo) {
        HashSet H0;
        Object failure;
        HashSet H02;
        Object failure2;
        a aVar = mediaLoadData.c;
        if (aVar != null) {
            if (isAdaptiveVideoStream(mediaLoadData)) {
                ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
                synchronized (observerDispatcher.getObservers()) {
                    H02 = kotlin.collections.a.H0(observerDispatcher.getObservers());
                }
                Iterator it = H02.iterator();
                while (it.hasNext()) {
                    try {
                        ((PlayerDelegate.Observer) it.next()).onVideoChunkLoaded(aVar.j);
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
            return;
        }
        if (isNonAdaptiveVideoStream(mediaLoadData, loadEventInfo)) {
            long j = mediaLoadData.g;
            if (j == -9223372036854775807L || j == 0) {
                return;
            }
            long j2 = loadEventInfo.e * 8;
            long j3 = j / 1000;
            if (j3 == 0) {
                return;
            }
            int i = (int) (j2 / j3);
            ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher2 = this.dispatcher;
            synchronized (observerDispatcher2.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher2.getObservers());
            }
            Iterator it2 = H0.iterator();
            while (it2.hasNext()) {
                try {
                    ((PlayerDelegate.Observer) it2.next()).onVideoChunkLoaded(i);
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

    private final boolean isAdaptiveVideoStream(he10 mediaLoadData) {
        a aVar = mediaLoadData.c;
        if ((aVar != null && aVar.j == -1) || mediaLoadData.a != 1) {
            return false;
        }
        int i = mediaLoadData.b;
        return i == 2 || i == 0;
    }

    private final boolean isApplication(String mimeType) {
        if (mimeType != null) {
            return cvu0.x(mimeType, ClidProvider.APPLICATION, false);
        }
        return false;
    }

    private final boolean isNonAdaptiveVideoStream(he10 mediaLoadData, uwy loadEventInfo) {
        return mediaLoadData.a == 1 && mediaLoadData.b == -1 && tw21.N(loadEventInfo.a.a) == 4;
    }

    private final LoadError toLoadError(uwy uwyVar, final IOException iOException) {
        kwu kwuVar;
        String uri = uwyVar.b.toString();
        try {
            jwu jwuVar = new jwu();
            jwuVar.i(null, uri);
            kwuVar = jwuVar.e();
        } catch (IllegalArgumentException unused) {
            kwuVar = null;
        }
        if (kwuVar == null) {
            return null;
        }
        String name = iOException.getClass().getName();
        String message = iOException.getMessage();
        Integer valueOf = iOException instanceof HttpDataSource$InvalidResponseCodeException ? Integer.valueOf(((HttpDataSource$InvalidResponseCodeException) iOException).responseCode) : null;
        Throwable cause = iOException.getCause();
        String name2 = cause != null ? cause.getClass().getName() : null;
        Throwable cause2 = iOException.getCause();
        String message2 = cause2 != null ? cause2.getMessage() : null;
        Throwable cause3 = iOException.getCause();
        final String str = message2;
        final Integer valueOf2 = cause3 instanceof HttpDataSource$InvalidResponseCodeException ? Integer.valueOf(((HttpDataSource$InvalidResponseCodeException) cause3).responseCode) : null;
        final String str2 = name2;
        return LoadErrorKt.LoadError(kwuVar.d, kwuVar.i, uwyVar.d, uwyVar.e, name, message, valueOf, new tls() { // from class: ru.yandex.video.m3.player.impl.listeners.InternalMediaSourceEventListener$toLoadError$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(LoadError.Builder builder) {
                LoadErrorHandlingPolicyImpl loadErrorHandlingPolicyImpl;
                LoadErrorHandlingPolicyImpl loadErrorHandlingPolicyImpl2;
                LoadErrorHandlingPolicyImpl loadErrorHandlingPolicyImpl3;
                loadErrorHandlingPolicyImpl = InternalMediaSourceEventListener.this.loadErrorHandlingPolicyImpl;
                builder.setEligibleForFallback(loadErrorHandlingPolicyImpl != null ? Boolean.valueOf(loadErrorHandlingPolicyImpl.isEligibleForFallback$video_player_internalRelease(iOException)) : null);
                loadErrorHandlingPolicyImpl2 = InternalMediaSourceEventListener.this.loadErrorHandlingPolicyImpl;
                builder.setEligibleForFallbackExc(loadErrorHandlingPolicyImpl2 != null ? loadErrorHandlingPolicyImpl2.getEligibleForFallbackErrors$video_player_internalRelease() : null);
                builder.setThrowable(iOException);
                builder.setExceptionCauseName(str2);
                builder.setExceptionCauseMessage(str);
                builder.setExceptionCauseCode(valueOf2);
                loadErrorHandlingPolicyImpl3 = InternalMediaSourceEventListener.this.loadErrorHandlingPolicyImpl;
                builder.setEligibleForRetry(loadErrorHandlingPolicyImpl3 != null ? Boolean.valueOf(loadErrorHandlingPolicyImpl3.isEligibleForRetry$video_player_internalRelease(iOException)) : null);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LoadError.Builder) obj);
                return zy11.a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String trackTypeOf(int trackType) {
        switch (trackType) {
            case -2:
                return "TRACK_TYPE_NONE";
            case -1:
            default:
                return "TRACK_TYPE_UNKNOWN";
            case 0:
                return "TRACK_TYPE_DEFAULT";
            case 1:
                return "TRACK_TYPE_AUDIO";
            case 2:
                return "TRACK_TYPE_VIDEO";
            case 3:
                return "TRACK_TYPE_TEXT";
            case 4:
                return "TRACK_TYPE_IMAGE";
            case 5:
                return "TRACK_TYPE_METADATA";
            case 6:
                return "TRACK_TYPE_CAMERA_MOTION";
        }
    }

    @Override // defpackage.yf10
    public void onDownstreamFormatChanged(int windowIndex, sf10 mediaPeriodId, he10 mediaLoadData) {
        HashSet H0;
        Object failure;
        a aVar = mediaLoadData.c;
        if (aVar != null) {
            String str = aVar.n;
            if (str == null) {
                str = aVar.m;
            }
            if (!eh20.p(str)) {
                String str2 = aVar.n;
                if (str2 == null) {
                    str2 = aVar.m;
                }
                if (!isApplication(str2)) {
                    aVar = null;
                }
            }
            if (aVar != null) {
                if ((this.videoTrackSelectionProvider.getVideoTrackSelection() instanceof RendererTrackSelector.Selection.Adaptive ? aVar : null) != null) {
                    ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
                    synchronized (observerDispatcher.getObservers()) {
                        H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
                    }
                    Iterator it = H0.iterator();
                    while (it.hasNext()) {
                        try {
                            ((PlayerDelegate.Observer) it.next()).onTracksChanged();
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
        }
    }

    @Override // defpackage.yf10
    public void onLoadCanceled(int windowIndex, sf10 mediaPeriodId, uwy loadEventInfo, he10 mediaLoadData) {
        HashSet<PlayerDelegate.Observer> H0;
        Object failure;
        zy11 zy11Var;
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        for (PlayerDelegate.Observer observer : H0) {
            try {
                LoadCanceled createLoadCanceled = createLoadCanceled(loadEventInfo, mediaLoadData);
                if (createLoadCanceled != null) {
                    observer.onLoadCanceled(createLoadCanceled);
                    zy11Var = zy11.a;
                } else {
                    zy11Var = null;
                }
                if (zy11Var == null) {
                    int i = mediaLoadData.b;
                    TrackType trackType = i != 1 ? i != 2 ? null : TrackType.Video : TrackType.Audio;
                    a aVar = mediaLoadData.c;
                    observer.onLoadCanceled(trackType, aVar != null ? Integer.valueOf(aVar.v) : null);
                }
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

    @Override // defpackage.yf10
    public void onLoadCompleted(int windowIndex, sf10 mediaPeriodId, uwy loadEventInfo, he10 mediaLoadData) {
        dispatchVideoBitrateInfo(mediaLoadData, loadEventInfo);
    }

    @Override // defpackage.yf10
    public void onLoadError(int windowIndex, sf10 mediaPeriodId, uwy loadEventInfo, he10 mediaLoadData, IOException error, boolean wasCanceled) {
        HashSet H0;
        Object failure;
        LoadError loadError = toLoadError(loadEventInfo, error);
        if (loadError != null) {
            ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.dispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((PlayerDelegate.Observer) it.next()).onLoadError(loadError);
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

    @Override // defpackage.yf10
    public /* bridge */ /* synthetic */ void onLoadStarted(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var, int i2) {
    }

    @Override // defpackage.yf10
    public /* bridge */ /* synthetic */ void onUpstreamDiscarded(int i, sf10 sf10Var, he10 he10Var) {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/InternalMediaSourceEventListener$Companion;", "", "()V", "BITS_IN_BYTE", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
