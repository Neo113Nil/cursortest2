package ru.yandex.video.m3.data;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.data.DrmParameters;
import ru.yandex.video.m3.ott.data.dto.drm.DrmConfig;
import ru.yandex.video.m3.player.drm.DrmSecurityLevel;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;", "drmConfig", "Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "drmSecurityLevel", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/DrmParameters$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/data/DrmParameters;", "DrmParameters", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;Lru/yandex/video/m3/player/drm/DrmSecurityLevel;Ltls;)Lru/yandex/video/m3/data/DrmParameters;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrmParametersKt {
    public static final /* synthetic */ DrmParameters DrmParameters(DrmConfig drmConfig, DrmSecurityLevel drmSecurityLevel, tls tlsVar) {
        DrmParameters.Builder builder = new DrmParameters.Builder(drmConfig, drmSecurityLevel);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ DrmParameters DrmParameters$default(DrmConfig drmConfig, DrmSecurityLevel drmSecurityLevel, tls tlsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.DrmParametersKt$DrmParameters$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DrmParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DrmParameters.Builder builder) {
                }
            };
        }
        return DrmParameters(drmConfig, drmSecurityLevel, tlsVar);
    }
}
