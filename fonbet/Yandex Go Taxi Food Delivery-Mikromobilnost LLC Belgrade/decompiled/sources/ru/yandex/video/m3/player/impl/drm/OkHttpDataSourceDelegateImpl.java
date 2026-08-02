package ru.yandex.video.m3.player.impl.drm;

import defpackage.d5j0;
import defpackage.kvj0;
import defpackage.m5j0;
import defpackage.nci0;
import defpackage.rvj0;
import defpackage.t4j0;
import defpackage.wms;
import defpackage.ya7;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.drm.HttpDataSourceDelegate;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/impl/drm/OkHttpDataSourceDelegateImpl;", "Lru/yandex/video/m3/player/drm/HttpDataSourceDelegate;", "okHttpClient", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "executePost", "", "requestUrl", "", "requestBody", "requestHeaders", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OkHttpDataSourceDelegateImpl implements HttpDataSourceDelegate {
    public static final int $stable = 8;
    private final OkHttpClient okHttpClient;

    public OkHttpDataSourceDelegateImpl(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }

    @Override // ru.yandex.video.m3.player.drm.HttpDataSourceDelegate
    public byte[] executePost(String requestUrl, byte[] requestBody, Map<String, String> requestHeaders) {
        try {
            OkHttpClient okHttpClient = this.okHttpClient;
            t4j0 t4j0Var = new t4j0();
            for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                t4j0Var.a(entry.getKey(), entry.getValue());
            }
            ya7 ya7Var = new ya7();
            ya7Var.a = true;
            ya7Var.b = true;
            t4j0Var.b(ya7Var.a());
            t4j0Var.h(requestUrl);
            int i = m5j0.a;
            t4j0Var.e("POST", wms.c(null, requestBody));
            kvj0 execute = ((nci0) okHttpClient.newCall(new d5j0(t4j0Var))).execute();
            rvj0 rvj0Var = execute.z;
            byte[] bytes = rvj0Var != null ? rvj0Var.bytes() : null;
            try {
                if (!execute.J) {
                    throw new PlaybackException.DrmThrowable.ErrorDrmProxyConnection(execute.w, bytes != null ? new String(bytes, Charset.defaultCharset()) : null, new Throwable());
                }
                if (bytes == null) {
                    bytes = new byte[0];
                }
                execute.close();
                return bytes;
            } finally {
            }
        } catch (IOException e) {
            throw new PlaybackException.DrmThrowable.ErrorDrmProxyConnection(-1, null, e, 2, null);
        }
    }
}
