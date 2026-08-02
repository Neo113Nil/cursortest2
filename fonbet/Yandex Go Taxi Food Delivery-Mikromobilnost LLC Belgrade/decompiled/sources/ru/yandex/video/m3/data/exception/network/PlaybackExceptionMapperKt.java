package ru.yandex.video.m3.data.exception.network;

import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.data.exception.network.NetworkRequestExceptionFactory;
import ru.yandex.video.m3.player.PlaybackException;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"fromPlaybackException", "Lru/yandex/video/m3/data/exception/network/NetworkRequestException;", "Lru/yandex/video/m3/data/exception/network/NetworkRequestExceptionFactory;", "playbackException", "Lru/yandex/video/m3/player/PlaybackException;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackExceptionMapperKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.String] */
    public static final NetworkRequestException fromPlaybackException(NetworkRequestExceptionFactory networkRequestExceptionFactory, final PlaybackException playbackException) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        if (playbackException instanceof PlaybackException.ErrorConnection) {
            ref$ObjectRef.element = Integer.valueOf(((PlaybackException.ErrorConnection) playbackException).getResponseCode());
            if (playbackException.getCause() instanceof HttpDataSource$InvalidResponseCodeException) {
                Throwable cause = playbackException.getCause();
                HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException = cause instanceof HttpDataSource$InvalidResponseCodeException ? (HttpDataSource$InvalidResponseCodeException) cause : null;
                if (httpDataSource$InvalidResponseCodeException != null) {
                    ref$ObjectRef2.element = httpDataSource$InvalidResponseCodeException.dataSpec.a.toString();
                    List<String> list = httpDataSource$InvalidResponseCodeException.headerFields.get("xRequestId");
                    ref$ObjectRef3.element = list != null ? (String) a.R(list) : 0;
                }
            }
        } else {
            if (!(playbackException instanceof PlaybackException.ErrorConnectionSSLHandshake ? true : playbackException instanceof PlaybackException.ErrorNoInternetConnection)) {
                if (playbackException instanceof PlaybackException.ErrorPreparing) {
                    Throwable cause2 = playbackException.getCause();
                    if (cause2 instanceof ManifestLoadingException) {
                        return ManifestLoadingExceptionMapperKt.fromManifestLoadingException(networkRequestExceptionFactory, (ManifestLoadingException) cause2);
                    }
                }
                return null;
            }
            if (playbackException.getCause() instanceof HttpDataSource$HttpDataSourceException) {
                Throwable cause3 = playbackException.getCause();
                HttpDataSource$HttpDataSourceException httpDataSource$HttpDataSourceException = cause3 instanceof HttpDataSource$HttpDataSourceException ? (HttpDataSource$HttpDataSourceException) cause3 : null;
                if (httpDataSource$HttpDataSourceException != null) {
                    ref$ObjectRef2.element = httpDataSource$HttpDataSourceException.dataSpec.a.toString();
                }
            }
        }
        return networkRequestExceptionFactory.create(NetworkRequestExceptionFactoryKt.NetworkRequestExceptionParameters(new tls() { // from class: ru.yandex.video.m3.data.exception.network.PlaybackExceptionMapperKt$fromPlaybackException$parameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(NetworkRequestExceptionFactory.Parameters.Builder builder) {
                builder.setResponseCode(ref$ObjectRef.element);
                builder.setRequestUrl(ref$ObjectRef2.element);
                builder.setRequestId(ref$ObjectRef3.element);
                builder.setMessage(playbackException.getMessage());
                builder.setCause(playbackException.getCause());
                builder.setUnknown(ref$BooleanRef.element);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((NetworkRequestExceptionFactory.Parameters.Builder) obj);
                return zy11.a;
            }
        }));
    }
}
