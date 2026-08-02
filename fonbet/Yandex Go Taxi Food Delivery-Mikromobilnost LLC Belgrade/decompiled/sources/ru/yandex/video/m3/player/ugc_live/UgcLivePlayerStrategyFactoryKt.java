package ru.yandex.video.m3.player.ugc_live;

import android.content.Context;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateFactory;
import ru.yandex.video.m3.player.ugc_live.UgcLivePlayerStrategyFactory;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroid/content/Context;", "context", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "mediaDrmCallbackDelegateFactory", "Lru/yandex/video/m3/player/ugc_live/UgcLiveVhVideoDataRepository;", "ugcLiveVhVideoDataRepository", "Lru/yandex/video/m3/player/ugc_live/UgcLiveManager;", "ugcLiveManager", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/ugc_live/UgcLivePlayerStrategyFactory$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/ugc_live/UgcLivePlayerStrategyFactory;", "UgcLivePlayerStrategyFactory", "(Landroid/content/Context;Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;Lru/yandex/video/m3/player/ugc_live/UgcLiveVhVideoDataRepository;Lru/yandex/video/m3/player/ugc_live/UgcLiveManager;Ltls;)Lru/yandex/video/m3/player/ugc_live/UgcLivePlayerStrategyFactory;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UgcLivePlayerStrategyFactoryKt {
    public static final /* synthetic */ UgcLivePlayerStrategyFactory UgcLivePlayerStrategyFactory(Context context, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, UgcLiveVhVideoDataRepository ugcLiveVhVideoDataRepository, UgcLiveManager ugcLiveManager, tls tlsVar) {
        UgcLivePlayerStrategyFactory.Builder builder = new UgcLivePlayerStrategyFactory.Builder(context, ottMediaDrmCallbackDelegateFactory, ugcLiveVhVideoDataRepository, ugcLiveManager);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ UgcLivePlayerStrategyFactory UgcLivePlayerStrategyFactory$default(Context context, OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, UgcLiveVhVideoDataRepository ugcLiveVhVideoDataRepository, UgcLiveManager ugcLiveManager, tls tlsVar, int i, Object obj) {
        if ((i & 16) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.ugc_live.UgcLivePlayerStrategyFactoryKt$UgcLivePlayerStrategyFactory$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((UgcLivePlayerStrategyFactory.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(UgcLivePlayerStrategyFactory.Builder builder) {
                }
            };
        }
        return UgcLivePlayerStrategyFactory(context, ottMediaDrmCallbackDelegateFactory, ugcLiveVhVideoDataRepository, ugcLiveManager, tlsVar);
    }
}
