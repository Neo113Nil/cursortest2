package ru.yandex.video.m3.player.impl.drm;

import defpackage.gno;
import defpackage.lno;
import java.util.UUID;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.player.drm.DefaultMediaDrmCallbackDelegate;
import ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegate;
import ru.yandex.video.m3.player.drm.RetriableMediaDrmCallbackDelegate;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R*\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/impl/drm/MediaDrmCallbackImpl;", "Lokhttp3/OkHttpClient;", "okHttpClient", "<init>", "(Lokhttp3/OkHttpClient;)V", "Ljava/util/UUID;", "uuid", "Llno;", "request", "", "executeProvisionRequest", "(Ljava/util/UUID;Llno;)[B", "Lgno;", "executeKeyRequest", "(Ljava/util/UUID;Lgno;)[B", "Lru/yandex/video/m3/player/impl/drm/OkHttpDataSourceDelegateImpl;", "httpDataSourceDelegate", "Lru/yandex/video/m3/player/impl/drm/OkHttpDataSourceDelegateImpl;", "Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "value", "delegate", "Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "getDelegate", "()Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "setDelegate", "(Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaDrmCallbackImpl {
    public static final int $stable = 8;
    private volatile MediaDrmCallbackDelegate delegate = new RetriableMediaDrmCallbackDelegate(new DefaultMediaDrmCallbackDelegate(null, false, null, 7, null), null, 2, null);
    private final OkHttpDataSourceDelegateImpl httpDataSourceDelegate;

    public MediaDrmCallbackImpl(OkHttpClient okHttpClient) {
        this.httpDataSourceDelegate = new OkHttpDataSourceDelegateImpl(okHttpClient);
    }

    public byte[] executeKeyRequest(UUID uuid, gno request) {
        MediaDrmCallbackDelegate mediaDrmCallbackDelegate = this.delegate;
        OkHttpDataSourceDelegateImpl okHttpDataSourceDelegateImpl = this.httpDataSourceDelegate;
        String str = request.b;
        if (str == null) {
            str = "";
        }
        return mediaDrmCallbackDelegate.executeKeyRequest(okHttpDataSourceDelegateImpl, str, request.a, uuid);
    }

    public byte[] executeProvisionRequest(UUID uuid, lno request) {
        MediaDrmCallbackDelegate mediaDrmCallbackDelegate = this.delegate;
        OkHttpDataSourceDelegateImpl okHttpDataSourceDelegateImpl = this.httpDataSourceDelegate;
        String str = request.b;
        if (str == null) {
            str = "";
        }
        return mediaDrmCallbackDelegate.executeProvisionRequest(okHttpDataSourceDelegateImpl, str, request.a, uuid);
    }

    public final MediaDrmCallbackDelegate getDelegate() {
        return this.delegate;
    }

    public final void setDelegate(MediaDrmCallbackDelegate mediaDrmCallbackDelegate) {
        this.delegate = new RetriableMediaDrmCallbackDelegate(mediaDrmCallbackDelegate, null, 2, null);
    }
}
