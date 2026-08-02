package ru.yandex.video.m3.ott.data.net.impl.urlprovider;

import defpackage.jwu;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/urlprovider/DefaultRequestUrlProvider;", "Lru/yandex/video/m3/ott/data/net/impl/urlprovider/RequestUrlProvider;", "()V", "getRequestUrl", "", "endpoint", "contentId", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultRequestUrlProvider implements RequestUrlProvider {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.ott.data.net.impl.urlprovider.RequestUrlProvider
    public String getRequestUrl(String endpoint, String contentId) {
        jwu jwuVar = new jwu();
        jwuVar.i(null, endpoint);
        jwu g = jwuVar.e().g();
        g.b(contentId);
        return g.e().i;
    }
}
