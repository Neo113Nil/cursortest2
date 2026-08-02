package ru.yandex.video.m3.player.provider.internal;

import android.content.Context;
import kotlin.Metadata;
import ru.yandex.video.m3.player.provider.internal.DeviceIdProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/player/provider/internal/DeviceIdProvider$Companion;", "Landroid/content/Context;", "context", "Lzy11;", "provideContext", "(Lru/yandex/video/m3/player/provider/internal/DeviceIdProvider$Companion;Landroid/content/Context;)V", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeviceIdProviderKt {
    public static final void provideContext(DeviceIdProvider.Companion companion, Context context) {
        DeviceIdProviderImpl.INSTANCE.provideContext(context);
    }
}
