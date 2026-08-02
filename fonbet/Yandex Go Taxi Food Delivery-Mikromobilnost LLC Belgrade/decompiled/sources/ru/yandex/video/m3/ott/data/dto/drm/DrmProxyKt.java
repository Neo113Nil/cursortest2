package ru.yandex.video.m3.ott.data.dto.drm;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "proxyUrl", "provisioningUrl", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "drmRequestParams", "Lkotlin/Function1;", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "DrmProxy", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;Ltls;)Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrmProxyKt {
    public static final /* synthetic */ DrmProxy DrmProxy(String str, String str2, DrmRequestParams drmRequestParams, tls tlsVar) {
        DrmProxy.Builder builder = new DrmProxy.Builder(str, str2, drmRequestParams);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ DrmProxy DrmProxy$default(String str, String str2, DrmRequestParams drmRequestParams, tls tlsVar, int i, Object obj) {
        if ((i & 8) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.ott.data.dto.drm.DrmProxyKt$DrmProxy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DrmProxy.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DrmProxy.Builder builder) {
                }
            };
        }
        return DrmProxy(str, str2, drmRequestParams, tlsVar);
    }
}
