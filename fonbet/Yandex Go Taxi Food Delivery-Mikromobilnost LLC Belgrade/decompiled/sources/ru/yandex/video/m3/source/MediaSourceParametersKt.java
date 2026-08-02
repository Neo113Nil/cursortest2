package ru.yandex.video.m3.source;

import defpackage.cj01;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.player.CurrentBufferLengthProvider;
import ru.yandex.video.m3.player.MediaSourceListener;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManager;
import ru.yandex.video.m3.source.MediaSourceParameters;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "url", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", "drmSessionManager", "Lcj01;", "transferListener", "Lru/yandex/video/m3/player/CurrentBufferLengthProvider;", "currentBufferLengthProvider", "Lru/yandex/video/m3/player/MediaSourceListener;", "mediaSourceListener", "Lkotlin/Function1;", "Lru/yandex/video/m3/source/MediaSourceParameters$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/source/MediaSourceParameters;", "MediaSourceParameters", "(Ljava/lang/String;Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;Lcj01;Lru/yandex/video/m3/player/CurrentBufferLengthProvider;Lru/yandex/video/m3/player/MediaSourceListener;Ltls;)Lru/yandex/video/m3/source/MediaSourceParameters;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaSourceParametersKt {
    public static final /* synthetic */ MediaSourceParameters MediaSourceParameters(String str, ExoDrmSessionManager exoDrmSessionManager, cj01 cj01Var, CurrentBufferLengthProvider currentBufferLengthProvider, MediaSourceListener mediaSourceListener, tls tlsVar) {
        MediaSourceParameters.Builder builder = new MediaSourceParameters.Builder(str, exoDrmSessionManager, cj01Var, currentBufferLengthProvider, mediaSourceListener);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ MediaSourceParameters MediaSourceParameters$default(String str, ExoDrmSessionManager exoDrmSessionManager, cj01 cj01Var, CurrentBufferLengthProvider currentBufferLengthProvider, MediaSourceListener mediaSourceListener, tls tlsVar, int i, Object obj) {
        if ((i & 32) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.source.MediaSourceParametersKt$MediaSourceParameters$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((MediaSourceParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(MediaSourceParameters.Builder builder) {
                }
            };
        }
        return MediaSourceParameters(str, exoDrmSessionManager, cj01Var, currentBufferLengthProvider, mediaSourceListener, tlsVar);
    }
}
