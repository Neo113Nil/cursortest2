package ru.yandex.video.m3.list_player_manager.impl.ypfactories;

import android.content.Context;
import defpackage.p16;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.data.network.UrlParams;
import ru.yandex.video.m3.player.impl.tracking.StrmTrackingApi;
import ru.yandex.video.m3.player.impl.utils.InfoProviderImpl;
import ru.yandex.video.m3.player.utils.JsonConverter;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/DefaultStrmTrackingApiFactory;", "", "()V", "create", "Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;", "context", "Landroid/content/Context;", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "jsonConverter", "Lru/yandex/video/m3/player/utils/JsonConverter;", "okHttpClient", "Lokhttp3/OkHttpClient;", "urlParams", "Lru/yandex/video/m3/data/network/UrlParams;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultStrmTrackingApiFactory {
    public static final int $stable = 0;
    public static final DefaultStrmTrackingApiFactory INSTANCE = new DefaultStrmTrackingApiFactory();

    private DefaultStrmTrackingApiFactory() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread create$lambda$2$lambda$1(ThreadFactory threadFactory, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        newThread.setName("YP:ListPlayerManagerEventTracker");
        return newThread;
    }

    public final StrmTrackingApi create(Context context, PlayerLogger playerLogger, JsonConverter jsonConverter, OkHttpClient okHttpClient, UrlParams urlParams) {
        return new StrmTrackingApi(okHttpClient, Executors.newSingleThreadExecutor(new p16(Executors.defaultThreadFactory(), 4)), jsonConverter, new InfoProviderImpl(context), playerLogger, urlParams);
    }
}
