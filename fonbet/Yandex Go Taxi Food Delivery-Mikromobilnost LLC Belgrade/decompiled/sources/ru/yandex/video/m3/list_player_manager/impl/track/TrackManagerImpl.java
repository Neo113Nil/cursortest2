package ru.yandex.video.m3.list_player_manager.impl.track;

import android.os.Handler;
import defpackage.hpo0;
import defpackage.jl40;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tw21;
import defpackage.w511;
import defpackage.y7x0;
import defpackage.zxc0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.video.m3.list_player_manager.ListPlayerObserver;
import ru.yandex.video.m3.list_player_manager.impl.track.TrackVariant;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackVariant;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001:B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u00020\u00142\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00112\b\b\u0001\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u0012*\u00020\u00192\b\b\u0001\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\b\b\u0001\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0018\u00100\u001a\u00060/R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R%\u00104\u001a\u0013\u0012\t\u0012\u00070\t¢\u0006\u0002\b3\u0012\u0004\u0012\u00020\u0012028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R+\u00106\u001a\u0019\u0012\t\u0012\u00070\t¢\u0006\u0002\b3\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020&078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/track/TrackManagerImpl;", "Lru/yandex/video/m3/list_player_manager/impl/track/TrackManager;", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "internalYandexPlayer", "Landroid/os/Handler;", "callbacksHandler", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Landroid/os/Handler;)V", "", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/list_player_manager/impl/track/Format;", "getSelectedTrackFormat", "(I)Lru/yandex/video/m3/list_player_manager/impl/track/Format;", "Lru/yandex/video/m3/player/tracks/Track;", "getInternalTrackForType", "(I)Lru/yandex/video/m3/player/tracks/Track;", "", "Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;", "trackVariants", "Lzy11;", "notifyCurrentTrackChanged", "(Ljava/util/List;)V", "availableTrackVariants", "notifyAvailableTrackChanged", "Lru/yandex/video/m3/player/tracks/TrackVariant;", "toTrackVariants", "(Ljava/util/List;I)Ljava/util/List;", "toTrack", "(Lru/yandex/video/m3/player/tracks/TrackVariant;I)Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;", "getCurrentTrack", "(I)Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;", "getAvailableTracks", "(I)Ljava/util/List;", "trackVariant", "", "setTrack", "(Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;)Z", "Lru/yandex/video/m3/list_player_manager/ListPlayerObserver;", "listener", "addPlayerListener", "(Lru/yandex/video/m3/list_player_manager/ListPlayerObserver;)V", "removePlayerListener", "release", "()V", "Lru/yandex/video/m3/player/YandexPlayer;", "Landroid/os/Handler;", "Lru/yandex/video/m3/list_player_manager/impl/track/TrackManagerImpl$TracksChangeObserverImpl;", "tracksChangeObserver", "Lru/yandex/video/m3/list_player_manager/impl/track/TrackManagerImpl$TracksChangeObserverImpl;", "", "Lru/yandex/video/m3/list_player_manager/impl/track/TrackType;", "currentSelectedTrackVariants", "Ljava/util/Map;", "currentAvailableTrackVariants", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "trackChangeListeners", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "TracksChangeObserverImpl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackManagerImpl implements TrackManager {
    public static final int $stable = 8;
    private final Handler callbacksHandler;
    private final Map<Integer, List<TrackVariant>> currentAvailableTrackVariants;
    private final Map<Integer, TrackVariant> currentSelectedTrackVariants;
    private final YandexPlayer<zxc0> internalYandexPlayer;
    private final ObserverDispatcher<ListPlayerObserver> trackChangeListeners;
    private final TracksChangeObserverImpl tracksChangeObserver;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/track/TrackManagerImpl$TracksChangeObserverImpl;", "Lru/yandex/video/m3/player/PlayerObserver;", "Lzxc0;", "<init>", "(Lru/yandex/video/m3/list_player_manager/impl/track/TrackManagerImpl;)V", "Lzy11;", "onPlayerReleased", "()V", "Lru/yandex/video/m3/player/tracks/Track;", "audioTrack", "subtitlesTrack", "videoTrack", "onTracksChanged", "(Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class TracksChangeObserverImpl implements PlayerObserver<zxc0> {
        public TracksChangeObserverImpl() {
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onPlayerReleased() {
            TrackManagerImpl.this.release();
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onTracksChanged(Track audioTrack, Track subtitlesTrack, Track videoTrack) {
            TrackManagerImpl.this.notifyAvailableTrackChanged(scc.g(TrackManagerImpl.this.toTrackVariants(audioTrack.getAvailableTrackVariants(), 0), TrackManagerImpl.this.toTrackVariants(subtitlesTrack.getAvailableTrackVariants(), 2), TrackManagerImpl.this.toTrackVariants(videoTrack.getAvailableTrackVariants(), 1)));
            ru.yandex.video.m3.player.tracks.TrackVariant selectedTrackVariant = audioTrack.getSelectedTrackVariant();
            TrackVariant track = selectedTrackVariant != null ? TrackManagerImpl.this.toTrack(selectedTrackVariant, 0) : null;
            ru.yandex.video.m3.player.tracks.TrackVariant selectedTrackVariant2 = subtitlesTrack.getSelectedTrackVariant();
            TrackVariant track2 = selectedTrackVariant2 != null ? TrackManagerImpl.this.toTrack(selectedTrackVariant2, 2) : null;
            ru.yandex.video.m3.player.tracks.TrackVariant selectedTrackVariant3 = videoTrack.getSelectedTrackVariant();
            TrackManagerImpl.this.notifyCurrentTrackChanged(scc.g(track, track2, selectedTrackVariant3 != null ? TrackManagerImpl.this.toTrack(selectedTrackVariant3, 1) : null));
        }
    }

    public TrackManagerImpl(YandexPlayer<zxc0> yandexPlayer, Handler handler) {
        this.internalYandexPlayer = yandexPlayer;
        this.callbacksHandler = handler;
        TracksChangeObserverImpl tracksChangeObserverImpl = new TracksChangeObserverImpl();
        this.tracksChangeObserver = tracksChangeObserverImpl;
        this.currentSelectedTrackVariants = new LinkedHashMap();
        this.currentAvailableTrackVariants = new LinkedHashMap();
        yandexPlayer.addObserver(tracksChangeObserverImpl);
        this.trackChangeListeners = new ObserverDispatcher<>();
    }

    private final Track getInternalTrackForType(@TrackType int trackType) {
        if (trackType == 0) {
            return this.internalYandexPlayer.getAudioTrack();
        }
        if (trackType == 1) {
            return this.internalYandexPlayer.getVideoTrack();
        }
        if (trackType != 2) {
            return null;
        }
        return this.internalYandexPlayer.getSubtitlesTrack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Format getSelectedTrackFormat(@TrackType int trackType) {
        TrackFormat selectedTrackFormat;
        Format format;
        Track internalTrackForType = getInternalTrackForType(trackType);
        if (internalTrackForType == null || (selectedTrackFormat = internalTrackForType.getSelectedTrackFormat()) == null) {
            return null;
        }
        format = TrackManagerImplKt.toFormat(selectedTrackFormat);
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyAvailableTrackChanged(List<? extends List<TrackVariant>> availableTrackVariants) {
        for (List<TrackVariant> list : availableTrackVariants) {
            TrackVariant trackVariant = (TrackVariant) a.R(list);
            ArrayList arrayList = null;
            Integer valueOf = trackVariant != null ? Integer.valueOf(trackVariant.getTrackType()) : null;
            List<TrackVariant> list2 = this.currentAvailableTrackVariants.get(valueOf);
            if (list2 != null) {
                List<TrackVariant> list3 = list2;
                arrayList = new ArrayList(tcc.n(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TrackVariant) it.next()).getTitle());
                }
            }
            List<TrackVariant> list4 = list;
            ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((TrackVariant) it2.next()).getTitle());
            }
            if (valueOf != null && !jl40.l(arrayList, arrayList2)) {
                this.currentAvailableTrackVariants.put(valueOf, list);
                tw21.a0(this.callbacksHandler, new hpo0(15, this, valueOf, list));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyAvailableTrackChanged$lambda$9$lambda$8(TrackManagerImpl trackManagerImpl, Integer num, List list) {
        HashSet H0;
        ObserverDispatcher<ListPlayerObserver> observerDispatcher = trackManagerImpl.trackChangeListeners;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((ListPlayerObserver) it.next()).onAvailableTracksChanged(num.intValue(), list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyCurrentTrackChanged(List<TrackVariant> trackVariants) {
        for (TrackVariant trackVariant : a.M(trackVariants)) {
            if (!jl40.l(this.currentSelectedTrackVariants.get(Integer.valueOf(trackVariant.getTrackType())), trackVariant)) {
                this.currentSelectedTrackVariants.put(Integer.valueOf(trackVariant.getTrackType()), trackVariant);
                tw21.a0(this.callbacksHandler, new y7x0(26, this, trackVariant));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyCurrentTrackChanged$lambda$4$lambda$3(TrackManagerImpl trackManagerImpl, TrackVariant trackVariant) {
        HashSet H0;
        ObserverDispatcher<ListPlayerObserver> observerDispatcher = trackManagerImpl.trackChangeListeners;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            ((ListPlayerObserver) it.next()).onTrackChanged(trackVariant.getTrackType(), trackVariant);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackVariant toTrack(final ru.yandex.video.m3.player.tracks.TrackVariant trackVariant, @TrackType final int i) {
        if (trackVariant instanceof TrackVariant.Adaptive) {
            return TrackVariantKt.TrackVariant(1, trackVariant.getTitle(), trackVariant.getSelected(), i, new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.track.TrackManagerImpl$toTrack$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(TrackVariant.Builder builder) {
                    builder.setFormat(builder.getSelected() ? TrackManagerImpl.this.getSelectedTrackFormat(i) : null);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((TrackVariant.Builder) obj);
                    return zy11.a;
                }
            });
        }
        if (trackVariant instanceof TrackVariant.Variant) {
            return TrackVariantKt.TrackVariant(2, trackVariant.getTitle(), trackVariant.getSelected(), i, new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.track.TrackManagerImpl$toTrack$2
                {
                    super(1);
                }

                public final void invoke(TrackVariant.Builder builder) {
                    Format format;
                    format = TrackManagerImplKt.toFormat(((TrackVariant.Variant) ru.yandex.video.m3.player.tracks.TrackVariant.this).getFormat());
                    builder.setFormat(format);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((TrackVariant.Builder) obj);
                    return zy11.a;
                }
            });
        }
        if (trackVariant instanceof TrackVariant.Disable) {
            return TrackVariantKt.TrackVariant$default(0, trackVariant.getTitle(), trackVariant.getSelected(), i, null, 16, null);
        }
        if (trackVariant instanceof TrackVariant.DownloadVariant ? true : trackVariant instanceof TrackVariant.PreferredTrackVariant) {
            return null;
        }
        w511.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TrackVariant> toTrackVariants(List<? extends ru.yandex.video.m3.player.tracks.TrackVariant> list, @TrackType int i) {
        if (list == null) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            TrackVariant track = toTrack((ru.yandex.video.m3.player.tracks.TrackVariant) it.next(), i);
            if (track != null) {
                arrayList.add(track);
            }
        }
        return arrayList;
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.track.TrackManager
    public void addPlayerListener(ListPlayerObserver listener) {
        this.trackChangeListeners.add((ObserverDispatcher<ListPlayerObserver>) listener);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.track.TrackManager
    public List<TrackVariant> getAvailableTracks(@TrackType int trackType) {
        Track internalTrackForType = getInternalTrackForType(trackType);
        return toTrackVariants(internalTrackForType != null ? internalTrackForType.getAvailableTrackVariants() : null, trackType);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.track.TrackManager
    public TrackVariant getCurrentTrack(@TrackType int trackType) {
        Track internalTrackForType = getInternalTrackForType(trackType);
        ru.yandex.video.m3.player.tracks.TrackVariant selectedTrackVariant = internalTrackForType != null ? internalTrackForType.getSelectedTrackVariant() : null;
        if (selectedTrackVariant != null) {
            return toTrack(selectedTrackVariant, trackType);
        }
        return null;
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.track.TrackManager
    public void release() {
        this.trackChangeListeners.clear();
        this.internalYandexPlayer.removeObserver(this.tracksChangeObserver);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.track.TrackManager
    public void removePlayerListener(ListPlayerObserver listener) {
        this.trackChangeListeners.remove(listener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.video.m3.list_player_manager.impl.track.TrackManager
    public boolean setTrack(TrackVariant trackVariant) {
        Track internalTrackForType = getInternalTrackForType(trackVariant.getTrackType());
        ru.yandex.video.m3.player.tracks.TrackVariant trackVariant2 = null;
        List<ru.yandex.video.m3.player.tracks.TrackVariant> availableTrackVariants = internalTrackForType != null ? internalTrackForType.getAvailableTrackVariants() : null;
        if (availableTrackVariants != null) {
            Iterator<T> it = availableTrackVariants.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((ru.yandex.video.m3.player.tracks.TrackVariant) next).getTitle(), trackVariant.getTitle())) {
                    trackVariant2 = next;
                    break;
                }
            }
            trackVariant2 = trackVariant2;
        }
        if (trackVariant2 != null) {
            return internalTrackForType.selectTrack(trackVariant2);
        }
        return false;
    }
}
