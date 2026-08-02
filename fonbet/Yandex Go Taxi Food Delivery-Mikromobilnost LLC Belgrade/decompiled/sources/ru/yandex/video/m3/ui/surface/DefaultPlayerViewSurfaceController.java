package ru.yandex.video.m3.ui.surface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001#B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\u0005R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/yandex/video/m3/ui/surface/DefaultPlayerViewSurfaceController;", "Lru/yandex/video/m3/ui/surface/InternalPlayerViewSurfaceController;", "", "showPreviewUntilFirstPlay", "<init>", "(Z)V", "Lzy11;", "updateSurfaces", "()V", "isVideoReady", "()Z", "tryActivateVideoSurface", "tryActivatePreviewSurface", "Lru/yandex/video/m3/ui/surface/PlayerViewSurface;", "surface", "onSurfaceReadyForDisplay", "(Lru/yandex/video/m3/ui/surface/PlayerViewSurface;)V", "", "surfaces", "onUpdateAvailableSurfaces", "(Ljava/util/Set;)V", "onSurfacesContentWillFlush", "onSurfacesContentDidFlush", "onResume", "onSetSource", "Z", "getShowPreviewUntilFirstPlay", "setShowPreviewUntilFirstPlay", "", "Lru/yandex/video/m3/ui/surface/DefaultPlayerViewSurfaceController$SurfaceState;", "stateBySurface", "Ljava/util/Map;", "isBeforeFirstPlay", "getSurfaces", "()Ljava/util/Set;", "SurfaceState", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DefaultPlayerViewSurfaceController implements InternalPlayerViewSurfaceController {
    public static final int $stable = 8;
    private boolean isBeforeFirstPlay;
    private boolean showPreviewUntilFirstPlay;
    private final Map<PlayerViewSurface, SurfaceState> stateBySurface;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ui/surface/DefaultPlayerViewSurfaceController$SurfaceState;", "", "(Ljava/lang/String;I)V", "READY", "WILL_FLUSH", "FLUSHED", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum SurfaceState {
        READY,
        WILL_FLUSH,
        FLUSHED
    }

    public DefaultPlayerViewSurfaceController(boolean z) {
        this.showPreviewUntilFirstPlay = z;
        this.stateBySurface = new LinkedHashMap();
        this.isBeforeFirstPlay = true;
    }

    private final Set<PlayerViewSurface> getSurfaces() {
        return this.stateBySurface.keySet();
    }

    private final boolean isVideoReady() {
        Map<PlayerViewSurface, SurfaceState> map = this.stateBySurface;
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry<PlayerViewSurface, SurfaceState> entry : map.entrySet()) {
            if (entry.getKey().getType() == 1 && entry.getValue() != SurfaceState.FLUSHED) {
                return true;
            }
        }
        return false;
    }

    private final void tryActivatePreviewSurface() {
        Object obj;
        Iterator<T> it = getSurfaces().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            PlayerViewSurface playerViewSurface = (PlayerViewSurface) obj;
            if (playerViewSurface.getType() == 0 && !playerViewSurface.getIsActive()) {
                break;
            }
        }
        PlayerViewSurface playerViewSurface2 = (PlayerViewSurface) obj;
        if (playerViewSurface2 != null) {
            playerViewSurface2.activate();
        }
    }

    private final void tryActivateVideoSurface() {
        Object obj;
        Iterator<T> it = getSurfaces().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            PlayerViewSurface playerViewSurface = (PlayerViewSurface) obj;
            if (playerViewSurface.getType() == 1 && !playerViewSurface.getIsActive() && playerViewSurface.getIsReadyForDisplay()) {
                break;
            }
        }
        PlayerViewSurface playerViewSurface2 = (PlayerViewSurface) obj;
        if (playerViewSurface2 != null) {
            playerViewSurface2.activate();
        }
    }

    private final void updateSurfaces() {
        if (!(this.isBeforeFirstPlay && getShowPreviewUntilFirstPlay()) && isVideoReady()) {
            tryActivateVideoSurface();
        } else {
            tryActivatePreviewSurface();
        }
    }

    @Override // ru.yandex.video.m3.ui.surface.InternalPlayerViewSurfaceController
    public boolean getShowPreviewUntilFirstPlay() {
        return this.showPreviewUntilFirstPlay;
    }

    @Override // ru.yandex.video.m3.ui.surface.InternalPlayerViewSurfaceController
    public void onResume() {
        this.isBeforeFirstPlay = false;
        updateSurfaces();
    }

    @Override // ru.yandex.video.m3.ui.surface.InternalPlayerViewSurfaceController
    public void onSetSource() {
        this.isBeforeFirstPlay = true;
        updateSurfaces();
    }

    @Override // ru.yandex.video.m3.ui.surface.PlayerViewSurfaceController
    public void onSurfaceReadyForDisplay(PlayerViewSurface surface) {
        this.stateBySurface.put(surface, SurfaceState.READY);
        updateSurfaces();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.video.m3.ui.surface.PlayerViewSurfaceController
    public void onSurfacesContentDidFlush(Set<PlayerViewSurface> surfaces) {
        Map<PlayerViewSurface, SurfaceState> map = this.stateBySurface;
        for (Object obj : surfaces) {
            map.put(obj, SurfaceState.FLUSHED);
        }
        updateSurfaces();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.video.m3.ui.surface.PlayerViewSurfaceController
    public void onSurfacesContentWillFlush(Set<PlayerViewSurface> surfaces) {
        Map<PlayerViewSurface, SurfaceState> map = this.stateBySurface;
        for (Object obj : surfaces) {
            map.put(obj, SurfaceState.WILL_FLUSH);
        }
        updateSurfaces();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.video.m3.ui.surface.PlayerViewSurfaceController
    public void onUpdateAvailableSurfaces(Set<PlayerViewSurface> surfaces) {
        this.stateBySurface.clear();
        Map<PlayerViewSurface, SurfaceState> map = this.stateBySurface;
        for (Object obj : surfaces) {
            map.put(obj, ((PlayerViewSurface) obj).getIsReadyForDisplay() ? SurfaceState.READY : SurfaceState.FLUSHED);
        }
        updateSurfaces();
    }

    @Override // ru.yandex.video.m3.ui.surface.InternalPlayerViewSurfaceController
    public void setShowPreviewUntilFirstPlay(boolean z) {
        this.showPreviewUntilFirstPlay = z;
    }

    public DefaultPlayerViewSurfaceController() {
        this(false, 1, null);
    }

    public /* synthetic */ DefaultPlayerViewSurfaceController(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
