package ru.yandex.video.m3.player.impl.tracking;

import defpackage.jl40;
import defpackage.wls;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.tracking.event.AudioTrackData;
import ru.yandex.video.m3.player.impl.tracking.event.SubtitleTrackData;
import ru.yandex.video.m3.player.impl.tracking.event.VideoTrackData;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackVariant;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0006*\u00020\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\tH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/TrackChangesObserverImpl;", "Lru/yandex/video/m3/player/impl/tracking/TrackChangesObserver;", "Lru/yandex/video/m3/player/impl/tracking/EventTracker;", "eventTracker", "<init>", "(Lru/yandex/video/m3/player/impl/tracking/EventTracker;)V", "", "T", "Lru/yandex/video/m3/player/tracks/Track;", "Lkotlin/Function2;", "Lru/yandex/video/m3/player/tracks/TrackVariant;", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "body", "withSelectedVariantAndFormat", "(Lru/yandex/video/m3/player/tracks/Track;Lwls;)Ljava/lang/Object;", "audioTrack", "subtitlesTrack", "videoTrack", "Lzy11;", "onTracksChanged", "(Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;Lru/yandex/video/m3/player/tracks/Track;)V", "variant", "format", "Lru/yandex/video/m3/player/impl/tracking/event/VideoTrackData;", "createVideoTrackData", "(Lru/yandex/video/m3/player/tracks/TrackVariant;Lru/yandex/video/m3/player/tracks/TrackFormat;)Lru/yandex/video/m3/player/impl/tracking/event/VideoTrackData;", "Lru/yandex/video/m3/player/impl/tracking/event/AudioTrackData;", "createAudioTrackData", "(Lru/yandex/video/m3/player/tracks/TrackVariant;Lru/yandex/video/m3/player/tracks/TrackFormat;)Lru/yandex/video/m3/player/impl/tracking/event/AudioTrackData;", "Lru/yandex/video/m3/player/impl/tracking/event/SubtitleTrackData;", "createSubtitleTrackData", "(Lru/yandex/video/m3/player/tracks/TrackVariant;Lru/yandex/video/m3/player/tracks/TrackFormat;)Lru/yandex/video/m3/player/impl/tracking/event/SubtitleTrackData;", "Lru/yandex/video/m3/player/impl/tracking/EventTracker;", "oldAudioTrackData", "Lru/yandex/video/m3/player/impl/tracking/event/AudioTrackData;", "oldVideoTrackData", "Lru/yandex/video/m3/player/impl/tracking/event/VideoTrackData;", "oldSubtitleTrackData", "Lru/yandex/video/m3/player/impl/tracking/event/SubtitleTrackData;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackChangesObserverImpl implements TrackChangesObserver {
    public static final int $stable = 8;
    private final EventTracker eventTracker;
    private AudioTrackData oldAudioTrackData;
    private SubtitleTrackData oldSubtitleTrackData;
    private VideoTrackData oldVideoTrackData;

    public TrackChangesObserverImpl(EventTracker eventTracker) {
        this.eventTracker = eventTracker;
    }

    private final <T> T withSelectedVariantAndFormat(Track track, wls wlsVar) {
        TrackVariant selectedTrackVariant = track.getSelectedTrackVariant();
        TrackFormat selectedTrackFormat = track.getSelectedTrackFormat();
        if (selectedTrackVariant == null || selectedTrackFormat == null) {
            return null;
        }
        return (T) wlsVar.invoke(selectedTrackVariant, selectedTrackFormat);
    }

    public final AudioTrackData createAudioTrackData(TrackVariant variant, TrackFormat format) {
        return new AudioTrackData(format.getId(), variant.getTitle(), format.getBitrate(), format.getLanguage());
    }

    public final SubtitleTrackData createSubtitleTrackData(TrackVariant variant, TrackFormat format) {
        return new SubtitleTrackData(format.getId(), variant.getTitle(), format.getLanguage());
    }

    public final VideoTrackData createVideoTrackData(TrackVariant variant, TrackFormat format) {
        return new VideoTrackData(format.getId(), variant instanceof TrackVariant.Adaptive, variant.getTitle(), format.getBitrate(), format.getWidth(), format.getHeight());
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.TrackChangesObserver, ru.yandex.video.m3.player.PlayerObserver
    public void onTracksChanged(Track audioTrack, Track subtitlesTrack, Track videoTrack) {
        VideoTrackData videoTrackData;
        AudioTrackData audioTrackData;
        TrackVariant selectedTrackVariant = audioTrack.getSelectedTrackVariant();
        TrackFormat selectedTrackFormat = audioTrack.getSelectedTrackFormat();
        SubtitleTrackData subtitleTrackData = null;
        AudioTrackData createAudioTrackData = (selectedTrackVariant == null || selectedTrackFormat == null) ? null : createAudioTrackData(selectedTrackVariant, selectedTrackFormat);
        TrackVariant selectedTrackVariant2 = videoTrack.getSelectedTrackVariant();
        TrackFormat selectedTrackFormat2 = videoTrack.getSelectedTrackFormat();
        VideoTrackData createVideoTrackData = (selectedTrackVariant2 == null || selectedTrackFormat2 == null) ? null : createVideoTrackData(selectedTrackVariant2, selectedTrackFormat2);
        TrackVariant selectedTrackVariant3 = subtitlesTrack.getSelectedTrackVariant();
        TrackFormat selectedTrackFormat3 = subtitlesTrack.getSelectedTrackFormat();
        if (selectedTrackVariant3 != null && selectedTrackFormat3 != null) {
            subtitleTrackData = createSubtitleTrackData(selectedTrackVariant3, selectedTrackFormat3);
        }
        if (createAudioTrackData != null && !createAudioTrackData.equals(this.oldAudioTrackData) && (audioTrackData = this.oldAudioTrackData) != null) {
            this.eventTracker.onAudioTrackChanged(createAudioTrackData, audioTrackData);
        }
        if (createVideoTrackData != null && !createVideoTrackData.equals(this.oldVideoTrackData) && (videoTrackData = this.oldVideoTrackData) != null && (!createVideoTrackData.getAuto() || !videoTrackData.getAuto())) {
            this.eventTracker.onVideoTrackChanged(createVideoTrackData, videoTrackData);
        }
        if (!jl40.l(subtitleTrackData, this.oldSubtitleTrackData) && this.oldVideoTrackData != null) {
            this.eventTracker.onSubtitleTrackChanged(subtitleTrackData, this.oldSubtitleTrackData);
        }
        this.oldAudioTrackData = createAudioTrackData;
        this.oldVideoTrackData = createVideoTrackData;
        this.oldSubtitleTrackData = subtitleTrackData;
    }
}
