package ru.yandex.video.m3.model.config.datasource;

import defpackage.jxi;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.model.config.datasource.CachedDataSourceConfig;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lru/yandex/video/m3/model/config/datasource/CachedDataSourceConfig$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/model/config/datasource/CachedDataSourceConfig;", "CachedDataSourceConfig", "(Ltls;)Lru/yandex/video/m3/model/config/datasource/CachedDataSourceConfig;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CachedDataSourceConfigKt {
    @jxi
    public static final /* synthetic */ CachedDataSourceConfig CachedDataSourceConfig(tls tlsVar) {
        CachedDataSourceConfig.Builder builder = new CachedDataSourceConfig.Builder();
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ CachedDataSourceConfig CachedDataSourceConfig$default(tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.model.config.datasource.CachedDataSourceConfigKt$CachedDataSourceConfig$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((CachedDataSourceConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(CachedDataSourceConfig.Builder builder) {
                }
            };
        }
        return CachedDataSourceConfig(tlsVar);
    }
}
