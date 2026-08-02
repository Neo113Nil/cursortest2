package ru.yandex.video.m3.player;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.TrackSelectionType;
import ru.yandex.video.m3.player.FirstPlaybackInfo;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/data/StartFromCacheInfo;", "startFromCacheInfo", "Lru/yandex/video/m3/data/TrackSelectionType;", "videoTrackSelectionType", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/FirstPlaybackInfo$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/FirstPlaybackInfo;", "FirstPlaybackInfo", "(Lru/yandex/video/m3/data/StartFromCacheInfo;Lru/yandex/video/m3/data/TrackSelectionType;Ltls;)Lru/yandex/video/m3/player/FirstPlaybackInfo;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FirstPlaybackInfoKt {
    public static final /* synthetic */ FirstPlaybackInfo FirstPlaybackInfo(StartFromCacheInfo startFromCacheInfo, TrackSelectionType trackSelectionType, tls tlsVar) {
        FirstPlaybackInfo.Builder builder = new FirstPlaybackInfo.Builder(startFromCacheInfo, trackSelectionType);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ FirstPlaybackInfo FirstPlaybackInfo$default(StartFromCacheInfo startFromCacheInfo, TrackSelectionType trackSelectionType, tls tlsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.FirstPlaybackInfoKt$FirstPlaybackInfo$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((FirstPlaybackInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(FirstPlaybackInfo.Builder builder) {
                }
            };
        }
        return FirstPlaybackInfo(startFromCacheInfo, trackSelectionType, tlsVar);
    }
}
