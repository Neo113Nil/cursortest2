package ru.yandex.video.m3.ui.surface;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000b\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ui/surface/InternalPlayerViewSurfaceController;", "Lru/yandex/video/m3/ui/surface/PlayerViewSurfaceController;", "Lzy11;", "onResume", "()V", "onSetSource", "", "getShowPreviewUntilFirstPlay", "()Z", "setShowPreviewUntilFirstPlay", "(Z)V", "showPreviewUntilFirstPlay", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface InternalPlayerViewSurfaceController extends PlayerViewSurfaceController {
    boolean getShowPreviewUntilFirstPlay();

    void onResume();

    void onSetSource();

    void setShowPreviewUntilFirstPlay(boolean z);
}
