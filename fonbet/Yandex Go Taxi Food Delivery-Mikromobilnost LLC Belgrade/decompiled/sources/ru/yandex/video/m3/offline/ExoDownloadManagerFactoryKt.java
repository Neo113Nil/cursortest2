package ru.yandex.video.m3.offline;

import android.content.Context;
import defpackage.ra7;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.offline.ExoDownloadManagerFactory;
import ru.yandex.video.m3.player.utils.ResourceProvider;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "resourceProvider", "Lru/yandex/video/m3/offline/DownloadStorage;", "downloadStorage", "Lru/yandex/video/m3/offline/DownloadActionHelper;", "downloadActionHelper", "Lra7;", "downloadCache", "Lkotlin/Function1;", "Lru/yandex/video/m3/offline/ExoDownloadManagerFactory$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/offline/ExoDownloadManagerFactory;", "ExoDownloadManagerFactory", "(Landroid/content/Context;Lru/yandex/video/m3/player/utils/ResourceProvider;Lru/yandex/video/m3/offline/DownloadStorage;Lru/yandex/video/m3/offline/DownloadActionHelper;Lra7;Ltls;)Lru/yandex/video/m3/offline/ExoDownloadManagerFactory;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoDownloadManagerFactoryKt {
    public static final /* synthetic */ ExoDownloadManagerFactory ExoDownloadManagerFactory(Context context, ResourceProvider resourceProvider, DownloadStorage downloadStorage, DownloadActionHelper downloadActionHelper, ra7 ra7Var, tls tlsVar) {
        ExoDownloadManagerFactory.Builder builder = new ExoDownloadManagerFactory.Builder(context, resourceProvider, downloadStorage, downloadActionHelper, ra7Var);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ ExoDownloadManagerFactory ExoDownloadManagerFactory$default(Context context, ResourceProvider resourceProvider, DownloadStorage downloadStorage, DownloadActionHelper downloadActionHelper, ra7 ra7Var, tls tlsVar, int i, Object obj) {
        if ((i & 32) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.offline.ExoDownloadManagerFactoryKt$ExoDownloadManagerFactory$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((ExoDownloadManagerFactory.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(ExoDownloadManagerFactory.Builder builder) {
                }
            };
        }
        return ExoDownloadManagerFactory(context, resourceProvider, downloadStorage, downloadActionHelper, ra7Var, tlsVar);
    }
}
