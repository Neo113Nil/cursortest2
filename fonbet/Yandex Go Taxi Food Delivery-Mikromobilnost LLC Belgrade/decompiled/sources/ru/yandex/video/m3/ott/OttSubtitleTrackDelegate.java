package ru.yandex.video.m3.ott;

import com.yandex.passport.internal.ui.domik.BaseTrack;
import defpackage.evu0;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackVariant;
import ru.yandex.video.m3.player.utils.ResourceProvider;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!¨\u0006\""}, d2 = {"Lru/yandex/video/m3/ott/OttSubtitleTrackDelegate;", "Lru/yandex/video/m3/player/tracks/Track;", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "", "isForbiddenToDisableSubtitleWithOriginalAudio", BaseTrack.KEY_TRACK, "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;ZLru/yandex/video/m3/player/tracks/Track;)V", "Lru/yandex/video/m3/player/tracks/TrackVariant;", "applyAvailabilityIfNeeded", "(Lru/yandex/video/m3/player/tracks/TrackVariant;)Lru/yandex/video/m3/player/tracks/TrackVariant;", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "getSelectedTrackFormat", "()Lru/yandex/video/m3/player/tracks/TrackFormat;", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "resourceProvider", "", "getSelectedTrackName", "(Lru/yandex/video/m3/player/utils/ResourceProvider;)Ljava/lang/String;", "Lzy11;", "update", "()V", "trackVariant", "selectTrack", "(Lru/yandex/video/m3/player/tracks/TrackVariant;)Z", "", "getAvailableTrackVariants", "()Ljava/util/List;", "getSelectedTrackVariant", "()Lru/yandex/video/m3/player/tracks/TrackVariant;", "Lru/yandex/video/m3/player/YandexPlayer;", "Z", "Lru/yandex/video/m3/player/tracks/Track;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OttSubtitleTrackDelegate implements Track {
    public static final int $stable = 0;
    private final boolean isForbiddenToDisableSubtitleWithOriginalAudio;
    private final YandexPlayer<?> player;
    private final Track track;

    public OttSubtitleTrackDelegate(YandexPlayer<?> yandexPlayer, boolean z, Track track) {
        this.player = yandexPlayer;
        this.isForbiddenToDisableSubtitleWithOriginalAudio = z;
        this.track = track;
    }

    private final TrackVariant applyAvailabilityIfNeeded(TrackVariant trackVariant) {
        TrackFormat selectedTrackFormat;
        if (!(trackVariant instanceof TrackVariant.Disable)) {
            return trackVariant;
        }
        Track audioTrack = this.player.getAudioTrack();
        String language = (audioTrack == null || (selectedTrackFormat = audioTrack.getSelectedTrackFormat()) == null) ? null : selectedTrackFormat.getLanguage();
        if (language == null) {
            language = "";
        }
        return !evu0.y(language, ClearCryptoProPrefs.COUNTRY, false) ? new TrackVariant.Disable(trackVariant.getTitle(), trackVariant.getSelected(), !this.isForbiddenToDisableSubtitleWithOriginalAudio) : (TrackVariant.Disable) trackVariant;
    }

    @Override // ru.yandex.video.m3.player.tracks.Track
    public List<TrackVariant> getAvailableTrackVariants() {
        List<TrackVariant> availableTrackVariants = this.track.getAvailableTrackVariants();
        ArrayList arrayList = new ArrayList(tcc.n(availableTrackVariants, 10));
        Iterator<T> it = availableTrackVariants.iterator();
        while (it.hasNext()) {
            arrayList.add(applyAvailabilityIfNeeded((TrackVariant) it.next()));
        }
        return arrayList;
    }

    @Override // ru.yandex.video.m3.player.tracks.Track
    public TrackFormat getSelectedTrackFormat() {
        return this.track.getSelectedTrackFormat();
    }

    @Override // ru.yandex.video.m3.player.tracks.Track
    public String getSelectedTrackName(ResourceProvider resourceProvider) {
        return this.track.getSelectedTrackName(resourceProvider);
    }

    @Override // ru.yandex.video.m3.player.tracks.Track
    public TrackVariant getSelectedTrackVariant() {
        TrackVariant selectedTrackVariant = this.track.getSelectedTrackVariant();
        if (selectedTrackVariant != null) {
            return applyAvailabilityIfNeeded(selectedTrackVariant);
        }
        return null;
    }

    @Override // ru.yandex.video.m3.player.tracks.Track
    public boolean selectTrack(TrackVariant trackVariant) {
        if (!(trackVariant instanceof TrackVariant.Disable) || ((TrackVariant.Disable) trackVariant).isAvailableForSelection()) {
            return this.track.selectTrack(trackVariant);
        }
        return false;
    }

    @Override // ru.yandex.video.m3.player.tracks.Track
    public void update() {
        this.track.update();
    }
}
