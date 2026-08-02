package ru.yandex.video.m3.player.baseurls;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/baseurls/BaseUrlsManagerProvider;", "", "Lru/yandex/video/m3/player/baseurls/BlacklistedBaseUrlsManager;", "blacklistedBaseUrlsManager", "<init>", "(Lru/yandex/video/m3/player/baseurls/BlacklistedBaseUrlsManager;)V", "", "dashManifestId", "", "", "baseUrls", "Lru/yandex/video/m3/player/baseurls/BaseUrlsManager;", "get", "(ILjava/util/List;)Lru/yandex/video/m3/player/baseurls/BaseUrlsManager;", "Lzy11;", "release", "()V", "Lru/yandex/video/m3/player/baseurls/BlacklistedBaseUrlsManager;", "currentDashManifestId", "Ljava/lang/Integer;", "currentBaseUrlsManager", "Lru/yandex/video/m3/player/baseurls/BaseUrlsManager;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BaseUrlsManagerProvider {
    public static final int $stable = 8;
    private final BlacklistedBaseUrlsManager blacklistedBaseUrlsManager;
    private BaseUrlsManager currentBaseUrlsManager;
    private Integer currentDashManifestId;

    public BaseUrlsManagerProvider(BlacklistedBaseUrlsManager blacklistedBaseUrlsManager) {
        this.blacklistedBaseUrlsManager = blacklistedBaseUrlsManager;
    }

    public final synchronized BaseUrlsManager get(int dashManifestId, List<String> baseUrls) {
        BaseUrlsManager baseUrlsManager;
        Integer num = this.currentDashManifestId;
        if (num != null && num.intValue() == dashManifestId && (baseUrlsManager = this.currentBaseUrlsManager) != null) {
            return baseUrlsManager;
        }
        BaseUrlsManager baseUrlsManager2 = this.currentBaseUrlsManager;
        if (baseUrlsManager2 != null) {
            baseUrlsManager2.release();
        }
        this.currentBaseUrlsManager = new BaseUrlsManagerImpl(baseUrls, this.blacklistedBaseUrlsManager, new SingleTrackTypeBaseUrlsManagerFactoryImpl());
        this.currentDashManifestId = Integer.valueOf(dashManifestId);
        return this.currentBaseUrlsManager;
    }

    public final synchronized void release() {
        try {
            BaseUrlsManager baseUrlsManager = this.currentBaseUrlsManager;
            if (baseUrlsManager != null) {
                baseUrlsManager.release();
            }
            this.blacklistedBaseUrlsManager.release();
        } catch (Throwable th) {
            throw th;
        }
    }
}
