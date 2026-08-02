package ru.yandex.video.m3.data;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.data.Ad;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/data/AdType;", "type", "", "adPodCount", "", "position", "", "isPlayed", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/Ad$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/data/Ad;", "Ad", "(Lru/yandex/video/m3/data/AdType;IJZLtls;)Lru/yandex/video/m3/data/Ad;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdKt {
    public static final /* synthetic */ Ad Ad(AdType adType, int i, long j, boolean z, tls tlsVar) {
        Ad.Builder builder = new Ad.Builder(adType, i, j, z);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ Ad Ad$default(AdType adType, int i, long j, boolean z, tls tlsVar, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.AdKt$Ad$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Ad.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(Ad.Builder builder) {
                }
            };
        }
        return Ad(adType, i, j, z, tlsVar);
    }
}
