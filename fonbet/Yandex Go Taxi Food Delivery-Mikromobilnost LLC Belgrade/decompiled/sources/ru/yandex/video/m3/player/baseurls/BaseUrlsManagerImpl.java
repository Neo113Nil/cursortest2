package ru.yandex.video.m3.player.baseurls;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.video.m3.player.PlaybackException;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010 \u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R0\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0)j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/yandex/video/m3/player/baseurls/BaseUrlsManagerImpl;", "Lru/yandex/video/m3/player/baseurls/BaseUrlsManager;", "Lru/yandex/video/m3/player/baseurls/BaseUrlInBlacklistAddedListener;", "", "", "baseUrls", "Lru/yandex/video/m3/player/baseurls/BlacklistedBaseUrlsManager;", "blacklistedBaseUrlsManager", "Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManagerFactory;", "singleTrackTypeBaseUrlsManagerFactory", "<init>", "(Ljava/util/List;Lru/yandex/video/m3/player/baseurls/BlacklistedBaseUrlsManager;Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManagerFactory;)V", "", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManager;", "getBaseUrlManagerByTrackType", "(I)Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManager;", "baseUrlPostfix", "Lzy11;", "setBaseUrlPostfix", "(ILjava/lang/String;)V", "getBaseUrl", "(I)Ljava/lang/String;", Constants.INTENT_PARAM_RESPONSE_CODE, "", "onChunkLoadError", "(ILjava/lang/Integer;)Z", "release", "()V", "getAvailableBaseUrlsCount", "(I)I", "newBaseUrls", "updateBaseUrls", "(ILjava/util/List;)V", "Lru/yandex/video/m3/player/baseurls/BaseUrl;", "bannedBaseUrl", "onBaseUrlAddedInBlacklist", "(Lru/yandex/video/m3/player/baseurls/BaseUrl;)V", "Ljava/util/List;", "Lru/yandex/video/m3/player/baseurls/BlacklistedBaseUrlsManager;", "Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManagerFactory;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "baseUrlsManagerByTrackType", "Ljava/util/HashMap;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BaseUrlsManagerImpl implements BaseUrlsManager, BaseUrlInBlacklistAddedListener {
    public static final int $stable = 8;
    private final List<String> baseUrls;
    private final HashMap<Integer, SingleTrackTypeBaseUrlsManager> baseUrlsManagerByTrackType = new HashMap<>();
    private final BlacklistedBaseUrlsManager blacklistedBaseUrlsManager;
    private final SingleTrackTypeBaseUrlsManagerFactory singleTrackTypeBaseUrlsManagerFactory;

    public BaseUrlsManagerImpl(List<String> list, BlacklistedBaseUrlsManager blacklistedBaseUrlsManager, SingleTrackTypeBaseUrlsManagerFactory singleTrackTypeBaseUrlsManagerFactory) {
        this.baseUrls = list;
        this.blacklistedBaseUrlsManager = blacklistedBaseUrlsManager;
        this.singleTrackTypeBaseUrlsManagerFactory = singleTrackTypeBaseUrlsManagerFactory;
    }

    private final synchronized SingleTrackTypeBaseUrlsManager getBaseUrlManagerByTrackType(int trackType) {
        SingleTrackTypeBaseUrlsManager singleTrackTypeBaseUrlsManager;
        singleTrackTypeBaseUrlsManager = this.baseUrlsManagerByTrackType.get(Integer.valueOf(trackType));
        if (singleTrackTypeBaseUrlsManager == null) {
            singleTrackTypeBaseUrlsManager = this.singleTrackTypeBaseUrlsManagerFactory.create(this.baseUrls, this);
            this.baseUrlsManagerByTrackType.put(Integer.valueOf(trackType), singleTrackTypeBaseUrlsManager);
            this.blacklistedBaseUrlsManager.addListener(singleTrackTypeBaseUrlsManager);
        }
        return singleTrackTypeBaseUrlsManager;
    }

    @Override // ru.yandex.video.m3.player.baseurls.BaseUrlsManager
    public int getAvailableBaseUrlsCount(int trackType) {
        return getBaseUrlManagerByTrackType(trackType).getAvailableBaseUrlsCount();
    }

    @Override // ru.yandex.video.m3.player.baseurls.BaseUrlsManager
    public String getBaseUrl(int trackType) {
        return getBaseUrlManagerByTrackType(trackType).getBaseUrl();
    }

    @Override // ru.yandex.video.m3.player.baseurls.BaseUrlInBlacklistAddedListener
    public void onBaseUrlAddedInBlacklist(BaseUrl bannedBaseUrl) {
        this.blacklistedBaseUrlsManager.addToBlackList(bannedBaseUrl);
    }

    @Override // ru.yandex.video.m3.player.baseurls.BaseUrlsManager
    public boolean onChunkLoadError(int trackType, Integer responseCode) {
        if (responseCode != null && responseCode.intValue() == 401) {
            return false;
        }
        if (responseCode != null && responseCode.intValue() == 403) {
            return false;
        }
        if (responseCode != null && responseCode.intValue() == 451) {
            return false;
        }
        return getBaseUrlManagerByTrackType(trackType).onChunkLoadError();
    }

    @Override // ru.yandex.video.m3.player.baseurls.BaseUrlsManager
    public synchronized void release() {
        Iterator<Map.Entry<Integer, SingleTrackTypeBaseUrlsManager>> it = this.baseUrlsManagerByTrackType.entrySet().iterator();
        while (it.hasNext()) {
            this.blacklistedBaseUrlsManager.removeListener(it.next().getValue());
        }
    }

    @Override // ru.yandex.video.m3.player.baseurls.BaseUrlsManager
    public void setBaseUrlPostfix(int trackType, String baseUrlPostfix) {
        getBaseUrlManagerByTrackType(trackType).setBaseUrlPostfix(baseUrlPostfix);
    }

    @Override // ru.yandex.video.m3.player.baseurls.BaseUrlsManager
    public void updateBaseUrls(int trackType, List<String> newBaseUrls) {
        getBaseUrlManagerByTrackType(trackType).updateBaseUrls(newBaseUrls);
    }
}
