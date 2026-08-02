package ru.yandex.video.m3.player.baseurls;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/baseurls/SingleTrackTypeBaseUrlsManager;", "Lru/yandex/video/m3/player/baseurls/BaseUrlFromBlackListRemovedListener;", "", "baseUrlPostfix", "Lzy11;", "setBaseUrlPostfix", "(Ljava/lang/String;)V", "getBaseUrl", "()Ljava/lang/String;", "", "onChunkLoadError", "()Z", "", "getAvailableBaseUrlsCount", "()I", "", "newBaseUrls", "updateBaseUrls", "(Ljava/util/List;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SingleTrackTypeBaseUrlsManager extends BaseUrlFromBlackListRemovedListener {
    int getAvailableBaseUrlsCount();

    String getBaseUrl();

    boolean onChunkLoadError();

    void setBaseUrlPostfix(String baseUrlPostfix);

    void updateBaseUrls(List<String> newBaseUrls);
}
