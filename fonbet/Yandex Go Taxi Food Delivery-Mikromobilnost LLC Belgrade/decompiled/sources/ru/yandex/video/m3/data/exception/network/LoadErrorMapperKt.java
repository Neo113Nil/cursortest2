package ru.yandex.video.m3.data.exception.network;

import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.yandex.video.m3.data.exception.network.NetworkRequestExceptionFactory;
import ru.yandex.video.m3.player.tracking.LoadError;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"fromLoadError", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory;", "loadError", "Lru/yandex/video/m3/player/tracking/LoadError;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadErrorMapperKt {
    public static final NetworkRequestException fromLoadError(NetworkRequestExceptionFactory networkRequestExceptionFactory, final LoadError loadError) {
        List<String> list;
        Throwable throwable = loadError.getThrowable();
        final String str = null;
        if ((throwable instanceof HttpDataSource$InvalidResponseCodeException) && (list = ((HttpDataSource$InvalidResponseCodeException) throwable).headerFields.get("xRequestId")) != null) {
            str = (String) a.R(list);
        }
        return networkRequestExceptionFactory.create(NetworkRequestExceptionFactoryKt.NetworkRequestExceptionParameters(new tls() { // from class: ru.yandex.video.m3.data.exception.network.LoadErrorMapperKt$fromLoadError$parameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(NetworkRequestExceptionFactory.Parameters.Builder builder) {
                builder.setResponseCode(LoadError.this.getExceptionCode());
                builder.setRequestUrl(LoadError.this.getUri());
                builder.setRequestId(str);
                builder.setMessage(LoadError.this.getExceptionMessage());
                builder.setCause(new Throwable(LoadError.this.getExceptionCauseMessage()));
                builder.setUnknown(false);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((NetworkRequestExceptionFactory.Parameters.Builder) obj);
                return zy11.a;
            }
        }));
    }
}
