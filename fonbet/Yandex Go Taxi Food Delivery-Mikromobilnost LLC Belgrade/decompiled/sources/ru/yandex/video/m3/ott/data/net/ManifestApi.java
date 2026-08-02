package ru.yandex.video.m3.ott.data.net;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ott/data/net/ManifestApi;", "R", "", "getManifest", "Ljava/util/concurrent/Future;", "contentId", "", "vpuid", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ManifestApi<R> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <R> Future<R> getManifest(ManifestApi<R> manifestApi, String str, String str2) {
            return ManifestApi.super.getManifest(str, str2);
        }
    }

    Future<R> getManifest(String contentId);

    default Future<R> getManifest(String contentId, String vpuid) {
        return getManifest(contentId);
    }
}
