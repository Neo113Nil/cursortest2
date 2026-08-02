package ru.yandex.video.m3.list_player_manager.impl.track;

import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.ListPlayerObserver;
import ru.yandex.video.m3.player.PlaybackException;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/track/TrackManager;", "", "", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;", "getCurrentTrack", "(I)Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;", "", "getAvailableTracks", "(I)Ljava/util/List;", "trackVariant", "", "setTrack", "(Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;)Z", "Lru/yandex/video/m3/list_player_manager/ListPlayerObserver;", "listener", "Lzy11;", "addPlayerListener", "(Lru/yandex/video/m3/list_player_manager/ListPlayerObserver;)V", "removePlayerListener", "release", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TrackManager {
    void addPlayerListener(ListPlayerObserver listener);

    List<TrackVariant> getAvailableTracks(@TrackType int trackType);

    TrackVariant getCurrentTrack(@TrackType int trackType);

    void release();

    void removePlayerListener(ListPlayerObserver listener);

    boolean setTrack(TrackVariant trackVariant);
}
