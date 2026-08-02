package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.list_player_manager.model.InternalVideo;
import ru.yandex.video.m3.ott.data.dto.DrmAdvanced;
import ru.yandex.video.m3.ott.data.dto.DrmAdvancedWidevine;
import ru.yandex.video.m3.ott.data.dto.DrmParams;
import ru.yandex.video.m3.ott.data.dto.DrmServers;
import ru.yandex.video.m3.ott.data.dto.c;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParams;

/* loaded from: classes6.dex */
public final class uwe extends uif implements Function1 {
    public final /* synthetic */ long r;
    public final /* synthetic */ InternalVideo.Stream s;
    public final /* synthetic */ InternalVideo.Content t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwe(long j, InternalVideo.Stream stream, InternalVideo.Content content) {
        super(1);
        this.r = j;
        this.s = stream;
        this.t = content;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String proxyUrl;
        DrmAdvancedWidevine widevine;
        c cVar = (c) obj;
        cVar.getClass();
        cVar.c = Long.valueOf(this.r);
        DrmParams drmConfig = this.s.getDrmConfig();
        DrmProxyWithFreeRequestParams drmProxyWithFreeRequestParams = null;
        r1 = null;
        String str = null;
        if (drmConfig != null) {
            DrmServers servers = drmConfig.getServers();
            if (servers == null || (proxyUrl = servers.getProxyUrl()) == null) {
                throw new ManifestLoadingException.UnknownError(new IllegalStateException("ProxyUrl mustn't be null"), null, 2, null);
            }
            Map<String, String> freeRequestParams = drmConfig.getFreeRequestParams();
            if (freeRequestParams == null) {
                throw new ManifestLoadingException.UnknownError(new IllegalStateException("Drm request params mustn't be null"), null, 2, null);
            }
            DrmAdvanced advanced = drmConfig.getAdvanced();
            if (advanced != null && (widevine = advanced.getWidevine()) != null) {
                str = widevine.getProvisioningUrl();
            }
            drmProxyWithFreeRequestParams = sk3.h(proxyUrl, str, freeRequestParams, new kma(22, drmConfig));
        }
        cVar.d = drmProxyWithFreeRequestParams;
        InternalVideo.Content content = this.t;
        cVar.h = content.getFirstFrameUrl();
        Boolean isUgcLive = content.isUgcLive();
        if (isUgcLive == null) {
            isUgcLive = Boolean.FALSE;
        }
        cVar.i = isUgcLive;
        cVar.j = content.getFirstFrameHash();
        return Unit.a;
    }
}
