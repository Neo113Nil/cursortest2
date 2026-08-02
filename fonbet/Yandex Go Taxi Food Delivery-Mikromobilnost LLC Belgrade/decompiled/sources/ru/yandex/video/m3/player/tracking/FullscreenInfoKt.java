package ru.yandex.video.m3.player.tracking;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.player.tracking.FullscreenInfo;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "isFullscreenExternal", "isFullscreenInternal", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/tracking/FullscreenInfo$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "FullscreenInfo", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ltls;)Lru/yandex/video/m3/player/tracking/FullscreenInfo;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FullscreenInfoKt {
    public static final /* synthetic */ FullscreenInfo FullscreenInfo(Boolean bool, Boolean bool2, tls tlsVar) {
        FullscreenInfo.Builder builder = new FullscreenInfo.Builder(bool, bool2);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ FullscreenInfo FullscreenInfo$default(Boolean bool, Boolean bool2, tls tlsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.tracking.FullscreenInfoKt$FullscreenInfo$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((FullscreenInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(FullscreenInfo.Builder builder) {
                }
            };
        }
        return FullscreenInfo(bool, bool2, tlsVar);
    }
}
