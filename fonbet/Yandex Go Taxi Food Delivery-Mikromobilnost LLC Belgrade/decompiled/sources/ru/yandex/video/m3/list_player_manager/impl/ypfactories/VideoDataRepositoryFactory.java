package ru.yandex.video.m3.list_player_manager.impl.ypfactories;

import kotlin.Metadata;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.list_player_manager.impl.data.VideoDataRepository;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/VideoDataRepositoryFactory;", "T", "Lru/yandex/video/m3/data/dto/VideoData;", "", "create", "Lru/yandex/video/m3/list_player_manager/impl/data/VideoDataRepository;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface VideoDataRepositoryFactory<T extends VideoData> {
    VideoDataRepository<T> create();
}
