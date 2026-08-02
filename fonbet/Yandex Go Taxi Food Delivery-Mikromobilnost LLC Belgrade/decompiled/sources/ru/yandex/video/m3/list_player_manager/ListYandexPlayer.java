package ru.yandex.video.m3.list_player_manager;

import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.impl.track.TrackType;
import ru.yandex.video.m3.list_player_manager.impl.track.TrackVariant;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.PlaybackException;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH'¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u000bH'¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H'¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H'¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0017H'¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH'¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001fH'¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H'¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020%H'¢\u0006\u0004\b)\u0010*J\u001b\u0010.\u001a\u0004\u0018\u00010-2\b\b\u0001\u0010,\u001a\u00020+H'¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\b\u0012\u0004\u0012\u00020-002\b\b\u0001\u0010,\u001a\u00020+H'¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020%2\u0006\u00103\u001a\u00020-H'¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020%H\u0017¢\u0006\u0004\b6\u0010*J\u000f\u00107\u001a\u00020\u000bH\u0017¢\u0006\u0004\b7\u0010\u000f¨\u00068À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;", "", "", "getVideoSessionId", "()Ljava/lang/String;", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "getItem", "()Lru/yandex/video/m3/list_player_manager/model/MediaData;", "mediaData", "Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "playbackConfig", "Lzy11;", "setSource", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/list_player_manager/PlaybackConfig;)V", "dropSource", "()V", "Lru/yandex/video/m3/list_player_manager/ListPlayerObserver;", "observer", "addObserver", "(Lru/yandex/video/m3/list_player_manager/ListPlayerObserver;)V", "removeObserver", "play", "pause", "", "getPosition", "()J", "getBufferedPosition", "getContentDuration", "position", "seekTo", "(J)V", "", "volume", "setVolume", "(F)V", "getVolume", "()F", "", "muted", "setMuted", "(Z)V", "isMuted", "()Z", "", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;", "getCurrentTrack", "(I)Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;", "", "getAvailableTracks", "(I)Ljava/util/List;", "trackVariant", "setTrack", "(Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;)Z", "isInLive", "goToLive", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ListYandexPlayer {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void goToLive(ListYandexPlayer listYandexPlayer) {
            ListYandexPlayer.super.goToLive();
        }

        @Deprecated
        public static boolean isInLive(ListYandexPlayer listYandexPlayer) {
            return ListYandexPlayer.super.isInLive();
        }
    }

    void addObserver(ListPlayerObserver observer);

    void dropSource();

    List<TrackVariant> getAvailableTracks(@TrackType int trackType);

    long getBufferedPosition();

    long getContentDuration();

    TrackVariant getCurrentTrack(@TrackType int trackType);

    MediaData getItem();

    long getPosition();

    /* renamed from: getVideoSessionId */
    String getListSdkVsid();

    float getVolume();

    default void goToLive() {
    }

    default boolean isInLive() {
        return false;
    }

    boolean isMuted();

    void pause();

    void play();

    void removeObserver(ListPlayerObserver observer);

    void seekTo(long position);

    void setMuted(boolean muted);

    void setSource(MediaData mediaData, PlaybackConfig playbackConfig);

    boolean setTrack(TrackVariant trackVariant);

    void setVolume(float volume);
}
