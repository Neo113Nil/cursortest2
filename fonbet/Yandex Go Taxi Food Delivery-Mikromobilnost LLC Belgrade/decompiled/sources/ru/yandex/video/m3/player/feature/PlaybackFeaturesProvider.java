package ru.yandex.video.m3.player.feature;

import kotlin.Metadata;
import ru.yandex.video.m3.player.provider.Supplier;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0012\u0010\b\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/feature/PlaybackFeatures;", "expDoRetryForStreamResetException", "", "getExpDoRetryForStreamResetException", "()Z", "isLowLatency", "supportLowLatency", "getSupportLowLatency", "DEFAULT", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PlaybackFeaturesProvider extends Supplier<PlaybackFeatures> {

    /* renamed from: DEFAULT, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider$DEFAULT;", "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "()V", "isLowLatency", "", "()Z", "supportLowLatency", "getSupportLowLatency", "get", "Lru/yandex/video/m3/player/feature/PlaybackFeatures;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider$DEFAULT, reason: from kotlin metadata */
    public static final class Companion implements PlaybackFeaturesProvider {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final boolean isLowLatency = false;
        private static final boolean supportLowLatency = false;

        private Companion() {
        }

        @Override // ru.yandex.video.m3.player.provider.Supplier
        public PlaybackFeatures get() {
            return new PlaybackFeatures(Boolean.valueOf(isLowLatency));
        }

        @Override // ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider
        public boolean getSupportLowLatency() {
            return supportLowLatency;
        }

        @Override // ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider
        public boolean isLowLatency() {
            return isLowLatency;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean getExpDoRetryForStreamResetException(PlaybackFeaturesProvider playbackFeaturesProvider) {
            return PlaybackFeaturesProvider.super.getExpDoRetryForStreamResetException();
        }
    }

    default boolean getExpDoRetryForStreamResetException() {
        return false;
    }

    boolean getSupportLowLatency();

    boolean isLowLatency();
}
