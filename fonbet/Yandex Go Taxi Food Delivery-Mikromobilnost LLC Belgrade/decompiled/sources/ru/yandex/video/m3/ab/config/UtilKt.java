package ru.yandex.video.m3.ab.config;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.yandex.video.m3.ab.config.internal.InternalAbFlags;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0007"}, d2 = {"toPublic", "Lru/yandex/video/m3/ab/config/AbConfig;", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", Constants.KEY_SERVICE, "", "Lru/yandex/video/m3/ab/config/AbFlags;", "Lru/yandex/video/m3/ab/config/internal/InternalAbFlags;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UtilKt {
    public static final AbFlags toPublic(InternalAbFlags internalAbFlags, String str) {
        return new AbFlags(str, internalAbFlags);
    }

    public static final AbConfig toPublic(AbConfigWithMeta abConfigWithMeta, String str) {
        return new AbConfig(str, abConfigWithMeta);
    }
}
