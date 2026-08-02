package ru.yandex.video.m3.preload_manager;

import defpackage.cvu0;
import defpackage.j73;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/preload_manager/DebugFirstAudioFirstVideo;", "Lru/yandex/video/m3/preload_manager/TrackSelectionStrategy;", "()V", "getSelectedTracks", "", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfo;", "tracks", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DebugFirstAudioFirstVideo implements TrackSelectionStrategy {
    public static final int $stable = 0;
    public static final DebugFirstAudioFirstVideo INSTANCE = new DebugFirstAudioFirstVideo();

    private DebugFirstAudioFirstVideo() {
    }

    @Override // ru.yandex.video.m3.preload_manager.TrackSelectionStrategy
    public List<PreloadTrackInfo> getSelectedTracks(List<? extends PreloadTrackInfo> tracks) {
        Object obj;
        Object obj2;
        List<? extends PreloadTrackInfo> list = tracks;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            String str = ((ExoPlayerPreloadTrackInfo) ((PreloadTrackInfo) obj2)).getFormat().n;
            if (str != null && cvu0.x(str, MediaStreamTrack.AUDIO_TRACK_KIND, false)) {
                break;
            }
        }
        PreloadTrackInfo preloadTrackInfo = (PreloadTrackInfo) obj2;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            String str2 = ((ExoPlayerPreloadTrackInfo) ((PreloadTrackInfo) next)).getFormat().n;
            if (str2 != null && cvu0.x(str2, MediaStreamTrack.VIDEO_TRACK_KIND, false)) {
                obj = next;
                break;
            }
        }
        return j73.A(new PreloadTrackInfo[]{preloadTrackInfo, (PreloadTrackInfo) obj});
    }
}
