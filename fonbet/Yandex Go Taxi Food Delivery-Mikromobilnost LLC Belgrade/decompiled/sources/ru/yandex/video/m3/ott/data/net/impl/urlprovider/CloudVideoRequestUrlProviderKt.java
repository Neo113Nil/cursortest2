package ru.yandex.video.m3.ott.data.net.impl.urlprovider;

import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.net.impl.urlprovider.RequestUrlProvider;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"forCloudVideo", "Lru/yandex/video/m3/ott/data/net/impl/urlprovider/RequestUrlProvider;", "Lru/yandex/video/m3/ott/data/net/impl/urlprovider/RequestUrlProvider$Companion;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CloudVideoRequestUrlProviderKt {
    public static final RequestUrlProvider forCloudVideo(RequestUrlProvider.Companion companion) {
        return new CloudVideoRequestUrlProvider();
    }
}
