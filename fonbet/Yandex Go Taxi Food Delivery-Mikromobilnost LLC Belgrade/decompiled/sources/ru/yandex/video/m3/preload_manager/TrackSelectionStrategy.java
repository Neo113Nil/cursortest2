package ru.yandex.video.m3.preload_manager;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/preload_manager/TrackSelectionStrategy;", "", "getSelectedTracks", "", "Lru/yandex/video/m3/preload_manager/PreloadTrackInfo;", "tracks", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TrackSelectionStrategy {
    List<PreloadTrackInfo> getSelectedTracks(List<? extends PreloadTrackInfo> tracks);
}
