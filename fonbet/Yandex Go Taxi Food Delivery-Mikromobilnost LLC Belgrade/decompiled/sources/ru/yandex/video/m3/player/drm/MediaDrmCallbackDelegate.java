package ru.yandex.video.m3.player.drm;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "", "Lru/yandex/video/m3/player/drm/HttpDataSourceDelegate;", "httpDataSourceDelegate", "", "defaultUrl", "", Constants.KEY_DATA, "Ljava/util/UUID;", "uuid", "executeProvisionRequest", "(Lru/yandex/video/m3/player/drm/HttpDataSourceDelegate;Ljava/lang/String;[BLjava/util/UUID;)[B", "executeKeyRequest", "vsid", "Lzy11;", "setVideoSessionIdQueryParam", "(Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MediaDrmCallbackDelegate {
    byte[] executeKeyRequest(HttpDataSourceDelegate httpDataSourceDelegate, String defaultUrl, byte[] data, UUID uuid);

    byte[] executeProvisionRequest(HttpDataSourceDelegate httpDataSourceDelegate, String defaultUrl, byte[] data, UUID uuid);

    void setVideoSessionIdQueryParam(String vsid);
}
