package ru.yandex.video.m3.list_player_manager.model;

import defpackage.jxi;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.model.MediaData;

@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a1\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\b\u0010\t\u001a[\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"", "Lru/yandex/video/m3/list_player_manager/model/Stream;", "streams", "Lkotlin/Function1;", "Lru/yandex/video/m3/list_player_manager/model/MediaData$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "MediaData", "(Ljava/util/List;Ltls;)Lru/yandex/video/m3/list_player_manager/model/MediaData;", "", "firstFrameHash", "firstFrameUrl", "videoContentId", "", "showFirstFrameUntilPlay", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLtls;)Lru/yandex/video/m3/list_player_manager/model/MediaData;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaDataKt {
    @jxi
    public static final /* synthetic */ MediaData MediaData(List list, String str, String str2, String str3, boolean z, tls tlsVar) {
        MediaData.Builder builder = new MediaData.Builder((List<Stream>) list);
        builder.setFirstFrameHash(str);
        builder.setFirstFrameUrl(str2);
        builder.setVideoContentId(str3);
        builder.setShowFirstFrameUntilPlay(z);
        tlsVar.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ MediaData MediaData$default(List list, String str, String str2, String str3, boolean z, tls tlsVar, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.list_player_manager.model.MediaDataKt$MediaData$2
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((MediaData.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(MediaData.Builder builder) {
                }
            };
        }
        return MediaData(list, str, str2, str3, z2, tlsVar);
    }

    public static /* synthetic */ MediaData MediaData$default(List list, tls tlsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.list_player_manager.model.MediaDataKt$MediaData$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((MediaData.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(MediaData.Builder builder) {
                }
            };
        }
        return MediaData(list, tlsVar);
    }

    public static final /* synthetic */ MediaData MediaData(List list, tls tlsVar) {
        MediaData.Builder builder = new MediaData.Builder((List<Stream>) list);
        tlsVar.invoke(builder);
        return builder.build();
    }
}
