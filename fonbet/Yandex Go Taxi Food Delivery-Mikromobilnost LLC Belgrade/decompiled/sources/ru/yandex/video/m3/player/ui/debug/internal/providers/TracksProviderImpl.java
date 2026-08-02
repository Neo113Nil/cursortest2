package ru.yandex.video.m3.player.ui.debug.internal.providers;

import com.yandex.passport.internal.ui.domik.BaseTrack;
import defpackage.h5z0;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import ru.yandex.video.m3.player.ui.debug.internal.observers.YandexDebugInfoObserver;
import ru.yandex.video.m3.player.ui.debug.model.AudioTrackData;
import ru.yandex.video.m3.player.ui.debug.model.Size;
import ru.yandex.video.m3.player.ui.debug.model.SubtitlesTrackData;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/providers/TracksProviderImpl;", "Lru/yandex/video/m3/player/ui/debug/internal/providers/TracksProvider;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/ui/debug/internal/observers/YandexDebugInfoObserver;", "observerDispatcher", "<init>", "(Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;)V", "Lru/yandex/video/m3/player/tracks/Track;", "videoTrack", "Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "mapVideoTrackData", "(Lru/yandex/video/m3/player/tracks/Track;)Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", BaseTrack.KEY_TRACK, "Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;", "mapAudioTrackData", "(Lru/yandex/video/m3/player/tracks/Track;)Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;", "Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;", "mapSubtitlesTrackData", "(Lru/yandex/video/m3/player/tracks/Track;)Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;", "audioTrack", "subtitlesTrack", "Lzy11;", "onTracksChanged", "(Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;)V", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TracksProviderImpl implements TracksProvider {
    public static final int $stable = 8;
    private final ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher;

    public TracksProviderImpl(ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher) {
        this.observerDispatcher = observerDispatcher;
    }

    private final AudioTrackData mapAudioTrackData(Track track) {
        TrackFormat selectedTrackFormat = track.getSelectedTrackFormat();
        TrackVariant selectedTrackVariant = track.getSelectedTrackVariant();
        return new AudioTrackData(selectedTrackVariant != null ? selectedTrackVariant.getTitle() : null, selectedTrackFormat != null ? Integer.valueOf(selectedTrackFormat.getBitrate()) : null, selectedTrackFormat != null ? selectedTrackFormat.getLanguage() : null);
    }

    private final SubtitlesTrackData mapSubtitlesTrackData(Track track) {
        TrackFormat selectedTrackFormat = track.getSelectedTrackFormat();
        TrackVariant selectedTrackVariant = track.getSelectedTrackVariant();
        return new SubtitlesTrackData(selectedTrackVariant != null ? selectedTrackVariant.getTitle() : null, selectedTrackFormat != null ? Integer.valueOf(selectedTrackFormat.getBitrate()) : null, selectedTrackFormat != null ? selectedTrackFormat.getLanguage() : null);
    }

    private final VideoTrackData mapVideoTrackData(Track videoTrack) {
        TrackFormat selectedTrackFormat = videoTrack.getSelectedTrackFormat();
        TrackVariant selectedTrackVariant = videoTrack.getSelectedTrackVariant();
        return new VideoTrackData(selectedTrackVariant != null ? selectedTrackVariant.getTitle() : null, selectedTrackFormat != null ? Integer.valueOf(selectedTrackFormat.getBitrate()) : null, new Size(selectedTrackFormat != null ? selectedTrackFormat.getWidth() : 0, selectedTrackFormat != null ? selectedTrackFormat.getHeight() : 0));
    }

    @Override // ru.yandex.video.m3.player.ui.debug.internal.providers.TracksProvider, ru.yandex.video.m3.player.PlayerObserver
    public void onTracksChanged(Track audioTrack, Track subtitlesTrack, Track videoTrack) {
        HashSet H0;
        HashSet H02;
        HashSet H03;
        Object failure;
        Object failure2;
        Object failure3;
        ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((YandexDebugInfoObserver) it.next()).onVideoTrackChanged(mapVideoTrackData(videoTrack));
                failure3 = zy11.a;
            } catch (Throwable th) {
                failure3 = new Result.Failure(th);
            }
            Throwable a = Result.a(failure3);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
        ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher2 = this.observerDispatcher;
        synchronized (observerDispatcher2.getObservers()) {
            H02 = a.H0(observerDispatcher2.getObservers());
        }
        Iterator it2 = H02.iterator();
        while (it2.hasNext()) {
            try {
                ((YandexDebugInfoObserver) it2.next()).onAudioTrackChanged(mapAudioTrackData(audioTrack));
                failure2 = zy11.a;
            } catch (Throwable th2) {
                failure2 = new Result.Failure(th2);
            }
            Throwable a2 = Result.a(failure2);
            if (a2 != null) {
                h5z0.a.f(a2, "notifyObservers", new Object[0]);
            }
        }
        ObserverDispatcher<YandexDebugInfoObserver> observerDispatcher3 = this.observerDispatcher;
        synchronized (observerDispatcher3.getObservers()) {
            H03 = a.H0(observerDispatcher3.getObservers());
        }
        Iterator it3 = H03.iterator();
        while (it3.hasNext()) {
            try {
                ((YandexDebugInfoObserver) it3.next()).onSubtitlesTrackChanged(mapSubtitlesTrackData(subtitlesTrack));
                failure = zy11.a;
            } catch (Throwable th3) {
                failure = new Result.Failure(th3);
            }
            Throwable a3 = Result.a(failure);
            if (a3 != null) {
                h5z0.a.f(a3, "notifyObservers", new Object[0]);
            }
        }
    }
}
