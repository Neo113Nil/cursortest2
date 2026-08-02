package ru.yandex.video.m3.player.provider;

import defpackage.jxi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.provider.ImmutableTrackSelectionRestrictionsProvider;
import ru.yandex.video.m3.player.provider.model.StartQuality;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u00138\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/provider/ImmutableTrackSelectionRestrictionsProvider;", "Lru/yandex/video/m3/player/provider/TrackSelectionRestrictionsProvider;", "inputSurfaceWidth", "", "inputSurfaceHeight", "inputMaxStartHeight", "(III)V", "startQualityProvider", "Lru/yandex/video/m3/player/provider/StartQualityProvider;", "getStartQualityProvider$annotations", "()V", "getStartQualityProvider", "()Lru/yandex/video/m3/player/provider/StartQualityProvider;", "startQualitySupplier", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/provider/model/StartQuality;", "getStartQualitySupplier", "()Lru/yandex/video/m3/player/provider/Supplier;", "surfaceSizeProvider", "Lru/yandex/video/m3/player/provider/SurfaceSizeProvider;", "getSurfaceSizeProvider$annotations", "getSurfaceSizeProvider", "()Lru/yandex/video/m3/player/provider/SurfaceSizeProvider;", "surfaceSizeSupplier", "Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "getSurfaceSizeSupplier", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImmutableTrackSelectionRestrictionsProvider implements TrackSelectionRestrictionsProvider {
    public static final int $stable = 0;
    private final int inputMaxStartHeight;
    private final int inputSurfaceHeight;
    private final int inputSurfaceWidth;
    private final StartQualityProvider startQualityProvider;
    private final Supplier<StartQuality> startQualitySupplier;
    private final SurfaceSizeProvider surfaceSizeProvider;
    private final Supplier<SurfaceSize> surfaceSizeSupplier;

    public ImmutableTrackSelectionRestrictionsProvider(int i, int i2, int i3) {
        this.inputSurfaceWidth = i;
        this.inputSurfaceHeight = i2;
        this.inputMaxStartHeight = i3;
        this.surfaceSizeProvider = new SurfaceSizeProvider() { // from class: ru.yandex.video.m3.player.provider.ImmutableTrackSelectionRestrictionsProvider$surfaceSizeProvider$1
            @Override // ru.yandex.video.m3.player.provider.SurfaceSizeProvider
            public int getSurfaceHeight() {
                int i4;
                i4 = ImmutableTrackSelectionRestrictionsProvider.this.inputSurfaceHeight;
                return i4;
            }

            @Override // ru.yandex.video.m3.player.provider.SurfaceSizeProvider
            public int getSurfaceWidth() {
                int i4;
                i4 = ImmutableTrackSelectionRestrictionsProvider.this.inputSurfaceWidth;
                return i4;
            }
        };
        this.startQualityProvider = new StartQualityProvider() { // from class: ru.yandex.video.m3.player.provider.ImmutableTrackSelectionRestrictionsProvider$startQualityProvider$1
            @Override // ru.yandex.video.m3.player.provider.StartQualityProvider
            public Integer getHeight() {
                int i4;
                i4 = ImmutableTrackSelectionRestrictionsProvider.this.inputMaxStartHeight;
                return Integer.valueOf(i4);
            }
        };
        final int i4 = 0;
        this.surfaceSizeSupplier = new Supplier(this) { // from class: tiv
            public final /* synthetic */ ImmutableTrackSelectionRestrictionsProvider b;

            {
                this.b = this;
            }

            @Override // ru.yandex.video.m3.player.provider.Supplier
            /* renamed from: get */
            public final Object getValue() {
                SurfaceSize surfaceSizeSupplier$lambda$0;
                StartQuality startQualitySupplier$lambda$1;
                int i5 = i4;
                ImmutableTrackSelectionRestrictionsProvider immutableTrackSelectionRestrictionsProvider = this.b;
                switch (i5) {
                    case 0:
                        surfaceSizeSupplier$lambda$0 = ImmutableTrackSelectionRestrictionsProvider.surfaceSizeSupplier$lambda$0(immutableTrackSelectionRestrictionsProvider);
                        return surfaceSizeSupplier$lambda$0;
                    default:
                        startQualitySupplier$lambda$1 = ImmutableTrackSelectionRestrictionsProvider.startQualitySupplier$lambda$1(immutableTrackSelectionRestrictionsProvider);
                        return startQualitySupplier$lambda$1;
                }
            }
        };
        final int i5 = 1;
        this.startQualitySupplier = new Supplier(this) { // from class: tiv
            public final /* synthetic */ ImmutableTrackSelectionRestrictionsProvider b;

            {
                this.b = this;
            }

            @Override // ru.yandex.video.m3.player.provider.Supplier
            /* renamed from: get */
            public final Object getValue() {
                SurfaceSize surfaceSizeSupplier$lambda$0;
                StartQuality startQualitySupplier$lambda$1;
                int i52 = i5;
                ImmutableTrackSelectionRestrictionsProvider immutableTrackSelectionRestrictionsProvider = this.b;
                switch (i52) {
                    case 0:
                        surfaceSizeSupplier$lambda$0 = ImmutableTrackSelectionRestrictionsProvider.surfaceSizeSupplier$lambda$0(immutableTrackSelectionRestrictionsProvider);
                        return surfaceSizeSupplier$lambda$0;
                    default:
                        startQualitySupplier$lambda$1 = ImmutableTrackSelectionRestrictionsProvider.startQualitySupplier$lambda$1(immutableTrackSelectionRestrictionsProvider);
                        return startQualitySupplier$lambda$1;
                }
            }
        };
    }

    @jxi
    public static /* synthetic */ void getStartQualityProvider$annotations() {
    }

    @jxi
    public static /* synthetic */ void getSurfaceSizeProvider$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StartQuality startQualitySupplier$lambda$1(ImmutableTrackSelectionRestrictionsProvider immutableTrackSelectionRestrictionsProvider) {
        return StartQuality.m804boximpl(StartQuality.m805constructorimpl(immutableTrackSelectionRestrictionsProvider.inputMaxStartHeight));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurfaceSize surfaceSizeSupplier$lambda$0(ImmutableTrackSelectionRestrictionsProvider immutableTrackSelectionRestrictionsProvider) {
        return new SurfaceSize(immutableTrackSelectionRestrictionsProvider.inputSurfaceWidth, immutableTrackSelectionRestrictionsProvider.inputSurfaceHeight);
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

    public ImmutableTrackSelectionRestrictionsProvider() {
        this(0, 0, 0, 7, null);
    }

    public /* synthetic */ ImmutableTrackSelectionRestrictionsProvider(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? Integer.MAX_VALUE : i, (i4 & 2) != 0 ? Integer.MAX_VALUE : i2, (i4 & 4) != 0 ? Integer.MAX_VALUE : i3);
    }
}
