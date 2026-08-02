package ru.yandex.video.m3.player.baseurls;

import java.util.List;
import kotlin.Metadata;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.video.m3.player.PlaybackException;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/baseurls/BaseUrlsManager;", "", "", PlaybackException.ErrorInRenderer.TRACK_TYPE, "", "baseUrlPostfix", "Lzy11;", "setBaseUrlPostfix", "(ILjava/lang/String;)V", "getBaseUrl", "(I)Ljava/lang/String;", Constants.INTENT_PARAM_RESPONSE_CODE, "", "onChunkLoadError", "(ILjava/lang/Integer;)Z", "release", "()V", "getAvailableBaseUrlsCount", "(I)I", "", "newBaseUrls", "updateBaseUrls", "(ILjava/util/List;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BaseUrlsManager {
    int getAvailableBaseUrlsCount(int trackType);

    String getBaseUrl(int trackType);

    boolean onChunkLoadError(int trackType, Integer responseCode);

    void release();

    void setBaseUrlPostfix(int trackType, String baseUrlPostfix);

    void updateBaseUrls(int trackType, List<String> newBaseUrls);
}
