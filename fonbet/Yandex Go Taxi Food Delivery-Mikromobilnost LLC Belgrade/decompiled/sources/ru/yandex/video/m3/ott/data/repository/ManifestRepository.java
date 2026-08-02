package ru.yandex.video.m3.ott.data.repository;

import java.util.concurrent.Future;
import kotlin.Metadata;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "T", "Lru/yandex/video/m3/data/dto/VideoData;", "", "loadVideoData", "Ljava/util/concurrent/Future;", "contentId", "", "vpuid", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ManifestRepository<T extends VideoData> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <T extends VideoData> Future<T> loadVideoData(ManifestRepository<T> manifestRepository, String str, String str2) throws ManifestLoadingException {
            return ManifestRepository.super.loadVideoData(str, str2);
        }
    }

    Future<T> loadVideoData(String contentId) throws ManifestLoadingException;

    default Future<T> loadVideoData(String contentId, String vpuid) throws ManifestLoadingException {
        return loadVideoData(contentId);
    }
}
