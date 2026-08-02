package ru.yandex.video.m3.ott.vh;

import android.content.Context;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.repository.ManifestRepository;
import ru.yandex.video.m3.ott.ott.DeviceProvider;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateFactory;
import ru.yandex.video.m3.ott.vh.VhPlayerStrategyFactory;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/content/Context;", "context", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "manifestRepository", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "mediaDrmCallbackDelegateFactory", "Lru/yandex/video/m3/ott/ott/DeviceProvider;", "deviceProvider", "Lkotlin/Function1;", "Lru/yandex/video/m3/ott/vh/VhPlayerStrategyFactory$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/ott/vh/VhPlayerStrategyFactory;", "VhPlayerStrategyFactory", "(Landroid/content/Context;Lru/yandex/video/m3/ott/data/repository/ManifestRepository;Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;Lru/yandex/video/m3/ott/ott/DeviceProvider;Ltls;)Lru/yandex/video/m3/ott/vh/VhPlayerStrategyFactory;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VhPlayerStrategyFactoryKt {
    public static final /* synthetic */ VhPlayerStrategyFactory VhPlayerStrategyFactory(Context context, ManifestRepository manifestRepository, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, DeviceProvider deviceProvider, tls tlsVar) {
        VhPlayerStrategyFactory.Builder builder = new VhPlayerStrategyFactory.Builder(context, manifestRepository, ottMediaDrmCallbackDelegateFactory, deviceProvider);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ VhPlayerStrategyFactory VhPlayerStrategyFactory$default(Context context, ManifestRepository manifestRepository, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, DeviceProvider deviceProvider, tls tlsVar, int i, Object obj) {
        if ((i & 16) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.ott.vh.VhPlayerStrategyFactoryKt$VhPlayerStrategyFactory$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((VhPlayerStrategyFactory.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(VhPlayerStrategyFactory.Builder builder) {
                }
            };
        }
        return VhPlayerStrategyFactory(context, manifestRepository, ottMediaDrmCallbackDelegateFactory, deviceProvider, tlsVar);
    }
}
