package ru.yandex.video.m3.player.provider;

import defpackage.jl40;
import defpackage.jxi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.provider.model.StartQuality;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J+\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001c\u0010\b\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u00020\u00118\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006!"}, d2 = {"Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProviderImpl;", "Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;", "surfaceSizeSupplier", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "startQualitySupplier", "Lru/yandex/video/m3/player/provider/model/StartQuality;", "(Lru/yandex/video/m3/player/provider/Supplier;Lru/yandex/video/m3/player/provider/Supplier;)V", "startQualityProvider", "Lru/yandex/video/m3/player/provider/StartQualityProvider;", "getStartQualityProvider$annotations", "()V", "getStartQualityProvider", "()Lru/yandex/video/m3/player/provider/StartQualityProvider;", "getStartQualitySupplier", "()Lru/yandex/video/m3/player/provider/Supplier;", "surfaceSizeProvider", "Lru/yandex/video/m3/player/provider/SurfaceSizeProvider;", "getSurfaceSizeProvider$annotations", "getSurfaceSizeProvider", "()Lru/yandex/video/m3/player/provider/SurfaceSizeProvider;", "getSurfaceSizeSupplier", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TrackSelectionRestrictionsProviderImpl implements TrackSelectionRestrictionsProvider {
    public static final int $stable = 0;
    private final StartQualityProvider startQualityProvider;
    private final Supplier<StartQuality> startQualitySupplier;
    private final SurfaceSizeProvider surfaceSizeProvider;
    private final Supplier<SurfaceSize> surfaceSizeSupplier;

    public TrackSelectionRestrictionsProviderImpl(Supplier<SurfaceSize> supplier, Supplier<StartQuality> supplier2) {
        this.surfaceSizeSupplier = supplier;
        this.startQualitySupplier = supplier2;
        this.surfaceSizeProvider = new SurfaceSizeProvider() { // from class: ru.yandex.video.m3.player.provider.TrackSelectionRestrictionsProviderImpl$surfaceSizeProvider$1
            @Override // ru.yandex.video.m3.player.provider.SurfaceSizeProvider
            public int getSurfaceHeight() {
                return TrackSelectionRestrictionsProviderImpl.this.getSurfaceSizeSupplier().getValue().getHeight();
            }

            @Override // ru.yandex.video.m3.player.provider.SurfaceSizeProvider
            public int getSurfaceWidth() {
                return TrackSelectionRestrictionsProviderImpl.this.getSurfaceSizeSupplier().getValue().getWidth();
            }
        };
        this.startQualityProvider = new StartQualityProvider() { // from class: ru.yandex.video.m3.player.provider.TrackSelectionRestrictionsProviderImpl$startQualityProvider$1
            @Override // ru.yandex.video.m3.player.provider.StartQualityProvider
            public Integer getHeight() {
                Supplier<StartQuality> startQualitySupplier = TrackSelectionRestrictionsProviderImpl.this.getStartQualitySupplier();
                return Integer.valueOf(startQualitySupplier != null ? startQualitySupplier.getValue().m810unboximpl() : Integer.MAX_VALUE);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackSelectionRestrictionsProviderImpl copy$default(TrackSelectionRestrictionsProviderImpl trackSelectionRestrictionsProviderImpl, Supplier supplier, Supplier supplier2, int i, Object obj) {
        if ((i & 1) != 0) {
            supplier = trackSelectionRestrictionsProviderImpl.surfaceSizeSupplier;
        }
        if ((i & 2) != 0) {
            supplier2 = trackSelectionRestrictionsProviderImpl.startQualitySupplier;
        }
        return trackSelectionRestrictionsProviderImpl.copy(supplier, supplier2);
    }

    @jxi
    public static /* synthetic */ void getStartQualityProvider$annotations() {
    }

    @jxi
    public static /* synthetic */ void getSurfaceSizeProvider$annotations() {
    }

    public final Supplier<SurfaceSize> component1() {
        return this.surfaceSizeSupplier;
    }

    public final Supplier<StartQuality> component2() {
        return this.startQualitySupplier;
    }

    public final TrackSelectionRestrictionsProviderImpl copy(Supplier<SurfaceSize> surfaceSizeSupplier, Supplier<StartQuality> startQualitySupplier) {
        return new TrackSelectionRestrictionsProviderImpl(surfaceSizeSupplier, startQualitySupplier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackSelectionRestrictionsProviderImpl)) {
            return false;
        }
        TrackSelectionRestrictionsProviderImpl trackSelectionRestrictionsProviderImpl = (TrackSelectionRestrictionsProviderImpl) other;
        return jl40.l(this.surfaceSizeSupplier, trackSelectionRestrictionsProviderImpl.surfaceSizeSupplier) && jl40.l(this.startQualitySupplier, trackSelectionRestrictionsProviderImpl.startQualitySupplier);
    }

    @Override // ru.yandex.video.m3.player.provider.TrackSelectionRestrictionsProvider
    public StartQualityProvider getStartQualityProvider() {
        return this.startQualityProvider;
    }

    @Override // ru.yandex.video.m3.player.provider.TrackSelectionRestrictionsProvider
    public Supplier<StartQuality> getStartQualitySupplier() {
        return this.startQualitySupplier;
    }

    @Override // ru.yandex.video.m3.player.provider.TrackSelectionRestrictionsProvider
    public SurfaceSizeProvider getSurfaceSizeProvider() {
        return this.surfaceSizeProvider;
    }

    @Override // ru.yandex.video.m3.player.provider.TrackSelectionRestrictionsProvider
    public Supplier<SurfaceSize> getSurfaceSizeSupplier() {
        return this.surfaceSizeSupplier;
    }

    public int hashCode() {
        int hashCode = this.surfaceSizeSupplier.hashCode() * 31;
        Supplier<StartQuality> supplier = this.startQualitySupplier;
        return hashCode + (supplier == null ? 0 : supplier.hashCode());
    }

    public String toString() {
        return "TrackSelectionRestrictionsProviderImpl(surfaceSizeSupplier=" + this.surfaceSizeSupplier + ", startQualitySupplier=" + this.startQualitySupplier + ')';
    }

    public /* synthetic */ TrackSelectionRestrictionsProviderImpl(Supplier supplier, Supplier supplier2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(supplier, (i & 2) != 0 ? null : supplier2);
    }
}
