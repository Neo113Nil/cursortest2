package ru.yandex.video.m3.data.exception.network;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.data.exception.network.NetworkRequestExceptionFactory;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a%\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory;", "NetworkRequestExceptionFactory", "()Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory;", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory$Parameters$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory$Parameters;", "NetworkRequestExceptionParameters", "(Ltls;)Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory$Parameters;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkRequestExceptionFactoryKt {
    public static final NetworkRequestExceptionFactory NetworkRequestExceptionFactory() {
        return new NetworkRequestExceptionFactoryImpl();
    }

    public static final NetworkRequestExceptionFactory.Parameters NetworkRequestExceptionParameters(tls tlsVar) {
        NetworkRequestExceptionFactory.Parameters.Builder builder = new NetworkRequestExceptionFactory.Parameters.Builder();
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ NetworkRequestExceptionFactory.Parameters NetworkRequestExceptionParameters$default(tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.exception.network.NetworkRequestExceptionFactoryKt$NetworkRequestExceptionParameters$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((NetworkRequestExceptionFactory.Parameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(NetworkRequestExceptionFactory.Parameters.Builder builder) {
                }
            };
        }
        return NetworkRequestExceptionParameters(tlsVar);
    }
}
