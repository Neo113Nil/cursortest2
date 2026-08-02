package ru.yandex.video.m3.ui.surface;

import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u000b\u0010\u0007J\u001d\u0010\f\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\f\u0010\u0007¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ui/surface/PlayerViewSurfaceController;", "", "", "Lru/yandex/video/m3/ui/surface/PlayerViewSurface;", "surfaces", "Lzy11;", "onUpdateAvailableSurfaces", "(Ljava/util/Set;)V", "surface", "onSurfaceReadyForDisplay", "(Lru/yandex/video/m3/ui/surface/PlayerViewSurface;)V", "onSurfacesContentWillFlush", "onSurfacesContentDidFlush", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface PlayerViewSurfaceController {
    void onSurfaceReadyForDisplay(PlayerViewSurface surface);

    void onSurfacesContentDidFlush(Set<PlayerViewSurface> surfaces);

    void onSurfacesContentWillFlush(Set<PlayerViewSurface> surfaces);

    void onUpdateAvailableSurfaces(Set<PlayerViewSurface> surfaces);
}
