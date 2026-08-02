package ru.yandex.video.m3.player.ui.debug.internal.providers;

import defpackage.h5z0;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver;
import ru.yandex.video.m3.player.ui.debug.model.BytesLoaded;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/LoadedChunksProviderImpl;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/LoadedChunksProvider;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/ui/debug/internal/observers/YandexDebugInfoObserver;", "observerDispatcher", "<init>", "(Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;)V", "", "chunkLengthMs", "loadTimeMs", "Lzy11;", "onDataLoaded", "(JJ)V", "", "elapsedMs", "bytesTransferred", "bitrateEstimate", "onBandwidthSample", "(IJJ)V", "bytes", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "onBytesLoaded", "(JLru/yandex/video/m3/player/tracks/TrackType;)V", "Lru/yandex/video/m3/player/tracking/LoadError;", "loadError", "onLoadError", "(Lru/yandex/video/m3/player/tracking/LoadError;)V", "release", "()V", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;", "bytesLoaded", "Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadedChunksProviderImpl implements LoadedChunksProvider {
    public static final int $stable = 8;
    private BytesLoaded bytesLoaded = new BytesLoaded(0, 0, 0, 0, 15, null);
    private final ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackType.values().length];
            try {
                iArr[TrackType.Video.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackType.Audio.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TrackType.Subtitles.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LoadedChunksProviderImpl(ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher) {
        this.observerDispatcher = observerDispatcher;
    }

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.LoadedChunksProvider, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate) {
        HashSet H0;
        Object failure;
        BytesLoaded bytesLoaded = this.bytesLoaded;
        this.bytesLoaded = BytesLoaded.copy$default(bytesLoaded, bytesLoaded.getTotal() + bytesTransferred, 0L, 0L, 0L, 14, null);
        ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((YandexDebugInfoObserver) it.next()).onBytesLoaded(this.bytesLoaded);
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

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.LoadedChunksProvider, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onBytesLoaded(long bytes, TrackType trackType) {
        BytesLoaded copy$default;
        HashSet H0;
        Object failure;
        int i = trackType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[trackType.ordinal()];
        if (i == 1) {
            BytesLoaded bytesLoaded = this.bytesLoaded;
            copy$default = BytesLoaded.copy$default(bytesLoaded, 0L, bytesLoaded.getVideo() + bytes, 0L, 0L, 13, null);
        } else if (i != 2) {
            copy$default = this.bytesLoaded;
            if (i == 3) {
                copy$default = BytesLoaded.copy$default(copy$default, 0L, 0L, 0L, copy$default.getSubtitles() + bytes, 7, null);
            }
        } else {
            BytesLoaded bytesLoaded2 = this.bytesLoaded;
            copy$default = BytesLoaded.copy$default(bytesLoaded2, 0L, 0L, bytesLoaded2.getAudio() + bytes, 0L, 11, null);
        }
        this.bytesLoaded = copy$default;
        ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((YandexDebugInfoObserver) it.next()).onBytesLoaded(this.bytesLoaded);
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

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.LoadedChunksProvider, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onDataLoaded(long chunkLengthMs, long loadTimeMs) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((YandexDebugInfoObserver) it.next()).onChunkLoadAttempt(true, System.currentTimeMillis());
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

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.LoadedChunksProvider, ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onLoadError(LoadError loadError) {
        HashSet H0;
        Object failure;
        ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((YandexDebugInfoObserver) it.next()).onChunkLoadAttempt(false, System.currentTimeMillis());
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

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.LoadedChunksProvider
    public void release() {
        this.bytesLoaded = new BytesLoaded(0L, 0L, 0L, 0L, 15, null);
    }
}
