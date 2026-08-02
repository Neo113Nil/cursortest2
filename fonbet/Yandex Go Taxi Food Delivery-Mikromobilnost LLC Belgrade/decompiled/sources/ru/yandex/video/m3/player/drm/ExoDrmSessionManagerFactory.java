package ru.yandex.video.m3.player.drm;

import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerFactory;", "", "create", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", DRMInfoProvider.MediaDRMKeys.SECURITY_LEVEL, "Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "listener", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerListener;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ExoDrmSessionManagerFactory {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ ExoDrmSessionManager create$default(ExoDrmSessionManagerFactory exoDrmSessionManagerFactory, DrmSecurityLevel drmSecurityLevel, ExoDrmSessionManagerListener exoDrmSessionManagerListener, int i, Object obj) throws PlaybackException.DrmThrowable.ErrorDrmNotSupported {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: create");
            return null;
        }
        if ((i & 1) != 0) {
            drmSecurityLevel = DrmSecurityLevel.Default;
        }
        return exoDrmSessionManagerFactory.create(drmSecurityLevel, exoDrmSessionManagerListener);
    }

    ExoDrmSessionManager create(DrmSecurityLevel securityLevel, ExoDrmSessionManagerListener listener) throws PlaybackException.DrmThrowable.ErrorDrmNotSupported;
}
