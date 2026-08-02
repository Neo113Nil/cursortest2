package ru.yandex.video.m3.player.impl.source.dash;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/source/dash/ParsedBaseUrlsHolder;", "", "", "baseUrl", "Lzy11;", "onNewBaseUrlParsed", "(Ljava/lang/String;)V", "", "getAllBaseUrls", "()Ljava/util/List;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ParsedBaseUrlsHolder {
    List<String> getAllBaseUrls();

    void onNewBaseUrlParsed(String baseUrl);
}
