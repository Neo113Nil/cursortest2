package ru.yandex.video.m3.player.provider.internal;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaYandex;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/provider/internal/UuidProviderImpl;", "Lru/yandex/video/m3/player/provider/internal/UuidProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getUuid", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UuidProviderImpl implements UuidProvider {
    public static final int $stable = 8;
    private final Context context;

    public UuidProviderImpl(Context context) {
        this.context = context;
    }

    @Override // ru.yandex.video.m3.player.provider.internal.UuidProvider
    public String getUuid() {
        return AppMetricaYandex.getUuid(this.context);
    }
}
