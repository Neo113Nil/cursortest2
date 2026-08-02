package ru.yandex.video.m3.debug;

import defpackage.n4u0;
import defpackage.zxc0;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\bJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/debug/DebugDataHandler;", "", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "mediaData", "Lzy11;", "setSource", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "dropSource", "()V", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "engine", "attachEngine", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "detachEngine", "", "width", "height", "setViewSize", "(II)V", "release", "Ln4u0;", "Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "getPlayerEngineDebugDataFlow", "()Ln4u0;", "playerEngineDebugDataFlow", "Lru/yandex/video/m3/debug/model/ListSdkPlayerDebugData;", "getListPlayerManagerDebugDataFlow", "listPlayerManagerDebugDataFlow", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DebugDataHandler {
    void attachEngine(YandexPlayer<zxc0> engine);

    void detachEngine();

    void dropSource();

    n4u0 getListPlayerManagerDebugDataFlow();

    n4u0 getPlayerEngineDebugDataFlow();

    void release();

    void setSource(MediaData mediaData);

    void setViewSize(int width, int height);
}
