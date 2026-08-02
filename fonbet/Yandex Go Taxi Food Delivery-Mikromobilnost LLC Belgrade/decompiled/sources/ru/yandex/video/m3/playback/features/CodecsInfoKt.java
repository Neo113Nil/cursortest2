package ru.yandex.video.m3.playback.features;

import defpackage.tls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.playback.features.CodecsInfo;

@Metadata(d1 = {"\u0000.\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aW\u0010\f\u001a\u00020\u000b2\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u00002\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "", "", "Lru/yandex/video/m3/playback/features/VideoCodecInfo;", "videoCodecs", "Lru/yandex/video/m3/playback/features/AudioCodecInfo;", "audioCodecs", "Lkotlin/Function1;", "Lru/yandex/video/m3/playback/features/CodecsInfo$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/playback/features/CodecsInfo;", "CodecsInfo", "(Ljava/util/Map;Ljava/util/Map;Ltls;)Lru/yandex/video/m3/playback/features/CodecsInfo;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CodecsInfoKt {
    public static final /* synthetic */ CodecsInfo CodecsInfo(Map map, Map map2, tls tlsVar) {
        CodecsInfo.Builder builder = new CodecsInfo.Builder(map, map2);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ CodecsInfo CodecsInfo$default(Map map, Map map2, tls tlsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.playback.features.CodecsInfoKt$CodecsInfo$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((CodecsInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(CodecsInfo.Builder builder) {
                }
            };
        }
        return CodecsInfo(map, map2, tlsVar);
    }
}
