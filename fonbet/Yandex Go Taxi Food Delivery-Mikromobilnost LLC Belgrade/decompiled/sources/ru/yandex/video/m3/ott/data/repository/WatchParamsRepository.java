package ru.yandex.video.m3.ott.data.repository;

import java.util.concurrent.Future;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.WatchParams;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0014\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\b\u001a\u00020\u0004H&¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ott/data/repository/WatchParamsRepository;", "", "getWatchParams", "Ljava/util/concurrent/Future;", "Lru/yandex/video/m3/ott/data/dto/WatchParams;", "contentId", "", "sendWatchParams", "watchParams", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface WatchParamsRepository {
    Future<WatchParams> getWatchParams(String contentId);

    Future<?> sendWatchParams(WatchParams watchParams);
}
