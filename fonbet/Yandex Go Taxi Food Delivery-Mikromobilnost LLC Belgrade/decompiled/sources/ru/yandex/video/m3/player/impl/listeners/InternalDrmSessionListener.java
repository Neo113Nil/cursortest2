package ru.yandex.video.m3.player.impl.listeners;

import androidx.media3.common.a;
import defpackage.b87;
import defpackage.eh20;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.jmm;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManagerListener;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r*\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0017\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/yandex/video/m3/player/impl/listeners/InternalDrmSessionListener;", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerListener;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "observerDispatcher", "<init>", "(Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;)V", "", "mimeType", "Lru/yandex/video/m3/player/tracks/TrackType;", "mimeTypeToTrackType", "(Ljava/lang/String;)Lru/yandex/video/m3/player/tracks/TrackType;", "Ljava/util/UUID;", "Lru/yandex/video/m3/data/DrmType;", "toDrmType", "(Ljava/util/UUID;)Lru/yandex/video/m3/data/DrmType;", "orNone", "(Lru/yandex/video/m3/data/DrmType;)Lru/yandex/video/m3/data/DrmType;", "Ljmm;", "session", "Landroidx/media3/common/a;", "format", "Lzy11;", "onDrmSessionAcquired", "(Ljmm;Landroidx/media3/common/a;)V", PlaybackException.ErrorInRenderer.TRACK_TYPE, "getCurrentDrmSessionType", "(Lru/yandex/video/m3/player/tracks/TrackType;)Lru/yandex/video/m3/data/DrmType;", "resetCurrentDrmSession", "()V", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "", "drmTypeHolder", "Ljava/util/Map;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalDrmSessionListener implements ExoDrmSessionManagerListener {
    public static final int $stable = 8;
    private final Map<TrackType, DrmType> drmTypeHolder = new ConcurrentHashMap(TrackType.values().length, 1.0f, 2);
    private final ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher;

    public InternalDrmSessionListener(ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher) {
        this.observerDispatcher = observerDispatcher;
    }

    private final TrackType mimeTypeToTrackType(String mimeType) {
        if (eh20.p(mimeType)) {
            return TrackType.Video;
        }
        if (eh20.l(mimeType)) {
            return TrackType.Audio;
        }
        if (eh20.o(mimeType)) {
            return TrackType.Subtitles;
        }
        return null;
    }

    private final DrmType orNone(DrmType drmType) {
        return drmType == null ? DrmType.None : drmType;
    }

    private final DrmType toDrmType(UUID uuid) {
        return jl40.l(uuid, b87.c) ? DrmType.ClearKey : jl40.l(uuid, b87.e) ? DrmType.PlayReady : jl40.l(uuid, b87.d) ? DrmType.Widevine : jl40.l(uuid, b87.a) ? DrmType.None : DrmType.Other;
    }

    public final DrmType getCurrentDrmSessionType(TrackType trackType) {
        return this.drmTypeHolder.get(trackType);
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManagerListener
    public void onDrmSessionAcquired(jmm session, a format) {
        TrackType mimeTypeToTrackType;
        HashSet H0;
        Object failure;
        UUID f;
        String str = format.n;
        if (str == null || (mimeTypeToTrackType = mimeTypeToTrackType(str)) == null) {
            return;
        }
        this.drmTypeHolder.put(mimeTypeToTrackType, orNone((session == null || (f = session.f()) == null) ? null : toDrmType(f)));
        ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onDrmSessionAcquired(orNone(getCurrentDrmSessionType(mimeTypeToTrackType)));
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

    public final void resetCurrentDrmSession() {
        this.drmTypeHolder.clear();
    }
}
