package ru.yandex.video.m3.model.config.download;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.model.config.download.DownloaderConfig;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lru/yandex/video/m3/model/config/download/DownloaderConfig$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/model/config/download/DownloaderConfig;", "DownloaderConfig", "(Ltls;)Lru/yandex/video/m3/model/config/download/DownloaderConfig;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DownloaderConfigKt {
    public static final /* synthetic */ DownloaderConfig DownloaderConfig(tls tlsVar) {
        DownloaderConfig.Builder builder = new DownloaderConfig.Builder();
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ DownloaderConfig DownloaderConfig$default(tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.model.config.download.DownloaderConfigKt$DownloaderConfig$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DownloaderConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DownloaderConfig.Builder builder) {
                }
            };
        }
        return DownloaderConfig(tlsVar);
    }
}
