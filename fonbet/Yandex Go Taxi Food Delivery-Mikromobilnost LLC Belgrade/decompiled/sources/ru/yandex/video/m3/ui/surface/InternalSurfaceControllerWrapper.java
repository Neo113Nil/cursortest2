package ru.yandex.video.m3.ui.surface;

import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ\u001e\u0010\u0010\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/ui/surface/InternalSurfaceControllerWrapper;", "Lru/yandex/video/m3/ui/surface/InternalPlayerViewSurfaceController;", "Lru/yandex/video/m3/ui/surface/PlayerViewSurfaceController;", "controller", "<init>", "(Lru/yandex/video/m3/ui/surface/PlayerViewSurfaceController;)V", "Lru/yandex/video/m3/ui/surface/PlayerViewSurface;", "surface", "Lzy11;", "onSurfaceReadyForDisplay", "(Lru/yandex/video/m3/ui/surface/PlayerViewSurface;)V", "", "surfaces", "onSurfacesContentDidFlush", "(Ljava/util/Set;)V", "onSurfacesContentWillFlush", "onUpdateAvailableSurfaces", "onResume", "()V", "onSetSource", "Lru/yandex/video/m3/ui/surface/PlayerViewSurfaceController;", "", "showPreviewUntilFirstPlay", "Z", "getShowPreviewUntilFirstPlay", "()Z", "setShowPreviewUntilFirstPlay", "(Z)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalSurfaceControllerWrapper implements InternalPlayerViewSurfaceController, PlayerViewSurfaceController {
    public static final int $stable = 8;
    private final PlayerViewSurfaceController controller;
    private boolean showPreviewUntilFirstPlay;

    public InternalSurfaceControllerWrapper(PlayerViewSurfaceController playerViewSurfaceController) {
        this.controller = playerViewSurfaceController;
    }

    @Override // ru.yandex.video.m3.ui.surface.InternalPlayerViewSurfaceController
    public boolean getShowPreviewUntilFirstPlay() {
        return this.showPreviewUntilFirstPlay;
    }

    @Override // ru.yandex.video.m3.ui.surface.InternalPlayerViewSurfaceController
    public void onResume() {
    }

    @Override // ru.yandex.video.m3.ui.surface.InternalPlayerViewSurfaceController
    public void onSetSource() {
    }

    @Override // ru.yandex.video.m3.ui.surface.PlayerViewSurfaceController
    public void onSurfaceReadyForDisplay(PlayerViewSurface surface) {
        this.controller.onSurfaceReadyForDisplay(surface);
    }

    @Override // ru.yandex.video.m3.ui.surface.PlayerViewSurfaceController
    public void onSurfacesContentDidFlush(Set<PlayerViewSurface> surfaces) {
        this.controller.onSurfacesContentDidFlush(surfaces);
    }

    @Override // ru.yandex.video.m3.ui.surface.PlayerViewSurfaceController
    public void onSurfacesContentWillFlush(Set<PlayerViewSurface> surfaces) {
        this.controller.onSurfacesContentWillFlush(surfaces);
    }

    @Override // ru.yandex.video.m3.ui.surface.PlayerViewSurfaceController
    public void onUpdateAvailableSurfaces(Set<PlayerViewSurface> surfaces) {
        this.controller.onUpdateAvailableSurfaces(surfaces);
    }

    @Override // ru.yandex.video.m3.ui.surface.InternalPlayerViewSurfaceController
    public void setShowPreviewUntilFirstPlay(boolean z) {
        this.showPreviewUntilFirstPlay = z;
    }
}
