package ru.yandex.video.m3.player.provider;

import defpackage.jxi;
import defpackage.s2u0;
import kotlin.Metadata;
import ru.yandex.video.m3.player.provider.model.StartQuality;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000e8&X§\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;", "", "startQualityProvider", "Lru/yandex/video/m3/player/provider/StartQualityProvider;", "getStartQualityProvider$annotations", "()V", "getStartQualityProvider", "()Lru/yandex/video/m3/player/provider/StartQualityProvider;", "startQualitySupplier", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/provider/model/StartQuality;", "getStartQualitySupplier", "()Lru/yandex/video/m3/player/provider/Supplier;", "surfaceSizeProvider", "Lru/yandex/video/m3/player/provider/SurfaceSizeProvider;", "getSurfaceSizeProvider$annotations", "getSurfaceSizeProvider", "()Lru/yandex/video/m3/player/provider/SurfaceSizeProvider;", "surfaceSizeSupplier", "Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "getSurfaceSizeSupplier", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TrackSelectionRestrictionsProvider {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @jxi
        public static /* synthetic */ void getStartQualityProvider$annotations() {
        }

        @Deprecated
        public static Supplier<StartQuality> getStartQualitySupplier(TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider) {
            return TrackSelectionRestrictionsProvider.super.getStartQualitySupplier();
        }

        @jxi
        public static /* synthetic */ void getSurfaceSizeProvider$annotations() {
        }

        @Deprecated
        public static Supplier<SurfaceSize> getSurfaceSizeSupplier(TrackSelectionRestrictionsProvider trackSelectionRestrictionsProvider) {
            return TrackSelectionRestrictionsProvider.super.getSurfaceSizeSupplier();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static StartQuality _get_startQualitySupplier_$lambda$1() {
        return StartQuality.m804boximpl(StartQuality.m805constructorimpl(Integer.MAX_VALUE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static SurfaceSize _get_surfaceSizeSupplier_$lambda$0() {
        return new SurfaceSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    StartQualityProvider getStartQualityProvider();

    default Supplier<StartQuality> getStartQualitySupplier() {
        return new s2u0(19);
    }

    SurfaceSizeProvider getSurfaceSizeProvider();

    default Supplier<SurfaceSize> getSurfaceSizeSupplier() {
        return new s2u0(18);
    }
}
