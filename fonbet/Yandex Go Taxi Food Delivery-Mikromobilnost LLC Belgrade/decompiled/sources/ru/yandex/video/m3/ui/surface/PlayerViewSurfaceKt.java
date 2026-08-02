package ru.yandex.video.m3.ui.surface;

import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"", "isActive", "isReadyForDisplay", "Lkotlin/Function0;", "Lzy11;", "onActivate", "Lru/yandex/video/m3/ui/surface/PlayerViewSurface;", "PreviewSurface", "(ZZLsls;)Lru/yandex/video/m3/ui/surface/PlayerViewSurface;", "VideoSurface", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PlayerViewSurfaceKt {
    public static final PlayerViewSurface PreviewSurface(boolean z, boolean z2, sls slsVar) {
        return new PlayerViewSurface(0, z, z2, slsVar);
    }

    public static /* synthetic */ PlayerViewSurface PreviewSurface$default(boolean z, boolean z2, sls slsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return PreviewSurface(z, z2, slsVar);
    }

    public static final PlayerViewSurface VideoSurface(boolean z, boolean z2, sls slsVar) {
        return new PlayerViewSurface(1, z, z2, slsVar);
    }

    public static /* synthetic */ PlayerViewSurface VideoSurface$default(boolean z, boolean z2, sls slsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return VideoSurface(z, z2, slsVar);
    }
}
