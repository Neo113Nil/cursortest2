package ru.yandex.video.m3.player.utils;

import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.MediaInfo;

@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "Lru/yandex/video/m3/player/utils/MediaCodecInfo;", "supportedCodecs", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/utils/MediaInfo$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/utils/MediaInfo;", "MediaInfo", "(Ljava/util/List;Ltls;)Lru/yandex/video/m3/player/utils/MediaInfo;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaInfoKt {
    public static final /* synthetic */ MediaInfo MediaInfo(List list, tls tlsVar) {
        MediaInfo.Builder builder = new MediaInfo.Builder(list);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ MediaInfo MediaInfo$default(List list, tls tlsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.utils.MediaInfoKt$MediaInfo$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((MediaInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(MediaInfo.Builder builder) {
                }
            };
        }
        return MediaInfo(list, tlsVar);
    }
}
