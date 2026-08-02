package ru.yandex.video.m3.list_player_manager.impl.ypfactories;

import kotlin.Metadata;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/DefaultOkHttpClientFactory;", "", "()V", "create", "Lokhttp3/OkHttpClient;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultOkHttpClientFactory {
    public static final int $stable = 0;
    public static final DefaultOkHttpClientFactory INSTANCE = new DefaultOkHttpClientFactory();

    private DefaultOkHttpClientFactory() {
    }

    public final OkHttpClient create() {
        return new OkHttpClient();
    }
}
