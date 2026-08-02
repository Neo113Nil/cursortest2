package ru.yandex.video.m3.model.config.mediasource;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.model.config.mediasource.PreloadLiveDashConfig;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "liveDashPreloadEnabled", "", "timeSincePreloadingWhileCacheIsValid", "Lkotlin/Function1;", "Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig$Builder;", "Lzy11;", "builder", "Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "PreloadLiveDashConfig", "(ZJLtls;)Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadLiveDashConfigKt {
    public static final /* synthetic */ PreloadLiveDashConfig PreloadLiveDashConfig(boolean z, long j, tls tlsVar) {
        PreloadLiveDashConfig.Builder builder = new PreloadLiveDashConfig.Builder(z, j);
        tlsVar.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ PreloadLiveDashConfig PreloadLiveDashConfig$default(boolean z, long j, tls tlsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.model.config.mediasource.PreloadLiveDashConfigKt$PreloadLiveDashConfig$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PreloadLiveDashConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PreloadLiveDashConfig.Builder builder) {
                }
            };
        }
        return PreloadLiveDashConfig(z, j, tlsVar);
    }
}
