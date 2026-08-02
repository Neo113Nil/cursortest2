package ru.yandex.video.m3.player.ui.debug.internal.providers;

import defpackage.h5z0;
import defpackage.jl40;
import defpackage.w511;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.yandex.video.m3.data.CodecInfo;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver;
import ru.yandex.video.m3.player.ui.debug.model.DecoderData;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0016\u0010\"\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/DecoderDataProviderImpl;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/DecoderDataProvider;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/ui/debug/internal/observers/YandexDebugInfoObserver;", "observerDispatcher", "<init>", "(Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;)V", "", "name", "", "hardwareAccelerated", "", "inits", "Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "getNewDecoder", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "decoderName", "Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "mediaCodecSelectorLog", "Lzy11;", "onDecoderInitialized", "(Lru/yandex/video/m3/player/tracks/TrackType;Ljava/lang/String;Lru/yandex/video/m3/data/MediaCodecSelectorLog;)V", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "format", "Lru/yandex/video/m3/data/MediaCodecReuseLog;", "codecReuseLog", "onVideoInputFormatChanged", "(Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/data/MediaCodecReuseLog;)V", "onAudioInputFormatChanged", "release", "()V", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "audioDecoderData", "Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "videoDecoderData", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DecoderDataProviderImpl implements DecoderDataProvider {
    public static final int $stable = 8;
    private final ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher;
    private DecoderData audioDecoderData = new DecoderData(null, null, null, null, null, 31, null);
    private DecoderData videoDecoderData = new DecoderData(null, null, null, null, null, 31, null);

    public DecoderDataProviderImpl(ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher) {
        this.observerDispatcher = observerDispatcher;
    }

    private final DecoderData getNewDecoder(String name, Boolean hardwareAccelerated, Integer inits) {
        return new DecoderData(name, Integer.valueOf((inits != null ? inits.intValue() : 0) + 1), null, null, hardwareAccelerated, 12, null);
    }

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.DecoderDataProvider, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onAudioInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
        HashSet H0;
        Object failure;
        DecoderData decoderData = this.audioDecoderData;
        Integer reuses = decoderData.getReuses();
        this.audioDecoderData = DecoderData.copy$default(decoderData, null, null, reuses != null ? Integer.valueOf(reuses.intValue() + 1) : null, null, null, 27, null);
        ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((YandexDebugInfoObserver) it.next()).onAudioDecoderUpdated(this.audioDecoderData);
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

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.DecoderDataProvider, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onDecoderInitialized(TrackType trackType, String decoderName, MediaCodecSelectorLog mediaCodecSelectorLog) {
        HashSet H0;
        Object failure;
        HashSet H02;
        Object failure2;
        List<CodecInfo> codecsInfo;
        if (mediaCodecSelectorLog != null && (codecsInfo = mediaCodecSelectorLog.getCodecsInfo()) != null) {
            for (CodecInfo codecInfo : codecsInfo) {
                if (jl40.l(codecInfo.getName(), decoderName)) {
                }
            }
            w511.i("Collection contains no element matching the predicate.");
            return;
        }
        codecInfo = null;
        if (trackType == TrackType.Video) {
            this.videoDecoderData = getNewDecoder(decoderName, codecInfo != null ? Boolean.valueOf(codecInfo.getHardwareAccelerated()) : null, this.videoDecoderData.getInits());
            ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher = this.observerDispatcher;
            synchronized (observerDispatcher.getObservers()) {
                H02 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H02.iterator();
            while (it.hasNext()) {
                try {
                    ((YandexDebugInfoObserver) it.next()).onVideoDecoderUpdated(this.videoDecoderData);
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
        if (trackType == TrackType.Audio) {
            this.audioDecoderData = getNewDecoder(decoderName, codecInfo != null ? Boolean.valueOf(codecInfo.getHardwareAccelerated()) : null, this.audioDecoderData.getInits());
            ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher2 = this.observerDispatcher;
            synchronized (observerDispatcher2.getObservers()) {
                H0 = a.H0(observerDispatcher2.getObservers());
            }
            Iterator it2 = H0.iterator();
            while (it2.hasNext()) {
                try {
                    ((YandexDebugInfoObserver) it2.next()).onAudioDecoderUpdated(this.audioDecoderData);
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

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.DecoderDataProvider, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onVideoInputFormatChanged(TrackFormat format, MediaCodecReuseLog codecReuseLog) {
        HashSet H0;
        Object failure;
        DecoderData decoderData = this.videoDecoderData;
        Integer reuses = decoderData.getReuses();
        this.videoDecoderData = DecoderData.copy$default(decoderData, null, null, reuses != null ? Integer.valueOf(reuses.intValue() + 1) : null, null, null, 27, null);
        ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((YandexDebugInfoObserver) it.next()).onVideoDecoderUpdated(this.videoDecoderData);
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

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.DecoderDataProvider
    public void release() {
        this.audioDecoderData = new DecoderData(null, null, null, null, null, 31, null);
        this.videoDecoderData = new DecoderData(null, null, null, null, null, 31, null);
    }
}
