package ru.yandex.video.m3.list_player_manager.impl.ext_provider;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H'¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ext_provider/ExternalMediaDataProvider;", "", "resolve", "Lru/yandex/video/m3/list_player_manager/impl/ext_provider/Cancellable;", "request", "Lru/yandex/video/m3/list_player_manager/impl/ext_provider/BatchRequest;", "Lru/yandex/video/m3/list_player_manager/impl/ext_provider/SingleRequest;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ExternalMediaDataProvider {
    Cancellable resolve(BatchRequest request);

    Cancellable resolve(SingleRequest request);
}
