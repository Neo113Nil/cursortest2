package ru.yandex.video.m3.player.impl.load_control;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.load_control.MaxBufferByNetworkType;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "maxBufferWifiMs", "maxBufferCellularMs", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType;", "MaxBufferByNetworkType", "(JJLtls;)Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MaxBufferByNetworkTypeKt {
    public static final /* synthetic */ MaxBufferByNetworkType MaxBufferByNetworkType(long j, long j2, tls tlsVar) {
        MaxBufferByNetworkType.Builder builder = new MaxBufferByNetworkType.Builder(j, j2);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ MaxBufferByNetworkType MaxBufferByNetworkType$default(long j, long j2, tls tlsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.impl.load_control.MaxBufferByNetworkTypeKt$MaxBufferByNetworkType$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((MaxBufferByNetworkType.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(MaxBufferByNetworkType.Builder builder) {
                }
            };
        }
        return MaxBufferByNetworkType(j, j2, tlsVar);
    }
}
