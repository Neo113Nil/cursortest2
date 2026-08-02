package ru.yandex.video.m3.data;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.data.StartFromCacheInfo;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\f\u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "preloaderVsid", "", "isManifestFromCache", "", "videoCachePositionMs", "audioCachePositionMs", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/StartFromCacheInfo$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/data/StartFromCacheInfo;", "StartFromCacheInfo", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ltls;)Lru/yandex/video/m3/data/StartFromCacheInfo;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StartFromCacheInfoKt {
    public static final /* synthetic */ StartFromCacheInfo StartFromCacheInfo(String str, Boolean bool, Long l, Long l2, tls tlsVar) {
        StartFromCacheInfo.Builder builder = new StartFromCacheInfo.Builder(str, bool, l, l2);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ StartFromCacheInfo StartFromCacheInfo$default(String str, Boolean bool, Long l, Long l2, tls tlsVar, int i, Object obj) {
        if ((i & 16) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.StartFromCacheInfoKt$StartFromCacheInfo$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((StartFromCacheInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(StartFromCacheInfo.Builder builder) {
                }
            };
        }
        return StartFromCacheInfo(str, bool, l, l2, tlsVar);
    }
}
