package ru.yandex.video.m3.ab.interactor;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ab.config.AbConfigWithMeta;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b \u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\u00020\nH ¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\nH ¢\u0006\u0004\b\r\u0010\u0003J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/ab/interactor/AbConfigInteractor;", "", "<init>", "()V", "", "vsid", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "getConfig$video_player_internalRelease", "(Ljava/lang/String;)Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "getConfig", "Lzy11;", "startUpdates$video_player_internalRelease", "startUpdates", "stopUpdates$video_player_internalRelease", "stopUpdates", "tryToGetCachedByVsidConfig", "", "fetchTimestamp", "", "canUseConfig", "(J)Z", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class AbConfigInteractor {
    public static final int $stable = 0;
    public static final long AB_CONFIG_TTL = 172800000;
    protected static final Companion Companion = new Companion(null);
    private static final long DAY_IN_MILLIS = 86400000;

    public final boolean canUseConfig(long fetchTimestamp) {
        return fetchTimestamp == -9223372036854775807L || System.currentTimeMillis() - fetchTimestamp < AB_CONFIG_TTL;
    }

    public abstract AbConfigWithMeta getConfig$video_player_internalRelease(String vsid);

    public abstract void startUpdates$video_player_internalRelease();

    public abstract void stopUpdates$video_player_internalRelease();

    public abstract AbConfigWithMeta tryToGetCachedByVsidConfig(String vsid);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0084\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ab/interactor/AbConfigInteractor$Companion;", "", "()V", "AB_CONFIG_TTL", "", "DAY_IN_MILLIS", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
