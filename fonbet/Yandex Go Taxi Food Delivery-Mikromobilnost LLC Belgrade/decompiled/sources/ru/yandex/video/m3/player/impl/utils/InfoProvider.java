package ru.yandex.video.m3.player.impl.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\n\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "", "appInfo", "Lru/yandex/video/m3/player/impl/utils/AppInfo;", "getAppInfo", "()Lru/yandex/video/m3/player/impl/utils/AppInfo;", "userAgent", "", "getUserAgent", "()Ljava/lang/String;", "getVpuid", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InfoProvider {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static String getVpuid(InfoProvider infoProvider) {
            return InfoProvider.super.getVpuid();
        }
    }

    AppInfo getAppInfo();

    String getUserAgent();

    default String getVpuid() {
        return null;
    }
}
