package ru.yandex.video.m3.ott.data.net.impl.urlprovider;

import defpackage.jwu;
import defpackage.kwu;
import defpackage.scc;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.yandex.video.m3.ott.data.net.impl.VhManifestArguments;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/urlprovider/InternalRequestUrlProvider;", "", "Lru/yandex/video/m3/ott/data/net/impl/VhManifestArguments;", "vhManifestArguments", "", "endpoint", "Lru/yandex/video/m3/ott/data/net/impl/urlprovider/RequestUrlProvider;", "clientRequestUrlProvider", "<init>", "(Lru/yandex/video/m3/ott/data/net/impl/VhManifestArguments;Ljava/lang/String;Lru/yandex/video/m3/ott/data/net/impl/urlprovider/RequestUrlProvider;)V", "Ljwu;", "Lkwu;", "url", "name", "value", "Lzy11;", "addQueryParameterIfNeeded", "(Ljwu;Lkwu;Ljava/lang/String;Ljava/lang/String;)V", "contentId", "vpuid", "getRequestUrl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lru/yandex/video/m3/ott/data/net/impl/VhManifestArguments;", "Ljava/lang/String;", "Lru/yandex/video/m3/ott/data/net/impl/urlprovider/RequestUrlProvider;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalRequestUrlProvider {
    public static final int $stable = 8;
    private final RequestUrlProvider clientRequestUrlProvider;
    private final String endpoint;
    private final VhManifestArguments vhManifestArguments;

    public InternalRequestUrlProvider(VhManifestArguments vhManifestArguments, String str, RequestUrlProvider requestUrlProvider) {
        this.vhManifestArguments = vhManifestArguments;
        this.endpoint = str;
        this.clientRequestUrlProvider = requestUrlProvider;
    }

    private final void addQueryParameterIfNeeded(jwu jwuVar, kwu kwuVar, String str, String str2) {
        if (kwuVar.i(str) == null) {
            jwuVar.d(str, str2);
        }
    }

    public static /* synthetic */ String getRequestUrl$default(InternalRequestUrlProvider internalRequestUrlProvider, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return internalRequestUrlProvider.getRequestUrl(str, str2);
    }

    public final String getRequestUrl(String contentId, String vpuid) {
        String requestUrl = this.clientRequestUrlProvider.getRequestUrl(this.endpoint, contentId);
        jwu jwuVar = new jwu();
        jwuVar.i(null, requestUrl);
        kwu e = jwuVar.e();
        ArrayList arrayList = e.f;
        int f = scc.f(arrayList);
        String str = (String) a.Z(arrayList);
        jwu g = e.g();
        ArrayList arrayList2 = g.f;
        arrayList2.remove(f);
        if (arrayList2.isEmpty()) {
            arrayList2.add("");
        }
        g.b(str + ".json");
        String service = this.vhManifestArguments.getService();
        if (service != null) {
            addQueryParameterIfNeeded(g, e, Constants.KEY_SERVICE, service);
        }
        String from = this.vhManifestArguments.getFrom();
        if (from != null) {
            addQueryParameterIfNeeded(g, e, "from", from);
        }
        if (vpuid != null) {
            addQueryParameterIfNeeded(g, e, "vpuid", vpuid);
        }
        return g.e().i;
    }
}
