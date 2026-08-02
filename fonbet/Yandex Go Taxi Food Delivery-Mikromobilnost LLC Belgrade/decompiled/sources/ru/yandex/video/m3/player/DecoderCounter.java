package ru.yandex.video.m3.player;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/DecoderCounter;", "", "getDroppedFrames", "", "getInitCount", "getReleaseCount", "getShownFrames", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DecoderCounter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/player/DecoderCounter$Companion;", "", "()V", "ZERO", "ru/yandex/video/m3/player/DecoderCounter$Companion$ZERO$1", "Lru/yandex/video/m3/player/DecoderCounter$Companion$ZERO$1;", "ofZero", "Lru/yandex/video/m3/player/DecoderCounter;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final DecoderCounter$Companion$ZERO$1 ZERO = new DecoderCounter() { // from class: ru.yandex.video.m3.player.DecoderCounter$Companion$ZERO$1
            @Override // ru.yandex.video.m3.player.DecoderCounter
            public int getDroppedFrames() {
                return 0;
            }

            @Override // ru.yandex.video.m3.player.DecoderCounter
            public int getInitCount() {
                return 0;
            }

            @Override // ru.yandex.video.m3.player.DecoderCounter
            public int getReleaseCount() {
                return 0;
            }

            @Override // ru.yandex.video.m3.player.DecoderCounter
            public int getShownFrames() {
                return 0;
            }
        };

        private Companion() {
        }

        public final DecoderCounter ofZero() {
            return ZERO;
        }
    }

    int getDroppedFrames();

    int getInitCount();

    int getReleaseCount();

    int getShownFrames();
}
