package ru.yandex.video.m3.ott.data.dto.drm;

import defpackage.tls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParams;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\f\u001a\u00020\t*\u00020\t2\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "proxyUrl", "provisioningUrl", "", "freeRequestParams", "Lkotlin/Function1;", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxyWithFreeRequestParams$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxyWithFreeRequestParams;", "DrmProxyWithFreeRequestParams", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ltls;)Lru/yandex/video/m3/ott/data/dto/drm/DrmProxyWithFreeRequestParams;", "copy", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmProxyWithFreeRequestParams;Ltls;)Lru/yandex/video/m3/ott/data/dto/drm/DrmProxyWithFreeRequestParams;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrmProxyWithFreeRequestParamsKt {
    public static final /* synthetic */ DrmProxyWithFreeRequestParams DrmProxyWithFreeRequestParams(String str, String str2, Map map, tls tlsVar) {
        DrmProxyWithFreeRequestParams.Builder builder = new DrmProxyWithFreeRequestParams.Builder(str, str2, map);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ DrmProxyWithFreeRequestParams DrmProxyWithFreeRequestParams$default(String str, String str2, Map map, tls tlsVar, int i, Object obj) {
        if ((i & 8) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParamsKt$DrmProxyWithFreeRequestParams$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DrmProxyWithFreeRequestParams.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DrmProxyWithFreeRequestParams.Builder builder) {
                }
            };
        }
        return DrmProxyWithFreeRequestParams(str, str2, map, tlsVar);
    }

    public static final DrmProxyWithFreeRequestParams copy(DrmProxyWithFreeRequestParams drmProxyWithFreeRequestParams, tls tlsVar) {
        DrmProxyWithFreeRequestParams.Builder builder = new DrmProxyWithFreeRequestParams.Builder(drmProxyWithFreeRequestParams);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ DrmProxyWithFreeRequestParams copy$default(DrmProxyWithFreeRequestParams drmProxyWithFreeRequestParams, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParamsKt$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DrmProxyWithFreeRequestParams.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DrmProxyWithFreeRequestParams.Builder builder) {
                }
            };
        }
        return copy(drmProxyWithFreeRequestParams, tlsVar);
    }
}
