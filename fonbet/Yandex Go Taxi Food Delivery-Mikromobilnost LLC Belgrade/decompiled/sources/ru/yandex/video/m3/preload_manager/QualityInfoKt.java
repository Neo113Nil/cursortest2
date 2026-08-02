package ru.yandex.video.m3.preload_manager;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.preload_manager.QualityInfo;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "width", "height", "bitrate", "Lkotlin/Function1;", "Lru/yandex/video/m3/preload_manager/QualityInfo$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/preload_manager/QualityInfo;", "QualityInfo", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ltls;)Lru/yandex/video/m3/preload_manager/QualityInfo;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class QualityInfoKt {
    public static final /* synthetic */ QualityInfo QualityInfo(Integer num, Integer num2, Integer num3, tls tlsVar) {
        QualityInfo.Builder builder = new QualityInfo.Builder(num, num2, num3);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ QualityInfo QualityInfo$default(Integer num, Integer num2, Integer num3, tls tlsVar, int i, Object obj) {
        if ((i & 8) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.preload_manager.QualityInfoKt$QualityInfo$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((QualityInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(QualityInfo.Builder builder) {
                }
            };
        }
        return QualityInfo(num, num2, num3, tlsVar);
    }
}
