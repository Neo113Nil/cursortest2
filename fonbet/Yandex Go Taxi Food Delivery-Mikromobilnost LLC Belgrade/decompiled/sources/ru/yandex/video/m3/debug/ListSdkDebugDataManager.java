package ru.yandex.video.m3.debug;

import defpackage.n4u0;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.impl.ListYandexPlayerManagerDebugListener;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.ui.debug.model.DebugData;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/debug/ListSdkDebugDataManager;", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerManagerDebugListener;", "Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "playerDebugData", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "currentMediaData", "Lzy11;", "onPlayerDebugDataUpdate", "(Lru/yandex/video/m3/player/ui/debug/model/DebugData;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "mediaData", "onUpdateIsOnDemand", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "", "videoCachePositionMs", "onStartFromCacheInfoReady", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;Ljava/lang/Long;)V", "release", "()V", "resetDebugData", "Ln4u0;", "Lru/yandex/video/m3/debug/model/ListSdkDebugData;", "getDebugData", "()Ln4u0;", "debugData", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ListSdkDebugDataManager extends ListYandexPlayerManagerDebugListener {
    n4u0 getDebugData();

    void onPlayerDebugDataUpdate(DebugData playerDebugData, MediaData currentMediaData);

    void onStartFromCacheInfoReady(MediaData mediaData, Long videoCachePositionMs);

    void onUpdateIsOnDemand(MediaData mediaData);

    void release();

    void resetDebugData();
}
