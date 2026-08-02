package ru.yandex.video.m3.player.utils;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a+\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"(\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lkotlin/Function1;", "Lzy11;", "block", "execute", "(Lru/yandex/video/m3/player/utils/PlayerLogger;Ltls;)V", "", BackendConfig.Restrictions.ENABLED, "getEnabled", "(Lru/yandex/video/m3/player/utils/PlayerLogger;)Z", "setEnabled", "(Lru/yandex/video/m3/player/utils/PlayerLogger;Z)V", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PlayerLoggerExtensionsKt {
    public static final void execute(PlayerLogger playerLogger, tls tlsVar) {
        if (getEnabled(playerLogger)) {
            tlsVar.invoke(playerLogger);
        }
    }

    public static final boolean getEnabled(PlayerLogger playerLogger) {
        return LoggerToggle.INSTANCE.getEnabled();
    }

    public static final void setEnabled(PlayerLogger playerLogger, boolean z) {
        LoggerToggle.INSTANCE.setEnabled(z);
    }
}
