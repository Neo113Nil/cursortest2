package ru.yandex.video.m3.trackselection.adapter;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.provider.StartQualityProvider;
import ru.yandex.video.m3.player.provider.Supplier;
import ru.yandex.video.m3.player.provider.model.StartQuality;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/trackselection/adapter/StartQualityProviderToStartQualitySupplierAdapter;", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/provider/model/StartQuality;", "startQualityProvider", "Lru/yandex/video/m3/player/provider/StartQualityProvider;", "(Lru/yandex/video/m3/player/provider/StartQualityProvider;)V", "get", "get-ARBYfN4", "()I", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StartQualityProviderToStartQualitySupplierAdapter implements Supplier<StartQuality> {
    private final StartQualityProvider startQualityProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private StartQualityProviderToStartQualitySupplierAdapter(StartQualityProvider startQualityProvider) {
        this.startQualityProvider = startQualityProvider;
    }

    @Override // ru.yandex.video.m3.player.provider.Supplier
    /* renamed from: get */
    public /* bridge */ /* synthetic */ StartQuality getValue() {
        return StartQuality.m804boximpl(m903getARBYfN4());
    }

    /* renamed from: get-ARBYfN4, reason: not valid java name */
    public int m903getARBYfN4() {
        Integer height = this.startQualityProvider.getHeight();
        return StartQuality.m805constructorimpl(height != null ? height.intValue() : Integer.MAX_VALUE);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/trackselection/adapter/StartQualityProviderToStartQualitySupplierAdapter$Companion;", "", "()V", "createStartQualitySupplier", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/provider/model/StartQuality;", "startQualityProvider", "Lru/yandex/video/m3/player/provider/StartQualityProvider;", "createStartQualitySupplierOrNull", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Supplier<StartQuality> createStartQualitySupplier(StartQualityProvider startQualityProvider) {
            return new StartQualityProviderToStartQualitySupplierAdapter(startQualityProvider, null);
        }

        public final Supplier<StartQuality> createStartQualitySupplierOrNull(StartQualityProvider startQualityProvider) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (startQualityProvider == null) {
                return null;
            }
            return new StartQualityProviderToStartQualitySupplierAdapter(startQualityProvider, defaultConstructorMarker);
        }

        private Companion() {
        }
    }

    public /* synthetic */ StartQualityProviderToStartQualitySupplierAdapter(StartQualityProvider startQualityProvider, DefaultConstructorMarker defaultConstructorMarker) {
        this(startQualityProvider);
    }
}
